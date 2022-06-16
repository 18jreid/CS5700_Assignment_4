import kotlin.math.sqrt

class CheckBlockCommand: Command {
    override fun execute(puzzle: SudokuPuzzle): SudokuPuzzle {
        val symbolsFound = mutableListOf<String>()
        val allSymbols = mutableListOf<String>()
        val specialNum = sqrt(puzzle.size.toDouble()).toInt()

        for (y in 0 until puzzle.size) {
            for (z in puzzle.symbols) {
                allSymbols.add(z)
            }

            for (x in 0 until puzzle.size) {
                val x0 = (Math.floorDiv(x, specialNum)) * specialNum
                val y0 = (Math.floorDiv(y, specialNum)) * specialNum

                for (i in 0 until specialNum) {
                    for (j in 0 until specialNum) {
                        if (puzzle.grid[y0+ i][x0 + j] != "-") {
                            symbolsFound.add(puzzle.grid[y0+ i][x0 + j])

                            if (symbolsFound.size + 1 == puzzle.symbols.size) {

                                for (symbol in symbolsFound) {
                                    if (allSymbols.contains(symbol)) {
                                        allSymbols.remove(symbol)
                                    }
                                }

                                for(i in 0 until puzzle.size) {
                                    if (puzzle.grid[i][y] == "-") {
                                        puzzle.grid[i][y] = allSymbols[0]
                                    }
                                }
                            }
                        }
                    }
                }
                symbolsFound.clear()
            }

            allSymbols.clear()
        }
        return puzzle
    }
}