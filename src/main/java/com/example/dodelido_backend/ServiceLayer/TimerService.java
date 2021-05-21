package com.example.dodelido_backend.ServiceLayer;

import com.example.dodelido_backend.DAO.DAOTimerCountDown;
import org.springframework.stereotype.Service;

@Service
public class TimerService {

    private DAOTimerCountDown daoTimerCountDown = new DAOTimerCountDown();

    public void startTimer() {
        daoTimerCountDown.startTimer();
    }

    public boolean isTimerDone(){
        return daoTimerCountDown.isTimerDone();
    }






}
