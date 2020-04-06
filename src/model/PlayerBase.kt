package model

open class PlayerBase {
    var hand = mutableListOf<Card>()
    var point: Int = 0
    var isBurst: Boolean = false

    fun drawCard(deck: Deck): List<Card> {
        val card = deck.draw()
        addCard(card)
        return card
    }

    /**
     * カードを手札に加える（点数の加算処理も行う）
     */
    fun addCard(card: List<Card>) {
        hand.add(card[0])
        point += card[0].point
        isBurst()
    }

    fun isBurst() {
        if(point > 21){
            isBurst = true
        }
    }
}