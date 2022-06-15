interface Command {
    fun execute(puzzle: SudokuPuzzle, row: Int, column: Int, size: Int, value: Int): Boolean {return false}
}