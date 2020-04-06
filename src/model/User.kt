package model

class User(deck: Deck) : PlayerBase(deck) {
//class User(deck: Deck) : PlayerBase(deck) {


    fun draw(doDraw: Boolean) {
        if(doDraw){
            drawCard()
        }
    }
}

fun main(){
    var deck = Deck()
    var u = User(deck)
    u.draw(true)
    println(u.hand)
}