package com.harlan.lhc.uitlsclass.utils;

/**
 * 线程睡眠
 * Created by a1 on 2017/10/13.
 */
public class CSleep {
    public static final long DEFAULT_SLEEP_TIME = 500;

    private boolean          isRuning           = false;

    public boolean isRuning() {
        return isRuning;
    }

    public void runWithTime(final long defaultSleepTime) {
        isRuning = true;
        new Thread() {

            @Override
            public void run() {
                try {
                    sleep(defaultSleepTime, 0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                isRuning = false;
                super.run();
            }
        }.start();
    }
}

