package quick_java.lesson7.enumAsConstant;

public enum enumAsConstant {
	COMPANY("Microsoft"), SALES_TARGET(2000000);
	private String stringVal;
	private int intVal;
	enumAsConstant(String val){
		this.stringVal = val;
	}
	
	enumAsConstant(int val){
		this.intVal = val;
	}
	
	public String getStringValue() {
		return stringVal;
	}
	
	public int getIntValue() {
		return intVal;
	}
}
