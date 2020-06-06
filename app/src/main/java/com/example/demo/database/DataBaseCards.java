package com.example.demo.database;

import android.util.Log;

import com.example.demo.models.CardModel;

import java.util.ArrayList;
import java.util.Random;

public class DataBaseCards {
    ArrayList <CardModel> cardModelArrayList = new ArrayList<>();

    public ArrayList<CardModel> getCardModelArrayList() {
        CardModel card2Hearts = new CardModel();
        card2Hearts.id = 1;
        card2Hearts.name = "2 Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "2";
        card2Hearts.description = "Two is you";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card2Hearts);

        CardModel card2Diamond = new CardModel();
        card2Diamond.id = 2;
        card2Diamond.name = "2 Diamond";
        card2Diamond.suits = "diamond";
        card2Diamond.type = "2";
        card2Diamond.description = "Two is you";
        card2Diamond.logoURL = "#";
        cardModelArrayList.add(card2Diamond);

        CardModel card2Spade = new CardModel();
        card2Spade.id = 3;
        card2Spade.name = "2 Spade";
        card2Spade.suits = "spade";
        card2Spade.type = "2";
        card2Spade.description = "Two is you";
        card2Spade.logoURL = "#";
        cardModelArrayList.add(card2Spade);

        CardModel card2Club = new CardModel();
        card2Club.id = 4;
        card2Club.name = "2 Club";
        card2Club.suits = "club";
        card2Club.type = "2";
        card2Club.description = "Two is you";
        card2Club.logoURL = "#";
        cardModelArrayList.add(card2Club);


        CardModel card3Hearts = new CardModel();
        card3Hearts.id = 5;
        card3Hearts.name = "3 Hearts";
        card3Hearts.suits = "hearts";
        card3Hearts.type = "3";
        card3Hearts.description = "Three is me";
        card3Hearts.logoURL = "#";
        cardModelArrayList.add(card3Hearts);

        CardModel card3Diamond = new CardModel();
        card3Diamond.id = 6;
        card3Diamond.name = "3 Diamond";
        card3Diamond.suits = "diamond";
        card3Diamond.type = "3";
        card3Diamond.description = "Three is me";
        card3Diamond.logoURL = "#";
        cardModelArrayList.add(card3Diamond);

        CardModel card3Spade = new CardModel();
        card3Spade.id = 7;
        card3Spade.name = "3 Spade";
        card3Spade.suits = "spade";
        card3Spade.type = "3";
        card3Spade.description = "Three is me";
        card3Spade.logoURL = "#";
        cardModelArrayList.add(card3Spade);

        CardModel card3Club = new CardModel();
        card3Club.id = 8;
        card3Club.name = "3 Club";
        card3Club.suits = "club";
        card3Club.type = "3";
        card3Club.description = "Three is me";
        card3Club.logoURL = "#";
        cardModelArrayList.add(card3Club);

        return cardModelArrayList;
    }


//    public CardModel getRandomCard(){
//        int randomCardID = getrandomCard();
//        CardModel returnCard = new CardModel();
//        returnCard = cardModelArrayList.get(0);
//
//        for(int i = 0 ; i < cardModelArrayList.size() ; i++){
//            if(randomCardID == cardModelArrayList.get(i).id){
//                returnCard = cardModelArrayList.get(i);
//            }
//            else
//                return getRandomCard();
//        }
//        return returnCard;
//    }

    public int getRadnomCardId(){

        Random rand = new Random();
        int randomCard = rand.nextInt(cardModelArrayList.size());
        return cardModelArrayList.get(randomCard).id;
    }

    public String returnCardName(int cardID){
        String returnString = "CardError";
        for (int i = 0; i < cardModelArrayList.size(); i++){

            if (cardID == cardModelArrayList.get(i).id){
                returnString =  cardModelArrayList.get(i).name.toString();

            }
        }
        return returnString;
    }
    public String returnCardDescription(int cardID){
        String returnString = "CardError";
        for (int i = 0; i < cardModelArrayList.size(); i++){
            if (cardID == cardModelArrayList.get(i).id){
                returnString =  cardModelArrayList.get(i).description;

            }
        }
        return returnString;
    }

    public int returnCardsLeft(){

        return cardModelArrayList.size();
    }

    public void deleteCardFromDeck(int cardID){
        for (int i = 0; i < cardModelArrayList.size(); i++){
            if (cardID == cardModelArrayList.get(i).id)

                cardModelArrayList.remove(i);

            }
        }
    }









//    CardModel card2Hearts = new CardModel(1, "2", "hearts", "2hearts", "Two is you", "temp");
//    CardModel card2Diamond = new CardModel(2, "2", "diamond", "2diamond", "Two is you", "temp");
//    CardModel card2Club = new CardModel(3, "2", "club", "2club", "Two is you", "temp");
//    CardModel card2Spade = new CardModel(4, "2", "spade", "2spade", "Two is you", "temp");
//
//    CardModel card3Hearts = new CardModel(1, "3", "hearts", "3hearts", "Three is me", "temp");
//    CardModel card3Diamond = new CardModel(2, "3", "diamond", "3diamond", "Three is me", "temp");
//    CardModel card3Club = new CardModel(3, "3", "club", "3club", "Three is me", "temp");
//    CardModel card3Spade = new CardModel(4, "3", "spade", "3spade", "Three is me", "temp");
//
//    CardModel card4Hearts = new CardModel(1, "4", "hearts", "4hearts", "Four is hoes", "temp");
//    CardModel card4Diamond = new CardModel(2, "4", "diamond", "4diamond", "Four is hoes", "temp");
//    CardModel card4Club = new CardModel(3, "4", "club", "4club", "Four is hoes", "temp");
//    CardModel card4Spade = new CardModel(4, "4", "spade", "4spade", "Four is hoes", "temp");



