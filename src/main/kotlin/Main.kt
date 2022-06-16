import java.io.File

fun main(args: Array<String>) {
    val puzzle = SudokuFileReader("SamplePuzzles/Input/Puzzle-4x4-0101.txt").getPuzzle()

    println("BEFORE SOLUTION")
    puzzle.toString()

    println("\nAFTER SOLUTION")
    val backTrackStrategy = BackTrackStrategy(puzzle)
    backTrackStrategy.solve()


//    CheckRowsCommand().execute(puzzle)
//    puzzle.toString()
//
//    CheckColumnsCommand().execute(puzzle)
//    puzzle.toString()
//
//    CheckBlockCommand().execute(puzzle)
//    puzzle.toString()

}