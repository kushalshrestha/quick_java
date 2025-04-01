/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.fundamental.eNumAsConstant;

public enum enumAsConstant {
    COMPANY("Microsoft"), SALES_TARGET(20000);

    private String stringVal;
    private int intVal;

    enumAsConstant(String val){
        this.stringVal = val;
    }

    enumAsConstant(int val) {
        this.intVal = val;
    }

    public String getStringValue(){
        return stringVal;
    }

    public int getIntVal(){
        return intVal;
    }
}
