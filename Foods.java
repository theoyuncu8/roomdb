

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Foods {
    @SerializedName("food_id")
    @Expose
    private String foodId;
    @SerializedName("food_name")
    @Expose
    private String foodName;
    @SerializedName("food_image")
    @Expose
    private String foodImage;
    @SerializedName("food_kcal")
    @Expose
    private String foodKcal;
    @SerializedName("food_url")
    @Expose
    private String foodUrl;
    @SerializedName("food_description")
    @Expose
    private String foodDescription;
    @SerializedName("carb_percent")
    @Expose
    private String carbPercent;
    @SerializedName("protein_percent")
    @Expose
    private String proteinPercent;
    @SerializedName("fat_percent")
    @Expose
    private String fatPercent;
    @SerializedName("units")
    @Expose
    private List<FoodUnitsData> units = null;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    public String getFoodKcal() {
        return foodKcal;
    }

    public void setFoodKcal(String foodKcal) {
        this.foodKcal = foodKcal;
    }

    public String getFoodUrl() {
        return foodUrl;
    }

    public void setFoodUrl(String foodUrl) {
        this.foodUrl = foodUrl;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public String getCarbPercent() {
        return carbPercent;
    }

    public void setCarbPercent(String carbPercent) {
        this.carbPercent = carbPercent;
    }

    public String getProteinPercent() {
        return proteinPercent;
    }

    public void setProteinPercent(String proteinPercent) {
        this.proteinPercent = proteinPercent;
    }

    public String getFatPercent() {
        return fatPercent;
    }

    public void setFatPercent(String fatPercent) {
        this.fatPercent = fatPercent;
    }

    public List<FoodUnitsData> getUnits() {
        return units;
    }

    public void setUnits(List<FoodUnitsData> units) {
        this.units = units;
    }

}
