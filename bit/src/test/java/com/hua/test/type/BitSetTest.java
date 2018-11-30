/**
 * 描述: 
 * BitSetTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.type;

// 静态导入
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.BitSet;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * BitSetTest
 */
public final class BitSetTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBitSet() {
		try {
			BitSet bitSet = new BitSet(3);
			/*
			 */
			bitSet.set(0, 3);
			
			for (int i = 0; i < bitSet.length(); i++)
			{
				System.out.println("[" + i + "] = " + bitSet.get(i));
			}
			
			//bitSet.andNot(bitSet);
			
		} catch (Exception e) {
			log.error("testBitSet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSetValue() {
		try {
			BitSet bitSet = new BitSet(3);
			/*
			 * 设置单个索引、指定区间的索引的位为true
			 */
			bitSet.set(0);
			
			bitSet.set(0, 3);
			// 设置指定索引为指定布尔值
			bitSet.set(1, false);
			// 设置指定索引范围为指定布尔值
			bitSet.set(0, 1, true);
			for (int i = 0; i < bitSet.length(); i++)
			{
				System.out.println("[" + i + "] = " + bitSet.get(i));
			}
			
			//bitSet.andNot(bitSet);
			
		} catch (Exception e) {
			log.error("testSetValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testGetValue() {
		try {
			BitSet bitSet = new BitSet(3);
			/*
			 */
			bitSet.set(0, 3);
			bitSet.set(1, false);
			// get()
			for (int i = 0; i < bitSet.length(); i++)
			{
				System.out.println("[" + i + "] = " + bitSet.get(i));
			}
			
			//bitSet.andNot(bitSet);
			
		} catch (Exception e) {
			log.error("testGetValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testClear() {
		try {
			BitSet bitSet = new BitSet(3);
			/*
			 */
			bitSet.set(0, 3);
			//bitSet.set(1, false);
			
			// 将指定索引的值清除 为false
			bitSet.clear(1);
			
			/*
			 * 将所有的值清除为false
			 * 所有的值为false之后，bitSet.length变成了0，后续的不再输出
			 * 至少有一个位是true 才后后面的输出
			 */
			//bitSet.clear();
			bitSet.clear(0, 2);
			for (int i = 0; i < bitSet.length(); i++)
			{
				System.out.println("[" + i + "] = " + bitSet.get(i));
			}
			
			//bitSet.andNot(bitSet);
			
		} catch (Exception e) {
			log.error("testClear =====> ", e);
		}
	}
	
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testFlip() {
		try {
			BitSet bitSet = new BitSet(3);
			/*
			 */
			bitSet.set(0, 3);
			bitSet.set(1, false);
			// 设置补码，true - false, false- true
			bitSet.flip(1);
			
			for (int i = 0; i < bitSet.length(); i++)
			{
				System.out.println("[" + i + "] = " + bitSet.get(i));
			}
			
		} catch (Exception e) {
			log.error("testFlip =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testAnd() {
		try {
			BitSet bitSet = new BitSet(3);
			bitSet.set(0, 3, true);
			BitSet bitSet2 = new BitSet(3);
			bitSet2.set(1, false);
			bitSet2.set(2, true);

			bitSet.and(bitSet2);
			
			for (int i = 0; i < bitSet.length(); i++)
			{
				System.out.println("[" + i + "] = " + bitSet.get(i));
			}
			
		} catch (Exception e) {
			log.error("testAnd =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testAndNot() {
		try {
			/*
			 * 与非
			 */
			BitSet bitSet = new BitSet(3);
			bitSet.set(0, 3, true);
			BitSet bitSet2 = new BitSet(3);
			
			
			/*
			 * 
			 */
			bitSet2.set(0, false);
			bitSet2.set(1, false);
			bitSet2.set(2, false);

			// 清除掉bitSet的值，用bitSet2的值取反代替
			bitSet.andNot(bitSet2);
			
			for (int i = 0; i < bitSet.length(); i++)
			{
				System.out.println("[" + i + "] = " + bitSet.get(i));
			}
			System.out.println(bitSet);
			
		} catch (Exception e) {
			log.error("testAndNot =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void test() {
		try {
			
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTemp() {
		try {
			
			
		} catch (Exception e) {
			log.error("testTemp=====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCommon() {
		try {
			
			
		} catch (Exception e) {
			log.error("testCommon =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSimple() {
		try {
			
			
		} catch (Exception e) {
			log.error("testSimple =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBase() {
		try {
			
			
		} catch (Exception e) {
			log.error("testBase =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 解决ide静态导入消除问题 
	 * @author qye.zheng
	 * 
	 */
	@Ignore("解决ide静态导入消除问题 ")
	private void noUse() {
		String expected = null;
		String actual = null;
		Object[] expecteds = null;
		Object[] actuals = null;
		String message = null;
		
		assertEquals(expected, actual);
		assertEquals(message, expected, actual);
		assertNotEquals(expected, actual);
		assertNotEquals(message, expected, actual);
		
		assertArrayEquals(expecteds, actuals);
		assertArrayEquals(message, expecteds, actuals);
		
		assertFalse(true);
		assertTrue(true);
		assertFalse(message, true);
		assertTrue(message, true);
		
		assertSame(expecteds, actuals);
		assertNotSame(expecteds, actuals);
		assertSame(message, expecteds, actuals);
		assertNotSame(message, expecteds, actuals);
		
		assertNull(actuals);
		assertNotNull(actuals);
		assertNull(message, actuals);
		assertNotNull(message, actuals);
		
		assertThat(null, null);
		assertThat(null, null, null);
		
		fail();
		fail("Not yet implemented");
		
	}

}
