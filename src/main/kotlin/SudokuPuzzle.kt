class SudokuPuzzle(
    val size: Int = 4,
    val grid: MutableList<MutableList<String>>,
    val symbols: MutableList<String>,
    var isComplete: Boolean = false
) {

    override fun toString(): String {
        grid.forEach {
            println(it)
        }

        return grid.toString()
    }

    fun checkIfComplete(): Boolean {
        for (x in grid) {
            for (y in x) {
                if (y == "-") {
                    return false
                }
            }
        }

        return true
    }
}