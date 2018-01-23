package com.xulala.SSMTemplate.entity;

import java.math.BigDecimal;

public class HatchetMcc {
    private String id;

    private String mccCode;

    private String mccDesc;

    private BigDecimal rate;

    private BigDecimal maxFee;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMccCode() {
        return mccCode;
    }

    public void setMccCode(String mccCode) {
        this.mccCode = mccCode == null ? null : mccCode.trim();
    }

    public String getMccDesc() {
        return mccDesc;
    }

    public void setMccDesc(String mccDesc) {
        this.mccDesc = mccDesc == null ? null : mccDesc.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getMaxFee() {
        return maxFee;
    }

    public void setMaxFee(BigDecimal maxFee) {
        this.maxFee = maxFee;
    }
}