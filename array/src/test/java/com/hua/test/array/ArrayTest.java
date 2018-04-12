/**
 * 描述: 
 * ArrayTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.array;

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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.hua.test.BaseTest;
import com.hua.util.ArrayStudyUtil;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * ArrayTest
 */
public final class ArrayTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBasic() {
		try {
			int size = 5;
			int[] arrayInt = null;
			// 在没有初始元素的情况下，需要指定大小
			arrayInt = new int[size];
			log.info("testBasic =====> arrayInt size1 = " + arrayInt.length);
			//ArrayStudyUtil.printIntArray(arrayInt);
			
			// 携带含初始化元素，素组大小即为元素的个数
			arrayInt = new int[] {1, 2};
			log.info("testBasic =====> arrayInt size2 = " + arrayInt.length);
			
			String[] arrayStr = null;
			arrayStr = new String[size];
			//ArrayStudyUtil.printStringArray(arrayStr);
			log.info("testBasic =====> 初始化一个指定大小的数组 arrayLength = " + arrayStr.length);
			
			// 初始化一个长度为0的数组
			arrayStr = new String[] {};
			log.info("testBasic =====> 初始化一个长度为0的数组 arrayLength = " + arrayStr.length);
			
			 // 初始化一个长度为n的数组 (n == 初始化元素个数)
			arrayStr = new String[] {"1", "2"};
			log.info("testBasic =====>初始化一个长度为n的数组 arrayLength = " + arrayStr.length);
		} catch (Exception e) {
			log.error("testBasic =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 测试数组构建
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBuild() {
		try {
			
			/*
			 数组初始化方式
			 1) 带初始元素，数组的大小即初始化是元素的个数
			 2) 规定数组大小，元素默认值
			 3) 
			 
			 无论如何初始化，初始化之后，数组对象有明确的大小
			 
			 // 初始化一个长度为size的元素为空的数组
			 type[] array = new type[size];
			 
			 // 初始化一个长度为0的数组
			 type[] array = new type[] {};
			 // 初始化一个长度为n的数组 (n == 初始化元素个数)
			 type[] array = new type[] {t1, t2, ...};
			 
			 */
			
			
		} catch (Exception e) {
			log.error("testBuild =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 测试一维数组
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testOneDimension() {
		try {
			int size = 5;
			int[] arrayInt = null;
			// 在没有初始元素的情况下，需要指定大小
			arrayInt = new int[size];
			log.info("testOneDimension =====> arrayInt size1 = " + arrayInt.length);
			//ArrayStudyUtil.printIntArray(arrayInt);
			
			// 携带含初始化元素，素组大小即为元素的个数
			arrayInt = new int[] {1, 2};
			log.info("testOneDimension =====> arrayInt size2 = " + arrayInt.length);
			
			String[] arrayStr = null;
			arrayStr = new String[size];
			//ArrayStudyUtil.printStringArray(arrayStr);
			log.info("testOneDimension =====> 初始化一个指定大小的数组 arrayLength = " + arrayStr.length);
			
			// 初始化一个长度为0的数组
			arrayStr = new String[] {};
			log.info("testOneDimension =====> 初始化一个长度为0的数组 arrayLength = " + arrayStr.length);
			
			 // 初始化一个长度为n的数组 (n == 初始化元素个数)
			arrayStr = new String[] {"1", "2"};
			log.info("testOneDimension =====>初始化一个长度为n的数组 arrayLength = " + arrayStr.length);
			
		} catch (Exception e) {
			log.error("testOneDimension =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 测试二维数组
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTwoDimension() {
		try {
			
			int oneSize = 5;
			int twoSize = 6;
			int[][] arrayInt = null;
			// 一维必须明确大小，二维可以不明确
			arrayInt = new int[oneSize][];
			
			
			
			/*
			 二维长度没有确定，需要在下级创建的时候确定
			 */
			
			// 构建一个 一维二维长度确定的数组
			arrayInt = new int[oneSize][twoSize];
			
			//
			
		} catch (Exception e) {
			log.error("testTwoDimension =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testArray() {
		try {
			
			
		} catch (Exception e) {
			log.error("testArray =====> ", e);
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
			//java.util.Arrays.
			
			
			
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
