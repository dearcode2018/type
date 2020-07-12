/**
 * 描述: 
 * ComputerCodeTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.type;

//静态导入
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.apache.commons.codec.binary.BinaryCodec;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * ComputerCodeTest
 */
//@DisplayName("测试类名称")
//@Tag("测试类标签")
//@Tags({@Tag("测试类标签1"), @Tag("测试类标签2")})
public final class ComputerCodeTest extends BaseTest {

	
	/**
	 * 
	 * 原码(true form): 
	 * 反码(reverse form): 
	 * 补码(complement form): 
	 * 
	 *  3种码特点:
	 *  1) 符号位，最高位0-正数，1-负数
	 *  2) 正数3种码表现都一样
	 *  3) 反码: 除开符号位，负数的其他位取反
	 *  4) 补码: 反码+1，负数的符号位也用来表示数值
	 */
	
	/*
	 * 32位 int 示例
	 * -1
	原码: 10000000000000000000000000000001
	反码: 11111111111111111111111111111110
	补码: 11111111111111111111111111111111 输出方法: Integer.toBinaryString(int)
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	/**
	 * 
	 * 描述: 原码
	 * @author qye.zheng
	 * 
	 */
	//@DisplayName("test")
	@Test
	public void testTrueForm() {
		try {
			int number = 0;
			
			number = -0;
			//System.out.println(Integer.toBinaryString(number));
			
			number = +0;
			//System.out.println(Integer.toBinaryString(number));
			
			number = -10;
			//System.out.println(Integer.toBinaryString(10));
			//System.out.println(Integer.toBinaryString(-10));
			//System.out.println(Integer.toString(number, 2));
			assertTrue("11111111111111111111111111111111".equals(Integer.toBinaryString(-1)));

		} catch (Exception e) {
			log.error("testTrueForm =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	//@DisplayName("test")
	@Test
	public void testMaxAndMinValue() {
		try {
			// 负数，符号位可以表示数字
			// -0 = -2147483648 = -2^31 = 10000000000000000000000000000000
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
			
			// 2147483647 = 2^31 - 1 = 01111111111111111111111111111111
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		} catch (Exception e) {
			log.error("testMaxAndMinValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 补码
	 * @author qye.zheng
	 * 
	 */
	//@DisplayName("test")
	@Test
	public void testComplementForm() {
		try {
			int number = 0;
			
			number = -1;
			System.out.println(Integer.toBinaryString(number));
			
			number = -0;
			System.out.println(Integer.toBinaryString(number));
			
			number = +0;
			System.out.println(Integer.toBinaryString(number));
			
			number = 1;
			System.out.println(Integer.toBinaryString(10));
			System.out.println(Integer.toBinaryString(-10));
			
			
		} catch (Exception e) {
			log.error("testComplementForm =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	//@DisplayName("test")
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
	@DisplayName("testTemp")
	@Test
	public void testTemp() {
		try {
			assertTrue(32 == "11111111111111111111111111111111".length());
			
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
	@DisplayName("testCommon")
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
	@DisplayName("testSimple")
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
	@DisplayName("testBase")
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
	@DisplayName("beforeMethod")
	@Tag(" [每个测试-方法]结束之后运行")
	@BeforeEach
	public void beforeMethod() {
		System.out.println("beforeMethod()");
	}
	
	/**
	 * 
	 * 描述: [每个测试-方法]结束之后运行
	 * @author qye.zheng
	 * 
	 */
	@DisplayName("afterMethod")
	@Tag(" [每个测试-方法]结束之后运行")
	@AfterEach
	public void afterMethod() {
		System.out.println("afterMethod()");
	}
	
	/**
	 * 
	 * 描述: 测试忽略的方法
	 * @author qye.zheng
	 * 
	 */
	@Disabled
	@DisplayName("ignoreMethod")
	@Test
	public void ignoreMethod() {
		System.out.println("ignoreMethod()");
	}
	
	/**
	 * 
	 * 描述: 解决ide静态导入消除问题 
	 * @author qye.zheng
	 * 
	 */
	@DisplayName("noUse")
	@Disabled("解决ide静态导入消除问题 ")
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
		assertArrayEquals(expecteds, actuals, message);
		
		assertFalse(true);
		assertTrue(true);
		assertFalse(true, message);
		assertTrue(true, message);
		
		assertSame(expecteds, actuals);
		assertNotSame(expecteds, actuals);
		assertSame(expecteds, actuals, message);
		assertNotSame(expecteds, actuals, message);
		
		assertNull(actuals);
		assertNotNull(actuals);
		assertNull(actuals, message);
		assertNotNull(actuals, message);
		
		fail();
		fail("Not yet implemented");
		
		dynamicTest(null, null);
		
		assumeFalse(false);
		assumeTrue(true);
		assumingThat(true, null);
	}

}
