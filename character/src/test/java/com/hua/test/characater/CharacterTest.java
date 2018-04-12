/**
 * 描述: 
 * CharacterTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.characater;

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
 * CharacterTest
 */
public final class CharacterTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBasic() {
		try {
			
			char value = 'a';
			value = '中';
			log.info("testBasic =====> value = " + value);
			
			/*
			 字符也可以通过4位16进制来表示
			 必须是4位16进制.
			 赋值自然也可以
			 */
			// \u0061 == 97 --> a
			char c = '\u0061';
			log.info("testGetNumericValue =====> char = " + c);
			
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
	public void testCharacter() {
		try {
			
			char value = 'a';
			value = '中';
			// 唯一构造方法
			Character ch = new Character(value);
			
			log.info("testCharacter =====> charValue = " + ch.charValue());
			
		} catch (Exception e) {
			log.error("testCharacter =====> ", e);
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
			
			log.info("testValue =====> bitSize = " + Character.SIZE);
			
			// 最小值
			
			log.info("testValue =====> minCodePoint = " + Character.MIN_CODE_POINT);
			
			// surrogate 代理
			log.info("testValue =====> minHighSurrogate = " + Character.MIN_HIGH_SURROGATE);
			
			log.info("testValue =====> minLowSurrogate = " + Character.MIN_LOW_SURROGATE);
			
			log.info("testValue =====> minRadix = " + Character.MIN_RADIX);
			
			// supplementaryCode 辅助码/补充码
			log.info("testValue =====> minSupplementaryCodePoint = " 
			+ Character.MIN_SUPPLEMENTARY_CODE_POINT);
			
			log.info("testValue =====> minSurrogate = " + Character.MIN_SURROGATE);
			
			log.info("testValue =====> minValue = " + Character.MIN_VALUE);
			
			log.info("testValue =====> minCodePoint = " + Character.MIN_CODE_POINT);
			
			
			// 最大值
			
			
			log.info("testValue =====> maxCodePoint = " + Character.MAX_CODE_POINT);
			
			// surrogate 代理
			log.info("testValue =====> maxHighSurrogate = " + Character.MAX_HIGH_SURROGATE);
			
			log.info("testValue =====> maxLowSurrogate = " + Character.MAX_LOW_SURROGATE);
			
			log.info("testValue =====> maxRadix = " + Character.MAX_RADIX);
			
			log.info("testValue =====> maxSurrogate = " + Character.MAX_SURROGATE);
			
			log.info("testValue =====> maxValue = " + Character.MAX_VALUE);
			
			log.info("testValue =====> maxCodePoint = " + Character.MAX_CODE_POINT);
			
		} catch (Exception e) {
			log.error("testValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 测试字母
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testLetter() {
		try {
			
			char value = 'a';
			log.info("testLetter =====> toUpperCase = " + Character.toUpperCase(value));
			//log.info("testLetter =====> toUpperCase = " +  Character.toUpperCase(788887));
			log.info("testLetter =====> toTitleCase = " + Character.toTitleCase(value));
			
			value = 'B';
			log.info("testLetter =====> toLowerCase = " + Character.toLowerCase(value));
			log.info("testLetter =====> toTitleCase = " + Character.toTitleCase(value));
			
			log.info("testLetter =====> toString = " + Character.toString(value));
			
		} catch (Exception e) {
			log.error("testLetter =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testToChars() {
		try {
			/*
			 将32位 int 拆分为2个16位的char，然后返回数组
			数组最大长度为2.最大值是有限制的，超过最大值将抛异常
			
			 */
			
			int codePoint = 97;
			codePoint = 955363;
			codePoint = 1000000;
			log.info("testToChars =====> charsArrayLength = " +Character.toChars(codePoint).length);
			
			log.info("testToChars =====> chars[0] = " +Character.toChars(codePoint)[0]);
			
			codePoint =65535 + 97;
			char[] chs = new char[2];
			int startIndex = 0;
			// 返回的2个char值存在 chs[startIndex] 和 chs[startIndex = 1] 中
			Character.toChars(codePoint, chs, startIndex);
			
			log.info("testToChars =====> chs[0] = " + chs[0]);
			log.info("testToChars =====> chs[1] = " + chs[1]);
			codePoint = 65535 + 97;
			// 统计int值转成32位二进制 再转成char 有多个字符
			log.info("testToChars =====> charCount = " + Character.charCount(codePoint));
			
		} catch (Exception e) {
			log.error("testToChars =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDigit() {
		try {
			
			/*
			 int Character.digit(char, int radix)
			 与
			  char Character.forDigit(int, int radix)
			  方法互逆，两个方法...
			 */
			
			/*
			 int Character.digit(char, int radix)
			 根据指定的进制，输出字符的十进制值
			 例如 十六进制的a或A字符，表示十进制10
			 最高是36进制
			 */
			
			char ch = 'a';
			ch = 'A';
			int radix = 16;
			
			log.info("testDigit =====> digit = " + Character.digit(ch, radix));
			
			/*
			 char Character.forDigit(int, int radix)
			 输入指定的值和进制，输出对应该值的字符
			 最高是36进制
			 */
			int value = 35;
			radix = 36;
			log.info("testDigit =====> forDigit = " + Character.forDigit(value, radix));
			
		} catch (Exception e) {
			log.error("testDigit =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testGetNumericValue() {
		try {
			char c = '9';
			//c= '\u0061';
			
			log.info("testGetNumericValue =====> char = " + c);
			log.info("testGetNumericValue =====> value = " + Character.getNumericValue(c));
			
		} catch (Exception e) {
			log.error("testGetNumericValue =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 测试判断
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testJudge() {
		try {
			int codePoint = 97;
			log.info("testJudge =====> 是否是字母 = " + Character.isAlphabetic(codePoint));
			
			char ch = '中';
			// 是否是 Unicode 成员
			log.info("testJudge =====> 字符是否定义 = " + Character.isDefined(ch));
			log.info("testJudge =====> 是否是数字 = " + Character.isDigit(ch));
			
			ch = 'i';
			// 是否是java标识符的一部分
			log.info("testJudge =====> isJavaIdentifierPart = " + Character.isJavaIdentifierPart(ch));
			log.info("testJudge =====> isJavaIdentifierStart = " + Character.isJavaIdentifierStart(ch));
			
			log.info("testJudge =====> 是否是字母 = " + Character.isLetter('b'));
			
			log.info("testJudge =====> 是否是大写 = " + Character.isUpperCase('A'));
			log.info("testJudge =====> 是否是小写 = " + Character.isLowerCase('A'));
			
			// 注意 Character.isSpace(char) 方法已经过时，改为使用 isWhitespace
			log.info("testJudge =====> 是否是空格 = " + Character.isWhitespace(' '));
			
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
	public void testTemp() {
		try {
			
			log.info("testTemp =====> " + Character.CURRENCY_SYMBOL);
			
			//log.info("testTemp =====> " + Character.getName(26));
		
			Character.isLetter('a');
			
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
