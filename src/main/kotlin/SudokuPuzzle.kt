class SudokuPuzzle(
    val size: Int = 4,
    val grid: MutableList<MutableList<String>>) {

    override fun toString(): String {
        return grid.toString()
    }
}