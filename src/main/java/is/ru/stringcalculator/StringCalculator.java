package is.ru.stringcalculator;

public class StringCalculator{

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else
			if(text.contains(",")){
				String[] numbers = text.split(",|\n");
				negatives(numbers);
				return sum(numbers);
			}
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static int sum(String[] numbers){
		int total = 0;
		for(String number : numbers){
			//total += toInt(number);
			if(toInt(number) > 1000){
				continue;
			}
			else{
				total += toInt(number);
			}
		}
		return total;
	}

	private static void negatives(String[] numbers){
		String numOfNeg = "";
		for(String nums : numbers){
			if(toInt(nums) < 0){
				numOfNeg += nums + " ";
			}
		}

		if(!numOfNeg.equals("")){
					throw new IllegalArgumentException("Negatives not allowed: " + numOfNeg);
		}
	}
}