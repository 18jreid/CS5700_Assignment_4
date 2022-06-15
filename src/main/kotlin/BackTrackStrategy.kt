import kotlin.math.sqrt
import kotlin.system.exitProcess

class BackTrackStrategy(var puzzle: SudokuPuzzle) {
    private val specialNum = sqrt(puzzle.size.toDouble()).toInt()

    fun solve() {
        for (y in 0 until puzzle.size) {

            for (x in 0 until puzzle.size) {
                if (puzzle.grid[y][x] == "-") {
                    for (n in 1 until puzzle.size + 1) {
                        if (possible(y, x, n)) {
                            puzzle.grid[y][x] = puzzle.symbols[n - 1]
                            solve()
                        }
                        puzzle.grid[y][x] = "-"
                    }
                    return
                }
            }
        }
        puzzle.toString()
        println()
        puzzle.isComplete = true
    }

    private fun possible(y: Int, x: Int, n: Int): Boolean {
        for (i in 0 until puzzle.size) {
            if (puzzle.grid[y][i] == n.toString()) {
                return false
            }
        }
        for (i in 0 until puzzle.size) {
            if (puzzle.grid[i][x] == n.toString()) {
                return false
            }
        }

        val x0 = (Math.floorDiv(x, specialNum)) * specialNum
        val y0 = (Math.floorDiv(y, specialNum)) * specialNum

        for (i in 0 until specialNum) {
            for (j in 0 until specialNum) {
                if (puzzle.grid[y0+ i][x0 + j] == puzzle.symbols[n - 1].toString()) {
                    return false
                }
            }
        }
        return true
    }
}