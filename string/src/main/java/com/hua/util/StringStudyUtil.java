/**
 * 描述: 
 * StringStudyUtil.java
 * @author	qye.zheng
 *  version 1.0
 */
package com.hua.util;

/**
 * 描述: 字符研究工具，不对外提供服务
 * 只作为内部研究领地
 * @author  qye.zheng
 * StringStudyUtil
 */
public final class StringStudyUtil
{

	/**
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 */
	private StringStudyUtil()
	{
	}
	
	/**
	 * 
	 * 描述: 输出字符串数组 
	 * @author qye.zheng
	 * @param array
	 */
	public static void printArray(final String[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("array[" + i + "]" +  "= " + array[i]);
		}
	}
	
	/**
	 * 
	 * 描述: 输出字节数组
	 * 10 * 10
	 * @author qye.zheng
	 * @param data
	 */
	public static void printByteArray(final byte[] data)
	{
		for (int i = 0 ; i < data.length; i++)
		{
			if (i % 10 == 0 && 0 != i)
			{
				System.out.println();
			}
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 
	 * 描述: 输出字节数组
	 * 10 * 10
	 * @author qye.zheng
	 * @param data
	 */
	public static <T>  void printArray(final T[] data)
	{
		for (int i = 0 ; i < data.length; i++)
		{
			if (i % 10 == 0 && 0 != i)
			{
				System.out.println();
			}
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 
	 * 描述: 输出分隔线
	 * @author qye.zheng
	 */
	public static void printLineBetween()
	{
		System.out.println("==========================");
	}
	
}
