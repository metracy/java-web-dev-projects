package org.launchcode;

public class Main {
    public static void main(String[] args) {
        // Create CD and DVD objects
        CD myCd = new CD("Thriller", 700, "Michael Jackson", "CD");
        DVD myDvd = new DVD("Movie", 4700, "Action Movie", "DVD");
        LaserDisc myLaserDisc = new LaserDisc("Bill Nye Science Guy", 9000, "Science Show", "LaserDisc");

        System.out.println("CDs");

        myCd.spinDisc();
        myCd.storeData();
        myCd.readData();
        myCd.writeData();
        myCd.discType();
        myCd.reportInfo();

        System.out.println("DvDs");

        myDvd.spinDisc();
        myDvd.storeData();
        myDvd.readData();
        myDvd.writeData();
        myDvd.discType();
        myDvd.reportInfo();

        System.out.println("LaserDiscs");

        myLaserDisc.spinDisc();
        myLaserDisc.storeData();
        myLaserDisc.readData();
        myLaserDisc.writeData();
        myLaserDisc.discType();
        myLaserDisc.reportInfo();
    }
}
