package com.avier.purchaseOrder.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PurchaseOrderDto {
    @JsonProperty("order_number")
    private String orderNumber;
    @JsonProperty("order_status")
    private String orderStatus;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
