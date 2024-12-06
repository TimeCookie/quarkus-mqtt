package com.avier.transferOrder.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransferOrderDto {
    @JsonProperty("order_number")
    private String orderNumber;
    @JsonProperty("transfer_from")
    private String transferFrom;
    @JsonProperty("transfer_to")
    private String transferTo;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getTransferFrom() {
        return transferFrom;
    }

    public void setTransferFrom(String transferFrom) {
        this.transferFrom = transferFrom;
    }

    public String getTransferTo() {
        return transferTo;
    }

    public void setTransferTo(String transferTo) {
        this.transferTo = transferTo;
    }

    @Override
    public String toString() {
        return "TransferOrderDto{" +
                "orderNumber='" + orderNumber + '\'' +
                ", transferFrom='" + transferFrom + '\'' +
                ", transferTo='" + transferTo + '\'' +
                '}';
    }
}
