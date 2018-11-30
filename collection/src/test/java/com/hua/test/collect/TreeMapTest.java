/**
 * 描述: 
 * TreeMapTest.java
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
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.bean.SortObject;
import com.hua.comparator.SomeComparator;
import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * TreeMapTest
 */
public final class TreeMapTest extends BaseTest {

	
	/*
	 * TreeSet 基于 TreeMap实现
	 * 
	 * 
	 */


	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTreeSet() {
		try {
			/*
			 * 在TreeSet构造方法参数不指定比较器
			 * 默认元素支持Comparable，否则抛 ClassCastException
			 */
			SortedSet<SortObject> set = new TreeSet<SortObject>();
			SortObject.asc = true;
			SortObject e = null;
			e = new SortObject();
			e.setId("20182012");
			e.setName("zhangsan10");
			e.setSize(10);
			set.add(e);
			
			e = new SortObject();
			e.setId("201820144");
			e.setName("lisi5");
			e.setSize(5);
			set.add(e);
			
			e = new SortObject();
			e.setId("20182099");
			e.setName("wangwu8");
			e.setSize(8);
			set.add(e);
			
			e = new SortObject();
			e.setId("201820911");
			e.setName("zhaoliu13");
			e.setSize(13);
			set.add(e);
			
			e = new SortObject();
			e.setId("20182089");
			e.setName("zhanglong9");
			e.setSize(9);
			set.add(e);
			
			
			for (SortObject sub : set)
			{
				System.out.println(sub.toString());
			}
			
			
		} catch (Exception e) {
			log.error("testTreeSet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTreeMap() {
		try {
			/*
			 * Map的排序是对键的排序，其实就是Set的排序
			 * TreeMap构造方法参数中提供Comparator<? super K>
			 */
			SortedMap<SortObject, String> map = 
					new TreeMap<SortObject, String>(new SomeComparator());
			SortObject.asc = true;
			SortObject e = null;
			e = new SortObject();
			e.setId("20182012");
			e.setName("zhangsan");
			e.setSize(10);
			map.put(e, e.getSize().toString());
			
			e = new SortObject();
			e.setId("201820144");
			e.setName("lisi");
			e.setSize(5);
			map.put(e, e.getSize().toString());
			
			e = new SortObject();
			e.setId("20182099");
			e.setName("wangwu");
			e.setSize(8);
			map.put(e, e.getSize().toString());
			Set<SortObject> keySet = map.keySet();
			/*
			 * 调用get方法的时候，根据key值去KeySet中搜索，会调用Comparator的方法
			 * 来快速寻找
			 */
/*			for (SortObject key : keySet)
			{
				System.out.println(map.get(key));
			}
			*/
			
			/*
			 * map.entrySet()得到排序好的项，根据这个来输出，遍历Set即可，不需要去寻找Key，
			 * 所以无需调用Comparator的方法.
			 * 
			 * 因此输出的时候应该选择map.entrySet()得到Set<Map.Entry<K,V>>来遍历，
			 * 而不是通过map.keySet()得到键的Set来遍历，
			 * 因为根据key去调用get的时候，会去调用Comparator来寻找key的位置.
			 * 
			 */
			Set<Map.Entry<SortObject, String>> entries = map.entrySet();
			for (Map.Entry<SortObject, String> entry : entries)
			{
				System.out.println(entry.getValue());
			}
			
		} catch (Exception e) {
			log.error("testTreeMap =====> ", e);
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
