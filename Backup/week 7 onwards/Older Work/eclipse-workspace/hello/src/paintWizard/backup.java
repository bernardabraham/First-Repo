package paintWizard;

public class backup {
	package paintWizard;

	public class PaintWizardLogic {

		public void wizard(List<>) {
			//int roomSize = 100; // room size
			//

			//
//						int leastWaste1 = 0;
//						int leastWaste2 = 0;
		//	wiz =[paint1, paint2, paint3, paint4]
			
			int leastWaste = wiz.stream().forEach(i -> i.getsize - (roomSize % i.getsize))
										.collect(Collectors.toList()); ;
			int cheapest = wiz.stream().forEach(i -> i.getsize - (roomSize % i.getsize))
										.collect(Collectors.toList()); ;
//					int cost1 = paint1.getCost(); // price
//					int size1 = paint1.getSize(); // size of tin
		//
//					int cost2 = paint2.getCost(); // price
//					int size2 = paint2.getSize(); // size of tin
//			if (roomSize % size2 != 0) {
//				leastWaste1 = size2 - (roomSize % size2);
//			}
//
//			if (roomSize % size1 != 0) {
//				leastWaste2 = size1 - (roomSize % size1);
//			}
//
//			// System.out.println(leastWaste1);
//			// System.out.println(leastWaste2);
//
//			if ((leastWaste1 == Math.min(leastWaste1, leastWaste2))) {
//				System.out.println("Option one has least waste");
//			} else {
//				System.out.println("Option two has least waste");
//			}
//			int cheapest1 = 0;
//			int cheapest2 = 0;
//
//			if (roomSize % size2 != 0) {
//				cheapest1 = ((roomSize / size2) + 1) * cost2;
//
//				// System.out.println(cheapest1);
//			} else {
//				cheapest1 = (roomSize / size2) * cost2;
//
//				// System.out.println(cheapest1);
//			}
//			if (roomSize % size1 != 0) {
//				cheapest2 = ((roomSize / size1) + 1) * cost1;
//
//				// System.out.println(Math.max(cheapest1, cheapest2));
//			} else {
//				cheapest2 = (roomSize / size1) * cost1;

				// System.out.println(Math.max(cheapest1, cheapest2));
			}
//
//			if (cheapest1 == (Math.min(cheapest1, cheapest2))) {
//				System.out.println("Option one is cheapest");
//			} else {
//				System.out.println("Option two is cheapest");
			}
	}
}

}
