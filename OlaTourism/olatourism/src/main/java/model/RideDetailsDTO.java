package model;

import java.util.ArrayList;

/**
 * Created by PrakashNandi on 27/09/15.
 */
public class RideDetailsDTO {

    public ArrayList<CategoriesDTO> categories;
    public ArrayList<RideEstimateDTO> ride_estimate;

    public RideDetailsDTO() {

    }

    public RideDetailsDTO(ArrayList<CategoriesDTO> categories, ArrayList<RideEstimateDTO> ride_estimate) {
        this.categories = categories;
        this.ride_estimate = ride_estimate;
    }

    public ArrayList<CategoriesDTO> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<CategoriesDTO> categories) {
        this.categories = categories;
    }

    public ArrayList<RideEstimateDTO> getRide_estimate() {
        return ride_estimate;
    }

    public void setRide_estimate(ArrayList<RideEstimateDTO> ride_estimate) {
        this.ride_estimate = ride_estimate;
    }
}
