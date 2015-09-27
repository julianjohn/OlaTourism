package model;

/**
 * Created by PrakashNandi on 27/09/15.
 */
public class SurchargeDTO {

    public String name;
    public String type;
    public String description;
    public float value;

    public SurchargeDTO(String name, String type, String description, float value) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
