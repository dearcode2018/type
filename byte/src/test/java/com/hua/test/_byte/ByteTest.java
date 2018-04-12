/**
 * 描述: 
 * ByteTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test._byte;

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
import com.hua.util.ByteUtil;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * ByteTest
 */
public final class ByteTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBaseByte() {
		try {
			
			byte bt = 127;
			
			log.info("testBaseByte =====> addBefore = " + bt);
			
			// 最大值 01111111 -加1之后-> 10000000 --> -128
			bt += 1;
			
			log.info("testBaseByte =====> addAfter = " + bt);
			
			// -1 == 11111111 -加1后-> 00000000 --> 0
			bt = -1;
			bt += 1;
			log.info("testBaseByte =====> addOne = " + bt);
			
			
		} catch (Exception e) {
			log.error("testBaseByte =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 移位运算
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testShiftA() {
		try {
			
			// 有符号左移
			int num = 2;
			System.out.println(num << 5);
			
			/**
			 0000 0000 0000 0000 0000 0000 0000 0001
			 727379969
			 101011010110101111000000000001
			 */
/*			 num = 727379969;
			System.out.println("num -->" + (num << 1));
			*/
			
			// 有符号右移
			num = 64;
			System.out.println(num >> 5);
		
			// 无符号右移 (正数)
			num = 64;
			System.out.println(num >>> 5);
			
			// 无符号右移 (负数)
			num = -64;
			System.out.println(num >>> 5);
			
			num = 1073741825;
			//System.out.println(Integer.parseInt("01000000000000000000000000000001", 2));
			System.out.println(num << 1);
			
			
		} catch (Exception e) {
			log.error("testShiftA =====> ", e);
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
			// 01111111 -左移1位-> 11111110 == -2
			byte bt = 127;
			bt <<= 1;
			
			log.info("testShift =====> 正数-左移 afterLeftShift = " + bt);
			
			// 10000001 -左移1位->  00000010 == 2
			bt = -127;
			bt <<= 1;
			log.info("testShift =====> 负数-左移 afterLeftShift = " + bt);
			
			// 带符号 - 右移 >>
			// 01111111 -右移1位-> 00111111 == 63
			bt = 127;
			bt >>= 1;
			log.info("testShift =====> 正数-带符号 - 右移 afterRightShift = " + bt);
			
			// 10000001 -右移1位->  01000000 == 64
			bt = -127;
			bt >>= 1;
			log.info("testShift =====> 负数-带符号 - 右移 afterRightShift = " + bt);
			
			/*
		 	 
		 	 注意:
			 由于无符号右移运算符>>> 只是对32位和64位的值有意义，所以它并不像你想象的那样有用。
			 因为你要记住，在表达式中过小的值总是被自动扩大为int 型。这意味着符号位扩展和移动总是发生在32位而不是8位或16位。
			 这样，对第7位以0开始的byte 型的值进行无符号移动是不可能的，因为在实际移动运算时，是对扩大后的32位值进行操作。
			 因此无法对8位的byte 或 16位的short 进行移动.
			 
			 */
			
			// 以下动作，实际上8位或16位需要扩展为32位再进行移动
			
			// 无符号右移 >>>  高位的空位补零
			/* 01111111 -右移1位-> 00111111 == 63 
			 实际上是00000000000000000000000001111111 -忽略符号右移1位->
			 00000000000000000000000000111111  -截取byte部分-> 00111111 --> 63
			*/
			bt = 127;
			bt >>>= 1;
			log.info("testShift =====> 正数-无符号右移 afterRightShift = " + bt);
			
			/*10000001 -右移1位->  01000000 == 64 实际上是 先扩展为32位，再进行移动
			 11111111111111111111111110000001 -忽略符号右移1位-> 0111111111111111111111111000000
			  -截取byte部分-> 11000000 --> -64
			 */
			bt = -127;
			bt >>>= 1;
			log.info("testShift =====> 负数-无符号右移 afterRightShift = " + bt);
			
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
	public void testByte() {
		try {
			// java.lang.Byte
			
			// 注意: Byte(String byteStr) 默认基数是 10，因此值的范围必须是 [-128, 127]
			String byteStr = "-128";
			Byte b = new Byte(byteStr);
		
			log.info("testByte =====> ");
			
			log.info("testByte =====> byteValue = " + b.byteValue());
			
			log.info("testByte =====> shortValue = " + b.shortValue());
			
			log.info("testByte =====> intValue = " + b.intValue());
			
			log.info("testByte =====> floatValue = " + b.floatValue());
			
			log.info("testByte =====> doubleValue = " + b.doubleValue());
			
			log.info("testByte =====> longValue = " + b.longValue());
			
		} catch (Exception e) {
			log.error("testByte =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testByteValue() {
		try {
			
			// 多少比特 1byte = 8bit
			log.info("testByteValue =====> bitSize = " + Byte.SIZE);
			
			// 10000000 == -128
			log.info("testByteValue =====> minValue = " + Byte.MIN_VALUE);
			
			// 01111111 == 127
			log.info("testByteValue =====> maxValue = " + Byte.MAX_VALUE);
			
		} catch (Exception e) {
			log.error("testByteValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 将制定进制(默认是10进制)转化为byte类型值
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testParse() {
		try {
			/*
			 Byte.parseByte 和 Byte.valueOf() 是相同的，只是返回的类型不同
			 一个是基本类型，一个引用类型
			 */
			// 
			String decimalStr = "-128";
			byte b1 = Byte.parseByte(decimalStr);
			// 或写成  byte b1 = Byte.parseByte(decimalStr, 10);
			log.info("testParse =====> 十进制 byteValue = " + b1);
			
			/*
			 字符串类型 -构造方法 - 指定进制(基数)  这里以二进制为例
			 注意，这里只能写为正数: 0000000 ~ 1111111，(7位，符号位写成+或-)
			 
			 不能出现 10000000 ~ 11111111，否者会抛数字格式异常
			 java.lang.NumberFormatException: Value out of range. Value:"11000001" Radix:2
			 
			 负数可以这样写 -0000000 ~ -1111111，在正数前面加上负号符号，
			 正数可以加+号或者不加或者加0表示.
			 
			注意: 由于此问题，导致-128无法表示出来，最小能解析的值是-127 = -1111111
			 */
			// 以二进制为例
			String binaryStr = "-1111111";
			byte b2 = Byte.parseByte(binaryStr, 2);
			log.info("testParse =====> 二进制 byteValue =  " + b2);
			
		} catch (Exception e) {
			log.error("testParse =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 将基本类型byte / 指定进制的字符串(默认是10进制) 转化为 Byte 对象
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testValueOf() {
		try {
			
			// Byte.valueOf(byte | String | int radix)
			
			// byte 类型
			byte bt = 127;
			Byte b1 = Byte.valueOf(bt);
			log.info("testValueOf =====> byte 类型 byteValue = " + b1.byteValue());
			
			// 字符串类型 -构造方法 默认解析10进制
			String decimalStr = "-128";
			Byte b2 = Byte.valueOf(decimalStr);
			// 或者写成  Byte b2 = Byte.valueOf(decimalStr, 10);
			log.info("testValueOf =====>  默认解析10进制 byteValue = " + b2.byteValue());
			
			/*
			 字符串类型 -构造方法 - 指定进制(基数)  这里以二进制为例
			 注意，这里只能写为正数: 0000000 ~ 1111111，(7位，符号位写成+或-)
			 
			 不能出现 10000000 ~ 11111111，否者会抛数字格式异常
			 java.lang.NumberFormatException: Value out of range. Value:"11000001" Radix:2
			 
			 负数可以这样写 -0000000 ~ -1111111，在正数前面加上负号符号，
			 正数可以加+号或者不加或者加0表示.
			 
			注意: 由于此问题，导致-128无法表示出来，最小能解析的值是-127 = -1111111
			 */
			String binaryPositiveStr = "1111111";
			int radix = 2;
			Byte b3 = Byte.valueOf(binaryPositiveStr, radix);
			log.info("testValueOf =====> 正数 - 指定进制(基数)  byteValue = " + b3.byteValue());
			
			String binaryPassiveStr = "-1111111";
			Byte b4 = Byte.valueOf(binaryPassiveStr, radix);
			log.info("testValueOf =====> 负数 - 指定进制(基数)  byteValue = " + b4.byteValue());
			
			
		} catch (Exception e) {
			log.error("testValueOf =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 解码(将二进制字符串解码 为 Byte 对象)
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDecode() {
		try {
			
			/*
			 编码
			 十进制 / 八进制(0) / 十六进制 (0x/0X/#)
			 
			 */
			
			
			// 十进制
			// 十进制值: 127
			String decimalStr = "127";
			Byte b1 = Byte.decode(decimalStr);
			log.info("testDecode =====> 十进制 byteValue = " + b1.byteValue());
			
			
			// 八进制 (数字0 + 八进制数)
			// 十进制值: 23
			String octalStr = "027";
			Byte b2 = Byte.decode(octalStr);
			log.info("testDecode =====> 八进制 byteValue = " + b2.byteValue());
			
			
			// 十六进制 (数字0 + x/X 或直接 #)
			// 十进制值: 26
			String hexadecimalStr = "0X1A";
			//hexadecimalStr = "0x1A";
			//hexadecimalStr = "#1A";
			Byte b3 = Byte.decode(hexadecimalStr);
			log.info("testDecode =====> 十六进制 byteValue = " + b3.byteValue());
			
		} catch (Exception e) {
			log.error("testDecode =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testToBinaryString() {
		try {
			/*
			 根据十进制 输出8位二进制计算机码(补码)
			 127 ==  01111111
			 -128 == 10000000
			 */
			byte b = 127;
			b = - 128;
			b = 0;
			b = 1;
			b = 10;
			//log.info("testToBinaryString =====> " + Integer.toBinaryString(b).substring(24));
			
			log.info("testToBinaryString =====> " + ByteUtil.toBinaryString(b));
			
			log.info("testToBinaryString =====> ");
			
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
	public void testHexString() {
		try {
			byte value = 127;
			value = -128;
			value = -1;
			log.info("testHexString =====> toHexString = " + ByteUtil.toHexString(value));
			
		} catch (Exception e) {
			log.error("testHexString =====> ", e);
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
			
			byte b = 127;
			log.info("testTemp =====> " + Byte.toString(b));
			
			String str = "12345678";
			// 负数倒取无法实现 
			// java.lang.StringIndexOutOfBoundsException: String index out of range: -1
			//log.info("testTemp =====> " + str.substring(-1, -3));
			log.info("testTemp =====> " + Integer.toOctalString(-128));
			log.info("testTemp =====> " + Integer.toHexString(-128));
			
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
