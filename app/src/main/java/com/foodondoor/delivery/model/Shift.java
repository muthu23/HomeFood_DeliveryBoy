package com.foodondoor.delivery.model;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Shift {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("transporter_id")
    @Expose
    private Integer transporterId;
    @SerializedName("transporter_vehicle_id")
    @Expose
    private Integer transporterVehicleId;
    @SerializedName("total_order")
    @Expose
    private Integer totalOrder;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("end_time")
    @Expose
    private String endTime;
    @SerializedName("deleted_at")
    @Expose
    private String deletedAt;
    @SerializedName("total_amount")
    @Expose
    private int totalAmount;
    @SerializedName("total_amount_pay")
    @Expose
    private int totalAmountPay;
    @SerializedName("vehicle")
    @Expose
    private Vehicle vehicle;
    @SerializedName("shiftbreaktimes")
    @Expose
    private List<Shiftbreaktime> shiftbreaktimes = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Shift withId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getTransporterId() {
        return transporterId;
    }

    public void setTransporterId(Integer transporterId) {
        this.transporterId = transporterId;
    }

    public Shift withTransporterId(Integer transporterId) {
        this.transporterId = transporterId;
        return this;
    }

    public Integer getTransporterVehicleId() {
        return transporterVehicleId;
    }

    public void setTransporterVehicleId(Integer transporterVehicleId) {
        this.transporterVehicleId = transporterVehicleId;
    }

    public Shift withTransporterVehicleId(Integer transporterVehicleId) {
        this.transporterVehicleId = transporterVehicleId;
        return this;
    }

    public Integer getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(Integer totalOrder) {
        this.totalOrder = totalOrder;
    }

    public Shift withTotalOrder(Integer totalOrder) {
        this.totalOrder = totalOrder;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Shift withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Shift withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Shift withDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Shift withTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public int getTotalAmountPay() {
        return totalAmountPay;
    }

    public void setTotalAmountPay(int totalAmountPay) {
        this.totalAmountPay = totalAmountPay;
    }

    public Shift withTotalAmountPay(int totalAmountPay) {
        this.totalAmountPay = totalAmountPay;
        return this;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Shift withVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public List<Shiftbreaktime> getShiftbreaktimes() {
        return shiftbreaktimes;
    }

    public void setShiftbreaktimes(List<Shiftbreaktime> shiftbreaktimes) {
        this.shiftbreaktimes = shiftbreaktimes;
    }

    public Shift withShiftbreaktimes(List<Shiftbreaktime> shiftbreaktimes) {
        this.shiftbreaktimes = shiftbreaktimes;
        return this;
    }

}