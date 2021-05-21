package com.example.dodelido_backend.DAO;

public class CounterTest {

    public static void main(String[] args) {
        DAOTimerCountDown c = new DAOTimerCountDown();
        c.startTimer();
        System.out.println(c.isTimerDone());
        try {
            Thread.currentThread().sleep(11000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c.isTimerDone());
        System.out.println("main has finished");
    }

}
