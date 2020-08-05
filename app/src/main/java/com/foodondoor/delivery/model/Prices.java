package com.foodondoor.delivery.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Prices {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("price")
    @Expose
    private int price;
    @SerializedName("orignal_price")
    @Expose
    private double orignalPrice;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("discount_type")
    @Expose
    private String discountType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Prices withId(Integer id) {
        this.id = id;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Prices withPrice(int price) {
        this.price = price;
        return this;
    }

    public double getOriginalPrice() {
        return orignalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.orignalPrice = originalPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Prices withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Prices withDiscount(Integer discount) {
        this.discount = discount;
        return this;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public Prices withDiscountType(String discountType) {
        this.discountType = discountType;
        return this;
    }
}
