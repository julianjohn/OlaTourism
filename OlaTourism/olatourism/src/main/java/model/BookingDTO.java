package model;

/**
 * Created by julianrex on 27/09/15.
 */
public class BookingDTO {
    public String crn;
    public String driver_name;
    public String driver_number;
    public String cab_type;
    public String cab_number;
    public String car_model;
    public int eta;
    public double driver_lat;
    public double driver_lng;

    public BookingDTO(String crn, String driver_name,String driver_number, String cab_type,String cab_number,String car_model, int eta, double driver_lat, double driver_lng){
        this.crn = crn;
        this.driver_name = driver_name;
        this.driver_number = driver_number;
        this.cab_type = cab_type;
        this.cab_number = cab_number;
        this.car_model = car_model;
        this.driver_lat = driver_lat;
        this.driver_lng = driver_lng;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getDriver_number() {
        return driver_number;
    }

    public void setDriver_number(String driver_number) {
        this.driver_number = driver_number;
    }

    public String getCab_type() {
        return cab_type;
    }

    public void setCab_type(String cab_type) {
        this.cab_type = cab_type;
    }

    public String getCab_number() {
        return cab_number;
    }

    public void setCab_number(String cab_number) {
        this.cab_number = cab_number;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public double getDriver_lat() {
        return driver_lat;
    }

    public void setDriver_lat(double driver_lat) {
        this.driver_lat = driver_lat;
    }

    public double getDriver_lng() {
        return driver_lng;
    }

    public void setDriver_lng(double driver_lng) {
        this.driver_lng = driver_lng;
    }
}
