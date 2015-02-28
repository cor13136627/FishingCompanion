package com.example.joe.fishingcompanion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class HomeActivity extends Activity {

    private Button btnCaughtAFish;
    private Integer FishCounter = 1;
    private EditText FishSpecies;
    private Button btnShowFish;

    public String[] FishSpeciesArray = new String[100];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FishCounter = new Integer(FishCounter.intValue() + 1);

        btnCaughtAFish = (Button) findViewById(R.id.CaughtAFishButton);
        btnShowFish = (Button) findViewById(R.id.ShowFishButton);
        FishSpecies = (EditText)findViewById(R.id.FishSpecies);



        btnCaughtAFish.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                FishSpeciesArray[FishCounter] = FishSpecies.getText().toString();

                FishCounter = FishCounter + 1;
            }
        });

        btnShowFish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this, FishList.class);
                startActivity(i);}
        });


    }

}
