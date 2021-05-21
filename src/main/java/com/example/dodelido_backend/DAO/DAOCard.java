package com.example.dodelido_backend.DAO;

import com.example.dodelido_backend.Model.Animal;
import com.example.dodelido_backend.Util.Card;
import com.example.dodelido_backend.Util.Color;

import java.util.ArrayList;

public class DAOCard {

    private ArrayList<Card> cardstack;

    public DAOCard(){
        cardstack = new ArrayList<Card>();
        for (Color color : Color.values())
        {
            for (Animal animal : Animal.values())
            {
                cardstack.add(new Card(animal, color));
                cardstack.add(new Card(animal, color));
            }
        }
    }

    public void addCard(Card card) {
        cardstack.add(card);
    }

    public Card drawCard()
    {
        return cardstack.get();

        System.out.println((int)(Math.random()*cardstack.size());
    }

    public void printAllCards() {
        for (Card card : cardstack)
        {
            System.out.println(card.getAnimal() + " " + card.getColor());
        }
    }

    public void printNrOfCards() {
        System.out.println(cardstack.size());
    }
}
