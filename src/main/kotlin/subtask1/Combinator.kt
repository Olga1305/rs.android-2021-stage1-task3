package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        var combinations = 0
        val posters = array[0]
        val colors: Int = array[1]

        while (combinations <= colors) {
            if ((factorial(colors) / posters) == (factorial(combinations) * factorial(colors - combinations))) {
                return combinations
            }
            ++combinations
        }
        return null
    }
    private fun factorial(colors: Int): Long = if (colors < 2) 1 else colors * factorial(colors - 1)

}
