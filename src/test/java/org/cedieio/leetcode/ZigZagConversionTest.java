package org.cedieio.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ZigZagConversionTest {

	private ZigZagConversion zigzag = new ZigZagConversion();
	
	
	@Test
	public void shouldConvertToZigZag() {
		assertEquals("PAHNAPLSIIGYIR", zigzag.convert("PAYPALISHIRING", 3));		
	}
}
