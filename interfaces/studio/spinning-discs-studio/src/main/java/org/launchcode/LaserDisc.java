package org.launchcode;

public class LaserDisc extends BaseDisc implements OpticalDisc {

    // Constructor to initialize LaserDisc-specific fields
    public LaserDisc(String name, int storageCapacity, String contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    // Override methods from OpticalDisc interface
    @Override
    public void spinDisc() {
        System.out.println("A LaserDisc spins at a rate of 1800 rpm.");
    }

    @Override
    public void storeData() {
        System.out.println("Storing analog video data to the LaserDisc.");
    }

    @Override
    public void readData() {
        System.out.println("Reading data from the LaserDisc using a laser.");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to the LaserDisc using a laser.");
    }

    @Override
    public void discType() {
        System.out.println("This is a LaserDisc.");
    }
}
