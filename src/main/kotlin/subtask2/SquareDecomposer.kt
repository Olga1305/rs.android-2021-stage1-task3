package subtask2


class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        if (number < 5) return null
        return decompose(number * number, number - 1)
    }

    private fun decompose(square: Int, value: Int): Array<Int>? {
        for (i in value downTo 1) {
            val remainder = square - i * i

            if (remainder < 0) return null
            else if (remainder == 0) return arrayOf(i)

            val next = kotlin.math.sqrt(remainder.toDouble()).toInt()
            val result = if (next >= i) {
                decompose(remainder, i - 1)
            } else {
                decompose(remainder, next)
            }
            if (result != null) {
                return result + arrayOf(i)
            }
        }
        return null
    }
}
