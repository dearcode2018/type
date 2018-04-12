/**
 * 描述: 
 * SetStoreTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.store;

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

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.bean.SortObject;
import com.hua.bean.SortObject2;
import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * SetStoreTest
 */
public final class SetStoreTest extends BaseTest {

	
	/**
	 java.util.Set<E>
	 
	 实现类 java.util.HashSet<E>
	 使用MashMap来装载数据，对应属性HashMap<E, Object> map
	 
	 HashSet()
	 HashSet(Collection<? extends E>)
	 HashSet(int initialCapacity, float loadFactor)
	 HashSet(int initialCapacity)
	 HashSet(int initialCapacity, float loadFactory, boolean dummy)
	 最后一个参数 boolean dummy 是虚假的，没有到的，只是为了
	 创造一个重载方法而已.
	 
	 Map和Set是交叉在一起构建的，Set是借助Map的key的唯一性
	 来保证set中元素的唯一，因此set和map是息息相关的.
	 set中许多实现是借助map的内部实现来达到的.
	 HashSet中的元素是存储在HashMap中，通过map.put(e, PRESENT)
	 的形式来存储元素，private static final Object PRESENT = new Object();
	 这样，map中的key就是set的元素，而value都是同一个静态对象.
	 
	 Set元素的存放，和元素的hashCode和equals方法相关，但是在设计上元素
	 的类上，要求hashCode和equals方法结果一致.
	 
	 */
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSetStore() {
		try {
			/**
			 * 哈希码相同 / euqals-false: HashSet会接收
			 * 
			 * 哈希码相同 / euqals-true: HashSet不会接收 (只有这种情况下不会接收)
			 * 
			 * 哈希码不相同 / euqals-false: HashSet会接收
			 * 
			 * 哈希码不相同 / euqals-true: HashSet会接收
			 * 
			 * 结论: HashSet在添加一个元素的之后，首先考虑的是哈希码，若哈希码不同则直接添加，
			 * 若相同，则再看看equals是否相同，不同再接收.
			 * 
			 */
			/**
			 *  HashSet 每次添加元素的时候 都会去 触发hashCode() 方法
			 */
			SortObject2 sortObject = null;
			Set<SortObject2> set = new HashSet<SortObject2>();
			int i = 0;
			
			i = 3;
			sortObject = new SortObject2();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			set.add(sortObject);			
			
			log.info("testSetStore =====> size = " + set.size());
			
			i = 1;
			SortObject2 sortObject2 = new SortObject2();
			sortObject2.setId("2000-" + i);
			sortObject2.setName("listName-" + i);
			sortObject2.setSize(i + 2);
			set.add(sortObject2);			
			
			log.info("testSetStore =====> size = " + set.size());
			log.info("testSetStore =====> equal = " + sortObject.equals(sortObject2));
			 
			for (SortObject2 e : set)
			{
				System.out.println(e.toString());
			}
			
		} catch (Exception e) {
			log.error("testSetStore =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSetStoreWithSort() {
		try {
			/**
			 *  HashSet 每次添加元素的时候 都会去 触发hashCode() 方法
			 */
			SortObject2 sortObject = null;
			SortedSet<SortObject2> sortedSet = new TreeSet<SortObject2>();
			int i = 0;
			
			i = 3;
			sortObject = new SortObject2();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			sortedSet.add(sortObject);			
			
			log.info("testSetStoreWithSort =====> size = " + sortedSet.size());
			
			i = 1;
			SortObject2 sortObject2 = new SortObject2();
			sortObject2.setId("2000-" + i);
			sortObject2.setName("listName-" + i);
			sortObject2.setSize(i + 2);
			// 无法添加进去，hasCode相同，equal返回false
			sortedSet.add(sortObject2);			
			
			log.info("testSetStoreWithSort =====> size = " + sortedSet.size());
			log.info("testSetStoreWithSort =====> equal = " + sortObject.equals(sortObject2));
			 
			for (SortObject2 e : sortedSet)
			{
				System.out.println(e.toString());
			}
			
		} catch (Exception e) {
			log.error("testSetStoreWithSort =====> ", e);
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
			strSet.add("a");
			strSet.add("c");
			strSet.add("b");
			strSet.add("a");
			log.info("testSet =====> size = " + strSet.size());
			
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
	public void testIterator() {
		try {
			strSet.add("a");
			strSet.add("c");
			strSet.add("b");
			strSet.add("a");
			//log.info("testIterator =====> ");
			strIt = strSet.iterator();
			String temp = null;
			while (strIt.hasNext())
			{
				temp = strIt.next();
				log.info("testIterator =====> " + temp);
			}
			
			
		} catch (Exception e) {
			log.error("testIterator =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testForEach() {
		try {
			strSet.add("a");
			strSet.add("c");
			strSet.add("b");
			strSet.add("a");
			for (String temp : strSet)
			{
				log.info("testForEach =====> " + temp);
			}
			
		} catch (Exception e) {
			log.error("testForEach =====> ", e);
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
