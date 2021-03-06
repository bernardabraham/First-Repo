package paintWizard;

public class PaintWizardLogic {

	public void wizard(List<Paint> paint) {

		int roomSize = 100; // room size

		int cost1 = paint1.getCost(); // price
		int size1 = paint1.getSize(); // size of tin

		int cost2 = paint2.getCost(); // price
		int size2 = paint2.getSize(); // size of tin

		int leastWaste1 = 0;
		int leastWaste2 = 0;

		int wasteComparison = Integer.MAX_VALUE;
		int cheapestComparison = Integer.MIN_VALUE;

		for (int i = 0; i < paint.size(); i++) {

			leastWaste1 = get.size(i) - (roomSize % get.size(i));
			if (leastWaste1 < wasteComparison) {
				wasteComparison = leastWaste1;
			}
		}
		System.out.println(wasteComparison);

	}

	// System.out.println(leastWaste1);
	// System.out.println(leastWaste2);
	int cheapest1 = 0;
	int cheapest2 = 0;

	if(roomSize%size2!=0)
	{
		cheapest1 = ((roomSize / size2) + 1) * cost2;

		// System.out.println(cheapest1);
	}else
	{
		cheapest1 = (roomSize / size2) * cost2;

		// System.out.println(cheapest1);
	}if(roomSize%size1!=0)
	{
		cheapest2 = ((roomSize / size1) + 1) * cost1;

		// System.out.println(Math.max(cheapest1, cheapest2));
	}else
	{
		cheapest2 = (roomSize / size1) * cost1;

		// System.out.println(Math.max(cheapest1, cheapest2));
	}

	if(cheapest1==(Math.min(cheapest1,cheapest2)))
	{
		System.out.println("Option one is cheapest");
	}else
	{
		System.out.println("Option two is cheapest");
	}
}}
