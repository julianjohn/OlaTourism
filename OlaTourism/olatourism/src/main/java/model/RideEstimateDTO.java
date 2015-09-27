package model;

import java.util.ArrayList;

/**
 * Created by PrakashNandi on 27/09/15.
 */
public class RideEstimateDTO {

    public String category;
    public double distance;
    public int travel_time_in_minutes;
    public int amount_min;
    public int amount_max;

    public RideEstimateDTO(String category, double distance, int travel_time_in_minutes, int amount_min, int amount_max) {
        this.category = category;
        this.distance = distance;
        this.travel_time_in_minutes = travel_time_in_minutes;
        this.amount_min = amount_min;
        this.amount_max = amount_max;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getTravel_time_in_minutes() {
        return travel_time_in_minutes;
    }

    public void setTravel_time_in_minutes(int travel_time_in_minutes) {
        this.travel_time_in_minutes = travel_time_in_minutes;
    }

    public int getAmount_min() {
        return amount_min;
    }

    public void setAmount_min(int amount_min) {
        this.amount_min = amount_min;
    }

    public int getAmount_max() {
        return amount_max;
    }

    public void setAmount_max(int amount_max) {
        this.amount_max = amount_max;
    }
}

