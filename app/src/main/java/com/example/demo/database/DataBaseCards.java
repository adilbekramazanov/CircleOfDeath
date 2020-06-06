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

        CardModel card4Hearts = new CardModel();
        card2Hearts.id = 9;
        card2Hearts.name = "4 Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "4";
        card2Hearts.description = "Four is whores";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card4Hearts);

        CardModel card4Diamond = new CardModel();
        card2Diamond.id = 10;
        card2Diamond.name = "4 Diamond";
        card2Diamond.suits = "diamond";
        card2Diamond.type = "4";
        card2Diamond.description = "Four is whores";
        card2Diamond.logoURL = "#";
        cardModelArrayList.add(card4Diamond);

        CardModel card4Spade = new CardModel();
        card2Spade.id = 11;
        card2Spade.name = "4 Spade";
        card2Spade.suits = "spade";
        card2Spade.type = "4";
        card2Spade.description = "Four is whores";
        card2Spade.logoURL = "#";
        cardModelArrayList.add(card4Spade);

        CardModel card4Club = new CardModel();
        card2Club.id = 12;
        card2Club.name = "4 Club";
        card2Club.suits = "club";
        card2Club.type = "4";
        card2Club.description = "Four is whores";
        card2Club.logoURL = "#";
        cardModelArrayList.add(card4Club);

        CardModel card5Hearts = new CardModel();
        card2Hearts.id = 13;
        card2Hearts.name = "5 Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "5";
        card2Hearts.description = "Never have I ever";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card5Hearts);

        CardModel card5Diamond = new CardModel();
        card2Diamond.id = 14;
        card2Diamond.name = "5 Diamond";
        card2Diamond.suits = "diamond";
        card2Diamond.type = "5";
        card2Diamond.description = "Never have I ever";
        card2Diamond.logoURL = "#";
        cardModelArrayList.add(card5Diamond);

        CardModel card5Spade = new CardModel();
        card2Spade.id = 15;
        card2Spade.name = "5 Spade";
        card2Spade.suits = "spade";
        card2Spade.type = "5";
        card2Spade.description = "Never have I ever";
        card2Spade.logoURL = "#";
        cardModelArrayList.add(card5Spade);

        CardModel card5Club = new CardModel();
        card2Club.id = 16;
        card2Club.name = "5 Club";
        card2Club.suits = "club";
        card2Club.type = "5";
        card2Club.description = "Never have I ever";
        card2Club.logoURL = "#";
        cardModelArrayList.add(card5Club);

        CardModel card6Hearts = new CardModel();
        card2Hearts.id = 17;
        card2Hearts.name = "6 Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "6";
        card2Hearts.description = "Six is dicks";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card6Hearts);

        CardModel card6Diamond = new CardModel();
        card2Diamond.id = 18;
        card2Diamond.name = "6 Diamond";
        card2Diamond.suits = "diamond";
        card2Diamond.type = "6";
        card2Diamond.description = "Six is dicks";
        card2Diamond.logoURL = "#";
        cardModelArrayList.add(card6Diamond);

        CardModel card6Spade = new CardModel();
        card2Spade.id = 19;
        card2Spade.name = "6 Spade";
        card2Spade.suits = "spade";
        card2Spade.type = "6";
        card2Spade.description = "Six is dicks";
        card2Spade.logoURL = "#";
        cardModelArrayList.add(card6Spade);

        CardModel card6Club = new CardModel();
        card2Club.id = 20;
        card2Club.name = "6 Club";
        card2Club.suits = "club";
        card2Club.type = "6";
        card2Club.description = "Six is dicks";
        card2Club.logoURL = "#";
        cardModelArrayList.add(card6Club);


        CardModel card7Hearts = new CardModel();
        card2Hearts.id = 21;
        card2Hearts.name = "7 Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "7";
        card2Hearts.description = "Seven is heaven";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card7Hearts);

        CardModel card7Diamond = new CardModel();
        card2Diamond.id = 22;
        card2Diamond.name = "7 Diamond";
        card2Diamond.suits = "diamond";
        card2Diamond.type = "7";
        card2Diamond.description = "Seven is heaven";
        card2Diamond.logoURL = "#";
        cardModelArrayList.add(card7Diamond);

        CardModel card7Spade = new CardModel();
        card2Spade.id = 23;
        card2Spade.name = "7 Spade";
        card2Spade.suits = "spade";
        card2Spade.type = "7";
        card2Spade.description = "Seven is heaven";
        card2Spade.logoURL = "#";
        cardModelArrayList.add(card7Spade);

        CardModel card7Club = new CardModel();
        card2Club.id = 24;
        card2Club.name = "7 Club";
        card2Club.suits = "club";
        card2Club.type = "7";
        card2Club.description = "Seven is heaven";
        card2Club.logoURL = "#";
        cardModelArrayList.add(card7Club);

        CardModel card8Hearts = new CardModel();
        card2Hearts.id = 25;
        card2Hearts.name = "8 Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "8";
        card2Hearts.description = "Eight is mate";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card8Hearts);

        CardModel card8Diamond = new CardModel();
        card2Diamond.id = 26;
        card2Diamond.name = "8 Diamond";
        card2Diamond.suits = "diamond";
        card2Diamond.type = "8";
        card2Diamond.description = "Eight is mate";
        card2Diamond.logoURL = "#";
        cardModelArrayList.add(card8Diamond);

        CardModel card8Spade = new CardModel();
        card2Spade.id = 27;
        card2Spade.name = "8 Spade";
        card2Spade.suits = "spade";
        card2Spade.type = "8";
        card2Spade.description = "Eight is mate";
        card2Spade.logoURL = "#";
        cardModelArrayList.add(card8Spade);

        CardModel card8Club = new CardModel();
        card2Club.id = 28;
        card2Club.name = "8 Club";
        card2Club.suits = "club";
        card2Club.type = "8";
        card2Club.description = "Eight is mate";
        card2Club.logoURL = "#";
        cardModelArrayList.add(card8Club);

        CardModel card9Hearts = new CardModel();
        card2Hearts.id = 29;
        card2Hearts.name = "9 Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "9";
        card2Hearts.description = "Nine bust a rhyme";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card9Hearts);

        CardModel card9Diamond = new CardModel();
        card2Diamond.id = 30;
        card2Diamond.name = "9 Diamond";
        card2Diamond.suits = "diamond";
        card2Diamond.type = "9";
        card2Diamond.description = "Nine bust a rhyme";
        card2Diamond.logoURL = "#";
        cardModelArrayList.add(card9Diamond);

        CardModel card9Spade = new CardModel();
        card2Spade.id = 31;
        card2Spade.name = "9";
        card2Spade.suits = "spade";
        card2Spade.type = "9";
        card2Spade.description = "Nine bust a rhyme";
        card2Spade.logoURL = "#";
        cardModelArrayList.add(card9Spade);

        CardModel card9Club = new CardModel();
        card2Club.id = 32;
        card2Club.name = "9 Club";
        card2Club.suits = "club";
        card2Club.type = "9";
        card2Club.description = "Nine bust a rhyme";
        card2Club.logoURL = "#";
        cardModelArrayList.add(card9Club);

        CardModel card10Hearts = new CardModel();
        card2Hearts.id = 33;
        card2Hearts.name = "10 Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "10";
        card2Hearts.description = "Categories";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(card10Hearts);

        CardModel card10Diamond = new CardModel();
        card2Diamond.id = 34;
        card2Diamond.name = "10 Diamond";
        card2Diamond.suits = "diamond";
        card2Diamond.type = "10";
        card2Diamond.description = "Categories";
        card2Diamond.logoURL = "#";
        cardModelArrayList.add(card10Diamond);

        CardModel card10Spade = new CardModel();
        card2Spade.id = 35;
        card2Spade.name = "10";
        card2Spade.suits = "spade";
        card2Spade.type = "10";
        card2Spade.description = "Categories";
        card2Spade.logoURL = "#";
        cardModelArrayList.add(card10Spade);

        CardModel card10Club = new CardModel();
        card2Club.id = 36;
        card2Club.name = "10 Club";
        card2Club.suits = "club";
        card2Club.type = "10";
        card2Club.description = "Categories";
        card2Club.logoURL = "#";
        cardModelArrayList.add(card10Club);

        CardModel cardJackHearts = new CardModel();
        card2Hearts.id = 37;
        card2Hearts.name = "Jack Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "Jack";
        card2Hearts.description = "Jack is back";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(cardJackHearts);

        CardModel cardJackDiamond = new CardModel();
        card2Diamond.id = 38;
        card2Diamond.name = "Jack Diamond";
        card2Diamond.suits = "diamond";
        card2Diamond.type = "Jack";
        card2Diamond.description = "Jack is back";
        card2Diamond.logoURL = "#";
        cardModelArrayList.add(cardJackDiamond);

        CardModel cardJackSpade = new CardModel();
        card2Spade.id = 39;
        card2Spade.name = "Jack";
        card2Spade.suits = "spade";
        card2Spade.type = "Jack";
        card2Spade.description = "Jack is back";
        card2Spade.logoURL = "#";
        cardModelArrayList.add(cardJackSpade);

        CardModel cardJackClub = new CardModel();
        card2Club.id = 40;
        card2Club.name = "Jack Club";
        card2Club.suits = "club";
        card2Club.type = "Jack";
        card2Club.description = "Jack is back";
        card2Club.logoURL = "#";
        cardModelArrayList.add(cardJackClub);

        CardModel cardQueenHearts = new CardModel();
        card2Hearts.id = 41;
        card2Hearts.name = "Queen Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "Queen";
        card2Hearts.description = "Question master";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(cardQueenHearts);

        CardModel cardQueenDiamond = new CardModel();
        card2Diamond.id = 42;
        card2Diamond.name = "Queen Diamond";
        card2Diamond.suits = "diamond";
        card2Diamond.type = "Queen";
        card2Diamond.description = "Question master";
        card2Diamond.logoURL = "#";
        cardModelArrayList.add(cardQueenDiamond);

        CardModel cardQueenSpade = new CardModel();
        card2Spade.id = 43;
        card2Spade.name = "Queen";
        card2Spade.suits = "spade";
        card2Spade.type = "Queen";
        card2Spade.description = "Question master";
        card2Spade.logoURL = "#";
        cardModelArrayList.add(cardQueenSpade);

        CardModel cardQueenClub = new CardModel();
        card2Club.id = 44;
        card2Club.name = "Queen Club";
        card2Club.suits = "club";
        card2Club.type = "Queen";
        card2Club.description = "Question master";
        card2Club.logoURL = "#";
        cardModelArrayList.add(cardQueenClub);

        CardModel cardKingHearts = new CardModel();
        card2Hearts.id = 45;
        card2Hearts.name = "King Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "King";
        card2Hearts.description = "King's cup";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(cardKingHearts);

        CardModel cardKingDiamond = new CardModel();
        card2Diamond.id = 46;
        card2Diamond.name = "King Diamond";
        card2Diamond.suits = "diamond";
        card2Diamond.type = "King";
        card2Diamond.description = "King's cup";
        card2Diamond.logoURL = "#";
        cardModelArrayList.add(cardKingDiamond);

        CardModel cardKingSpade = new CardModel();
        card2Spade.id = 47;
        card2Spade.name = "King";
        card2Spade.suits = "spade";
        card2Spade.type = "King";
        card2Spade.description = "King's cup";
        card2Spade.logoURL = "#";
        cardModelArrayList.add(cardKingSpade);

        CardModel cardKingClub = new CardModel();
        card2Club.id = 48;
        card2Club.name = "King Club";
        card2Club.suits = "club";
        card2Club.type = "King";
        card2Club.description = "King's cup";
        card2Club.logoURL = "#";
        cardModelArrayList.add(cardKingClub);

        CardModel cardAceHearts = new CardModel();
        card2Hearts.id = 49;
        card2Hearts.name = "Ace Hearts";
        card2Hearts.suits = "hearts";
        card2Hearts.type = "Ace";
        card2Hearts.description = "New rule!";
        card2Hearts.logoURL = "#";
        cardModelArrayList.add(cardAceHearts);

        CardModel cardAceDiamond = new CardModel();
        card2Diamond.id = 50;
        card2Diamond.name = "Ace Diamond";
        card2Diamond.suits = "diamond";
        card2Diamond.type = "Ace";
        card2Diamond.description = "New rule!";
        card2Diamond.logoURL = "#";
        cardModelArrayList.add(cardAceDiamond);

        CardModel cardAceSpade = new CardModel();
        card2Spade.id = 51;
        card2Spade.name = "Ace";
        card2Spade.suits = "spade";
        card2Spade.type = "Ace";
        card2Spade.description = "New rule!";
        card2Spade.logoURL = "#";
        cardModelArrayList.add(cardAceSpade);

        CardModel cardAceClub = new CardModel();
        card2Club.id = 52;
        card2Club.name = "Ace Club";
        card2Club.suits = "club";
        card2Club.type = "Ace";
        card2Club.description = "New rule!";
        card2Club.logoURL = "#";
        cardModelArrayList.add(cardAceClub);





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



