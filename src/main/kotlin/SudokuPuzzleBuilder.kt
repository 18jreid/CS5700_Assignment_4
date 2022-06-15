class SudokuPuzzleBuilder {
    private var size: Int = 4
    private val grid = mutableListOf<MutableList<String>>()

    fun setSize(value: Int): SudokuPuzzleBuilder {
        this.size = value
        return this
    }

    fun addRow(row: MutableList<String>): SudokuPuzzleBuilder {
        this.grid.add(row)
        return this
    }

    fun build(): SudokuPuzzle {
        return SudokuPuzzle(size = this.size, grid = this.grid)
    }
}