/**
 * 描述: 
 * CollectionTest.java
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

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.hua.test.BaseTest;
import com.hua.util.EmptyUtil;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * CollectionTest
 */
public final class CollectionTest extends BaseTest {

	
	/**
	 * HashMap 和 HashTable的区别
	 * 1) HashTable的方法是线程同步，HashMap的方法不是线程同步
	 * 2) HashTable不能有null的key和value，而HashMap可以有一个null的key
	 * 3) 
	 * 
	 * List和Set的区别
	 * 1) List特点: 元素存放是有顺序的，元素可以重复，需要排序 则用 Collections.sort()方法
	 * 2) Set特点: 元素存放是没有顺序的，元素不可以重复，需要排序则用 TreeSet
	 * 元素的位置由其hashCode来决定.
	 * 3)
	 * 
	 */
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testAdd() {
		try {
			
			String e = "abc";
			result = strCollect.add(e);
			log.info("testAdd =====> size = " + strCollect.size());
			log.info("testAdd =====> result = " + result);
			
			
		} catch (Exception e) {
			log.error("testAdd =====> ", e);
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
			String e = "abc";
			subCollect.add(e);
			
			strCollect.addAll(subCollect);
			log.info("testAddAll =====> size = " + strCollect.size());
			
			
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
	public void testClear() {
		try {
			String e = "abc";
			result = strCollect.add(e);
			log.info("testClear =====> size = " + strCollect.size());
			log.info("testClear =====> result = " + result);
			
			/*
			 清空，将所有元素设置为null，并将size设置为0
			 */
			strCollect.clear();
			log.info("testClear =====> size = " + strCollect.size());
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
	public void testContains() {
		try {
			String e = "a";
			strCollect.add(e);
			
			result = strCollect.contains(e);
			//Character a = new Character('a');
			//result = strCollect.contains(a);
			
			log.info("testContains =====> result = " + result);
			
		} catch (Exception e) {
			log.error("testContains =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testContainsAll() {
		try {
			strCollect.add("a");
			
			subCollect.add("a");
			//subCollect.add("b");
			result = strCollect.containsAll(subCollect);
			
			log.info("testContainsAll =====> result = " + result);
			
		} catch (Exception e) {
			log.error("testContainsAll =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testEquals() {
		try {
			/*
			 集合相等，所存放的元素一一对应
			 相等，而且长度也相等
			 看原码能非常清晰这一切
			 */
			//strCollect.add("b");
			strCollect.add("a");
			
			subCollect.add("a");
			//subCollect.add("b");
			
			result = strCollect.equals(subCollect);
			log.info("testEquals =====> result = " + result);
		} catch (Exception e) {
			log.error("testEquals =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testJudge() {
		try {
			/*
			 若size ==0 则是 empty集合
			 */
			log.info("testJudge =====> " + strCollect.isEmpty());
			
			/*
			 hashCode 是集合所有元素的哈希码的和
			 空集合哈希码默认是1
			 */
			log.info("testJudge =====> " + strCollect.hashCode());
			
		} catch (Exception e) {
			log.error("testJudge =====> ", e);
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
			strCollect.add("a");
			strCollect.add("b");
			
			log.info("testIterator =====> size = " + strCollect.size());
			
			strIt = strCollect.iterator();
			String temp = null;
			/*
			 通过循环判断是否有下一个，来遍历集合中所有的元素
			 */
			while (strIt.hasNext())
			{
				// 游标下移，获取位置上的值
				temp = strIt.next();
				/*
				 将当前游标指定的元素从集合中移除
				 */
				if ("a".equals(temp))
				{
					strIt.remove();
				}
			}
			log.info("testIterator =====> size = " + strCollect.size());
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
	public void testRemove() {
		try {
			strCollect.add("a");
			strCollect.add("b");
			
			log.info("testRemove =====> size = " + strCollect.size());
			
			result = strCollect.remove("a");
			log.info("testRemove =====> result = " + result);
			log.info("testRemove =====> size = " + strCollect.size());
			
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
	public void testRemoveAll() {
		try {
			/*
			 把所有子集中包含有的元素移除掉
			 */
			strCollect.add("a");
			strCollect.add("b");
			
			subCollect.add("a");
			subCollect.add("c");
			
			strCollect.removeAll(subCollect);
			
			log.info("testRemoveAll =====> size = " + strCollect.size());
			
		} catch (Exception e) {
			log.error("testRemoveAll =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testRetainAll() {
		try {
			/*
			 把所有子集中包含有的元素留下，
			 其余元素移除
			 */
			strCollect.add("a");
			strCollect.add("b");
			
			subCollect.add("a");
			subCollect.add("c");
			
			strCollect.retainAll(subCollect);
			
			log.info("testRetainAll =====> size = " + strCollect.size());
			
		} catch (Exception e) {
			log.error("testRetainAll =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 集合大小
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSize() {
		try {
			
			/*
			 size 指示集合实际存放元素的根数，
			 而不是集合的容量，size <= 集合容量
			 */
			/*
			 不指定容量，在添加元素的时候，会扩展到默认
			 容量(默认容量是10，这里指的是ArrayList)
			 此时，size是不会赋值的.
			 */
			strCollect = new ArrayList<String>();
			log.info("testSize =====> size = " + strCollect.size());
			
			/**
			 指定初始容量，初始容量小于默认容量，
			 则在添加元素的时候会自动扩展到默认的容量，
			 
			 */
			strCollect = new ArrayList<String>(5);
			
			log.info("testSize =====> size = " + strCollect.size());
			
			// 指定初始化集合，size等于初始化集合的大小
			strCollect = new ArrayList<String>(subCollect);
			log.info("testSize =====> size = " + strCollect.size());
			
		} catch (Exception e) {
			log.error("testSize =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testToArrayOne() {
		try {
			/*
			 Object[] toArray()
			 通过数组拷贝或者其他方式构造一个大小等于集合
			 大小的数组，然后把元素逐个放入数组，最后返回
			 
			 T[] toArray(T[])
			 需要创建一个数组对象作为参数，如果参数数组大小小于
			 集合的大小，会构造一个新的数组对象，然后返回，此时
			 只是使用到了参数数组的getClass()方法；
			 若T[]的长度>= size，则进行拷贝，最后若T[]的长度 > size，
			 则将 t[size] 置为null
			 */
			strCollect.add("a");
			strCollect.add("b");
			Object[] objs = strCollect.toArray();
			
			System.out.println(Arrays.toString(objs));
			
		} catch (Exception e) {
			log.error("testToArrayOne =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testToArrayTwo() {
		try {
			/*
			 Object[] toArray()
			 通过数组拷贝或者其他方式构造一个大小等于集合
			 大小的数组，然后把元素逐个放入数组，最后返回
			 
			 T[] toArray(T[])
			 需要创建一个数组对象作为参数，如果参数数组大小小于
			 集合的大小，会构造一个新的数组对象，然后返回，此时
			 只是使用到了参数数组的getClass()方法；
			 若T[]的长度>= size，则进行拷贝，最后若T[]的长度 > size，
			 则将 t[size] 置为null
			 也即，当T[]的长度小于size时，数组不发生改变，将返回新的数组
			 */
			strCollect.add("a");
			strCollect.add("b");
			String[] t = new String[5];
			String[] temp = null;
			// 由于长度大于size，t[size]将会被置空
			t[2] = "bb";
			System.out.println("拷贝之前: " + Arrays.toString(t));
			
			t = strCollect.toArray(t);
			System.out.println("拷贝之后: " + Arrays.toString(t));
			
			/*
			 建议: 
			 构造数组的时候，长度应该等于集合的大小，
			 最后应该接受toArray(T[])方法返回的值，而不是
			 直接用参数的数组.
			 */
			
		} catch (Exception e) {
			log.error("testToArrayTwo =====> ", e);
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
			
			int[] a = null;
			EmptyUtil.isEmpty(a);
			
			
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
	 * 描述: [每个测试-方法]开始之前运行
	 * @author qye.zheng
	 * 
	 */
	@Before
	public void beforeMethod() {
		System.out.println("beforeMethod()");
		// 测试方法之前将子集清空
		subCollect.clear();
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
