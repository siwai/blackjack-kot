package blackjack

import model.*
import exception.*
class Main(){
    var deck: Deck = Deck()
    var user:User = User(deck)
    var dealer: Dealer = Dealer(deck)

    fun start() {
        println("Welcome to blackjack!")
        println("Game start")
    }

    fun userDraw(){
        user.draw(deck)



    }
}
fun main(args: Array<String>) {

    println("Player dealt SPADE:A")


}

var s: String = "abd"
val t: String = "xyz"

var a: Int = 42

