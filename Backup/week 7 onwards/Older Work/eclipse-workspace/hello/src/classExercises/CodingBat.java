package classExercises;

//
public class CodingBat {
	public static void main(String[] args) {
		//
		//
		//
	}

	public String minCat(String a, String b) {

		int x = 0;
		if (a.length() != b.length()) {
			if (a.length() > b.length()) {
				x = a.length() - b.length();
				return a.substring(x, a.length()) + b;
			}

			else if (a.length() < b.length()) {
				x = b.length() - a.length();
				return b.substring(x, b.length()) + a;
			}

		} else {
			return a + b;
		}
		return "woops";

	}

}

// Con cat = new con();
// cat.conCat("hi", "bye");
// public class Con {
// public String conCat(String a, String b) {
// if (a.endswith("")==b.startswith("")) {
// return "hi";
// }
// }
