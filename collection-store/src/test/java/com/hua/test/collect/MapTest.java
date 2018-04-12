/**
 * 描述: 
 * MapTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.collect;

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

import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * MapTest
 */
public final class MapTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testMap() {
		try {
			log.info("testMap =====> " + map.isEmpty());
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			log.info("testMap =====> size = " + map.size());
			
			
		} catch (Exception e) {
			log.error("testMap =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testContainsKey() {
		try {
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			map.put(null, "nullkey");
			map.put("6-nullvalue", null);
			
			log.info("testContainsKey =====> " + map.containsKey("1"));
			log.info("testContainsKey =====> " + map.containsKey(null));
			log.info("testContainsKey =====> " + map.containsKey("d"));
		} catch (Exception e) {
			log.error("testContainsKey =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testContainsValue() {
		try {
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			map.put(null, "nullkey");
			map.put("6-nullvalue", null);
			
			log.info("testContainsValue =====> " + map.containsValue(null));
			log.info("testContainsValue =====> " + map.containsValue("shenzhen"));
			log.info("testContainsValue =====> " + map.containsValue("guangdong"));
			
		} catch (Exception e) {
			log.error("testContainsValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testGet() {
		try {
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			map.put(null, "nullkey");
			map.put("6-nullvalue", null);
			
			String temp = map.get(null);
			log.info("testGet =====> temp = " + temp);
			
			temp = map.get("shen");
			log.info("testGet =====> temp = " + temp);
			
			temp = map.get("1");
			log.info("testGet =====> temp = " + temp);
			
		} catch (Exception e) {
			log.error("testGet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testKeySet() {
		try {
			/*
			 获取可以构成的set对对象
			 */
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			map.put(null, "nullkey");
			map.put("6-nullvalue", null);
			
			strSet = map.keySet();
			
			log.info("testKeySet =====> " + strSet.size());
			
		} catch (Exception e) {
			log.error("testKeySet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testValues() {
		try {
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			map.put(null, "nullkey");
			map.put("6-nullvalue", null);
			
			strCollect = map.values();
			log.info("testValues =====> " + strCollect.size());
			
		} catch (Exception e) {
			log.error("testValues =====> ", e);
		}
	}
	
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testEntrySet() {
		try {
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			map.put(null, "nullkey");
			map.put("6-nullvalue", null);
			
			entrySet = map.entrySet();
					
			for (Map.Entry<String, String> mapEntry: entrySet)
			{
				log.info("=====> " + mapEntry.getKey() + ": " + mapEntry.getValue());
			}
			
		} catch (Exception e) {
			log.error("testEntrySet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testPut() {
		try {
			/*
			 put方法将返回一个Value值，
			 若key已经存在，则返回旧value，否则返回null
			 返回的oldValue表示该值将被新的替换
			 可以根据此返回值是否为空来判断放值是否成功
			 */
			String oldValue = null;
			oldValue = map.put("1", "beijing");
			log.info("testPut =====> oldValue = " + oldValue);
			
			oldValue =map.put("2", "shanghai");
			log.info("testPut =====> oldValue = " + oldValue);
			
			oldValue =map.put("1", "guangzhou");
			log.info("testPut =====> oldValue = " + oldValue);
		} catch (Exception e) {
			log.error("testPut =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testRemove() {
		try {
			/*
			 返回被移除的值，如果key存在，
			 否则返回null，可以根据返回值是否为空来判断
			 移除动作是否成功
			 */
			String removedValue = null;
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");

			removedValue = map.remove("1");
			log.info("testRemove =====> removedValue = " + removedValue);
			
			removedValue = map.remove("dd");
			log.info("testRemove =====> removedValue = " + removedValue);
			
		} catch (Exception e) {
			log.error("testRemove =====> ", e);
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
