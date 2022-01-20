package com.seguros.teste.domain.dtos;

public class BrockerInfo {
    
    private String code;
    private Boolean active;
    private String commissionRate;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public Boolean isActive() {
        return this.active;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


    public String getCommissionRate() {
        return this.commissionRate;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }

    

}
