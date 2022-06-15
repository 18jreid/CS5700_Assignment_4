import java.io.File

fun main(args: Array<String>) {
    val puzzle = SudokuFileReader("SamplePuzzles/Input/Puzzle-9x9-0001.txt").getPuzzle()

    println("BEFORE SOLUTION")
    puzzle.toString()

    val backTrackStrategy = BackTrackStrategy(puzzle)
    println("\nAFTER SOLUTION")
    backTrackStrategy.solve()
}