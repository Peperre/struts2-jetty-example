package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;

public class InvoiceAction extends ActionSupport  {

    InvoiceBean invoiceBean;
    private final int IVA = 16;

    @Override
    public String execute() throws Exception {

        float pricePlusIva = Integer.parseInt(invoiceBean.getPrice()) + ((float) (Integer.parseInt(invoiceBean.getPrice()) * IVA) / 100);
        invoiceBean.setPricePlusIva(String.valueOf(pricePlusIva));
        return SUCCESS;
    }

    public int getIVA() {
        return IVA;
    }
    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }
    @Override
    public void validate() {
        if (invoiceBean.getSubject().isEmpty()) {
            addFieldError("invoiceBean.subject", "El concepto es obligatorio.");
        }

        if (invoiceBean.getPrice().isEmpty()) {
            addFieldError("invoiceBean.price", "El precio es obligatorio.");
        }
        else  {
            try{
                Integer.parseInt(invoiceBean.getPrice());
            }catch(NumberFormatException e){
                addFieldError("invoiceBean.price", "El precio debe ser un numero entero.");
            }
        }
    }
}
