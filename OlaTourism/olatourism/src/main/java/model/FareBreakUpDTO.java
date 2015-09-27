package model;

import java.util.ArrayList;

/**
 * Created by PrakashNandi on 27/09/15.
 */
public class FareBreakUpDTO {

    public String type;
    public String minimum_distance;
    public String minimum_time;
    public String base_fare;
    public String cost_per_distance;
    public String waiting_cost_per_minute;
    public String ride_cost_per_minute;
    public ArrayList<SurchargeDTO> surcharge;


    public FareBreakUpDTO(String type, String minimum_distance, String minimum_time, String base_fare, String cost_per_distance, String waiting_cost_per_minute, String ride_cost_per_minute, ArrayList<SurchargeDTO>  surcharge) {
        this.type = type;
        this.minimum_distance = minimum_distance;
        this.minimum_time = minimum_time;
        this.base_fare = base_fare;
        this.cost_per_distance = cost_per_distance;
        this.waiting_cost_per_minute = waiting_cost_per_minute;
        this.ride_cost_per_minute = ride_cost_per_minute;
        this.surcharge = surcharge;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMinimum_distance() {
        return minimum_distance;
    }

    public void setMinimum_distance(String minimum_distance) {
        this.minimum_distance = minimum_distance;
    }

    public String getMinimum_time() {
        return minimum_time;
    }

    public void setMinimum_time(String minimum_time) {
        this.minimum_time = minimum_time;
    }

    public String getBase_fare() {
        return base_fare;
    }

    public void setBase_fare(String base_fare) {
        this.base_fare = base_fare;
    }

    public String getCost_per_distance() {
        return cost_per_distance;
    }

    public void setCost_per_distance(String cost_per_distance) {
        this.cost_per_distance = cost_per_distance;
    }

    public String getWaiting_cost_per_minute() {
        return waiting_cost_per_minute;
    }

    public void setWaiting_cost_per_minute(String waiting_cost_per_minute) {
        this.waiting_cost_per_minute = waiting_cost_per_minute;
    }

    public String getRide_cost_per_minute() {
        return ride_cost_per_minute;
    }

    public void setRide_cost_per_minute(String ride_cost_per_minute) {
        this.ride_cost_per_minute = ride_cost_per_minute;
    }

    public ArrayList<SurchargeDTO> getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(ArrayList<SurchargeDTO>  surcharge) {
        this.surcharge = surcharge;
    }
}
