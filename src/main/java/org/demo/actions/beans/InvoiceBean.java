package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {

    private String subject;

    private String price;

    private String pricePlusIva;

    private Date dateFrom;
    private Date dateTo;

    public String getPricePlusIva() {
        return pricePlusIva;
    }

    public void setPricePlusIva(String pricePlusIva) {
        this.pricePlusIva = pricePlusIva;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
