package io.vhi.mspurchase.model;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class PaymentSaveResponseModel {
    public Boolean ok;
    public String message;

    public PaymentSaveResponseModel() {}

    public PaymentSaveResponseModel(Boolean ok, String message) {
        this.ok = ok;
        this.message = message;
    }
}






