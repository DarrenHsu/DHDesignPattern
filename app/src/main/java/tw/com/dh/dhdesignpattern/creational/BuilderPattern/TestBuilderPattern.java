package tw.com.dh.dhdesignpattern.creational.BuilderPattern;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.creational.BuilderPattern.Builder.CarBuilder;
import tw.com.dh.dhdesignpattern.creational.BuilderPattern.Builder.SedanCarBuilder;
import tw.com.dh.dhdesignpattern.creational.BuilderPattern.Builder.SportsCarBuilder;
import tw.com.dh.dhdesignpattern.creational.BuilderPattern.Director.CarDirector;
import tw.com.dh.dhdesignpattern.creational.BuilderPattern.Product.Car;

public class TestBuilderPattern {
    public static void test() {
        CarBuilder builder = new SedanCarBuilder();
        CarDirector director = new CarDirector(builder);
        Car car = director.build();
        Log.d(AppConstant.APP_TAG, car.toString());

        builder = new SportsCarBuilder();
        director = new CarDirector(builder);
        car = director.build();
        Log.d(AppConstant.APP_TAG, car.toString());
    }
}
