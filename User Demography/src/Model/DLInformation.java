package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sushm
 */
public class DLInformation {
    
    private String LicenseNum;
    private String DateOfIssue;
    private String DateOfExpiry;
    private String BloodType;
    private String Picture;

    public String getLicenseNum() {
        return LicenseNum;
    }

    public void setLicenseNum(String LicenseNum) {
        this.LicenseNum = LicenseNum;
    }

    public String getDateOfIssue() {
        return DateOfIssue;
    }

    public void setDateOfIssue(String DateOfIssue) {
        this.DateOfIssue = DateOfIssue;
    }

    public String getDateOfExpiry() {
        return DateOfExpiry;
    }

    public void setDateOfExpiry(String DateOfExpiry) {
        this.DateOfExpiry = DateOfExpiry;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String Picture) {
        this.Picture = Picture;
    }
    
    
    
}
