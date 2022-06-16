import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CheckBlockCommandTest {
    @Test
    fun testBlocks4x4Successfully() {
        val puzzle = SudokuFileReader("SamplePuzzles/TestPuzzles/Test-4x4-0003.txt").getPuzzle()
        CheckBlockCommand().execute(puzzle)

        assertEquals(puzzle.checkIfComplete(), true)
    }

    @Test
    fun testBlocks4x4Failed() {
        val puzzle = SudokuFileReader("SamplePuzzles/TestPuzzles/Test-4x4-0002.txt").getPuzzle()
        CheckBlockCommand().execute(puzzle)

        assertEquals(puzzle.checkIfComplete(), false)
    }

    @Test
    fun testBlocks9x9Successfully() {
        val puzzle = SudokuFileReader("SamplePuzzles/TestPuzzles/Test-9x9-0003.txt").getPuzzle()
        CheckBlockCommand().execute(puzzle)

        assertEquals(puzzle.checkIfComplete(), true)
    }

    @Test
    fun testBlocks9x9Failed() {
        val puzzle = SudokuFileReader("SamplePuzzles/TestPuzzles/Test-9x9-0005.txt").getPuzzle()
        CheckBlockCommand().execute(puzzle)

        assertEquals(puzzle.checkIfComplete(), false)
    }
}