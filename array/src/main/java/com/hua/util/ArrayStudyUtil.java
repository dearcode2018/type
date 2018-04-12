/**
 * 描述: 
 * ArrayStudyUtil.java
 * @author	qye.zheng
 *  version 1.0
 */
package com.hua.util;

/**
 * 描述: 内部研究实施工具，不对外提供公共服务
 * @author  qye.zheng
 * ArrayStudyUtil
 */
public final class ArrayStudyUtil
{

	/**
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 */
	private ArrayStudyUtil()
	{
	}

	/**
	 * 
	 * 描述: 输出字符串数组 
	 * @author qye.zheng
	 * @param arrayString
	 */
	public static void printStringArray(final String[] arrayString)
	{
		for (int i = 0; i < arrayString.length; i++)
		{
			System.out.println("array[" + i + "]" +  "= " + arrayString[i]);
		}
	}
	
	/**
	 * 
	 * 描述: 输出字节数组
	 * 10 * 10
	 * @author qye.zheng
	 * @param arrayByte
	 */
	public static void printByteArray(final byte[] arrayByte)
	{
		for (int i = 0 ; i < arrayByte.length; i++)
		{
			if (i % 10 == 0 && 0 != i)
			{
				System.out.println();
			}
			System.out.print(arrayByte[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 
	 * 描述: 输出字节数组
	 * 10 * 10
	 * @author qye.zheng
	 * @param array
	 */
	public static <T>  void printArray(final T[] array)
	{
		for (int i = 0 ; i < array.length; i++)
		{
			if (i % 10 == 0 && 0 != i)
			{
				System.out.println();
			}
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 
	 * 描述: 输出int数组 
	 * @author  qye.zheng
	 * @param arrayInt
	 */
	public static void printIntArray(final int[] arrayInt)
	{
		for (int i = 0 ; i < arrayInt.length; i++)
		{
			if (i % 10 == 0 && 0 != i)
			{
				System.out.println();
			}
			System.out.print(arrayInt[i] + " ");
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
