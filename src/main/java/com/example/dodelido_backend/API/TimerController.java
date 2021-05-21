package com.example.dodelido_backend.API;

import com.example.dodelido_backend.ServiceLayer.TimerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("Dodelido/v1/timer")

@RestController()
public class TimerController {

    private TimerService timerService;

    public TimerController(TimerService timerService) {
        this.timerService = timerService;
    }

    @GetMapping("/done")
    public boolean isTimerDone(){
        return timerService.isTimerDone();
    }

    @GetMapping("/go")
    public void startTimer() {
        timerService.startTimer();
    }
}
