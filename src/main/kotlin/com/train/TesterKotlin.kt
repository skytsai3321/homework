package com.train

import java.util.*

fun main(args: Array<String>) {
    //val scanner = Scanner(System.`in`)
    var tickets = 0
    while (tickets != -1) {
        print("Please enter number of tickets: ")
        tickets = readLine()!!.toInt()
        if (tickets > 0 ) {
            print("How many round-trip tickets: ")
            val roundTrip = readLine()!!.toInt()
            if (tickets > 0 && roundTrip > 0 && tickets >= roundTrip) {
                val tic = TicketKo(tickets, roundTrip)
                tic.cal()
            } else {
                println("輸入票值有誤!!!")
            }
        }
    }

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