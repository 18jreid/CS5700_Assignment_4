class SudokuPuzzle(
    val size: Int = 4,
    val grid: MutableList<MutableList<String>>,
    val symbols: MutableList<String>
) {

    override fun toString(): String {
        grid.forEach {
            println(it)
        }

        return ""
    }
}