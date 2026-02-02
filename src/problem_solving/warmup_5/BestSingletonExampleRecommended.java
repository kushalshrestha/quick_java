/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_5;
/**
 * Recommended way: Using enum
 * Because:
 *  - Thread safe by default
 *  - Serialization safe
 *  - Reflection safe
 *  - Clean implementation
 * */
public class BestSingletonExampleRecommended {

    public static void main(String[] args) {
//        WaterJug wg = new WaterJug(); // !!WRONG b/c Enum types cannot be instantiated
        WaterJugA wg1 = WaterJugA.INSTANCE; // Enum singleton are accessed as : EnumName.INSTANCE
        System.out.println(wg1.getWaterQuantity(100));
        System.out.println(wg1.getWaterQuantity(200));

        WaterJugA wg2 = WaterJugA.INSTANCE;
        System.out.println(wg2.getWaterQuantity(10));

        System.out.println(wg1 == wg2);
    }
}

enum WaterJugA {
    INSTANCE;   // public, static, final object of enum type WaterjugA

    private int waterQuantity = 500;

    public int getWaterQuantity(int quantity){
        if (quantity <= waterQuantity){
            waterQuantity -= quantity;
            return quantity;
        }
        return 0;
    }
}