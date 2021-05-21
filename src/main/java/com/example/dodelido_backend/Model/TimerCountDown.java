package com.example.dodelido_backend.Model;

public class TimerCountDown {

    private int countDownInSec;
    private boolean timerDone;

    public TimerCountDown(int countDownInSec) {
        setTime(countDownInSec);
        timerDone = false;
    }

    public int getCountDownInSecDownTimeInSec() {
        return countDownInSec;
    }

    private void setTime(int countDownInSec) throws IndexOutOfBoundsException {
        if (countDownInSec<=0) {
            throw new IndexOutOfBoundsException("Count down time must greater than 0");
        }
        else {
            this.countDownInSec=countDownInSec;
        }
    }

    public boolean isTimerDone() {
        return timerDone;
    }

    public void setTimerDone(boolean status) {
        timerDone = status;
    }
}
