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
public class BankingInformation {
    
    private String BankName;
    private String BankRountingNum;
    private String AccNum;
    private String AccBalance;
    private String AccType;

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getBankRountingNum() {
        return BankRountingNum;
    }

    public void setBankRountingNum(String BankRountingNum) {
        this.BankRountingNum = BankRountingNum;
    }

    public String getAccNum() {
        return AccNum;
    }

    public void setAccNum(String AccNum) {
        this.AccNum = AccNum;
    }

    public String getAccBalance() {
        return AccBalance;
    }

    public void setAccBalance(String AccBalance) {
        this.AccBalance = AccBalance;
    }

    public String getAccType() {
        return AccType;
    }

    public void setAccType(String AccType) {
        this.AccType = AccType;
    }
    
    
}
