package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private String contents;
    private String discType;

    public BaseDisc(String name, int storageCapacity, String contents, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void reportInfo() {
        System.out.println("Disc name: " + name);
        System.out.println("Capacity: " + storageCapacity + "MB");
        System.out.println("Contents: " + contents);
        System.out.println("Type: " + discType);
    }
}