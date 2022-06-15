import java.io.File

fun main(args: Array<String>) {
    val puzzle = SudokuFileReader("SamplePuzzles/Input/Puzzle-4x4-0001.txt").getPuzzle()

    println("BEFORE SOLUTION")
    puzzle.toString()

    val backTrackStrategy = BackTrackStrategy(puzzle)
    println("\nAFTER SOLUTION")
    backTrackStrategy.solve()
}