package com.xulala.SSMTemplate.entity;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import java.io.Serializable;

public class AjaxMessage implements Serializable {
    private static final long serialVersionUID = 287162721460370957L;
    private String content;
    private String value;
    private String code;
    private String src;
    private String status;
    private String[] contentArray;
    private Object obj;
    private Object[] objArray;
    private String id;
    String title;
    boolean isSuccess;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getContentArray() {
        return this.contentArray;
    }

    public void setContentArray(String[] contentArray) {
        this.contentArray = contentArray;
    }

    public AjaxMessage() {
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSrc() {
        return this.src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public AjaxMessage(String content, String title, boolean isSuccess) {
        this.content = content;
        this.title = title;
        this.isSuccess = isSuccess;
    }

    public AjaxMessage(String value) {
        this.setValue(value);
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getObj() {
        return this.obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object[] getObjArray() {
        return this.objArray;
    }

    public void setObjArray(Object[] objArray) {
        this.objArray = objArray;
    }
}
