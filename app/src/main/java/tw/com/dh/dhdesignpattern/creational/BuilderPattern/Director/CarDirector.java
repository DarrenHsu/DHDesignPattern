package tw.com.dh.dhdesignpattern.creational.BuilderPattern.Director;

import tw.com.dh.dhdesignpattern.creational.BuilderPattern.Builder.CarBuilder;

public class CarDirector {

    private CarBuilder mCarBuilder;

    public CarDirector(CarBuilder carBuilder) {
        mCarBuilder = carBuilder;
    }

    public void build() {
        mCarBuilder.buildBodyStyle();
        mCarBuilder.buildPower();
        mCarBuilder.buildEngine();
        mCarBuilder.buildBreaks();
        mCarBuilder.buildSeats();
        mCarBuilder.buildWindows();
        mCarBuilder.buildFuelType();
    }
}
