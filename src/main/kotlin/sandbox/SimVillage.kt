package sandbox

class SimVillage {
    fun printlnFun() {
        /*
        println({
            val currentYear = 2018
            "welcome to SimVillage, Mayor!(copyright $currentYear)"
        }())
        */

        val greetingFunction:() -> String = {
            val currentYear = 2018
            "Welcome to SimVillage, Mayor! (Copyright $currentYear)"
        }
        println(greetingFunction())
    }

    fun anonymousFun() {
        val count = "Mississippi".count()
        println(count)

        val numLetters = "Mississippi".count { letter ->
            letter == 's'
        }

        println(numLetters)
    }
}