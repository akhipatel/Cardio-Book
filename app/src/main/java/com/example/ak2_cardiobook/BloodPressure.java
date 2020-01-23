
package Assignment1;

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

    /* Accessor */
    public Date getDate() {
        return this.date;
    }

    public void setDate() {
        this.date = new Date();
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        this.time = sdf.format(date);
    }

}