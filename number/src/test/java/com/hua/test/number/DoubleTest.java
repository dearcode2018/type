/**
 * 描述: 
 * DoubleTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.number;

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


/**
 * 描述: 
 * 
 * @author qye.zheng
 * DoubleTest
 */
public final class DoubleTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBasic() {
		try {
			
			double db = 320;
			
			log.info("testBasic =====> " + db);
			
		} catch (Exception e) {
			log.error("testBasic =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDouble() {
		try {
			String dbStr = "420.0";
			// 十进制
			Double db = new Double(dbStr);
			
			log.info("testDouble =====> doubleValue = " + db.doubleValue());
			
		} catch (Exception e) {
			log.error("testDouble =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testValue() {
		try {
			// 32
			log.info("testValue =====> bitSize = " + Double.SIZE);
			
			// 1.4E-45
			log.info("testValue =====> minValue = " + Double.MIN_VALUE);
			
			// 3.4028235E38
			log.info("testValue =====> maxValue = " + Double.MAX_VALUE);
			
			// -126
			log.info("testValue =====> 最小指数 = " + Double.MIN_EXPONENT);
			
			// 127
			log.info("testValue =====> 最大指数 = " + Double.MAX_EXPONENT);
			
			// 1.17549435E-38
			log.info("testValue =====> 最小正常值 = " + Double.MIN_NORMAL);
			
			// NaN
			log.info("testValue =====> 非数字(not a number) = " + Double.NaN);
			
			// Infinity
			log.info("testValue =====> 正无穷 = " + Double.POSITIVE_INFINITY);
			
			//  -Infinity
			log.info("testValue =====> 负无穷 = " + Double.NEGATIVE_INFINITY);
			
		} catch (Exception e) {
			log.error("testValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 将10进制字符串转化为double类型值
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testParse() {
		try {
			/*
			 Double.parseDouble 和 Double.valueOf() 是相同的，只是返回的类型不同
			 一个是基本类型，一个引用类型
			 */
			
			String decimalStr = "-123";
			double s2 = Double.parseDouble(decimalStr);
			log.info("testParse =====> 十进制 doubleValue = " + s2);
			
		} catch (Exception e) {
			log.error("testParse =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 将基本类型double / 10进制的字符串 转化为 Double 对象
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testValueOf() {
		try {
			double sh = -234;
			Double s1 = Double.valueOf(sh);
			log.info("testValueOf =====> doubleValue = " + s1.doubleValue());
			
			String decimalStr = "-123";
			Double s2 = Double.valueOf(decimalStr);
			log.info("testValueOf =====> 十进制 doubleValue = " + s2.doubleValue());
			
		} catch (Exception e) {
			log.error("testValueOf =====> ", e);
		}
	}

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTransform() {
		try {
			double value = 10.0F;
			
			value = -10.05F;
			// double数的二进制位转成int数
			log.info("testTransform =====> doubleToLongBits = " + Double.doubleToLongBits(value));
			
			log.info("testTransform =====> doubleToRawLongBits = " + Double.doubleToRawLongBits(value));
			long bits = 10548150L;
			// int数的二进制位转成double数
			log.info("testTransform =====> longBitsToDouble = " + Double.longBitsToDouble(bits));
			
		} catch (Exception e) {
			log.error("testTransform =====> ", e);
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
			double value = 10.0F;
			
			// double数转成16进制字符串
			log.info("testToString =====> toHexString = " + Double.toHexString(value));
			
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
