package com.example.demo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demo.R;
import com.example.demo.database.DataBaseCards;
import com.example.demo.fragmets.CardFragment;
import com.example.demo.models.CardModel;

public class MainActivity extends AppCompatActivity {

    DataBaseCards dataBaseCards = new DataBaseCards();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        CardFragment cardFragment = CardFragment.newInstance();
//        ft.add(R.id.flContainer, cardFragment);
//        ft.commit();


        dataBaseCards.getCardModelArrayList();

        final TextView cardName = findViewById(R.id.cardName);
        final TextView cardDescription = findViewById(R.id.cardDescription);
        final TextView cardsLeft = findViewById(R.id.cardsLeft);
        Button newCardButton = findViewById(R.id.buttonClick);
        newCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int randomId = dataBaseCards.getRadnomCardId();
                cardName.setText(dataBaseCards.returnCardName(randomId));
                cardDescription.setText(dataBaseCards.returnCardDescription(randomId));
                dataBaseCards.deleteCardFromDeck(randomId);
                cardsLeft.setText("Cards left: " + Integer.toString(dataBaseCards.returnCardsLeft()));

                if (dataBaseCards.returnCardsLeft() == 0){
                    cardName.setText("GAME IS OVER!");
                    cardDescription.setText("");
                }


            }
        });



    }
}
