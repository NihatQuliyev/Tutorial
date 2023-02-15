package time1;

import java.time.LocalTime;

public class Time {
    private int hour ;
    private  int minute ;
    private int second ;
    private int nanoSecond;



    public Time() {
        LocalTime localTime = LocalTime.now();
        this.hour = localTime.getHour();
        this.minute = localTime.getMinute();
        this.second = localTime.getSecond();
        this.nanoSecond = localTime.getNano();

    }
    @TimeManage(value = "Hour: ")
    public int getHour() {
        return hour;
    }

    public void  setHour(int hour) {
        this.hour = hour;
    }
    @TimeManage
    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @TimeManage(value = "Second: ")
    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @TimeManage(value = "NanoSecond: ")
    public int getNanoSecond() {
        return nanoSecond;
    }

    public void setNanoSecond(int nanoSecond) {
        this.nanoSecond = nanoSecond;
    }
}
