/**
 * 描述: 
 * ShortTest.java
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
import com.hua.util.ShortUtil;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * ShortTest
 */
public final class ShortTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBasic() {
		try {
			
			short sh = 320;
			
			log.info("testBasic =====> " + sh);
			
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
	public void testShort() {
		try {
			String shStr = "420";
			// 十进制
			Short sh = new Short(shStr);
			
			log.info("testShort =====> shortValue = " + sh.shortValue());
			
		} catch (Exception e) {
			log.error("testShort =====> ", e);
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
			
			// 16
			log.info("testValue =====> bitSize = " + Short.SIZE);
			
			// -32768
			log.info("testValue =====> minValue = " + Short.MIN_VALUE);
			
			// 32767
			log.info("testValue =====> maxValue = " + Short.MAX_VALUE);
			
		} catch (Exception e) {
			log.error("testValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 将制定进制(默认是10进制)转化为short类型值
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testParse() {
		try {
			
			/*
			 Short.parseShort 和 Short.valueOf() 是相同的，只是返回的类型不同
			 一个是基本类型，一个引用类型
			 */
			
			// 指定进制
			int radix = 0;
			
			String decimalStr = "-123";
			short s2 = Short.parseShort(decimalStr);
			// 或 Short s2 = Short.valueOf(decimalStr, 10);
			log.info("testParse =====> 十进制 shortValue = " + s2);
			
			// -15
			String octalStr = "-17";
			short s3 = Short.parseShort(octalStr, 8);
			log.info("testParse =====>八进制 shortValue = " + s3);
			
			// -26
			String hexaDecimalStr = "-1A";
			short s4 = Short.parseShort(hexaDecimalStr, 16);
			log.info("testParse =====> 十六进制 shortValue = " + s4);
			
			
		} catch (Exception e) {
			log.error("testParse =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 将基本类型short / 指定进制的字符串(默认是10进制) 转化为 Short 对象
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testValueOf() {
		try {
			
			short sh = -234;
			Short s1 = Short.valueOf(sh);
			log.info("testValueOf =====> shortValue = " + s1.shortValue());
			
			// 指定进制
			int radix = 0;
			
			// 二进制 123
			String binaryStr = "0000000001111011";
			binaryStr = "0111101100000000";
			
			Short s = Short.valueOf(binaryStr, 2);
			log.info("testValueOf =====> 二进制 shortValue = " + s.shortValue());
			
			String decimalStr = "-123";
			Short s2 = Short.valueOf(decimalStr);
			// 或 Short s2 = Short.valueOf(decimalStr, 10);
			log.info("testValueOf =====> 十进制 shortValue = " + s2.shortValue());
			
			// -15
			String octalStr = "-17";
			Short s3 = Short.valueOf(octalStr, 8);
			log.info("testValueOf =====>八进制 shortValue = " + s3.shortValue());
			
			// -26
			String hexaDecimalStr = "-1A";
			Short s4 = Short.valueOf(hexaDecimalStr, 16);
			log.info("testValueOf =====> 十六进制 shortValue = " + s4.shortValue());
			
			
		} catch (Exception e) {
			log.error("testValueOf =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 解码(将十进制 / 八进制(0) / 十六进制 (0x/0X/#) 字符串解码 为 Short 对象)
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDecode() {
		try {
			// -123
			String decimalStr = "-123";
			Short s1 = Short.decode(decimalStr);
			log.info("testDecode =====> 十进制 shortValue = " + s1.shortValue());
			
			// -15
			String octalStr = "-017";
			Short s2 = Short.decode(octalStr);
			log.info("testDecode =====>八进制 shortValue = " + s2.shortValue());
			
			// -26
			String hexaDecimalStr = "-0x1A";
			 //hexaDecimalStr = "-0X1A";
			 //hexaDecimalStr = "-#1A";
			Short s3 = Short.decode(hexaDecimalStr);
			log.info("testDecode =====> 十六进制 shortValue = " + s3.shortValue());
			
		} catch (Exception e) {
			log.error("testDecode =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 字节颠倒
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testReverse() {
		try {
			
			/*
			 Short.reverseBytes(short i)
			 高8位右移8位，低8位
			 (i & 0xFF00) >> 8) | (i << 8)
			 
			 字节颠倒: 将高8位和低8位换位.
			 */
			
			// 16位二进制: 00000000 01111011 -颠倒之后-> 01111011 00000000
			short sh = 123;
			// 31488
			log.info("testReverse =====> " + Short.reverseBytes(sh));
			
		} catch (Exception e) {
			log.error("testReverse =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 移位运算
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testShift() {
		try {
			
			/*
			 
			 按照平移的方向和填充数字的规则分为三种：<<（左移）、>>（带符号右移）和>>>（无符号右移）
			 
			 */
			
			// 移位运算
			// 左移 (左移 无需考虑符号，由最左边第二位来决定) 用0填充右边
			// 0000000001111111 -左移1位-> 0000000011111110 == 254
			short sh = 127;
			sh <<= 1;
			
			log.info("testShift =====> 正数-左移 afterLeftShift = " + sh);
			
			// 1111111110000001 -左移1位->  1111111100000010 == -254
			sh = -127;
			sh <<= 1;
			log.info("testShift =====> 负数-左移 afterLeftShift = " + sh);
			
			// 带符号(正常右移) - 右移 >>
			// 0000000001111111 -右移1位-> 0000000000111111 == 63
			sh = 127;
			sh >>= 1;
			log.info("testShift =====> 正数-带符号 - 右移 afterRightShift = " + sh);
			
			// 1111111110000001 -右移1位->  1111111111000000 ==  -64
			sh = -127;
			sh >>= 1;
			log.info("testShift =====> 负数-带符号 - 右移 afterRightShift = " + sh);
			
			/*
		 	 
		 	 注意:
			 由于无符号右移运算符>>> 只是对32位和64位的值有意义，所以它并不像你想象的那样有用。
			 因为你要记住，在表达式中过小的值总是被自动扩大为int 型。这意味着符号位扩展和移动总是发生在32位而不是8位或16位。
			 这样，对第7位以0开始的byte 型的值进行无符号移动是不可能的，因为在实际移动运算时，是对扩大后的32位值进行操作。
			 因此无法对8位的byte 或 16位的short 进行移动.
			 
			 */
			
			// 以下动作，实际上8位或16位需要扩展为32位再进行移动
			
			// 无符号右移 >>>  高位的空位补零
			/* 0000000001111111 -右移1位-> 0000000000111111 == 63 
			 实际上是00000000000000000000000001111111 -忽略符号右移1位->
			 00000000000000000000000000111111  -截取short部分-> 0000000000111111 --> 63
			*/
			sh = 127;
			sh >>>= 1;
			log.info("testShift =====> 正数-无符号右移 afterRightShift = " + sh);
			
			/*0000000010000001 -右移1位->  0000000001000000 == 64 实际上是 先扩展为32位，再进行移动
			 11111111111111111111111110000001 -忽略符号右移1位-> 0111111111111111111111111000000
			  -截取short部分-> 1111111111000000 --> -64
			 */
			sh = -127;
			sh >>>= 1;
			log.info("testShift =====> 负数-无符号右移 afterRightShift = " + sh);
			
		} catch (Exception e) {
			log.error("testShift =====> ", e);
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
			
			short value = -127;
			value = -1;
			log.info("testToString =====> toBinaryString = " + ShortUtil.toBinaryString(value));
			
			log.info("testToString =====> toHexString = " + ShortUtil.toHexString(value));
			
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
