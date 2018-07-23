package tw.com.dh.dhdesignpattern.structural.BridgePattern.Abstraction;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.structural.BridgePattern.Implementor.Product;

public abstract class Car {
    private final Product product;
    private final String carType;

    public Car(Product product,String carType){
        this.product = product;
        this.carType = carType;
    }

    public abstract void assemble();
    public abstract void produceProduct();

    public void printDetails(){
        Log.d(AppConstant.APP_TAG,"Car: " + carType + ", Product:" + product.productName());
    }
}
