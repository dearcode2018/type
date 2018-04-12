/**
 * 描述: 
 * CollectionsUtilTest.java
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
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.hua.entity.collect.User;
import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * CollectionsUtilTest
 */
public final class CollectionsUtilTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCreateCollection() {
		try {
			/*new Comparable<User>() {
				 *//**
				 * 描述: 
				 * @author qye.zheng
				 * @param o
				 * @return
				 *//*
				@Override
				public int compareTo(User o)
				{
					return 0;
				}
			};*/
			
		} catch (Exception e) {
			log.error("testCreateCollection =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testAddAll() {
		try {
			//Collection<? super Short> list = new ArrayList<Number>();
			// 使用单一的集合
			Collection<String> list = new ArrayList<String>();
			// Collection<? super T> ,T... 可变长参数
			flag = Collections.addAll(list, "a", "e", "b");
			log.info("testAddAll =====> flag = " + flag);
			System.out.println(list.toString());
			
		} catch (Exception e) {
			log.error("testAddAll =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBinarySearch() {
		try {
			/*
			 二分法搜索，集合需要经过排序处理
			 或者提供排序所需的比较器
			 */
			User key = null;
			List<User> users = new ArrayList<User>();
			User user = new User();
			user.setUsername("cbc");
			user.setNickname("张三");
			users.add(user);
			key = user;
			
			user = new User();
			user.setUsername("abc");
			user.setNickname("李四");
			users.add(user);
			//key = user;
			
			user = new User();
			user.setUsername("bbc");
			user.setNickname("王五");
			users.add(user);
			//key = user;
			
/*			user = new User();
			users.add(user);
			user.setUsername("ebc");
			user.setNickname("赵六");*/
			
			// 集合经过排序处理
			Collections.sort(users);
			User.printList(users);
			index = Collections.binarySearch(users, user);
			log.info("testBinarySearch =====> " + key.getUsername());
			
			log.info("testBinarySearch =====> 集合经过排序处理  index = " + index);
			
			
			// 提供排序所需的比较器
			//index = Collections.binarySearch(users, key, new UserComparator());
			//log.info("testBinarySearch =====> 提供排序所需的比较器 index = " + index);
		} catch (Exception e) {
			log.error("testBinarySearch =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCheck() {
		try {
			
			
		} catch (Exception e) {
			log.error("testCheck =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCheckSorted() {
		try {
			
			
		} catch (Exception e) {
			log.error("testCheckSorted =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCopy() {
		try {
			/*
			  Collections.copy(List<T> dest, List<T> src)
			 */
			
			
		} catch (Exception e) {
			log.error("testCopy =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 不相交并集
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDisjoint() {
		try {
			/**
			 Collections.disjoint() 用法未明
			 */
			intList.add(3);
			intList.add(4);
			intList.add(6);
			intList.add(2);
			List<Integer> list = new ArrayList<Integer>();
			list.add(4);
			list.add(6);
			Collections.disjoint(intList, list);
			Collections.disjoint(list, intList);
			log.info("testDisjoint =====> " + intList.size());
			log.info("testDisjoint =====> " + list.get(0));
			
		} catch (Exception e) {
			log.error("testDisjoint =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 生成一个空集合 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testEmpty() {
		try {
			
			//List<Integer> eList = Collections.EMPTY_LIST;
			//Collections.EMPTY_MAP;
			
			// 空迭代器
			Iterator<Integer> it = Collections.emptyIterator();
			List<Integer> eList = Collections.emptyList();
			Map<String, String> map = Collections.emptyMap();
			Set<String> set = Collections.emptySet();
			
			ListIterator<String> it2 = Collections.emptyListIterator();
			
			Enumeration<String> e = Collections.emptyEnumeration();
			
		
			
		} catch (Exception e) {
			log.error("testEmpty =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testFill() {
		try {
			
			/*
			 填充值
			 
			 */
			intList.add(3);
			intList.add(4);
			intList.add(6);
			intList.add(2);
			// 将容器的所有元素填充为指定的值
			Collections.fill(intList, 1);
			log.info("testFill =====> " + intList.size());
			log.info("testFill =====> " + intList.get(3));
			
		} catch (Exception e) {
			log.error("testFill =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testFrequency() {
		try {
			/*
				某个元素出现的频率(次数)
				[0, size] 次
			 */
			
			intList.add(3);
			intList.add(4);
			intList.add(6);
			intList.add(2);
			intList.add(6);
			log.info("testFrequency =====> " + intList.size());
			
			log.info("testFrequency =====> " + Collections.frequency(intList, 2));
			log.info("testFrequency =====> " + Collections.frequency(intList, 6));
			log.info("testFrequency =====> " + Collections.frequency(intList, 110));
			
		} catch (Exception e) {
			log.error("testFrequency =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testIndexOf() {
		try {
			
			
		} catch (Exception e) {
			log.error("testIndexOf =====> ", e);
		}
	}
	
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
			 ArrayList<T> Collections.list(Enumeration<T>)
			 将枚举类型转成List
			 */
			//Collections.list(e)
			
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
	public void testMostValue() {
		try {
			/*
			  最小最大值
			  容器内的所有元素类都必须实现Comparable接口
			  
			 */
			
			intList.add(3);
			intList.add(4);
			intList.add(6);
			intList.add(2);
			intList.add(6);
			
			log.info("testMostValue =====> " + Collections.min(intList));
			log.info("testMostValue =====> " + Collections.max(intList));
			
		} catch (Exception e) {
			log.error("testMostValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testNCopies() {
		try {
			
			/*
			 拷贝指定次数
			 List<T> Collections.nCopies(int times, T t)
			 */
			Integer i = new Integer(3);
			int times = 8;
			intList = Collections.nCopies(times, i);
			log.info("testNCopies =====> " + intList.size());
			
		} catch (Exception e) {
			log.error("testNCopies =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testNewSetFromMap() {
		try {
			
			
		} catch (Exception e) {
			log.error("testNewSetFromMap =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testReplaceAll() {
		try {
			/*
			 将容器内所有 旧的对象全部替换成新对象 List中可以存放重复的对象
			 Collections.replaceAll(List<T>, T oldValue, T newValue)
			 */
			intList.add(3);
			intList.add(4);
			intList.add(6);
			intList.add(2);
			intList.add(6);
			
			Integer oldVal = 6;
			Integer newVal = 99;
			
			Collections.replaceAll(intList, oldVal, newVal);
			
			log.info("testReplaceAll =====> " + intList.get(2));
			log.info("testReplaceAll =====> " + intList.get(4));
			
		} catch (Exception e) {
			log.error("testReplaceAll =====> ", e);
		}
	}
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testReverse() {
		try {
			/*
			 Collections.reverse(List<T>)
			 颠倒，将List元素顺序颠倒
			 */
			intList.add(3);
			intList.add(4);
			intList.add(6);
			intList.add(2);
			intList.add(6);
			
			log.info("testReverse =====> " + intList.get(0));
			Collections.reverse(intList);
			log.info("testReverse =====> " + intList.get(4));
		} catch (Exception e) {
			log.error("testReverse =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testReverseOrder() {
		try {
			
			
		} catch (Exception e) {
			log.error("testReverseOrder =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 洗牌 (打乱顺序)
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testShuffle() {
		try {
			/*
			 打乱排序
			 */
			intList.add(3);
			intList.add(4);
			intList.add(6);
			intList.add(2);
			intList.add(6);
			
			log.info("testShuffle =====> " + intList.get(1));
			Collections.shuffle(intList);
			log.info("testShuffle =====> " + intList.get(1));
			
		} catch (Exception e) {
			log.error("testShuffle =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSingleton() {
		try {
			
			/*
			 以参数作为集合唯一元素，生成集合实例，
			 不能往该集合中放置元素，会抛如下异常
			 java.lang.UnsupportedOperationException
			 */
			
			intList = Collections.singletonList(new Integer(8));
			
			// 执行此动作会抛异常
			intList.add(new Integer(9));
			
			log.info("testSingleton =====> " + intList.size());
			
		} catch (Exception e) {
			log.error("testSingleton =====> ", e);
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
		try {
			
			/*
			 对List 进行排序，
			 1) list 中所有元素类必须实现Comparable接口
			 2) 提供一个适应于所有元素类的比较器接口 Comparator
			*/
			
			List<User> users = new ArrayList<User>();
			User user = new User();
			user.setUsername("cbc");
			user.setNickname("张三");
			users.add(user);
			
			user = new User();
			user.setUsername("abc");
			user.setNickname("李四");
			users.add(user);
			
			user = new User();
			user.setUsername("bbc");
			user.setNickname("王五");
			users.add(user);
			
			User.printList(users);
			Collections.sort(users);
			User.printList(users);
			
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
	public void testSwap() {
		try {
			/*
			 交换指定下标的2个元素
			 */
			intList.add(3);
			intList.add(4);
			intList.add(6);
			intList.add(2);
			intList.add(6);
			
			int indexA = 1;
			int indexB = 4;
			log.info("testSwap =====> " + intList.get(indexA) + ", " + intList.get(indexB));
			
			Collections.swap(intList, indexA, indexB);
			
			log.info("testSwap =====> " + intList.get(indexA) + ", " + intList.get(indexB));
			
		} catch (Exception e) {
			log.error("testSwap =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSynchronized() {
		try {
			
			
		} catch (Exception e) {
			log.error("testSynchronized =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSynchronizedSorted() {
		try {
			
			
		} catch (Exception e) {
			log.error("testSynchronizedSorted =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testUnmodifiable() {
		try {
			/*
			 返回一个不可修改的集合
			 集合大小/元素不能发生变更
			 实施更改，将抛操作不支持异常
			 java.lang.UnsupportedOperationException
			 */
			intList.add(3);
			intList.add(4);
			intList.add(6);
			intList.add(2);
			intList.add(6);
			Collection<Integer> collect = Collections.unmodifiableCollection(intList);
			// 原先的集合引用仍然可以操作
			intList.add(new Integer(44));
			// 抛操作不支持异常
			//collect.add(new Integer(43));
			//collect.clear();
		} catch (Exception e) {
			log.error("testUnmodifiable =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testUnmodifiableSorted() {
		try {
			
			
		} catch (Exception e) {
			log.error("testUnmodifiableSorted =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testRotate() {
		try {
			
			
		} catch (Exception e) {
			log.error("testRotate =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testAsLifoQueue() {
		try {
			
			/**
			 lifo: last in first out 后进先出
			 */
			
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 集合转成Enumeration对象
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testEnumeration() {
		try {
			
			
		} catch (Exception e) {
			log.error("testEnumeration =====> ", e);
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
	 * 描述: 普通测试方法
	 ,@Test注解 不带参数
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testNormal() {
		System.out.println("testNormal()");
	}
	
	/**
	 * 
	 * 描述: 期望发生异常-测试方法
	 ,@Test注解 异常
	 * @author qye.zheng
	 * 
	 */
	@Test(expected=NullPointerException.class)
	@SuppressWarnings("all")
	public void testException() {
		String str = null;
		System.out.println(str.length());
	}
	
	/**
	 * 
	 * 描述: 超时测试方法
	 ,@Test注解 指定运行时间 (单位 : 毫秒)
	 * @author qye.zheng
	 * 
	 */
	@Test(timeout=3000)
	public void testTimeOut() {
		System.out.println("testTimeOut()");
	}
	
	/**
	 * 
	 * 描述: 测试忽略的方法
	 * @author qye.zheng
	 * 
	 */
	@Ignore("暂时忽略的方法")
	@Test
	public void ignoreMethod() {
		System.out.println("ignoreMethod()");
	}
	
	/**
	 * 
	 * 描述: [所有测试]开始之前运行
	 * @author qye.zheng
	 * 
	 */
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
	}
	
	/**
	 * 
	 * 描述: [所有测试]结束之后运行
	 * @author qye.zheng
	 * 
	 */
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}
	
	/**
	 * 
	 * 描述: [每个测试-方法]开始之前运行
	 * @author qye.zheng
	 * 
	 */
	@Before
	public void beforeMethod() {
		System.out.println("beforeMethod()");
	}
	
	/**
	 * 
	 * 描述: [每个测试-方法]结束之后运行
	 * @author qye.zheng
	 * 
	 */
	@After
	public void afterMethod() {
		System.out.println("afterMethod()");
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
