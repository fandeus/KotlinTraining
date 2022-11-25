import nyetHack.Game
import nyetHack.SwordJuggler
import nyetHack.Tavern
import sandbox.SimVillage
import typeIntro.TypeIntro

fun main(args: Array<String>) {
    //typeIntro()
    //nyetHack()
    //sandbox()
    //swordJuggler()
    tavern()
    println("Hello Kotlin v1")
    println("Hello Kotlin v2")
    println("Hello Kotlin v3")
}

fun typeIntro() {
    val typeIntro = TypeIntro()
    typeIntro.variables()
}

fun nyetHack() {
    val game = Game()
    game.nyetHack()
}

//Sandbox project
fun  sandbox(){
    val simVillage = SimVillage()
    simVillage.printlnFun()
}

fun swordJuggler(){
    SwordJuggler().swordJuggler()
}

fun tavern(){
   Tavern().tavernMain()
}