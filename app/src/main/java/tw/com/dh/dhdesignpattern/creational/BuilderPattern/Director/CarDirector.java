package tw.com.dh.dhdesignpattern.creational.BuilderPattern.Director;

import tw.com.dh.dhdesignpattern.creational.BuilderPattern.Builder.CarBuilder;
import tw.com.dh.dhdesignpattern.creational.BuilderPattern.Product.Car;

public class CarDirector {

    private CarBuilder mCarBuilder;

    public CarDirector(CarBuilder carBuilder) {
        mCarBuilder = carBuilder;
    }

    public Car build() {
        mCarBuilder.buildBodyStyle();
        mCarBuilder.buildPower();
        mCarBuilder.buildEngine();
        mCarBuilder.buildBreaks();
        mCarBuilder.buildSeats();
        mCarBuilder.buildWindows();
        mCarBuilder.buildFuelType();
        return mCarBuilder.getCar();
    }
}
