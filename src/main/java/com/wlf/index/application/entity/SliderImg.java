package com.wlf.index.application.entity;

import java.io.Serializable;

public class SliderImg implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slider_img.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slider_img.picurl
     *
     * @mbg.generated
     */
    private String picurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table slider_img
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slider_img.id
     *
     * @return the value of slider_img.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slider_img.id
     *
     * @param id the value for slider_img.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slider_img.picurl
     *
     * @return the value of slider_img.picurl
     *
     * @mbg.generated
     */
    public String getPicurl() {
        return picurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slider_img.picurl
     *
     * @param picurl the value for slider_img.picurl
     *
     * @mbg.generated
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slider_img
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", picurl=").append(picurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}