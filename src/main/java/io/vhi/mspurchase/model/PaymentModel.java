package io.vhi.mspurchase.model;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Arrays;
import java.util.List;

@EnableAsync
public class PaymentModel {
    private String id;
    private Double amount;
    private String payeeId;

    public PaymentModel(String id, Double amount, String payeeId) {
        this.id = id;
        this.amount = amount;
        this.payeeId = payeeId;
    }

    @Async
    public static List<PaymentModel> fetchPayments(String userId) {
        try{
            Thread.sleep(1000);
        } catch(InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        return Arrays.asList(
                new PaymentModel("11", 1200.0, "jx-8900"),
                new PaymentModel("11", 1200.0, "jx-8900"),
                new PaymentModel("11", 1200.0, "jx-8900"),
                new PaymentModel("11", 1200.0, "jx-8900"),
                new PaymentModel("11", 1200.0, "jx-8900")
        );
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public Boolean validate () {
        return true;
    }
}
