package paintWizard;

import java.util.Arrays;
import java.util.List;

public class PaintWizardApp {

	public static void main(String[] args) {

		// public Paint(String name, int cost, int size, int coverage)

		Paint cheapoMax = new Paint("Cheapo", 20, 21, 10);
		// cheapoMax.setName("cheapo");
		Paint thatDog = new Paint("thatDog", 34, 40, 12);
		// thatDog.setName();
		Paint averageJoe = new Paint("averageJoe", 17, 16, 11);
		// averageJoe.setName();
		Paint deluxPaint = new Paint("deluxPaint", 25, 10, 22);
		// deluxPaint.setName();

		List<Paint> list2 = Arrays.asList(cheapoMax, thatDog, averageJoe, deluxPaint);

		PaintWizardLogic logic = new PaintWizardLogic();
		logic.wizard(cheapoMax, thatDog);

	}
}

// 1. Create a paint requirement wizard that will calculate
// which of the following three products, would be the cheapest to buy,
// for the room you are painting.
//
// a. Work out which one wastes the least.
// b. Work out which is the best choice for any room (Cheapest).
