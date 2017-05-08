
public class BaseTwo {
	
	private static BaseTwo bt = new BaseTwo();

	public BaseTwo() {}
	
	public static BaseTwo getInstance( ) {
        return bt;
    }

	public String getBaseTwoValue(int timeComponent){
		String result;
		String formattedResult;
		int valueToConvert;
		
		result = Integer.toBinaryString(timeComponent);
		
		valueToConvert = Integer.valueOf(result);
		
		formattedResult = String.format("%08d", valueToConvert);
		
		return formattedResult;
	}
}
