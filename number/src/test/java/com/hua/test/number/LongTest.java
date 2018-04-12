/**
 * 描述: 
 * LongTest.java
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
 * LongTest
 */
public final class LongTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBasic() {
		try {
			
			long lon = 320;
			
			log.info("testBasic =====> " + lon);
			
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
	public void testLong() {
		try {
			String lonStr = "420";
			// 十进制
			Long lon = new Long(lonStr);
			
		} catch (Exception e) {
			log.error("testLong =====> ", e);
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
			
			// 64
			log.info("testValue =====> bitSize = " + Long.SIZE);
			
			// -9223372036854775808
			log.info("testValue =====> minValue = " + Long.MIN_VALUE);
			
			// 9223372036854775807
			log.info("testValue =====> maxValue = " + Long.MAX_VALUE);
			
		} catch (Exception e) {
			log.error("testValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 将制定进制(默认是10进制)转化为long类型值
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testParse() {
		try {
			/*
			 Long.parseLong 和 Long.valueOf() 是相同的，只是返回的类型不同
			 一个是基本类型，一个引用类型
			 */
			
			// 指定进制
			int radix = 0;
			
			String decimalStr = "-123";
			long s2 = Long.parseLong(decimalStr);
			// 或 Long s2 = Long.valueOf(decimalStr, 10);
			log.info("testParse =====> 十进制 longValue = " + s2);
			
			// -15
			String octalStr = "-17";
			long s3 = Long.parseLong(octalStr, 8);
			log.info("testParse =====>八进制 longValue = " + s3);
			
			// -26
			String hexaDecimalStr = "-1A";
			long s4 = Long.parseLong(hexaDecimalStr, 16);
			log.info("testParse =====> 十六进制 longValue = " + s4);
			
		} catch (Exception e) {
			log.error("testParse =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 将基本类型long / 指定进制的字符串(默认是10进制) 转化为 Long 对象
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testValueOf() {
		try {
			long sh = -234;
			Long s1 = Long.valueOf(sh);
			log.info("testValueOf =====> longValue = " + s1.longValue());
			
			// 指定进制
			int radix = 0;
			
			// 二进制 123
			String binaryStr = "0000000001111011";
			binaryStr = "0111101100000000";
			
			Long s = Long.valueOf(binaryStr, 2);
			log.info("testValueOf =====> 二进制 longValue = " + s.longValue());
			
			String decimalStr = "-123";
			Long s2 = Long.valueOf(decimalStr);
			// 或 Long s2 = Long.valueOf(decimalStr, 10);
			log.info("testValueOf =====> 十进制 longValue = " + s2.longValue());
			
			// -15
			String octalStr = "-17";
			Long s3 = Long.valueOf(octalStr, 8);
			log.info("testValueOf =====>八进制 longValue = " + s3.longValue());
			
			// -26
			String hexaDecimalStr = "-1A";
			Long s4 = Long.valueOf(hexaDecimalStr, 16);
			log.info("testValueOf =====> 十六进制 longValue = " + s4.longValue());
			
		} catch (Exception e) {
			log.error("testValueOf =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 解码(将十进制 / 八进制(0) / 十六进制 (0x/0X/#) 字符串解码 为 Long 对象)
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDecode() {
		try {
			// -123
			String decimalStr = "-123";
			Long s1 = Long.decode(decimalStr);
			log.info("testDecode =====> 十进制 longValue = " + s1.longValue());
			
			// -15
			String octalStr = "-017";
			Long s2 = Long.decode(octalStr);
			log.info("testDecode =====>八进制 longValue = " + s2.longValue());
			
			// -26
			String hexaDecimalStr = "-0x1A";
			 //hexaDecimalStr = "-0X1A";
			 //hexaDecimalStr = "-#1A";
			Long s3 = Long.decode(hexaDecimalStr);
			log.info("testDecode =====> 十六进制 longValue = " + s3.longValue());
			
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
			
			final long lon = 123L;
			
			log.info("testReverse =====> 位翻转 = " + Long.reverse(lon));
			
			log.info("testReverse =====> 字节翻转 = " + Long.reverseBytes(lon));
			
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
			// 01111111 -左移1位-> 11111110 == -2
			long lon = 127;
			lon <<= 1;
			
			log.info("testShift =====> 正数-左移 afterLeftShift = " + lon);
			
			// 10000001 -左移1位->  00000010 == 2
			lon = -127;
			lon <<= 1;
			log.info("testShift =====> 负数-左移 afterLeftShift = " + lon);
			
			// 带符号 - 右移 >>
			// 01111111 -右移1位-> 00111111 == 63
			lon = 127;
			lon >>= 1;
			log.info("testShift =====> 正数-带符号 - 右移 afterRightShift = " + lon);
			
			// 10000001 -右移1位->  01000000 == 64
			lon = -127;
			lon >>= 1;
			log.info("testShift =====> 负数-带符号 - 右移 afterRightShift = " + lon);
			
			// 无符号右移 >>>  高位的空位补零
			/* 01111111 -右移1位-> 00111111 == 63 
			 实际上是00000000000000000000000001111111 -忽略符号右移1位->
			 00000000000000000000000000111111  -截取byte部分-> 00111111 --> 63
			*/
			lon = 127;
			lon >>>= 1;
			log.info("testShift =====> 正数-无符号右移 afterRightShift = " + lon);
			
			/*10000001 -右移1位->  01000000 == 64 实际上是 先扩展为32位，再进行移动
			 11111111111111111111111110000001 -忽略符号右移1位-> 0111111111111111111111111000000
			  -截取byte部分-> 11000000 --> -64
			 */
			lon = -127;
			lon >>>= 1;
			log.info("testShift =====> 负数-无符号右移 afterRightShift = " + lon);
			
		} catch (Exception e) {
			log.error("testShift =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 转成2/8/10(默认)/16/指定进制字符串
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testToString() {
		try {
			final long in = 127;
			
			log.info("testToString =====> 2进制字符串 = " + Long.toBinaryString(in));
			
			log.info("testToString =====> 8进制字符串 = " + Long.toOctalString(in));
			
			log.info("testToString =====> 10进制字符串 = " + Long.toString(in));
			
			log.info("testToString =====> 16进制字符串 = " + Long.toHexString(in));
			
			// 指定进制
			final int radix = 4;
			log.info("testToString =====> " + radix + "进制字符串 = " + Long.toString(in, radix));
			
		} catch (Exception e) {
			log.error("testToString =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 位-信息
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBit() {
		try {
			
			// 00000000000000000000000000000000 00000000000000000000000001111110
			long in = 126;
			
			// 二进制位 == 1 的个数
			// 6
			log.info("testBit =====> 正数 -  bitCount = " + Long.bitCount(in));
			
			// 1111110 == 64 
			log.info("testBit =====> 正数 - 最高1位 = " + Long.highestOneBit(in));
			
			// 10 == 2
			log.info("testBit =====> 正数 - 最低1位 = " + Long.lowestOneBit(in));
			
			// 11111111111111111111111110000010
			in = -126;
			
			// 二进制位 == 1 的个数
			// 58
			log.info("testBit =====> 负数 - bitCount = " + Long.bitCount(in));
			
			// 100000000000000000000000000000000000000000000000000000000000000 == -9223372036854775808 (long 最小值)
			log.info("testBit =====> 负数 - 最高1位 = " + Long.highestOneBit(in));
			
			// 10 == 2
			log.info("testBit =====> 负数 - 最低1位 = " + Long.lowestOneBit(in));
			
		} catch (Exception e) {
			log.error("testBit =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 头/尾 的0的个数统计
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testZeroCount() {
		try {
			long in = 0;
			
			// 00000000000000000000000001111110
			in = 126;
			// 25
			log.info("testZeroCount =====> 前导0个数: " + Long.numberOfLeadingZeros(in));
			
			// 1
			log.info("testZeroCount =====> 末尾0个数: " + Long.numberOfTrailingZeros(in));
			
			// 11111111111111111111111110000010
			in = -126;
			
			// 0
			log.info("testZeroCount =====> 前导0个数: " + Long.numberOfLeadingZeros(in));
			
			// 1
			log.info("testZeroCount =====> 末尾0个数: " + Long.numberOfTrailingZeros(in));
			
		} catch (Exception e) {
			log.error("testZeroCount =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 循环移动
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testRotate() {
		try {
			
			/*
			 循环移动，就是尾部的数据跑到头部，或者头部的数据跑到尾部
			 */
			
			long in = 0;
			
			// 00000000000000000000000000000000 00000000000000000000000001111110
			in = 126;
			// 循环左移 -- > 负数则为反转 或调用 rotateRight
			log.info("testRotate =====> " + Long.toBinaryString(Long.rotateLeft(in, 2)));
			
			// 循环右移 -- > 负数则为反转 或调用 rotateLeft
			log.info("testRotate =====> " + Long.toBinaryString(Long.rotateRight(in, 3)));
			
		} catch (Exception e) {
			log.error("testRotate =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 测试 正/负/0
		 正数: 返回 1
		 0: 返回 0
		 负数: 返回 -1
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSignum() {
		try {
			long in = 0;
			
			log.info("testSignum =====> " + Long.signum(in));
			
			in = -126;
			log.info("testSignum =====> " + Long.signum(in));
			
			in = 126;
			log.info("testSignum =====> " + Long.signum(in));
			
		} catch (Exception e) {
			log.error("testSignum =====> ", e);
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
