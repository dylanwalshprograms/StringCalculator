import java.lang.reflect.Array;

public class StringCalculator {


	//"\\t|,|;|\\.|\\?|!|-|:|@|\\[|\\]|\\(|\\)|\\{|\\}|_|\\*|/"

	public static int add (String number) {
		if(number.matches(".*\\d.*")) {
			String[] splitString = number.split("[\\s\\t,;.?!:@\\[\\](){}_*/]|\\r\\n");
			int sum = 0;
			String negatives = "";
			for(String split : splitString) {
				int i = 0;
				if(!split.equals("")) {
					i = Integer.parseInt(split);
				}
				if(i < 0) {		
					negatives += split;
					System.out.println("Negatives not allowed: " + negatives);
				}
				if (i <= 1000 && i >0) {
					sum += i;
				}	
			}
			return sum;
			}
	return 0;
	}

	
	
	
}