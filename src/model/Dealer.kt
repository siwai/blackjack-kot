package model

class Dealer(deck: Deck) : PlayerBase(deck) {


    fun draw():Int {
        val point = this.point
        if (point < 17) {
            drawCard()
            return 0
        }
        if( point > 17){
            return point
        }

        return 99
    }


}

fun main(){
    val deck = Deck()
    val d = Dealer(deck)
    println(d.draw())
    println(d.point)
}