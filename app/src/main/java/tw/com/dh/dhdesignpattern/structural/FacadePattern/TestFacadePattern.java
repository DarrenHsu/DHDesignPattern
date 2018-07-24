package tw.com.dh.dhdesignpattern.structural.FacadePattern;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.structural.FacadePattern.Facade.ScheduleServerFacade;

public class TestFacadePattern {
    public static void test() {
        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);

        facadeServer.startServer();

        Log.d(AppConstant.APP_TAG,"Start working......");
        Log.d(AppConstant.APP_TAG,"After work done.........");

        facadeServer.stopServer();
    }
}
