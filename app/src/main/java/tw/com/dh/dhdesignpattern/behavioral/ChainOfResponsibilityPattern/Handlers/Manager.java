package tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern.Handlers;

import android.util.Log;

import tw.com.dh.constant.AppConstant;
import tw.com.dh.dhdesignpattern.behavioral.ChainOfResponsibilityPattern.LeaveRequest;

public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void heandleRequest(LeaveRequest request) {
        if (request.getLevelDays() < 10) {
            Log.d(AppConstant.APP_TAG, "emp: " + request.getEmpName() + " leave: " + request.getLevelDays() + " reson: " + request.getReason());
            Log.d(AppConstant.APP_TAG, "leader: " + this.name + " accept!");
        }else {
            Log.d(AppConstant.APP_TAG, this.name + " not support!");
            if (this.nextLeader != null) {
                this.nextLeader.heandleRequest(request);
            }
        }
    }
}
