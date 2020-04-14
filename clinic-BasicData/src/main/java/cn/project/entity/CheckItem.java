package cn.project.entity;


public class CheckItem {
    private Integer id;
    private String itemNo;
    private String itemName;
    private double costPrice;
    private double retailPrice;
    private Integer itemTypeId;
    private String itemTypeName;
    private String part;
    private Integer memberDiscount;
    private Integer itemStatus;
    private String remarks;
    private Integer prescriptionTypeId;
    private String prescriptionTypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public Integer getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public Integer getMemberDiscount() {
        return memberDiscount;
    }

    public void setMemberDiscount(Integer memberDiscount) {
        this.memberDiscount = memberDiscount;
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getPrescriptionTypeId() {
        return prescriptionTypeId;
    }

    public void setPrescriptionTypeId(Integer prescriptionTypeId) {
        this.prescriptionTypeId = prescriptionTypeId;
    }

    public String getPrescriptionTypeName() {
        return prescriptionTypeName;
    }

    public void setPrescriptionTypeName(String prescriptionTypeName) {
        this.prescriptionTypeName = prescriptionTypeName;
    }
}
