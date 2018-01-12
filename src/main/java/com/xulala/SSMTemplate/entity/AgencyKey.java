package com.xulala.SSMTemplate.entity;

/**
 * Created by Administrator on 2017/12/27 0027.
 * 各渠道加密秘钥
 */
public class AgencyKey {
    private Integer id;//主键
    private String agencyNo;//机构号
    private String md5Key;//MD5加密串
    private String desKey;//des加密串
    private String remark;//备注

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAgencyNo() {
        return agencyNo;
    }

    public void setAgencyNo(String agencyNo) {
        this.agencyNo = agencyNo;
    }

    public String getMd5Key() {
        return md5Key;
    }

    public void setMd5Key(String md5Key) {
        this.md5Key = md5Key;
    }

    public String getDesKey() {
        return desKey;
    }

    public void setDesKey(String desKey) {
        this.desKey = desKey;
    }
}
