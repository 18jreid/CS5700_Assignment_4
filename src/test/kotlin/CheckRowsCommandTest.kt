import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CheckRowsCommandTest {
    @Test
    fun test4x4Successful() {
        val puzzle = SudokuFileReader("SamplePuzzles/TestPuzzles/Test-4x4-0001.txt").getPuzzle()
        CheckRowsCommand().execute(puzzle)

        assertEquals(puzzle.checkIfComplete(), true)
    }

    @Test
    fun test4x4Failure() {
        val puzzle = SudokuFileReader("SamplePuzzles/TestPuzzles/Test-4x4-0002.txt").getPuzzle()
        CheckRowsCommand().execute(puzzle)

        assertEquals(puzzle.checkIfComplete(), false)
    }

    @Test
    fun test9x9Successful() {
        val puzzle = SudokuFileReader("SamplePuzzles/TestPuzzles/Test-9x9-0001.txt").getPuzzle()
        CheckRowsCommand().execute(puzzle)

        assertEquals(puzzle.checkIfComplete(), true)
    }

    @Test
    fun test9x9Failure() {
        val puzzle = SudokuFileReader("SamplePuzzles/TestPuzzles/Test-9x9-0002.txt").getPuzzle()
        CheckRowsCommand().execute(puzzle)

        assertEquals(puzzle.checkIfComplete(), false)
    }
}