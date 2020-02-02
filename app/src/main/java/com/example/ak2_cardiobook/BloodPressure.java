
package com.example.ak2_cardiobook;

import java.text.SimpleDateFormat;
import java.util.Date;


//TODO: Need to make another file that has a records array which will keep track of everything.

/*Note to self, to run in terminal
    1-- javac BloodPressure.java
    2-- java BloodPressure */

public class BloodPressure {

    /* Fields */
    private Date date;
    private String time;
    private int systolicPressure;
    private int diastolicPressure;
    private int heartRate;
    private String comments;

    /* Constructor */
    BloodPressure() {
        this.date = new Date();
        this.time = "";
        this.systolicPressure = 0;
        this.diastolicPressure = 0;
        this.heartRate = 0;
        this.comments = "";
    }

    /* Main */
    public static void main(String[] args) {

        System.out.println("Hello World");

        BloodPressure bp = new BloodPressure();
        bp.setDate();
        System.out.println(bp.getDate().toString());
        // date = new Date();
        // System.out.println(bp.getTime(date).toString());

    }

    /* Accessors Getters and Setters */
    /**
     * @return the daet
     */
    public Date getDate() {
        return this.date;
    }
    /**
     * @param date the date to set
     */
    public void setDate() {
        this.date = new Date();
    }
    /**
     * @return the time
     */
    public String getTime() {
        return this.time;
    }
    /**
     * @param time the time to set
     */
    public void setTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        this.time = sdf.format(date);
    }

    /**
     * @return the systolicPressure
     */
    public int getSystolicPressure() {
        return systolicPressure;
    }

    /**
     * @param systolicPressure the systolicPressure to set
     */
    public void setSystolicPressure(int systolicPressure) {
        this.systolicPressure = systolicPressure;
    }
    /**
     * @return the diastolicPressure
     */
    public int getDiastolicPressure() {
        return diastolicPressure;
    }

    /**
     * @param diastolicPressure the diastolicPressure to set
     */
    public void setDiastolicPressure(int diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }
    /**
     * @return the heartRate
     */
    public int getHeartRate() {
        return heartRate;
    }
    /**
     * @param heartRate the heartRate to set
     */
    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }
    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        if (comments.length() > 20){
            System.out.println("Please input comment under 20 characters");
        }else{
            this.comments = comments;
        }
    }

}
