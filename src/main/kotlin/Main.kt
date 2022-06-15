import java.io.File

fun main(args: Array<String>) {
    val testFile: File = File("SamplePuzzles/Input/Puzzle-9x9-0001.txt")
    val lines = testFile.readLines()
    val sudokuPuzzle = SudokuPuzzleBuilder()
        .setSize(lines[0].toInt())
    for (i in lines) {
        if (lines.indexOf(i) == 0) {
            continue
        } else if (lines.indexOf(i) == 1) {
            continue
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