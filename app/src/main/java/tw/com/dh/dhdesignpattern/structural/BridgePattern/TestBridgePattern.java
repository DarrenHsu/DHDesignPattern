package tw.com.dh.dhdesignpattern.structural.BridgePattern;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.structural.BridgePattern.Abstraction.BigWheel;
import tw.com.dh.dhdesignpattern.structural.BridgePattern.Abstraction.Car;
import tw.com.dh.dhdesignpattern.structural.BridgePattern.Abstraction.Motoren;
import tw.com.dh.dhdesignpattern.structural.BridgePattern.Implementor.CentralLocking;
import tw.com.dh.dhdesignpattern.structural.BridgePattern.Implementor.GearLocking;
import tw.com.dh.dhdesignpattern.structural.BridgePattern.Implementor.Product;

public class TestBridgePattern {
    public static void test() {
        Product product = new CentralLocking("Central Locking System");
        Product product2 = new GearLocking("Gear Locking System");

        Car car = new BigWheel(product, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        Log.d(AppConstant.APP_TAG, "\n\n");

        car = new BigWheel(product2, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        Log.d(AppConstant.APP_TAG, "\n\n");

        car = new Motoren(product, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        Log.d(AppConstant.APP_TAG, "\n\n");

        car = new Motoren(product2, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();
        Log.d(AppConstant.APP_TAG, "\n\n");
    }
}
