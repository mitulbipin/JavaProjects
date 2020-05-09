package FirstPackage;

public class commonMethods {
	
	public static String convertToUpperCase(String element) {
		char ch1 = element.charAt(0);
	boolean isUpper = Character.isUpperCase(ch1);
		element = isUpper? element : element.substring(0,1).toUpperCase() + element.substring(1);
		
		return element;
	}

}
