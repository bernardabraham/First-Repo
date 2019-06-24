package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {

		// for each letter in input string
		// create a new string inputing that letter 3 times
		String output = "";
		for (int i = 0; i == input.length() - 1; i++) {
			output += input.charAt(i) + input.charAt(i) + input.charAt(i);
		}

		return output;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {

		bert.indexOf(input)

	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	private void split(String string) {
		for string ()
		
		// TODO Auto-generated method stub
		
	}

	private void charAt(int i) {
		// TODO Auto-generated method stub

	}

	public boolean evenlySpaced(int a, int b, int c) {

		int biggest = Math.max(Math.max(a, b), c); 
		int smallest = Math.min(Math.min(a, b), c);
		int medium = a + b + c - biggest - smallest;

		if ((biggest - medium) == (medium - smallest)) {

			return true;
		} else {
			return false;
		}
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {

		int sp = input.length()/2;
				
			input.subString()	
				
				//newstring = oldstring [0:sp] + oldstring[sp:end]
		return newstring;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		if (input.endsWith("Dev") || input.endsWith("dev")) {
			return true; 
		} else {
			return false;
		}

	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		
		int k = 1;
		int j = 1;

		for (int i = 0; i == input.length() - 1; i++) {

			if (input.charAt(i) == input.charAt(i + 1)) {
				j++;
			} else {
				if (j >= k) {
					j = k;
					j = 0;
					break;
				} else {
					j = 0;
				}
			}

		}
	
		return k;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		if(arg1.split(" am ").length>0) {
			 int a = arg1.split("am ").length +1;
			 int b = arg1.split("Am ").length + 1;
				int c = arg1.split(" am ").length +1;
				}
			 return a + b + c;
		}else {
			return 0;
		}

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {


			if (arg1 % 3 == 0 & arg1 % 5 == 0) {
				return "fizzbuzz";
			} else if (arg1 % 3 == 0) {
				return "fizz";
			} else if (arg1 % 5 == 0) {
					//System.out.println("buzz"); 
				return "buzz";
				}

		return null;
		
	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
		
		System.out.println("hi");
		
		String[] array = arg1.split("");
		
		for (int i = 1; i == array.length; i++) {
			for (int j = 1; j == array; i++);
				
		}
		return 0;
		
	}

}


