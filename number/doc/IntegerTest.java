/**
 * 描述: 
 * IntegerTest.java
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
 * IntegerTest
 */
public final class IntegerTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBasic() {
		try {
			
			int in = 320;
			
			log.info("testBasic =====> " + in);
			
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
	public void testInteger() {
		try {
			String intStr = "420";
			// 十进制
			Integer in = new Integer(intStr);
			
			log.info("testInteger =====> intValue = " + in.intValue());
			
			
			
		} catch (Exception e) {
			log.error("testInteger =====> ", e);
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
			// 32 bit
			log.info("testValue =====> bitSize = " + Integer.SIZE);
			
			// -2147483648
			log.info("testValue =====> minValue = " + Integer.MIN_VALUE);
			
			// 2147483647
			log.info("testValue =====> maxValue = " + Integer.MAX_VALUE);
			
		} catch (Exception e) {
			log.error("testValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 将制定进制(默认是10进制)转化为int类型值
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testParse() {
		try {
			/*
			 Integer.parseInt 和 Integer.valueOf() 是相同的，只是返回的类型不同
			 一个是基本类型，一个引用类型
			 */
			
			// 指定进制
			int radix = 0;
			
			String decimalStr = "-123";
			int s2 = Integer.parseInt(decimalStr);
			// 或 Integer s2 = Integer.valueOf(decimalStr, 10);
			log.info("testParse =====> 十进制 intValue = " + s2);
			
			// -15
			String octalStr = "-17";
			int s3 = Integer.parseInt(octalStr, 8);
			log.info("testParse =====>八进制 intValue = " + s3);
			
			// -26
			String hexaDecimalStr = "-1A";
			int s4 = Integer.parseInt(hexaDecimalStr, 16);
			log.info("testParse =====> 十六进制 intValue = " + s4);
			
		} catch (Exception e) {
			log.error("testParse =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 将基本类型int / 指定进制的字符串(默认是10进制) 转化为 Integer 对象
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testValueOf() {
		try {
			int in = -234;
			Integer s1 = Integer.valueOf(in);
			log.info("testValueOf =====> intValue = " + s1.intValue());
			
			// 指定进制
			int radix = 0;
			
			// 二进制 123
			String binaryStr = "0000000001111011";
			binaryStr = "0111101100000000";
			
			Integer s = Integer.valueOf(binaryStr, 2);
			log.info("testValueOf =====> 二进制 intValue = " + s.intValue());
			
			String decimalStr = "-123";
			Integer s2 = Integer.valueOf(decimalStr);
			// 或 Integer s2 = Integer.valueOf(decimalStr, 10);
			log.info("testValueOf =====> 十进制 intValue = " + s2.intValue());
			
			// -15
			String octalStr = "-17";
			Integer s3 = Integer.valueOf(octalStr, 8);
			log.info("testValueOf =====>八进制 intValue = " + s3.intValue());
			
			// -26
			String hexaDecimalStr = "-1A";
			Integer s4 = Integer.valueOf(hexaDecimalStr, 16);
			log.info("testValueOf =====> 十六进制 intValue = " + s4.intValue());
			
		} catch (Exception e) {
			log.error("testValueOf =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 解码(将十进制 / 八进制(0) / 十六进制 (0x/0X/#) 字符串解码 为 Integer 对象)
	 * 把其他类型的字符码 转成 Integer 对象码
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDecode() {
		try {
			// -123
			String decimalStr = "-123";
			Integer s1 = Integer.decode(decimalStr);
			log.info("testDecode =====> 十进制 intValue = " + s1.intValue());
			
			// -15
			String octalStr = "-017";
			Integer s2 = Integer.decode(octalStr);
			log.info("testDecode =====>八进制 intValue = " + s2.intValue());
			
			// -26
			String hexaDecimalStr = "-0x1A";
			 //hexaDecimalStr = "-0X1A";
			 //hexaDecimalStr = "-#1A";
			Integer s3 = Integer.decode(hexaDecimalStr);
			log.info("testDecode =====> 十六进制 intValue = " + s3.intValue());
			
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
			 
			 00000001 00000010 00000011 00000100 
			 
			 0xFF00
			 00000000 00000000 11111111 00000000 
			 
			 0xFF0000
			 00000000 11111111 00000000 00000000
			 
			 Integer.reverseBytes(int i)
				( (i >>> 24) ) |
               ( (i >>   8) & 0xFF00 ) |
               ( (i <<   8) & 0xFF0000 ) |
               ( (i << 24) )
			 
			 分析:
			 ( (i >>> 24) ) --  第1个8位 00000000 00000000 00000000 00000001
			 ( (i >>   8) & 0xFF00 ) --  第2个8位
			 00000000 00000001 00000010 00000011
			 00000000 00000000 11111111 00000000
			 00000000 00000000 00000010 00000000
			 
			 ( (i <<   8) & 0xFF0000 )--  第3个8位 
			 00000010 00000011 00000100 00000000
			 00000000 11111111 00000000 00000000
			 00000000 00000011 00000000 00000000
			  ( (i << 24) )--  第4个8位 00000100 00000000 00000000 00000000
			 
			 00000000 00000000 00000000 00000001
			 00000000 00000000 00000010 00000000
			 00000000 00000011 00000000 00000000
			 00000100 00000000 00000000 00000000
			 -->
			以字节为单位进行翻转.
			 
			 字节颠倒: 将高16位和低16位换位.
			 高16位中的高8位和低8位互换，低16
			 */
			
			// 32位二进制: 00000000000000000000000001111011 -颠倒之后->
			final int in = 123;
			//  2063597568
			log.info("testReverse =====> " + Integer.reverseBytes(in));
			
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
			// 00000000000000000000000001111111 -左移1位-> 00000000000000000000000011111110 == 254
			int in = 127;
			in <<= 1;
			
			log.info("testShift =====> 正数-左移 afterLeftShift = " + in);
			
			// 11111111111111111111111110000001 -左移1位->  11111111111111111111111100000010 == -254
			in = -127;
			in <<= 1;
			log.info("testShift =====> 负数-左移 afterLeftShift = " + in);
			
			// 带符号 - 右移 >>
			// 00000000000000000000000001111111 -右移1位-> 00000000000000000000000000111111 == 63
			in = 127;
			in >>= 1;
			log.info("testShift =====> 正数-带符号 - 右移 afterRightShift = " + in);
			
			// 11111111111111111111111110000001 -右移1位->  11111111111111111111111111000000 == -64
			in = -127;
			in >>= 1;
			log.info("testShift =====> 负数-带符号 - 右移 afterRightShift = " + in);
			
			// 无符号右移 >>>  高位的空位补零
			/* 
				00000000000000000000000001111111 -无符号右移1位-> 00000000000000000000000000111111 == 63
			*/
			in = 127;
			in >>>= 1;
			log.info("testShift =====> 正数-无符号右移 afterRightShift = " + in);
			
			/*
			 11111111111111111111111110000001 --> 01111111111111111111111111000000 == 2147483584
			 */
			in = -127;
			in >>>= 1;
			log.info("testShift =====> 负数-无符号右移 afterRightShift = " + in);
			
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
			final int in = 127;
			
			log.info("testToString =====> 2进制字符串 = " + Integer.toBinaryString(in));
			
			log.info("testToString =====> 8进制字符串 = " + Integer.toOctalString(in));
			
			log.info("testToString =====> 10进制字符串 = " + Integer.toString(in));
			
			log.info("testToString =====> 16进制字符串 = " + Integer.toHexString(in));
			
			// 指定进制
			final int radix = 4;
			log.info("testToString =====> " + radix + "进制字符串 = " + Integer.toString(in, radix));
			
		} catch (Exception e) {
			log.error("testToString =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 根据name获取java系统属性，返回Integer对象
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testGetInteger() {
		try {
			// java 系统属性
			String property = "sun.arch.data.model";
			log.info("testTemp =====> " + Integer.getInteger(property));
			
			// Long 同理
			log.info("testGetInteger =====> " + Long.getLong(property));
			
		} catch (Exception e) {
			log.error("testGetInteger =====> ", e);
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
			
			// 00000000000000000000000001111110
			int in = 126;
			
			// 二进制位 == 1 的个数
			// 6
			log.info("testBit =====> 正数 -  bitCount = " + Integer.bitCount(in));
			
			// 1111110 == 64 
			log.info("testBit =====> 正数 - 最高1位 = " + Integer.highestOneBit(in));
			
			// 10 == 2
			log.info("testBit =====> 正数 - 最低1位 = " + Integer.lowestOneBit(in));
			
			// 11111111111111111111111110000010
			in = -126;
			
			// 二进制位 == 1 的个数
			// 26
			log.info("testBit =====> 负数 - bitCount = " + Integer.bitCount(in));
			
			// 10000000000000000000000000000000 == -2147483648 (int 最小值)
			log.info("testBit =====> 负数 - 最高1位 = " + Integer.highestOneBit(in));
			
			// 10 == 2
			log.info("testBit =====> 负数 - 最低1位 = " + Integer.lowestOneBit(in));
			
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
			int in = 0;
			
			// 00000000000000000000000001111110
			in = 126;
			// 25
			log.info("testZeroCount =====> 前导0个数: " + Integer.numberOfLeadingZeros(in));
			
			// 1
			log.info("testZeroCount =====> 末尾0个数: " + Integer.numberOfTrailingZeros(in));
			
			// 11111111111111111111111110000010
			in = -126;
			
			// 0
			log.info("testZeroCount =====> 前导0个数: " + Integer.numberOfLeadingZeros(in));
			
			// 1
			log.info("testZeroCount =====> 末尾0个数: " + Integer.numberOfTrailingZeros(in));
			
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
			
			int in = 0;
			
			// 00000000000000000000000001111110
			in = 126;
			// 循环左移 -- > 负数则为反转 或调用 rotateRight
			log.info("testRotate =====> " + Integer.toBinaryString(Integer.rotateLeft(in, 2)));
			
			// 循环右移 -- > 负数则为反转 或调用 rotateLeft
			log.info("testRotate =====> " + Integer.toBinaryString(Integer.rotateRight(in, 3)));
			
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
			
			int in = 0;
			
			log.info("testSignum =====> " + Integer.signum(in));
			
			in = -126;
			log.info("testSignum =====> " + Integer.signum(in));
			
			in = 126;
			log.info("testSignum =====> " + Integer.signum(in));
			
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
			
			log.info("testTemp =====> " + Integer.bitCount(1));
			
			log.info("testTemp =====> " + Integer.highestOneBit(127));
			
			int in = -126;
			in = -2147483648;
			log.info("testTemp =====> " + Integer.toBinaryString(in));
			
			// 00000000000000000000000001111110
			in = 126;
			
			// 11111111111111111111111110000010
			in = -126;
			
			log.info("testTemp =====> " + Integer.numberOfLeadingZeros(in));
			
			log.info("testTemp =====> " + Integer.numberOfTrailingZeros(in));
			
			/*
			 循环移动，就是尾部的数据跑到头部，或者头部的数据跑到尾部
			 */
			// 00000000000000000000000001111110
			in = 126;
			// 循环左移 -- > 负数则为反转 或调用 rotateRight
			log.info("testTemp =====> " + Integer.toBinaryString(Integer.rotateLeft(in, 2)));
			
			// 循环右移 -- > 负数则为反转 或调用 rotateLeft
			log.info("testTemp =====> " + Integer.toBinaryString(Integer.rotateRight(in, 3)));
			
			// 11111111111111111111111110000010
			in = -126;
			log.info("testTemp =====> " + Integer.signum(in));
			
			in = 126;
			log.info("testTemp =====> " + Integer.signum(in));
			
			
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
