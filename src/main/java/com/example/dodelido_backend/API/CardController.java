package com.example.dodelido_backend.API;

import com.example.dodelido_backend.ServiceLayer.CardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("Dodelido/v1/card")

@RestController()
public class CardController {

    CardService cardService = new CardService();

    @GetMapping ("/show")
    public String[] getOpenCards() {
        return cardService.getAllOpenCards();
    }

    @GetMapping ("/refresh")
    public void refreshStack() {
        cardService.refreshStack();
    }
}
