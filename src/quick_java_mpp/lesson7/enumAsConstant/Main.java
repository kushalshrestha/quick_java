package quick_java_mpp.lesson7.enumAsConstant;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(Constants.COMPANY);
		System.out.println(Constants.SALES_TARGET);
		
		System.out.println(enumAsConstant.COMPANY.getStringValue());
		System.out.println(enumAsConstant.COMPANY.getIntValue());
		System.out.println(enumAsConstant.SALES_TARGET.getIntValue());
		System.out.println(enumAsConstant.SALES_TARGET.getStringValue());
//		
//		System.out.println(enumAsConstant.SALES_TARGET.getCompanyValue());
//		System.out.println(enumAsConstant.SALES_TARGET.getSalesTargetValue());
//		System.out.println(enumAsConstant.COMPANY.getSalesTargetValue());
		
		
		
	}

}
