import java.io.File

fun main(args: Array<String>) {
    var puzzle = SudokuFileReader("SamplePuzzles/Input/Puzzle-4x4-0001.txt").getPuzzle()

    println("BEFORE SOLUTION")
    puzzle.toString()

    println("\nAFTER SOLUTION")
    val backTrackStrategy = BackTrackStrategy(puzzle)
    val startTime = System.currentTimeMillis()
    backTrackStrategy.solve()


//    CheckRowsCommand().execute(puzzle)
//    puzzle.toString()
//
//    CheckColumnsCommand().execute(puzzle)
//    puzzle.toString()
//
//    CheckBlockCommand().execute(puzzle)
//    puzzle.toString()
    val endTime = System.currentTimeMillis()
    val totalTime = endTime - startTime
    println("Total Time: 0.000$totalTime seconds")
}