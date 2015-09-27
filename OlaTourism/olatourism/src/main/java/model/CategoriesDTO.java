package model;

import java.util.ArrayList;

/**
 * Created by PrakashNandi on 27/09/15.
 */
public class CategoriesDTO {

    public String id;
    public String display_name;
    public String currency;
    public String distance_unit;
    public String time_unit;
    public int eta;
    public int distance;
    public String image;
    public ArrayList<FareBreakUpDTO> fare_breakup;

    public CategoriesDTO(String id, String display_name, String currency, String distance_unit, String time_unit, int eta, int distance, String image, ArrayList<FareBreakUpDTO> fare_breakup) {
        this.id = id;
        this.display_name = display_name;
        this.currency = currency;
        this.distance_unit = distance_unit;
        this.time_unit = time_unit;
        this.eta = eta;
        this.distance = distance;
        this.image = image;
        this.fare_breakup = fare_breakup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDistance_unit() {
        return distance_unit;
    }

    public void setDistance_unit(String distance_unit) {
        this.distance_unit = distance_unit;
    }

    public String getTime_unit() {
        return time_unit;
    }

    public void setTime_unit(String time_unit) {
        this.time_unit = time_unit;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<FareBreakUpDTO> getFare_breakup() {
        return fare_breakup;
    }

    public void setFare_breakup(ArrayList<FareBreakUpDTO> fare_breakup) {
        this.fare_breakup = fare_breakup;
    }
}
