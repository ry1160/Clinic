package cn.project.vo;

public class queryTemplateVO {
    private Integer prescriptionTypeId;
    private Integer templatePermission;
    private String templateNoOrName;
    private Integer pageNo;
    public Integer getPrescriptionTypeId() {
        return prescriptionTypeId;
    }

    public void setPrescriptionTypeId(Integer prescriptionTypeId) {
        this.prescriptionTypeId = prescriptionTypeId;
    }

    public Integer getTemplatePermission() {
        return templatePermission;
    }

    public void setTemplatePermission(Integer templatePermission) {
        this.templatePermission = templatePermission;
    }

    public String getTemplateNoOrName() {
        return templateNoOrName;
    }

    public void setTemplateNoOrName(String templateNoOrName) {
        this.templateNoOrName = templateNoOrName;
    }
}
