package blackjack

import model.*

class Main() {
    var deck: Deck = Deck()
    var user: User = User()
    var dealer: Dealer = Dealer()

    fun start() {
        println("Welcome to blackjack!")
        println("Game start")
    }

    fun userDraw() {
        val card = user.draw(deck)
        println("Player dealt " + card[0].displayNumber + " of " + card[0].mark)
    }

    fun dealerDraw() {
        val card = dealer.draw(deck)
        println("Player dealt " + card[0].displayNumber + " of " + card[0].mark)
    }

    /**
     * UserがHitかBurstするまで処理をする
     */
    fun userTurn() {
        displayUserHand()
        var input: String?
        while (true) {
            println("h: Hit | s: Stand") // Hit: 一枚引く, Stand:カードを惹かずに勝負する
            input = readLine()
            if (input == "h" || input == "H") {
                userDraw()
                if (user.isBurst) {
                    println("You have " + user.point + ", you bust! You lose!")
                    end()
                }
            } else if (input == "s" || input == "S") {
                break
            } else {
                println("You must enter 'h' or 's'")
            }
        }
    }

    fun dealerTurn() {
        dealer.draw(deck)
        displayDealerHand()
        while (true) {
            if (!dealer.canDraw(deck)) {
                break
            }
        }
        if (dealer.isBurst) {
            println("Dealer has " + dealer.point + ", dealer bust! You win!")
            end()
        }
    }

    /**
     * ゲームの終了
     */
    fun end() {
        println("Finish a deal. See you next time.")
        System.exit(0)
    }

    fun dealerInit() {
        val card = dealer.draw(deck)
        println("Dealer dealt " + card[0].displayNumber + " of " + card[0].mark)
    }

    fun judgeDeal() {
        val userValue = user.point
        val dealerValue = dealer.point

        println("Player's point is $userValue")
        println("Dealer's point is $dealerValue")

        if (userValue > dealerValue) {
            println("You win!")
        }
        if (userValue < dealerValue) {
            println("You lose!")
        }
        if (userValue == dealerValue) {
            println("Draw!")
        }
        end()
    }

    fun displayUserHand() {
        val point = user.point
        println("Player's hand is ")
        val hand = user.hand
        hand.forEach {
            println(it.displayNumber + " of " + it.mark)
        }
    }

    fun displayDealerHand() {
        val point = dealer.point
        println("Dealer's hand is ")
        val hand = dealer.hand
        hand.forEach {
            println(it.displayNumber + " of " + it.mark)
        }
    }
}

fun main() {
    val main = Main()
    main.start()
    main.deck.shuffle()
    main.userDraw()
    main.userDraw()
    main.dealerInit()
    println("Dealer dealt ? of ?")
    println("You don't know dealer's hand")
    main.userTurn()
    main.dealerTurn()
    main.judgeDeal()
}

