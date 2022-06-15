import java.io.File

fun main(args: Array<String>) {
    val testFile: File = File("SamplePuzzles/Input/Puzzle-4x4-0002.txt")
    val lines = testFile.readLines()
    val sudokuPuzzle = SudokuPuzzleBuilder()
    for (i in lines) {
        if (lines.indexOf(i) == 0) {
            sudokuPuzzle.setSize(i.toInt())
        } else if (lines.indexOf(i) == 1) {
            val list = i.split(" ")
            sudokuPuzzle.setSymbols(list as MutableList<String>)
        } else {
            val list = i.split(" ")
            sudokuPuzzle.addRow(list as MutableList<String>)
        }
    }

    val puzzle = sudokuPuzzle.build()
    println(puzzle.toString())

    val backTrackStrategy = BackTrackStrategy(puzzle)
    backTrackStrategy.solve()
    println(backTrackStrategy.puzzle.size)
}