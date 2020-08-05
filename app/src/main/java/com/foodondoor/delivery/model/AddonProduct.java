package com.foodondoor.delivery.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class AddonProduct {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("addon_id")
    @Expose
    private Integer addonId;
    @SerializedName("product_id")
    @Expose
    private Integer productId;
    @SerializedName("price")
    @Expose
    private int price;
    @SerializedName("addon")
    @Expose
    private Addon addon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AddonProduct withId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getAddonId() {
        return addonId;
    }

    public void setAddonId(Integer addonId) {
        this.addonId = addonId;
    }

    public AddonProduct withAddonId(Integer addonId) {
        this.addonId = addonId;
        return this;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public AddonProduct withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public AddonProduct withPrice(int price) {
        this.price = price;
        return this;
    }

    public Addon getAddon() {
        return addon;
    }

    public void setAddon(Addon addon) {
        this.addon = addon;
    }

    public AddonProduct withAddon(Addon addon) {
        this.addon = addon;
        return this;
    }
}
