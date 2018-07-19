package tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern.Handlers;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern.LeaveRequest;

public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void heandleRequest(LeaveRequest request) {
        if (request.getLevelDays() < 30) {
            Log.d(AppConstant.APP_TAG, "emp: " + request.getEmpName() + " leave: " + request.getLevelDays() + " reson: " + request.getReason());
            Log.d(AppConstant.APP_TAG, "leader: " + this.name + " accept!");
        }else {
            Log.d(AppConstant.APP_TAG, "other then " + request.getEmpName() + " need leave job!");
        }
    }
}
