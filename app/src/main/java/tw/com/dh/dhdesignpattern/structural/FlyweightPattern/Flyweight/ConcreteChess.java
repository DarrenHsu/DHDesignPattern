package tw.com.dh.dhdesignpattern.structural.FlyweightPattern.Flyweight;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class ConcreteChess implements ChessFlyweight {
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Cordinate cordinate) {
        Log.d(AppConstant.APP_TAG, "color " + getColor());
        Log.d(AppConstant.APP_TAG, "cordinate " + cordinate.getX() + "," + cordinate.getY());
    }
}
