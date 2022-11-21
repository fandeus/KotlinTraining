package nyetHack

const val TAVERN_NAME = "Taernyl's Folly"

class Tavern {

    fun tavernMain() {
        placeOrder("shandy, Dragon's Breath, 5.91")
    }

    private fun placeOrder(meanData: String) {
        val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
        val travernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
        println("Madrigal speaks with $travernMaster about their order.")

        /*
        val  data = meanData.split(',')
        val type = data[0]
        val name = data[1]
        val price = data[2]
        */
        val (type, name, price) = meanData.split(',')
        val message = "Madrigal buys a $name($type) for $price."
        println(message)
    }
}