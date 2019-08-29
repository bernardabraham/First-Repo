package com.qa.Goldilocks;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GoldilocksTest {

	@Test
	public void test1() {

		WeightTemperature goldilocks = new WeightTemperature(50, 60);
		WeightTemperature chairPorridge = new WeightTemperature(70, 50);

		List<WeightTemperature> list2 = Arrays.asList(new WeightTemperature(50, 60), new WeightTemperature(80, 60),
				goldilocks);

		// goldilocks.goldilocksMethod(chairPorridge);
		// assertEquals("", true, (list2).contains(goldilocks));
		assertEquals("Compares the indexes we expect to be Goldilocks with the actual", Arrays.asList(0, 1, 2),
				goldilocks.goldilocksMethod(list2));
		// assertEquals("note", what we expect, method passing through)
	}

}
