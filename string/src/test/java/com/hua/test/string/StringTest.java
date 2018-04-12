/**
 * 描述: 
 * StringTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.string;

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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.hua.test.BaseTest;
import com.hua.util.StringStudyUtil;
import com.hua.util.StringUtil;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * StringTest
 */
public final class StringTest extends BaseTest {
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBase() {
		try {
			
			log.info("testBase =====> " + str);
			str = "abc";
			
			log.info("testBase =====> " + str);
			
			// 通过 \udddd 4位十六进制来表示一个字符 unicode
			// a
			str = "\u0061";
			log.info("testBase =====> " + str);
			
			// 字符串拼接运算
			str += ", hi";
			log.info("testBase =====> " + str);
			
			
			
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
	public void testSubstring() {
		try {
			str = "abcdefg";
			// 条件: beginIndex >=0 && beginIndex <= str.length - 1
			int beginIndex = 1;
			/*
			 从指定的下标开始到最后 [beginIndex, length - 1] 
			 结果字符串长度: length - beginIndex
			 */
			result = str.substring(beginIndex);
			// 或者写成 result = str.substring(beginIndex, str.length());
			log.info("testSubstring =====> str = " + str);
			log.info("testSubstring =====> result = " + result);
			
			// 
			int endIndex = 4;
			/*
			 字符串下标 [beginIndex, endIndex - 1] 
			 结果字符串长度: endIndex - beginIndex
			 */
			result = str.substring(beginIndex, endIndex);
			log.info("testSubstring =====> str = " + str);
			log.info("testSubstring =====> result = " + result);
			
			// 字符序列
			CharSequence cs = str.subSequence(beginIndex, endIndex);
			log.info("testSubstring =====> cs = " + cs.toString());
			
		} catch (Exception e) {
			log.error("testSubstring =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testIndexOf() {
		try {
			
			/*
			 indexOf 从前往后搜索
			 lastIndexOf 从后往前搜索
			 
			 lastIndexOf(String search, int fromIndex)
			 从指定的位置开始，从后往前搜索
			 123456
			 例如
			  "01a345a7".lastIndexOf("a", -1) --> -1
			  
			 "01a345a7".lastIndexOf("a", 0) --> -1
			 "01a345a7".lastIndexOf("a", 1) --> -1
			 "01a345a7".lastIndexOf("a", 2) --> 2
			 "01a345a7".lastIndexOf("a", 3) --> 2
			 "01a345a7".lastIndexOf("a", 4) --> 2
			 "01a345a7".lastIndexOf("a", 5) --> 2
			 
			 "01a345a7".lastIndexOf("a", 6) --> 6
			 "01a345a7".lastIndexOf("a", 7) --> 6
			 
			 // 延长搜索
			 "01a345a7".lastIndexOf("a", 8) --> 6
			 "01a345a7".lastIndexOf("a", 9) --> 6
			 "01a345a7".lastIndexOf("a", 100) --> 6
			 
			 若搜索不到，则返回-1
			 */
			index = 0;
			str = "1acdabcdaefg";
			search = "cd";
			// 从0开始
			index = str.indexOf(search);
			// 或者写成 index = str.indexOf(search, 0);
			
			// 从指定下标开始搜索
			index = 1;
			index = 0 ;
			resultIndex = str.indexOf(search, index);
			
			log.info("testIndexOf =====> resultIndex = " + resultIndex);
			
			// lastIndexOf 从后往前搜索
			resultIndex = str.lastIndexOf(search);
			log.info("testIndexOf =====> resultIndex = " + resultIndex);
			
			index = 3;
			index = 4;
			index = 9;
			index = 1;
			index = 0;
			index = 22;
			index = -1;
			search = "a";
			resultIndex = str.lastIndexOf(search, index);
			
			log.info("testIndexOf =====> resultIndex_a = " + resultIndex);
			
			
			/*
			 查看原码，若搜索字符串为空，则返回fromIndex值，
			 若fromIndex值超过字符串长度，则返回其长度，即
			 最后一个字符的下一个下标位置.
			 */
			log.info("testIndexOf =====> length = " + str.length());
			index = 11;
			// 空搜索字符串
			search = "";
			resultIndex = str.lastIndexOf(search, index);
			
			log.info("testIndexOf =====> resultIndex = " + resultIndex);
			
			
		} catch (Exception e) {
			log.error("testIndexOf =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testReplace() {
		try {
			/*
			 replace(char oldChar, char newChar)
			 
			 CharSequence 可以是 String 或 Character
			 replace(CharSequence target, CharSequence replacement)
			 
			 */
			str = "abcdeabfg";
			char oldChar = 'a';
			char newChar = 'A';
			// 旧字符 替换为 新字符
			result = str.replace(oldChar, newChar);
			log.info("testReplace =====> replace old char result = " + result);
			
			CharSequence target = "ab";
			CharSequence replacement = "AB";
			result = str.replace(target, replacement);
			log.info("testReplace =====> replace charSequence result = " + result);
			
		} catch (Exception e) {
			log.error("testReplace =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testReplaceFirst() {
		try {
			/*
			 replaceFirst / replaceAll 都是通过
			 正则表达式来执行替换，replaceFirst 找到第一个
			 之后就执行替换，不再往下找，而replaceAll则是
			 替换所有的
			 replace也是替换所有的，但是，不支持正则表达式方式
			 而replaceAll则同时支持目标字符串、正则2种方式.
			 replaceAll > replace
			 replaceFirst == 1
			 */
			str = "ab12mbk07a";
			str = "ab12mbk07a";
			str = "aa12mbk07a";
			// 整体由a或b多个字符构成的子串
			regex = "[a-b]+";
			replacement = "#";
			
			result = str.replaceFirst(regex, replacement);
			log.info("testReplaceFirst =====> result = " + result);
			
		} catch (Exception e) {
			log.error("testReplaceFirst =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testReplaceAll() {
		try {
			/*
			 replaceFirst / replaceAll 都是通过
			 正则表达式来执行替换，replaceFirst 找到第一个
			 之后就执行替换，不再往下找，而replaceAll则是
			 替换所有的
			 replace也是替换所有的，但是，不支持正则表达式方式
			 而replaceAll则同时支持目标字符串、正则2种方式.
			 replaceAll > replace
			 replaceFirst == 1
			 */
			str = "ab12mbk07a";
			str = "ab12mbk07a";
			str = "aa12mbk07a";
			// 整体由a或b多个字符构成的子串
			regex = "[a-b]+";
			replacement = "%";
			
			result = str.replaceAll(regex, replacement);
			log.info("testReplaceAll =====> result = " + result);
			
		} catch (Exception e) {
			log.error("testReplaceAll =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSplit() {
		try {
			/*
			 字符串分割，分割之后返回字符串数组
			 String[] split(String regex)
			 
			 String[] split(String regex, int limit)
			 */
			str = "1a2b3c4d5e6";
			// 根据字母来分割
			regex = "[a-z]{1}";
			array = str.split(regex);
			//StringStudyUtil.printArray(array);
			
			System.out.println("==========================");
			
			/*
			 个数限制
			 limit 分割后的字符串数组最大长度
			 ，若limit 少于无限制的长度，则执行 limit - 1次的分割
			 分割后最后一个元素是分割剩下的所有字符串.
			 若limit 大于无限制的长度，则返回无限制的长度.
			 
			 最后一个元素: 未拆字符串剩下的
			 
			 */
			int limit = 2;
			//limit = 6;
			// 超过无限制的长度
			//limit = 100;
			array = str.split(regex, limit);
			StringStudyUtil.printArray(array);
			
		} catch (Exception e) {
			log.error("testSplit =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testConcact() {
		try {
			/*
			 字符串连接
			 */
			str = "start123 ";
			result = str.concat(" end456");
			
			log.info("testConcact =====> result = " + result);
			
		} catch (Exception e) {
			log.error("testConcact =====> ", e);
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
			/*
			 equals / equalsIgnoreCase
			 contentEquals(CharSequence)
			 contentEquals(StringBuffer)
			 */
			str = "abc";
			String other = "abc";
			log.info("testEquals =====> equals = " + str.equals(other));
			log.info("testEquals =====> equalsIgnoreCase = " + str.equalsIgnoreCase(other));
			
			log.info("testEquals =====> contentEquals = " + str.contentEquals(other));
			
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
	public void testGetBytes() {
		try {
			/*
			 getBytes()
			 getBytes(Charset)
			 getBytes(String charsetName)
			 */
			// 97 98 99 100 101 102 103 
			str = "abcdefg";
			// 97 98 99 100 101 102 103 -28 -72 -83 
			str = "abcdefg中";
			data = str.getBytes();
			//StringStudyUtil.printByteArray(data);
			
			StringStudyUtil.printLineBetween();
			
			str = "abcdefg中";
			// 指定编码
			// 97 98 99 100 101 102 103 -28 -72 -83 
			//data = str.getBytes(Constant.CHART_SET_UTF_8);
			
			// 97 98 99 100 101 102 103 -42 -48 
			//data = str.getBytes(Constant.CHART_SET_GB2312);
			
			// 97 98 99 100 101 102 103 -42 -48 
			//data = str.getBytes(Constant.CHART_SET_GBK);
			
			StringStudyUtil.printByteArray(data);
			
		} catch (Exception e) {
			log.error("testGetBytes =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 修剪
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTrim() {
		try {
			/*
			 将头尾的所有空格字符去掉
			 中间空格不在修剪范围
			 regex = "\\s";
			 */
			str = " ab cde fg   ";
			result = str.trim();
			log.info("testTrim =====> result = " + result);
			
		} catch (Exception e) {
			log.error("testTrim =====> ", e);
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
			str = "abcdefg";
			
			log.info("testJudge =====> isEmpty = " + str.isEmpty());
			regex = "[a-z]+";
			log.info("testJudge =====> " + str.matches(regex));
			
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
	public void testFormat() {
		try {
			/*
			 String String.format(String format, Object...)
			 
			 String String.format(Locale, String format, Object...)
			 
			 */
			format = "value = %5d, float=%4.1f";
			int value = 123;
			float fl = 12.8689F;
			fl = 12.8366F;
			result = String.format(format, value, fl);
			log.info("testFormat =====> result = " + result);
			
		} catch (Exception e) {
			log.error("testFormat =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testValueOf() {
		try {
			/*
			 参数: boolean / char / int / long / float / double / Object
			 valueOf()
			 valueOf(char[])
			 valueOf(char[], int offset, int count)
			 offset 位移
			 */
			char[] chs = {'a' , 'b', 'c', 'd', 'e', 'f'};
			//  valueOf(char[])
			result = String.valueOf(chs);
			log.info("testValueOf =====> result1 = " + result);
			
			int offset = 1;
			int count =3;
			// valueOf(char[], int offset, int count)
			result = String.valueOf(chs, offset, count);
			log.info("testValueOf =====> result2 = " + result);
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
	public void testCopyValueOf() {
		try {
			/*
			  将字符数组拷贝构造字符串对象
			  与String.valueOf(char[])方法相同
			  	
			 */
			char[] chs = {'a' , 'b', 'c', 'd', 'e', 'f'};
			result = String.copyValueOf(chs);
			log.info("testCopyValueOf =====> copyValueOf result = " + result);
			
			result = String.valueOf(chs);
			log.info("testCopyValueOf =====> valueOf result = " + result);
			
			int offset = 1;
			int count =3;
			result = String.copyValueOf(chs, offset, count);
			log.info("testCopyValueOf =====> copyValueOf(offset, count) result = " + result);
		} catch (Exception e) {
			log.error("testCopyValueOf =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 测试转换
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTransform() {
		try {
			str = "abcdefg";
			
			// 转成字符数组 - 底层结构
			char[] chs = str.toCharArray();
			
			log.info("testTransform =====> " + chs);
			
			log.info("testTransform =====> " + str.toUpperCase());
			
			log.info("testTransform =====> " + str.toLowerCase());
			
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
	public void testGetChars() {
		try {
			/*
			 拷贝的长度必须满足: (srcEnd - srcBegin) <= chs.length - dstBegin
			 拷贝多了，导致字符数组无法装得下，将抛异常
			 java.lang.ArrayIndexOutOfBoundsException
			 */
			
			char[] chs = new char[4];
			str = "abcdefgasfsdafee";
			int srcBegin = 2;
			int srcEnd = 5;
			
			int dstBegin = 1;
			// 将 [srcBegin, srcEnd) 长度 (srcEnd - srcBegin) 范围str的字符 拷贝到chs
			str.getChars(srcBegin, srcEnd, chs, dstBegin);
			
			log.info("testGetChars =====> " + chs[0]);
			log.info("testGetChars =====> " + chs[1]);
			log.info("testGetChars =====> " + chs[2]);
			log.info("testGetChars =====> " + chs[3]);
			
		} catch (Exception e) {
			log.error("testGetChars =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testConstains() {
		try {
			str = "abcdefg";
			CharSequence cs = "cd";
			log.info("testConstains =====> constains = " + str.contains(cs));
			
		} catch (Exception e) {
			log.error("testConstains =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 以xx开始/结束
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testWith() {
		try {
			/*
			 startWith(String prefix)
			 startWith(String prefix, int toOffset)
			 
			 endsWith(String suffix)
			 */
			str = "abacdefg";
			String prefix = "ab";
			log.info("testWith =====> startsWith1 = " + str.startsWith(prefix));
			prefix = "ac";
			// 从指定下标开始匹配
			int startIndex = 2;
			//startIndex = 3;
			log.info("testWith =====> startsWith2 = " + str.startsWith(prefix, startIndex));
			
			str = "abacdefgkg";
			String suffix = "g";
			log.info("testWith =====> endsWith1 = " + str.endsWith(suffix));
			
		} catch (Exception e) {
			log.error("testWith =====> ", e);
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
			String str = null;
			
			
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
			StringBuilder builder = StringUtil.getBuilder();
			//builder.append("a" + ",");
			//builder.append("b" + ",");
			//builder.append("c" + ",");
			
			String[] arr = builder.toString().split(",");
			
			System.out.println(arr[0].equals(""));
			
			System.out.println(arr.length);
			
			System.out.println(Arrays.toString(arr));
			
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
