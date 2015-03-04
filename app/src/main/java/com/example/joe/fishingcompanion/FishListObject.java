package com.example.joe.fishingcompanion;

/**
 * Created by Joe on 3/4/2015.
 */
public class FishListObject {

    private String fishSpecies;
    private String fishWeight;

    public String getFishSpecies() {
        return fishSpecies;
    }

    public String getFishWeight() {
        return fishWeight;
    }

    public FishListObject(String fishSpecies, String fishWeight){
        this.fishSpecies = fishSpecies;
        this.fishWeight = fishWeight;
    }
}
