package model

class Card {
    var mark: String
    val number: Int
    var displayNumber: String
    var point: Int

    constructor(mark: String, number: Int) {
        this.mark = mark
        this.number = number
        this.displayNumber = getDisplayNumberFromNumber()
        this.point = getPointFromNumber()
    }


    fun getFullName(): String {
        return mark + " " + number
    }

    private fun getDisplayNumberFromNumber(): String {
        val number = this.number
        val displayNumber =
            if (number <= 10) {
                number.toString()
            } else if (number == 11) {
                "J"
            } else if (number == 12) {
                "Q"
            } else if (number == 13) {
                "K"
            } else {
                "Unknown"
            }
        return displayNumber
    }

    private fun getPointFromNumber(): Int {
        val number = this.number
        val point = when (number) {
            in 1..10 -> number
            in 11..13 -> 10
            else -> 0
        }
        return point
    }
}

