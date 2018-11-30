/**
 * 描述: 
 * ListAndSetTest.java
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.bean.SortObject;
import com.hua.bean.SortObject2;
import com.hua.comparator.SomeComparator;
import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * ListAndSetTest
 */
public final class ListAndSetTest extends BaseTest {

	
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testList() {
		try {
			/*
			 * 编译错误
			 * Type mismatch: cannot convert from ArrayList<String> to List<Object>	 
			 */
			// List<Object> list = new ArrayList<String>();
			
			Collection<Object> collection = new ArrayList<Object>();
			/*
			 * 泛型为Object，可以添加任意类型
			 */
			collection.add("xx");
			collection.add(null);
			// 插入重复对象
			collection.add("xx");
			collection.add(22);
			/*
			 * list可以添加多个null元素
			 */
			collection.add(null);
			
			// 遍历输出
			for (Object e : collection)
			{
				System.out.println(e);
			}
			
		} catch (Exception e) {
			log.error("testList =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSet() {
		try {
			
			Collection<Object> collection = new HashSet<Object>();
			/*
			 * 泛型为Object，可以添加任意类型
			 */
			collection.add("xx");
			collection.add(null);
			collection.add(22);
			// 插入重复对象
			collection.add("xx");
			/*
			 * list可以添加多个null元素
			 */
			collection.add(null);
			collection.add("dddxx");
			
			// 遍历输出
			for (Object e : collection)
			{
				System.out.println(e);
			}
			
		} catch (Exception e) {
			log.error("testSet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testListSort1() {
		try {
			List<SortObject> list = new ArrayList<SortObject>();
			SortObject.asc = true;
			SortObject e = null;
			e = new SortObject();
			e.setId("20182012");
			e.setName("zhangsan");
			e.setSize(10);
			list.add(e);
			
			e = new SortObject();
			e.setId("201820144");
			e.setName("lisi");
			e.setSize(5);
			list.add(e);
			
			e = new SortObject();
			e.setId("20182099");
			e.setName("wangwu");
			e.setSize(8);
			list.add(e);
			
			// 调用 Collections.sort()方法
			Collections.sort(list);
			for (SortObject sub : list)
			{
				System.out.println(sub.toString());
			}
			
			//Collections.sort(null);
			
		} catch (Exception e) {
			log.error("testListSort1 =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testListSort2() {
		try {
			List<SortObject> list = new ArrayList<SortObject>();
			SortObject.asc = true;
			SortObject e = null;
			e = new SortObject();
			e.setId("20182012");
			e.setName("zhangsan");
			e.setSize(10);
			list.add(e);
			
			e = new SortObject();
			e.setId("201820144");
			e.setName("lisi");
			e.setSize(5);
			list.add(e);
			
			e = new SortObject();
			e.setId("20182099");
			e.setName("wangwu");
			e.setSize(8);
			list.add(e);
			
			// 调用 Collections.sort()方法
			Collections.sort(list, new SomeComparator());
			for (SortObject sub : list)
			{
				System.out.println(sub.toString());
			}
		
			
			//Collections.sort(null);
			
		} catch (Exception e) {
			log.error("testListSort2 =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testListSort3() {
		try {
			List<SortObject> list = new ArrayList<SortObject>();
			SortObject.asc = true;
			SortObject e = null;
			e = new SortObject();
			e.setId("20182012");
			e.setName("zhangsan");
			e.setSize(10);
			list.add(e);
			
			e = new SortObject();
			e.setId("201820144");
			e.setName("lisi");
			e.setSize(5);
			list.add(e);
			
			e = new SortObject();
			e.setId("20182099");
			e.setName("wangwu");
			e.setSize(8);
			list.add(e);
			
			// 调用 List 接口的sort()方法
			list.sort(new SomeComparator());
			for (SortObject sub : list)
			{
				System.out.println(sub.toString());
			}
		
			
			//Collections.sort(null);
			
		} catch (Exception e) {
			log.error("testListSort3 =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSetSort1() {
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
			e.setName("zhangsan");
			e.setSize(10);
			set.add(e);
			
			e = new SortObject();
			e.setId("201820144");
			e.setName("lisi");
			e.setSize(5);
			set.add(e);
			
			e = new SortObject();
			e.setId("20182099");
			e.setName("wangwu");
			e.setSize(8);
			set.add(e);
			
			for (SortObject sub : set)
			{
				System.out.println(sub.toString());
			}
			
		} catch (Exception e) {
			log.error("testSetSort1 =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSetSort2() {
		try {
			/*
			 * 在TreeSet构造方法中传入Comparator<T>
			 */
			SortedSet<SortObject> set = new TreeSet<SortObject>(new SomeComparator());
			SortObject.asc = true;
			SortObject e = null;
			e = new SortObject();
			e.setId("20182012");
			e.setName("zhangsan");
			e.setSize(10);
			set.add(e);
			
			e = new SortObject();
			e.setId("201820144");
			e.setName("lisi");
			e.setSize(5);
			set.add(e);
			
			e = new SortObject();
			e.setId("20182099");
			e.setName("wangwu");
			e.setSize(8);
			set.add(e);
			
			for (SortObject sub : set)
			{
				System.out.println(sub.toString());
			}
			
		} catch (Exception e) {
			log.error("testSetSort2 =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSetSort3() {
		try {
			/*
			 * 在TreeSet构造方法中传入Comparator<T>
			 */
			SortedSet<SortObject2> set = new TreeSet<SortObject2>();
			SortObject2.asc = true;
			SortObject2 e = null;
			e = new SortObject2();
			e.setId("20182012");
			e.setName("zhangsan");
			e.setSize(10);
			/*
			 * com.hua.bean.SortObject2 cannot be cast to java.lang.Comparable
			 */
			set.add(e);
			
			e = new SortObject2();
			e.setId("201820144");
			e.setName("lisi");
			e.setSize(5);
			set.add(e);
			
			e = new SortObject2();
			e.setId("20182099");
			e.setName("wangwu");
			e.setSize(8);
			set.add(e);
			
			for (SortObject2 sub : set)
			{
				System.out.println(sub.toString());
			}
			
		} catch (Exception e) {
			log.error("testSetSort3 =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testGenericType() {
		try {
			/*
			 * 编译错误
			 * Type mismatch: cannot convert from ArrayList<String> to List<Object>	 
			 */
			// List<Object> list = new ArrayList<String>();
			
			List<Object> list = new ArrayList<Object>();
			/*
			 * 泛型为Object，可以添加任意类型
			 */
			list.add("xx");
			list.add(22);
			
			
		} catch (Exception e) {
			log.error("testGenericType =====> ", e);
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
