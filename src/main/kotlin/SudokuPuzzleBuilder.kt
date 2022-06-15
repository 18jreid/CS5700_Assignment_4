class SudokuPuzzleBuilder {
    private var size: Int = 4
    private val grid = mutableListOf<MutableList<String>>()
    private var symbols = mutableListOf<String>()

    fun setSize(value: Int): SudokuPuzzleBuilder {
        this.size = value
        return this
    }

    fun addRow(row: MutableList<String>): SudokuPuzzleBuilder {
        this.grid.add(row)
        return this
    }

    fun setSymbols(symbols: MutableList<String>) {
        this.symbols = symbols
    }

    fun build(): SudokuPuzzle {
        return SudokuPuzzle(size = this.size, grid = this.grid, this.symbols)
    }
}