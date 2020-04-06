package model

open class PlayerBase {
    //    var hand = arrayListOf<Card>()
//    var hand = listOf<Card>()
    var hand = mutableListOf<Card>()
    //    var hand: List<Card>()
    var point: Int = 0
    var isBurst: Boolean = false

    //    var deck: Any
//    constructor(deck: Deck) {
//        this.deck = deck
//    }
//    var Deck:model = Deck()

//    constructor(Deck: list, number: Int) {
//        this.mark = mark
//        this.number = number
//        this.displayNumber = getDisplayNumberFromNumber()
//        this.point = getPointFromNumber()
////        getDisplayNumberFromNumber()
////        println(getFullName())
//    }

    //    inline fun <reified T> drawCard (deck: Deck) {
//    fun drawCard (deck: Deck) {
    fun drawCard(deck: Deck): List<Card> {
//        var deck = this.deck
        val card = deck.draw()
        addCard(card)
        return card
    }

    /**
     * カードを手札に加える（点数の加算処理も行う）
     */
    fun addCard(card: List<Card>) {
//    fun addCard(card: Card) {
//        val myHand = this.hand
//        myHand.add(card)
//        this.hand = myHand
        // こちらでよい？
//        println(hand)
        hand.add(card[0])
        point += card[0].point
        isBurst()
    }

    fun isBurst() {
        if(point > 21){
            isBurst = true
        }
//        if (point <= 21) {
//            isBurst = false
//        }
//        return false
    }

//    constructor(list: String) {
//        this.list = list
//    }
}


//fun main(args: Array<String>) {
//    val deck = Deck()
//    deck.shuffle()
//    val foo = PlayerBase()
//    foo.drawCard(deck)
//    println(foo.hand)
//    val d = foo.hand
//    println("end")
//
//}
