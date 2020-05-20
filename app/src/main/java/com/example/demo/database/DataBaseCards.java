package com.example.demo.database;

import com.example.demo.models.CardModel;

import java.util.ArrayList;

public class DataBaseCards {
    ArrayList <CardModel> cardModelArrayList = new ArrayList<>();

    public ArrayList<CardModel> getCardModelArrayList() {
        CardModel card2Hearts = new CardModel();
        card2Hearts.id = 1;
        card2Hearts.name = "2Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "2";
        card2Hearts.description = "Two is you";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card2Hearts);

        CardModel card2Diamond = new CardModel();
        card2Hearts.id = 2;
        card2Hearts.name = "2Diamond";
        card2Hearts.suits = "diamond";
        card2Hearts.type = "2";
        card2Hearts.description = "Two is you";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card2Diamond);

        CardModel card2Spade = new CardModel();
        card2Hearts.id = 3;
        card2Hearts.name = "2Spade";
        card2Hearts.suits = "spade";
        card2Hearts.type = "2";
        card2Hearts.description = "Two is you";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card2Spade);

        CardModel card2Club = new CardModel();
        card2Hearts.id = 4;
        card2Hearts.name = "2Club";
        card2Hearts.suits = "club";
        card2Hearts.type = "2";
        card2Hearts.description = "Two is you";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card2Club);


        CardModel card3Hearts = new CardModel();
        card2Hearts.id = 5;
        card2Hearts.name = "3Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "3";
        card2Hearts.description = "Three is me";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card3Hearts);

        CardModel card3Diamond = new CardModel();
        card2Hearts.id = 6;
        card2Hearts.name = "3Diamond";
        card2Hearts.suits = "diamond";
        card2Hearts.type = "3";
        card2Hearts.description = "Three is me";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card3Diamond);

        CardModel card3Spade = new CardModel();
        card2Hearts.id = 7;
        card2Hearts.name = "3Spade";
        card2Hearts.suits = "spade";
        card2Hearts.type = "3";
        card2Hearts.description = "Three is me";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card3Spade);

        CardModel card3Club = new CardModel();
        card2Hearts.id = 8;
        card2Hearts.name = "3Club";
        card2Hearts.suits = "club";
        card2Hearts.type = "3";
        card2Hearts.description = "Three is megit ";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card3Club);

        return cardModelArrayList;
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


}
