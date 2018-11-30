/**
 * 描述: 集合排序
 * SortTest.java
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
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.entity.collect.User;
import com.hua.entity.collect.UserComparator;
import com.hua.entity.collect.UserEntryComparator;
import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * SortTest
 */
public final class SortTest extends BaseTest {
	
	private User user1 = new User("BBC", "张三");
	
	private User user2 = new User(null, "李四");
	
	private User user3 = new User("CBC", "王五");
	
	private User user4 = new User("ABC", "赵六");
	
	private User[] userArray = new User[] {};
	
	private String str;
	
	private Comparator<User> userComparator = new UserComparator();
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testNumberSort() {
		try {
			int[] nums = {2, 1, 33, 9, 8, 4};
			Arrays.sort(nums, 0, nums.length);
			for (int i = 0; i < nums.length; i++)
			{
				System.out.println(nums[i]);
			}
			
		} catch (Exception e) {
			log.error("testNumberSort=====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSort() {
		/*
		 1) Collections 排序工具主要是适用于 List集合，对Set或Map没有作用
		 
		 */
		try {
			
			
		} catch (Exception e) {
			log.error("testSort =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testListSortComparable() {
		/*
		 2) List排序: 
		第一步，元素实现Comparable接口，或者基于元素构建一个Comparator对象
		第二步，调用Collections.sort()方法进行排序.
		 */
		try {
			List<User> users = new ArrayList<User>();
			users.add(user1);
			users.add(user2);
			users.add(user3);
			users.add(user1);
			users.add(user4);
			
			// 排序之前
			userArray = users.toArray(userArray);
			str = Arrays.toString(userArray);
			System.out.println(str);
			
			// 调用Collections.sort(List<T>) 进行排序
			Collections.sort(users);
			// 排序之后
			userArray = users.toArray(userArray);
			str = Arrays.toString(userArray);
			System.out.println(str);
			
		} catch (Exception e) {
			log.error("testListSortComparable =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testListSortComparator() {
		/*
		 2) List排序: 
		第一步，元素实现Comparable接口，或者基于元素构建一个Comparator对象
		第二步，调用Collections.sort()方法进行排序.
		 */
		try {
			List<User> users = new ArrayList<User>();
			users.add(user1);
			users.add(user2);
			users.add(user3);
			users.add(user1);
			users.add(user4);
			
			// 排序之前
			userArray = users.toArray(userArray);
			str = Arrays.toString(userArray);
			System.out.println(str);
			
			// 调用Collections.sort(List<T>, Comparator<? extends T>) 进行排序
			Collections.sort(users, userComparator);
			// 排序之后
			userArray = users.toArray(userArray);
			str = Arrays.toString(userArray);
			System.out.println(str);
			
		} catch (Exception e) {
			log.error("testListSortComparator =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSetSortComparable() {
		try {
			// 使用可比较功能
			Set<User> users = new TreeSet<User>();
			users.add(user1);
			users.add(user2);
			users.add(user3);
			// 重复的不再添加
			users.add(user1);
			users.add(user4);
			
			userArray = users.toArray(userArray);
			str = Arrays.toString(userArray);
			System.out.println(str);
			
		} catch (Exception e) {
			log.error("testSetSortComparable =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSetSortComparator() {
		try {
			// 使用指定的比较器
			Set<User> users = new TreeSet<User>(userComparator);
			users.add(user1);
			users.add(user2);
			users.add(user3);
			// 重复的不再添加
			users.add(user1);
			users.add(user4);
			
			userArray = users.toArray(userArray);
			str = Arrays.toString(userArray);
			System.out.println(str);
			
			
		} catch (Exception e) {
			log.error("testSetSortComparator =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testMapKeySort() {
		try {
			/*
			 key 一般是数字或字符串，因此可以直接使用key
			 的可比较功能，或者针对key定义比较器也可以
			 使用key 的排序方式
			 */
			Comparator<String> keyComparator = null;
			
			Map<String, User> map = new TreeMap<String, User>();
			map.put("2", user2);
			map.put("3", user3);
			map.put("1", user1);
			// 重复将更新其value
			map.put("2", user2);
			map.put("4", user4);
			
			// 输出key
			Set<String> keySet = map.keySet();
			String[] strArray = new String[] {};
			strArray = keySet.toArray(strArray);
			System.out.println(Arrays.toString(strArray));
		} catch (Exception e) {
			log.error("testMapKeySort =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testMapValueSortComparable() {
		try {
			
			
			
			
		} catch (Exception e) {
			log.error("testMapValueSortComparable =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testMapValueSortComparator() {
		try {
			Map<String, User> map = new TreeMap<String, User>();
			map.put("23", user2);
			map.put("3", user3);
			map.put("01", user1);
			// 重复将更新其value
			map.put("42", user2);
			map.put("4k", user4);
			
			/*
			 转成Set格式，然后借TreeSet用指定的比较器来进行排序
			 */
			Set<Map.Entry<String, User>> entrySet = map.entrySet();
			
			/*
			 Map.Entry<String, User> 比较器
			 Key 和 Value 都可以通过这种方式来排序
			 */
			Comparator<Map.Entry<String, User>> 
			entryComparator = new UserEntryComparator();
			
			// 使用Entry比较器
			Set<Map.Entry<String, User>> set = 
					new TreeSet<Map.Entry<String, User>>(entryComparator);
			// 加入EntrySet，排序同步进行
			set.addAll(entrySet);
			
			for (Map.Entry<String, User> entry : set)
			{
				System.out.println(entry.getValue().toString());
			}
			
		} catch (Exception e) {
			log.error("testMapValueSortComparator =====> ", e);
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
			log.error("test=====> ", e);
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
