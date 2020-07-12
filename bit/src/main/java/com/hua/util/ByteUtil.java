/**
 * ByteUtil.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.util;

import com.hua.constant.Constant;
/**
 * ByteUtil
 * 描述: 
 * @author  qye.zheng
 */
public final class ByteUtil
{

	/**
	 * 构造方法
	 * 描述: 
	 * @author  qye.zheng
	 */
	private ByteUtil()
	{
	}
	
	/**
	 * 
	 * 描述: 生成8位二进制计算机码(补码)
	 * @author qye.zheng
	 * @param value
	 * @return
	 */
	public static String toBinaryString(final byte value)
	{
		/*
		  正数: 前面需要补0，直至结果字符串的长度等于8
		  
		  负数: 截取24 - 31 位 substring(24)
		  
		 */
		String result = null;
		if (value >= Constant.ZERO)
		{
			// 正数(包括0)
			result = Integer.toBinaryString(value);
			// 补0
			result = StringUtil.addZero(result, Byte.SIZE);
		} else 
		{
			// 负数 截取24 - 31 位 substring(24)
			result = Integer.toBinaryString(value);
			// 截取 32bit int二进制的倒数8位
			result = result.substring(24);
		}
		
		return result;
	}

}
