package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    val tickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    val roundTrip = scanner.nextInt()
    if (tickets > 0 && roundTrip > 0 && tickets >= roundTrip) {
        val tic = TicketKo(tickets, roundTrip)
        tic.cal()
    }
    println("輸入票值有誤!!!")

}

class TicketKo(var tickets: Int, var roundTrip: Int) {
    val free = 1000
    val discount = 0.9f
    fun cal() {
        println("Total tickets: " + tickets)
        println("Round-Trip: " + roundTrip)
        println("Total: " + ((tickets - roundTrip) * free + (roundTrip * 2 * free * discount)))
    }
}