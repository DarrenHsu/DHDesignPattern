package tw.com.dh.dhdesignpattern.structural.AdapterPattern.Adapter;

import tw.com.dh.dhdesignpattern.structural.AdapterPattern.Target.PayD;
import tw.com.dh.dhdesignpattern.structural.AdapterPattern.Adaptee.PayX;

public class PayXToPayDAdapter implements PayD {
    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;

    private final PayX payX;

    public PayXToPayDAdapter(PayX payX){
        this.payX = payX;
        setProp();
    }

    @Override
    public String getCustCardNo() {
        return custCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    @Override
    public Integer getCVVNo() {
        return cVVNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    private void setProp(){
        setCardOwnerName(this.payX.getCustomerName());
        setCustCardNo(this.payX.getCreditCardNo());
        setCardExpMonthDate(this.payX.getCardExpMonth() + "/" + this.payX.getCardExpYear());
        setCVVNo(this.payX.getCardCVVNo().intValue());
        setTotalAmount(this.payX.getAmount());
    }

}
