/**
 * BinaryBitUtil.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.util;

import com.hua.constant.Constant;
import com.hua.constant.RegexConstant;
import com.hua.util.StringUtil;

/**
 * BinaryBitUtil
 * 描述: 二进制位工具
 * @author  qye.zheng
 */
public final class BinaryBitUtil
{
	/**
	 计算机中二进制位，以字符串形式作为参数
	 
	 分别获取反码、补码
	 其中，补码是计算机中二进制表示形式
	 
	 */

	/**
	 * 构造方法
	 * 描述: 
	 * @author  qye.zheng
	 */
	private BinaryBitUtil()
	{
	}

	/**
	 * 
	 * 描述: 获取二进制整数原码
	 * @author  qye.zheng
	 * @return
	 */
	public static String getTrueForm(final String trueForm)
	{
		String result = null;
		/** begin 异常拦截段 */
		// 不是二进制数，返回null
		if (!isBinaryCode(trueForm))
		{
			return result;
		}
		/** end of 异常拦截段 */
		// 正负整数的二进制码的原码即为其本身
		result = trueForm;
		
		return result;
	}
	
	/**
	 * 
	 * 描述: 获取二进制正整数反码
	 * @author  qye.zheng
	 * @param trueForm
	 * @return
	 */
	public static String getInverseCode(final String trueForm)
	{
		String result = null;
		/** begin 异常拦截段 */
		// 不是二进制数，返回null
		if (!isBinaryCode(trueForm))
		{
			return result;
		}
		/** end of 异常拦截段 */

		// 正整数，原码 = 反码
		if (Constant.CHAR_ZERO == trueForm.charAt(Constant.ZERO))
		{
			result = trueForm;
			
			// 正整数，直接返回
			return result;
		} else if (Constant.CHAR_ONE == trueForm.charAt(Constant.ZERO))
		{
			// 负整数，反码 - 除了符号位(第一位是1)外，其他数值位取反
			// 截取 数值位
			String code = trueForm.substring(Constant.ONE);
			final StringBuilder builder = StringUtil.getBuilder();
			for (int i = 0; i < code.length(); i++)
			{
				if (Constant.CHAR_ZERO == code.charAt(i))
				{
					builder.append(Constant.CHAR_ONE);
				} else 
				{
					builder.append(Constant.CHAR_ZERO);
				}
			}
			result = builder.toString();
			// 加上符号位
			result = Constant.CHAR_ONE + result;
			
			return result;
		}
		
		return result ;
	}
	
	/**
	 * 
	 * 描述: 获取二进制正整数补码
	 * @author  qye.zheng
	 * @param trueForm
	 * @return
	 */
	public static String getComplementCode(final String trueForm)
	{
		// 获取反码
		String result = getInverseCode(trueForm);
		
		// 返回null 或者trueForm 是正整数
		if (null == result || Constant.CHAR_ZERO == result.charAt(Constant.ZERO))
		{
			return result;
		}
		// 负整数，对补码的整体进行+1 处理，然后再返回
		result = addOne(result);
		
		return result;
	}
	
	/**
	 * 
	 * 描述: 二进制数加1处理 
	 * @author  qye.zheng
	 * @param code
	 * @return
	 */
	public static String addOne(final String code)
	{
		char[] chs = new char[code.length()];
		// 从低位开始，逐位比较，将+1算在最开始的进位中
		boolean carryBit = true;
		for (int i = code.length() - 1; i >= 0; i--)
		{
			if (carryBit)
			{
				// 有进位
				if (Constant.CHAR_ONE == code.charAt(i))
				{
					// 1
					chs[i] = Constant.CHAR_ZERO;
					// 置为 有进位
					carryBit = true;
				} else
				{
					// 0
					chs[i] = Constant.CHAR_ONE;
					// 置为 无进位
					carryBit = false;
				}
			} else 
			{
				// 没有进位，决定于当前下标的值
				chs[i] = code.charAt(i);
				// 置为 无进位
				carryBit = false;
			}
		}
		final String result = String.valueOf(chs);

		return result;
	}
	
	/**
	 * 
	 * 描述: 是否是二进制编码 
	 * @author qye.zheng
	 * @param code
	 * @return
	 */
	public static boolean isBinaryCode(final String code)
	{
		return code.matches(RegexConstant.BINARY_FIGURE);
	}
	
}
