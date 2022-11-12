import nyetHack.Game
import sandbox.SimVillage
import typeIntro.TypeIntro

fun main(args: Array<String>) {
    //typeIntro()
    //nyetHack()
    val simVillage = SimVillage()
    simVillage.printlnFun()
}

fun typeIntro() {
    val typeIntro = TypeIntro()
    typeIntro.variables()
}

fun nyetHack() {
    val game = Game()
    game.nyetHack()
}