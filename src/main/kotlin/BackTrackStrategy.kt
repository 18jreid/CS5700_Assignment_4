abstract class BackTrackStrategy(val puzzle: SudokuPuzzle) {
    open fun convertToLetters() {}
    open fun convertToNumbers() {}
    open fun possible(y: Int, x: Int, n: Int): Boolean {return false}
    open fun solve() {}
}