package com.example.dodelido_backend.DAO;

import com.example.dodelido_backend.Util.Card;

public class DAOCArdTest {

    public static void main(String[] args) {
        DAOCard daocard = new DAOCard();
        daocard.printAllCards();
        daocard.printNrOfCards();

        Card card = daocard.drawCard();
        System.out.println(card.getAnimal()+" "+card.getColor());

        card = daocard.drawCard();
        System.out.println(card.getAnimal()+" "+card.getColor());

        card = daocard.drawCard();
        System.out.println(card.getAnimal()+" "+card.getColor());

        card = daocard.drawCard();
        System.out.println(card.getAnimal()+" "+card.getColor());


    }

}
