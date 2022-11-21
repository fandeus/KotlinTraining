package sandbox

class SimVillage {
    fun printlnFun() {/*
        println({
            val currentYear = 2018
            "welcome to SimVillage, Mayor!(copyright $currentYear)"
        }())
        */

        /*
        val greetingFunction:() -> String = {
            val currentYear = 2018
            "Welcome to SimVillage, Mayor! (Copyright $currentYear)"
        }
        println(greetingFunction())
        */

        /*
        val greetingFunction: (String,Int) -> String = { playerName,numBuildings ->
            val currentYear = 2018
            println("Adding $numBuildings houses")
            "Welcome to SimVillage, $playerName ! (Copyright $currentYear)"
        }
        println(greetingFunction("Happy",3))
        */

        /*
        val greetingFunction = { playerName:String,numBuildings:Int ->
            val currentYear = 2018
            println("Adding $numBuildings houses")
            "Welcome to SimVillage, $playerName ! (Copyright $currentYear)"
        }
        println(greetingFunction("Happy",3))
        */

        /*
        val greetingFunction = { playerName: String, numBuildings: Int ->
            val currentYear = 2018
            println("Adding $numBuildings houses")
            "Welcome to SimVillage, $playerName ! (Copyright $currentYear)"
        }

        runSimulation("Guyal", greetingFunction)
        */

        /*
        runSimulation("Guyal",::printConstructionCost) { playerName, numBuildings ->
            val currentYear = 2018
            println("Adding $numBuildings houses")
            "Welcome to SimVillage $playerName ! (Copyright $currentYear)"
        }
        */

        runSimulation()
    }

    /*
    private inline fun runSimulation(playerName: String,
                                     costPrinter:(Int) -> Unit,
                                     greetingFunction: (String, Int) -> String) {
        val numBuildings = (1..3).shuffled().last()  //Randomly selects 1, 2, or 3
        costPrinter(numBuildings)
        println(greetingFunction(playerName, numBuildings))
    }
    */

    private fun runSimulation() {
        val greetingFunction = configureGreetingFunction()
        println(greetingFunction("Guyal"))
        println(greetingFunction("Guyal"))
    }

    private fun configureGreetingFunction(): (String) -> String {
        val structureType = "hospitals"
        var numBuildings = 5
        return { playerName: String ->
            val currentYear = 2018
            numBuildings += 1
            println("Adding $numBuildings $structureType")
            "Welcome to SimVillage, $playerName ! (copyright $currentYear)"
        }
    }

    private fun printConstructionCost(numBuildings: Int) {
        val cost = 500
        println("construction cost:${cost * numBuildings}")
    }

    fun anonymousFun() {
        val count = "Mississippi".count()
        println(count)

        val numLetters = "Mississippi".count { letter ->
            letter == 's'
        }

        val counts = "Mississippi".count { it == 's' }
        println(counts)
        println(numLetters)
    }
}