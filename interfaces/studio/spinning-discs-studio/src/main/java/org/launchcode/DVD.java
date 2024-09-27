package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, int storageCapacity, String contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    // Override methods from OpticalDisc interface
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storeData() {
        System.out.println("Storing data to the DVD using a laser.");
    }

    @Override
    public void readData() {
        System.out.println("Reading data from the DVD using a laser.");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to the DVD using a laser.");
    }

    @Override
    public void discType() {
        System.out.println("This is a DVD.");
    }
}