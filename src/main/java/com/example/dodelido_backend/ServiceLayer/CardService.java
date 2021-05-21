package com.example.dodelido_backend.ServiceLayer;

import com.example.dodelido_backend.DAO.DAOCard;
import com.example.dodelido_backend.Util.Card;

public class CardService {

    DAOCard daoCard = new DAOCard();
    Card card1;
    Card card2;
    Card card3;
    int latestCard;

    public CardService() {
        card1 = drawCard();
        card2 = drawCard();
        card3 = drawCard();
        latestCard = 0;
    }

    public void refreshStack() {
        switch(latestCard) {
            case 0:
                card1 = drawCard();
                break;
            case 1:
                card2 = drawCard();
                break;
            case 2:
                card3 = drawCard();
                break;
        }
        latestCard++;
        latestCard = latestCard%3;
    }

    public Card drawCard() {
        return daoCard.drawCard();
    }


    public String[] getAllOpenCards() {
        String[] output = new String[3];
        output[0]= card1.getColor() + " " + card1.getAnimal();
        output[1]= card2.getColor() + " " + card2.getAnimal();
        output[2]= card3.getColor() + " " + card3.getAnimal();
        return output;
    }
}
