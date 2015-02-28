package com.example.joe.fishingcompanion;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;



public class FishList extends HomeActivity {

    private Integer FishCounter = 1;
    private EditText FishOne;
    private EditText FishTwo;
    private EditText FishThree;
    private EditText FishFour;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fish_caught);

        FishOne = (EditText) findViewById(R.id.FishOne);
        FishTwo = (EditText) findViewById(R.id.FishTwo);
        FishThree = (EditText) findViewById(R.id.FishThree);
        FishFour = (EditText) findViewById(R.id.FishFour);

        FishOne.setText(FishSpeciesArray[FishCounter]);
        FishCounter = FishCounter + 1;
        FishTwo.setText(FishSpeciesArray[FishCounter]);
        FishCounter = FishCounter + 1;
        FishThree.setText(FishSpeciesArray[FishCounter]);
        FishCounter = FishCounter + 1;
        FishFour.setText(FishSpeciesArray[FishCounter]);
    }


}

