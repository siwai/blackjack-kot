package model

class User() : PlayerBase() {
//class User(deck: Deck) : PlayerBase(deck) {


    //    fun draw(doDraw: Boolean, deck: Deck): List<Card> {
//        if(doDraw){
//            return drawCard(deck)
//        }
//        val list: List<Card> = listOf(
//            Card("SPADE", 1))
//        return list
//    }
    fun draw(deck: Deck): List<Card> {
        return drawCard(deck)
    }
}
//
//fun main() {
//    var deck = Deck()
//    var u = User()
////    u.draw(true, deck)
//    println(u.hand)
//}