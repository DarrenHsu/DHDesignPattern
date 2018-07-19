package tw.com.dh.dhdesignpattern.creational.BuilderPattern.Builder;

import tw.com.dh.dhdesignpattern.creational.BuilderPattern.Product.Car;

public interface CarBuilder {
    void buildBodyStyle();
    void buildPower();
    void buildEngine();
    void buildBreaks();
    void buildSeats();
    void buildWindows();
    void buildFuelType();
    Car getCar();
}
