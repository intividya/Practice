package com.icss;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import com.icss.*;

public class TestFindBestOperator {

	@Test
	public void testBestOperator() {
		FindBestOperator  fOperator = new FindBestOperator();
		Map<String,Map<String,String>> fmap = fOperator.getopWisePrice(); // it will return allDetails(
		fOperator.findBestOperator(fmap, "4673212345");
		assertEquals("vodafone", fOperator.getBestOperator());
		assertEquals(1.0, fOperator.getBestUnitPrice(),0.0f);
	}

}
