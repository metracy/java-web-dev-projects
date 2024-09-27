package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {


    public CD(String name, int storageCapacity, String contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("Spinrate: 200 - 500 rpm.");
    }

    @Override
    public void storeData() {
        System.out.println("Writing Data");
    }

    @Override
    public void readData() {
        System.out.println("Reading data from the CD using a laser.");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to the CD using a laser.");
    }

    @Override
    public void discType() {
        System.out.println("This is a CD.");
    }
}
