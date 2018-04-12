/**
 * 描述: 
 * FloatTest.java
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
 * FloatTest
 */
public final class FloatTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBasic() {
		try {
			
			float fl = 320;
			
			log.info("testBasic =====> " + fl);
			
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
	public void testFloat() {
		try {
			String flStr = "420.0F";
			// 十进制
			Float fl = new Float(flStr);
			
			log.info("testFloat =====> floatValue = " + fl.floatValue());
			double db = 1.0;
			
			// 接受double类型
			fl = new Float(db);
			
		} catch (Exception e) {
			log.error("testFloat =====> ", e);
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
			log.info("testValue =====> bitSize = " + Float.SIZE);
			
			// 1.4E-45
			log.info("testValue =====> minValue = " + Float.MIN_VALUE);
			
			// 3.4028235E38
			log.info("testValue =====> maxValue = " + Float.MAX_VALUE);
			
			// -126
			log.info("testValue =====> 最小指数 = " + Float.MIN_EXPONENT);
			
			// 127
			log.info("testValue =====> 最大指数 = " + Float.MAX_EXPONENT);
			
			// 1.17549435E-38
			log.info("testValue =====> 最小正常值 = " + Float.MIN_NORMAL);
			
			// NaN
			log.info("testValue =====> 非数字(not a number) = " + Float.NaN);
			
			// Infinity
			log.info("testValue =====> 正无穷 = " + Float.POSITIVE_INFINITY);
			
			//  -Infinity
			log.info("testValue =====> 负无穷 = " + Float.NEGATIVE_INFINITY);
			
		} catch (Exception e) {
			log.error("testValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 将10进制转化为float类型值
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testParse() {
		try {
			/*
			 Float.parseFloat 和 Float.valueOf() 是相同的，只是返回的类型不同
			 一个是基本类型，一个引用类型
			 */
			
			String decimalStr = "-123";
			float s2 = Float.parseFloat(decimalStr);
			
		} catch (Exception e) {
			log.error("testParse =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 将基本类型float / 10进制的字符串转化为 Float 对象
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testValueOf() {
		try {
			float fl = -234;
			Float s1 = Float.valueOf(fl);
			log.info("testValueOf =====> floatValue = " + s1.floatValue());
			
			String decimalStr = "-123";
			Float s2 = Float.valueOf(decimalStr);
			log.info("testValueOf =====> 十进制 floatValue = " + s2.floatValue());

			
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
			float value = 10.0F;
			
			value = -10.05F;
			// float数的二进制位转成int数
			log.info("testTransform =====> floatToIntBits = " + Float.floatToIntBits(value));
			
			log.info("testTransform =====> floatToRawIntBits = " + Float.floatToRawIntBits(value));
			int bits = -1054815027;
			// int数的二进制位转成float数
			log.info("testTransform =====> intBitsToFloat = " + Float.intBitsToFloat(bits));
			
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
			float value = 10.0F;
			
			// float数转成16进制字符串
			log.info("testToString =====> toHexString = " + Float.toHexString(value));
			
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
			
			float value = 10.0F;
			
			value = -10.05F;
			// float数的二进制位转成int数
			log.info("testTemp =====> floatToIntBits = " + Float.floatToIntBits(value));
			
			log.info("testTemp =====> floatToRawIntBits = " + Float.floatToRawIntBits(value));
			int bits = -1054815027;
			// int数的二进制位转成float数
			log.info("testTemp =====> intBitsToFloat = " + Float.intBitsToFloat(bits));
			value = 10.0F;
			// float数转成16进制字符串
			log.info("testTemp =====> toHexString = " + Float.toHexString(value));
			
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
