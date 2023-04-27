package org.example;

public class Vacation {

    private int countOfPeople;
    private int countOfDays;

    public int calculate() {
        return  countOfDays * countOfPeople;
    }



    public Vacation(int countOfDays, int countOfPeople){
        this.countOfDays = countOfDays;
        this.countOfPeople = countOfPeople;
    }
}
