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

    fun draw(deck: Deck): List<Card> {
        return drawCard(deck)
    }
}