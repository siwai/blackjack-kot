package model

class User() : PlayerBase() {
    fun draw(deck: Deck): List<Card> {
        return drawCard(deck)
    }
}