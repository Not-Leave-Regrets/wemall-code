package com.wlf.index.application.entity;

import java.io.Serializable;

public class Choices implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column choice.goodspics
     *
     * @mbg.generated
     */
    private String goodspics;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table choice
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice.id
     *
     * @return the value of choice.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice.id
     *
     * @param id the value for choice.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice.title
     *
     * @return the value of choice.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice.title
     *
     * @param title the value for choice.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column choice.goodspics
     *
     * @return the value of choice.goodspics
     *
     * @mbg.generated
     */
    public String getGoodspics() {
        return goodspics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column choice.goodspics
     *
     * @param goodspics the value for choice.goodspics
     *
     * @mbg.generated
     */
    public void setGoodspics(String goodspics) {
        this.goodspics = goodspics == null ? null : goodspics.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
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
        sb.append(", title=").append(title);
        sb.append(", goodspics=").append(goodspics);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}