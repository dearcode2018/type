/**
 * 描述: 
 * ArraySortTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.sort;

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

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.bean.SortObject;
import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * ArraySortTest
 */
public final class ArraySortTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testArraySort() {
		try {
			SortObject sortObject = null;
			SortObject[] list = new SortObject[5];
			int i = 0;
			int index = 0;
			i = 3;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list[index++] = sortObject;
			
			i = 1;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list[index++] = sortObject;
			
			i = 5;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list[index++] = sortObject;
			
			i = 9;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list[index++] = sortObject;
			
			i = 4;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list[index++] = sortObject;
			
			// 执行排序，使用Comparable接口方式
			Arrays.sort(list);
			
			for (SortObject e : list)
			{
				System.out.println(e.toString());
			}
			
		} catch (Exception e) {
			log.error("testArraySort =====> ", e);
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
