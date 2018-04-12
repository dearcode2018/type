/**
 * 描述: 
 * ArraysUtilTest.java
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

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.hua.test.BaseTest;
import com.hua.util.ArrayStudyUtil;
import com.hua.util.ArrayUtil;


/**
 * 描述: 测试java.util.Arrays 工具类使用
 * 
 * @author qye.zheng
 * ArraysUtilTest
 */
public final class ArraysUtilTest extends BaseTest {

	/*
	 测试java.util.Arrays 工具类使用
	 
	 
	 */
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testAsList() {
		try {
			
			/*
			 	List<T> Arrays.asList(T...)
			 	
			 	T... 可以是数组，也可以是多个Object
			 	
			 */
			Integer[] arrayInteger = new Integer[] {2, 3, 1, 0, 5};
			List<Integer> list = Arrays.asList(arrayInteger);
			
			log.info("testAsList =====> size = " + list.size());
			
			// 自动装箱为Integer类型
			list = Arrays.asList(0 ,3, 3, 4);
			log.info("testAsList =====> size = " + list.size());
			
			
		} catch (Exception e) {
			log.error("testAsList =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 二分法搜索
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBinarySearch() {
		try {
			/*
			 注意: 使用二分法搜索，有一个前提: 目标数组必须是经过排序的
			 ，一般是升序. 因此，应该先使用Arrays.sort(T[]) 对目标数组进行排序，
			 然后再调用此方法
			 */
			
			// 先调用Arrays.sort() 对目标素组进行排序，然后再使用二分法进行搜索
			// 调用排序方法，对数组进行排序 - 修改了数组元素存放位置
			Arrays.sort(arrayInt);
			int key = 2;
			result = Arrays.binarySearch(arrayInt, key);
			
			log.info("testBinarySearch =====> result = " + result);
			
			int fromIndex = 0;
			int toIndex = 1;
			// 可以指定搜索范围
			result = Arrays.binarySearch(arrayInt, fromIndex, toIndex, key);
			log.info("testBinarySearch =====> result = " + result);
			
		} catch (Exception e) {
			log.error("testBinarySearc =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testHashCode() {
		try {
			// 获取数组的哈希码
			int hashCode = Arrays.hashCode(arrayInt);
			
			log.info("testHashCode =====> hashCode = " + hashCode);
			
		} catch (Exception e) {
			log.error("testHashCode =====> ", e);
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
			// 排序前
			ArrayStudyUtil.printIntArray(arrayInt);
			
			ArrayStudyUtil.printLineBetween();
			
			// 调用排序方法，对数组进行排序 - 修改了数组元素存放位置
			Arrays.sort(arrayInt);
			// 排序后
			ArrayStudyUtil.printIntArray(arrayInt);
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
	public void testFill() {
		try {
			/*
			 填充值
			 
			 1) 对一个数组所有元素，填充同一个值
			 
			 2) 对一个数组的指定范围的元素，填充同一个值
			 
			 */
			int value = 123;
			// 填充前
			ArrayStudyUtil.printIntArray(arrayInt);
			
			ArrayStudyUtil.printLineBetween();
			
			Arrays.fill(arrayInt, value);
			
			// 填充后
			ArrayStudyUtil.printIntArray(arrayInt);
			
			ArrayStudyUtil.printLineBetween();
			
			// 填充指定的范围
			int fromIndex = 1;
			// 不包括
			int toIndex = 3;
			value = 456;
			Arrays.fill(arrayInt, fromIndex, toIndex, value);
			ArrayStudyUtil.printIntArray(arrayInt);
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
	public void testCopyOf() {
		try {
			/*
			 拷贝生成一个同类型或不同类型的新数组，
			 新数组可能比当前数组长，超出的部分元素
			 用默认值填充，也可能比当前数组短，则
			 其元素的值都是来源于当前的数组.
			 
			 */
			
			// 长度比原数组大
			int length = 10;
			int[] array = Arrays.copyOf(arrayInt, length);
			ArrayStudyUtil.printIntArray(array);
			
			ArrayStudyUtil.printLineBetween();
			
			// 长度比原数组小
			length = 2;
			array = Arrays.copyOf(arrayInt, length);
			ArrayStudyUtil.printIntArray(array);
			
			// 拷贝生成不同类型的数组
			//Integer[] arrayInteger = new Integer[10];
			
		} catch (Exception e) {
			log.error("testCopyOf =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCopyOfRange() {
		try {
			
			/*
			 拷贝生成一个同类型或不同类型的新数组，
			 新数组可能比当前数组长，超出的部分元素
			 用默认值填充，也可能比当前数组短，则
			 其元素的值都是来源于当前的数组.
			 
			 */
			
			// 拷贝指定的范围
			int fromIndex = 1;
			// 不包括
			int toIndex = 3;
			int[] array =Arrays.copyOfRange(arrayInt, fromIndex, toIndex);
			ArrayStudyUtil.printIntArray(array);
			
			
		} catch (Exception e) {
			log.error("testCopyOfRange =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCopyStringToInteger() {
		try {
			/*
			 说明: 工具暂时无法支持!!
			 */
			String[] strArray = {"2", "1", "4"};
			Integer[] intArray = null;
			// 无法实现，抛 java.lang.ArrayStoreException, 需通过数组工具扩展实现
			//Arrays.copyOf(strArray, strArray.length, Integer[].class);
			intArray = ArrayUtil.copyStringToInteger(strArray);
			
			String result = Arrays.toString(intArray);
			System.out.println(result);
			
		} catch (Exception e) {
			log.error("testCopyStringToInteger =====> ", e);
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
			
			/**
			 比较2个相同类型的数组是否相等
			 Arrays.equals()
			 在长度相等前提下，再逐位比较其元素是否相等
			 长度不相等，即便最短的数组全部元素和另外一个数组
			 的逐位元素相等，这2个数组也不相等
			 
			 数组相等 1) 长度相等 2) 所有元素逐位相等
			 
			 */
			int[] arrayInt1 = new int[] {0, 2, 1, 5, 3, 6};
			int[] arrayInt2 = new int[] {0, 2, 1, 5, 3, 6};
			
			log.info("testEquals =====> 长度相等，元素相等 = " + Arrays.equals(arrayInt1, arrayInt2));
			
			arrayInt1 = new int[] {0, 2, 1, 5, 3};
			arrayInt2 = new int[] {0, 2, 1, 5, 3, 6};
			log.info("testEquals =====> 长度不相等，元素相等 = " + Arrays.equals(arrayInt1, arrayInt2));
			
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
	public void testDeep() {
		try {
			
			/*
			 deepToString
			 deepHashCode
			 deepEquals
			 
			 主要是针对数组元素是某个复合对象的时候，
			 进行输出、获取哈希吗、进行比较
			 */
			
			
			
		} catch (Exception e) {
			log.error("testDeep =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testToString() {
		try {
			
			/**
			 使用该方法，就无需再逐个类型写输出数组元素的方法了
			 
			 */
			
			/*
			 输出数组的每个元素
			 输出格式:
			 [元素1, 元素2, ...]
			 */
			log.info("testToString =====> " + Arrays.toString(arrayInt));
			
			
		} catch (Exception e) {
			log.error("testToString =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testMultipleResult() {
		try {
			Integer[] intArray = {1, 2, 3};
			int result = ArrayUtil.multipleResult(intArray);
			log.info("testMultipleResult =====> result = " + result);
			
		} catch (Exception e) {
			log.error("testMultipleResult =====> ", e);
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
