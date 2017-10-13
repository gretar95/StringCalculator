package is.ru.stringcalculator;

public class StringCalculator{

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else
			if(text.contains(",")){
				String[] numbers = text.split(",");
				return toInt(numbers[0]) + toInt(numbers[1]);
			}
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
}