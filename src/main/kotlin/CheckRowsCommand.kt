class CheckRowsCommand: Command {
    override fun execute(puzzle: SudokuPuzzle): SudokuPuzzle {
        val symbolsFound = mutableListOf<String>()
        val allSymbols = mutableListOf<String>()

        for (y in 0 until puzzle.size) {
            for (z in puzzle.symbols) {
                allSymbols.add(z)
            }
            for (x in 0 until puzzle.size) {
                if (puzzle.grid[y][x] != "-") {
                    symbolsFound.add(puzzle.grid[y][x])
                }
            }
            
            if (symbolsFound.size + 1 == puzzle.symbols.size) {

                for (symbol in symbolsFound) {
                    if (allSymbols.contains(symbol)) {
                        allSymbols.remove(symbol)
                    }
                }

                for(x in 0 until puzzle.size) {
                    if (puzzle.grid[y][x] == "-") {
                        puzzle.grid[y][x] = allSymbols[0]
                    }
                }
            }
            symbolsFound.clear()
            allSymbols.clear()
        }

        return puzzle
    }
}