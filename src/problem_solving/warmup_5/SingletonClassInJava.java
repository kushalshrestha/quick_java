/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_5;
/**
 * singleton class in Java
 * IMPORTANT POINTS
 *  - constructor private -> so that we cannot create the object of the class. But we can get the object by calling
 *  the method getInstance().
 *  - And getInstance() is static so it can be called without creating the object. and returns the object.
 * */
public class SingletonClassInJava {

    public static void main(String[] args) {
        WaterJug wj = WaterJug.getInstance();
        System.out.println(wj.getWaterQuantity(100));
        System.out.println(wj.getWaterQuantity(200));
        System.out.println(wj.getWaterQuantity(300));

        // to prove its singleton
        WaterJug wj2 = WaterJug.getInstance();
        System.out.println(wj == wj2);  //true
        System.out.println(wj2.equals(wj)); //true
    }
}


class WaterJug {
    private int waterQuantity = 500;
    private WaterJug(){} //private -. to prevents new WaterJug() and creating new instance
    private static volatile WaterJug object = null; // volatile ->

    public int getWaterQuantity(int quantity){
        if (quantity <= waterQuantity){
            waterQuantity -= quantity;
            return quantity;
        }
        return 0;
    }

    public static WaterJug getInstance(){
        //Double-checked locking -> Thread-safe + performant
        if (object == null){
            synchronized(WaterJug.class) {
                if (object == null) {
                    object = new WaterJug();
                }
            }
        }
        return object;
    }
}
