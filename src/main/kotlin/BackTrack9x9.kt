class BackTrack9x9(puzzle: SudokuPuzzle): BackTrackStrategy(puzzle) {
    override fun convertToLetters() {
        super.convertToLetters()
    }

    override fun convertToNumbers() {
        super.convertToNumbers()
    }

    override fun solve() {
        for (y in 0 until 9) {
            for (x in 0 until 9) {
                if (puzzle.grid[y][x] == "-") {
                    for (n in 1 until 10) {
                        if (possible(y, x, n)) {
                            puzzle.grid[y][x] = n.toString()
                            solve()
                        }
                    }
                    return
                }
            }
        }
    }

    override fun possible(y: Int, x: Int, n: Int): Boolean {
        for (i in 0 until 9) {
            if (puzzle.grid[y][i] == n.toString()) {
                return false
            }
        }
        for (i in 0 until 9) {
            if (puzzle.grid[i][x] == n.toString()) {
                return false
            }
        }
        val x0 = (Math.floorDiv(x, 3)) * 3
        val y0 = (Math.floorDiv(y, 3)) * 3

        for (i in 0 until 3) {
            for (j in 0 until 3) {
                if (puzzle.grid[y0+ i][x0 + j] == n.toString()) {
                    return false
                }
            }
        }
        return true
    }
}