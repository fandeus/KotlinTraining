package nyetHack

class Game {
    fun nyetHack() {
        val name = "Madrigal"
        var healthPoints = 89
        val isBlessed = true
        val isImmortal = false

        val auraVisible = isBlessed && healthPoints > 50 || isImmortal

        //Aura
        if (auraVisible) {
            println("GREEN")
        } else {
            println("NONE")
        }

        /*
        if (healthPoints == 100) {
            println(name + "is in excellent condition")
        } else if (healthPoints > 90) {
            println(name + " has a few scratches.")
        } else if (healthPoints >= 75) {
            if (isBlessed){
                println(name + " has some minor wounds but is healing quite quickly!")
            }else{
                println(name + " has some minor wounds.")
            }
        }else if (healthPoints >= 15) {
            println(name + " looks pretty hurt.")
        } else {
            println(name + "is in awful condition")
        }

        //change
         val healthStatus = if (healthPoints == 100) {
            "is in excellent condition"
        } else if (healthPoints >= 90) {
            "has a few scratches."
        } else if (healthPoints >= 75) {
            if (isBlessed) {
                "has some minor wounds but is healing quite quickly!"
            } else {
                "has some minor wounds."
            }
        } else if (healthPoints >= 15) {
            "looks pretty hurt."
        } else {
            "is in awful condition"
        }
        println(name + healthStatus)

        */

        //range
        /*
        val healthStatus = if (healthPoints == 100) {
            "is in excellent condition"
        } else if (healthPoints in 90 .. 99) {
            "has a few scratches."
        } else if (healthPoints in 75..89) {
            if (isBlessed) {
                "has some minor wounds but is healing quite quickly!"
            } else {
                "has some minor wounds."
            }
        } else if (healthPoints in 15..74) {
            "looks pretty hurt."
        } else {
            "is in awful condition"
        }
        println(name + healthStatus)
        */

        //when
        val healthStatus = formatHealthStatus(healthPoints, isBlessed)

        println("$name $healthStatus")
        castFireball(5)

        var beverage = readLine()
        if (beverage != null){
            beverage = beverage.capitalize()
        }else{
            println()
        }
//        beverage = null
        println(beverage)
    }

    private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) = when (healthPoints) {
        100 -> "is in excellent condition"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }

        in 15..75 -> "looks pretty hurt."
        else -> "is in awful condition"
    }

    private fun castFireball(numFireball: Int) = println("A glass of Fireball springs into existence.(x $numFireball)")
}