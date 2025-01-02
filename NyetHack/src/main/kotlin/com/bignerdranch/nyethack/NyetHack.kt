package com.bignerdranch.nyethack// Chapter 12


var player = Player()

fun main() {
    narrate("${player.name} is ${player.title}")
    player.changeName("Aurelia")
    //changeNarratorMood()
    narrate("${player.name}, ${player.title}, heads to the town square")

    visitTavern()
    player.castFireBall()
}

private fun promptHeroName(): String {
    narrate("A hero enters the town of Kronstadt. What is their name?") { message ->
        // Prints the message in yellow
        "\u001b[33;1m$message\u001b[0m"
    }

    /*val input = readLine()
    require(input != null && input.isNotEmpty()) {
        "The hero must have a name."
    }
     return input*/
    println("Madrigo")
    return "Madrigo"


}