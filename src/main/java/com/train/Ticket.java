package com.train;

public class Ticket {
    int tickers;
    int roundTrip;
    private static final int free = 1000;
    private static final float discount = 0.9f;

    public Ticket(int tickers, int roundTrip) {
        this.tickers = tickers;
        this.roundTrip = roundTrip;
    }

    public void cal(){
        System.out.println("Total tickets: " + tickers);
        System.out.println("Round-trip: " + roundTrip);
        System.out.println("Total: " + (((tickers - roundTrip) * free) + (roundTrip * 2 * free * discount)));
    }
}
