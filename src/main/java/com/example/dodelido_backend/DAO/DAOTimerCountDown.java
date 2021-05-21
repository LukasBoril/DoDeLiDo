package com.example.dodelido_backend.DAO;

import com.example.dodelido_backend.Model.TimerCountDown;

import java.util.Timer;
import java.util.TimerTask;

public class DAOTimerCountDown {

    private TimerCountDown tim = new TimerCountDown(10);

    public void startTimer() {
        tim.setTimerDone(false);
        Timer timer = new Timer();
        final int[] counter = {tim.getCountDownInSecDownTimeInSec()};
        TimerTask t = new TimerTask() {
            public void run() {
                System.out.println(counter[0]);
                counter[0]--;
                if (counter[0] ==0) {
                    timer.cancel();
                    tim.setTimerDone(true);
                }
            }
        };
        timer.scheduleAtFixedRate(t, 1000, 1000 );
    }

    public boolean isTimerDone(){
        return tim.isTimerDone();
    }
}
