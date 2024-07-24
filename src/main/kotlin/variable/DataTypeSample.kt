package variable

class DataTypeSample{
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            //Number Data Type
            val number1 = 123
            val number2 = 123L
            val number3 = -123
            val number4: Long = 123
            val number5: Any = 123
            val number6 = 123.456
            val number7: Double = 123.456
            //Float는 F 명시
            val number8: Float = 123.456F

            //Logical DataType
            val isTrue = true
            val isFalse: Boolean = false
            var isFalse2: Any = false

            //Character, String Data type
            val character = 'a'
            println(character)
            println(character+1)

            val string1 = "text"
            val string2: Any = "text"
            isFalse2 = "oh"
        }
    }
}