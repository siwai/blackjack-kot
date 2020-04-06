package model


class Deck {
    companion object {
        const val SPADE: String = "SPADE"
        const val HEART: String = "HEART"
        const val DIAMOND: String = "DIAMOND"
        const val CLUB: String = "CLUB"
    }

    var list: List<Card> = listOf(
        Card(SPADE, 1),
        Card(SPADE, 2),
        Card(SPADE, 3),
        Card(SPADE, 4),
        Card(SPADE, 5),
        Card(SPADE, 6),
        Card(SPADE, 7),
        Card(SPADE, 8),
        Card(SPADE, 9),
        Card(SPADE, 10),
        Card(SPADE, 11),
        Card(SPADE, 12),
        Card(SPADE, 13),
        Card(HEART, 1),
        Card(HEART, 2),
        Card(HEART, 3),
        Card(HEART, 4),
        Card(HEART, 5),
        Card(HEART, 6),
        Card(HEART, 7),
        Card(HEART, 8),
        Card(HEART, 9),
        Card(HEART, 10),
        Card(HEART, 11),
        Card(HEART, 12),
        Card(HEART, 13),
        Card(DIAMOND, 1),
        Card(DIAMOND, 2),
        Card(DIAMOND, 3),
        Card(DIAMOND, 4),
        Card(DIAMOND, 5),
        Card(DIAMOND, 6),
        Card(DIAMOND, 7),
        Card(DIAMOND, 8),
        Card(DIAMOND, 9),
        Card(DIAMOND, 10),
        Card(DIAMOND, 11),
        Card(DIAMOND, 12),
        Card(DIAMOND, 13),
        Card(CLUB, 1),
        Card(CLUB, 2),
        Card(CLUB, 3),
        Card(CLUB, 4),
        Card(CLUB, 5),
        Card(CLUB, 6),
        Card(CLUB, 7),
        Card(CLUB, 8),
        Card(CLUB, 9),
        Card(CLUB, 10),
        Card(CLUB, 11),
        Card(CLUB, 12),
        Card(CLUB, 13)
    )

    fun shuffle() {
        var deck = this.list
        deck = deck.shuffled()
        this.list = deck
    }

    fun draw(): List<Card> {
        var deck = this.list
        val card = deck.take(1)
        deck = deck.drop(1)
        this.list = deck
        return card
    }
}