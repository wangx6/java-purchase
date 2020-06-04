package io.vhi.mspurchase.model;

public class PurchaseItem {
    private String id;
    private String name;
    private Double price;
    private String currency;

    public PurchaseItem(String id, String name, Double price, String currency) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setId(String id) {
        this.id = id;
    }
}
