package tw.com.dh.dhdesignpattern.structural.FacadePattern;

import android.util.Log;

import tw.com.dh.constant.AppConstant;

public class ScheduleServer {
    public void startBooting() {
        Log.d(AppConstant.APP_TAG, "server startBooting");
    }

    public void readSystemConfigFile() {
        Log.d(AppConstant.APP_TAG, "server readSystemConfigFile");
    }

    public void init() {
        Log.d(AppConstant.APP_TAG, "server init");
    }

    public void initializeContext() {
        Log.d(AppConstant.APP_TAG, "server initializeContext");
    }

    public void initializeListeners() {
        Log.d(AppConstant.APP_TAG, "server initializeListeners");
    }

    public void createSystemObjects() {
        Log.d(AppConstant.APP_TAG, "server createSystemObjects");
    }

    public void releaseProcesses() {
        Log.d(AppConstant.APP_TAG, "server releaseProcesses");
    }

    public void destory() {
        Log.d(AppConstant.APP_TAG, "server destory");
    }

    public void destroySystemObjects() {
        Log.d(AppConstant.APP_TAG, "server destroySystemObjects");
    }

    public void destoryListeners() {
        Log.d(AppConstant.APP_TAG, "server destoryListeners");
    }

    public void destoryContext() {
        Log.d(AppConstant.APP_TAG, "server destoryContext");
    }

    public void shutdown() {
        Log.d(AppConstant.APP_TAG, "server shutdown");
    }
}
