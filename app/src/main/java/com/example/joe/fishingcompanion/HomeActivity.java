package com.example.joe.fishingcompanion;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class HomeActivity extends Activity {

    private ListView FishList;
    private List<FishListObject> fishList;
    private EditText Species;
    private EditText Weight;

    private Button btnUpdate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Species = (EditText)findViewById(R.id.editTextSpecies);
        Weight = (EditText)findViewById(R.id.editTextWeight);
        FishList = (ListView) findViewById(R.id.FishList);

        fishList = new ArrayList<FishListObject>();

        btnUpdate = (Button)findViewById(R.id.btnUpdate);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fishList.add(new FishListObject(Species.getText().toString(),Weight.getText().toString()));
            }
        });

        FishAdapter adapter = new FishAdapter(fishList);
        FishList.setAdapter(adapter);
    }

    private class FishAdapter extends ArrayAdapter<FishListObject> {

        public FishAdapter(List<FishListObject> items) {
            super(HomeActivity.this, 0, items);
        }

        @Override
        public  View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null){
                convertView = getLayoutInflater().inflate(R.layout.fish_list_object, null);
            }

            TextView lblFishWeight = (TextView)findViewById(R.id.lblFishWeight);
            TextView lblFishSpecies = (TextView)findViewById(R.id.lblFishSpecies);

            FishListObject location = fishList.get(position);

            lblFishWeight.setText(location.getFishWeight());
            lblFishSpecies.setText(location.getFishSpecies());

         return convertView;
        }

    }
}


