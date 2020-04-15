package cn.project.entity;

public class AdditionalFees {
    private Integer id;
    private String additionalFeesName;
    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdditionalFeesName() {
        return additionalFeesName;
    }

    public void setAdditionalFeesName(String additionalFeesName) {
        this.additionalFeesName = additionalFeesName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
