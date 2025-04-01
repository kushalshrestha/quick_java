/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.fundamental.eNumAsConstant;

public class Main {

    public static void main(String[] args) {
        System.out.println(Constants.COMPANY);
        System.out.println(Constants.SALES_TARGET);

        System.out.println(enumAsConstant.COMPANY); // will print COMPANY because enum constant directly(implicityl
        // calls 'toString()'
        System.out.println(enumAsConstant.COMPANY.getStringValue());
        System.out.println(enumAsConstant.COMPANY.getIntVal());
        System.out.println(enumAsConstant.SALES_TARGET.getIntVal());
        System.out.println(enumAsConstant.SALES_TARGET.getStringValue());
//
//		System.out.println(enumAsConstant.SALES_TARGET.getCompanyValue());
//		System.out.println(enumAsConstant.SALES_TARGET.getSalesTargetValue());
//		System.out.println(enumAsConstant.COMPANY.getSalesTargetValue());



    }

}

