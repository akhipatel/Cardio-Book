
package com.example.ak2_cardiobook;

import java.time.format.TextStyle;
import java.util.Date;

public class Test {

    public static void main(String args[]) {

        BloodPressure bp = new BloodPressure();
        System.out.println("#----------------------Program Start----------------------#\n");

        bp.setDate();
        Date test = bp.getDate();
        System.out.println(test);

        bp.setTime(test);
        String time = bp.getTime();
        System.out.println(time);

        System.out.println("\n#----------------------Program End----------------------#");
    }
}
