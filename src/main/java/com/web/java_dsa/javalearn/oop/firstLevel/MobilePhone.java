package com.web.java_dsa.javalearn.oop.firstLevel;

public class MobilePhone {

    private final String brand;
    private final String model;
    private final int battery;
    private final double storage;
    private boolean isInstall = false;

    public MobilePhone(String brand,String model,int battery,double storage){
        this.brand=brand;
        this.model=model;
        this.battery=battery;
        this.storage=storage;
    }

    public double getStorage() {
        return storage;
    }

    public int getBattery() {
        return battery;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isInstall() {return isInstall;}

    public void call(){
        if (battery == 0){
            System.out.println("Telefon qilish imkonsiz.");
        } else {
            System.out.println("Qo'ng'iroq qilinyapti...");
        }
    }
    public void charge(){

    }
    public void installApp(){

    }
    @Override
    public String toString(){
        return "Brand: " + brand + ", Model: " + model + ", Battery: " + battery + "%, Storage: " + storage;
    }

    public static void main(String[] args) {
        // 10. MobilePhone
        //
        //MobilePhone klassini yarating.
        //
        //brand
        //model
        //battery
        //storage
        //
        //Metodlar:
        //
        //call()
        //charge()
        //installApp()
        //
        //Battery 0 bo‘lsa call qilish mumkin emas.
    }
}
