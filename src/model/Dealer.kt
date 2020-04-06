package model

class Dealer() : PlayerBase() {


    fun canDraw(deck: Deck): Boolean {
        val point = this.point
        if (point < 17) {
            drawCard(deck)
            return true
        }
        return false

    }
//    fun init(deck: Deck): List<Card> {
//        return drawCard(deck)
//    }

    fun draw(deck: Deck): List<Card> {
        return drawCard(deck)
    }

}
//
//fun main() {
//    val deck = Deck()
//    val d = Dealer()
//    println(d.draw(deck))
//    println(d.point)
//}