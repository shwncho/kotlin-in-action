package variable

class VariableSample {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val name: String = "Simple"
            val org = "Kakao"
            var age = 28
            // org = "test"
            age = 11

            println("my name is $name")
            println("my organization is $org")
            println("my age is $age")
        }
    }
}