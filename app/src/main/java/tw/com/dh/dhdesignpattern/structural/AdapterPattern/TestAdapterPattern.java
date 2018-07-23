package tw.com.dh.dhdesignpattern.structural.AdapterPattern;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.structural.AdapterPattern.Adapter.PayXToPayDAdapter;

public class TestAdapterPattern {
    public static void test() {
        PayX xpay = new PayXImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Max Warner");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)235);
        xpay.setAmount(2565.23);

        PayD payD = new PayXToPayDAdapter(xpay);

        Log.d(AppConstant.APP_TAG, payD.getCardOwnerName());
        Log.d(AppConstant.APP_TAG, payD.getCustCardNo());
        Log.d(AppConstant.APP_TAG, payD.getCardExpMonthDate());
        Log.d(AppConstant.APP_TAG, "" + payD.getCVVNo());
        Log.d(AppConstant.APP_TAG, "" +payD.getTotalAmount());
    }
}
