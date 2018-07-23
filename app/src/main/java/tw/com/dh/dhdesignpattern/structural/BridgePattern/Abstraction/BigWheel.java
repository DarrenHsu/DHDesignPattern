package tw.com.dh.dhdesignpattern.structural.BridgePattern.Abstraction;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.structural.BridgePattern.Implementor.Product;

public class BigWheel extends Car {
    private final Product product;
    private final String carType;

    public BigWheel(Product product, String carType) {
        super(product, carType);
        this.product = product;
        this.carType = carType;
    }

    @Override
    public void assemble() {
        Log.d(AppConstant.APP_TAG,"Assembling " + product.productName() + " for " + carType);
    }

    @Override
    public void produceProduct() {
        product.produce();
        Log.d(AppConstant.APP_TAG, "Modifing product " + product.productName() + " according to " + carType);
    }
}
