package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        if (number.toLong() < 0) return null

        val result = arrayListOf<String>()

        number.forEachIndexed { index, item ->
            val neighbors = when (item) {
                '0' -> arrayOf('8')
                '1' -> arrayOf('2', '4')
                '2'-> arrayOf('1','3','5')
                '3'-> arrayOf('2','6')
                '4'-> arrayOf('1','5','7')
                '5'-> arrayOf('2','4','6','8')
                '6'-> arrayOf('3','5','9')
                '7'-> arrayOf('4','8')
                '8'-> arrayOf('0','5','7','9')
                '9' -> arrayOf('6', '8')
                else-> arrayOf()
            }
            neighbors.forEach {
                val buffer = StringBuffer(number)
                buffer.setCharAt(index,it)
                result.add(buffer.toString())
            }
        }
        return result.toTypedArray()
    }
}
