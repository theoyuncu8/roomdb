
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoodUnitsData {
    @SerializedName("unit")
    @Expose
    private String unit;
    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("calory")
    @Expose
    private String calory;
    @SerializedName("calcium")
    @Expose
    private String calcium;
    @SerializedName("carbohydrt")
    @Expose
    private String carbohydrt;
    @SerializedName("cholestrl")
    @Expose
    private String cholestrl;
    @SerializedName("fiber_td")
    @Expose
    private String fiberTd;
    @SerializedName("iron")
    @Expose
    private String iron;
    @SerializedName("lipid_tot")
    @Expose
    private String lipidTot;
    @SerializedName("potassium")
    @Expose
    private String potassium;
    @SerializedName("protein")
    @Expose
    private String protein;
    @SerializedName("sodium")
    @Expose
    private String sodium;
    @SerializedName("vit_a_iu")
    @Expose
    private String vitAIu;
    @SerializedName("vit_c")
    @Expose
    private String vitC;


    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCalory() {
        return calory;
    }

    public void setCalory(String calory) {
        this.calory = calory;
    }

    public String getCalcium() {
        return calcium;
    }

    public void setCalcium(String calcium) {
        this.calcium = calcium;
    }

    public String getCarbohydrt() {
        return carbohydrt;
    }

    public void setCarbohydrt(String carbohydrt) {
        this.carbohydrt = carbohydrt;
    }

    public String getCholestrl() {
        return cholestrl;
    }

    public void setCholestrl(String cholestrl) {
        this.cholestrl = cholestrl;
    }

    public String getFiberTd() {
        return fiberTd;
    }

    public void setFiberTd(String fiberTd) {
        this.fiberTd = fiberTd;
    }

    public String getIron() {
        return iron;
    }

    public void setIron(String iron) {
        this.iron = iron;
    }

    public String getLipidTot() {
        return lipidTot;
    }

    public void setLipidTot(String lipidTot) {
        this.lipidTot = lipidTot;
    }

    public String getPotassium() {
        return potassium;
    }

    public void setPotassium(String potassium) {
        this.potassium = potassium;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getSodium() {
        return sodium;
    }

    public void setSodium(String sodium) {
        this.sodium = sodium;
    }

    public String getVitAIu() {
        return vitAIu;
    }

    public void setVitAIu(String vitAIu) {
        this.vitAIu = vitAIu;
    }

    public String getVitC() {
        return vitC;
    }

    public void setVitC(String vitC) {
        this.vitC = vitC;
    }
}
