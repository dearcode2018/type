/**
  * @filename ListReadWrite.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.collection;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

/**
 * @type ListReadWrite
 * @description 
 * @author qianye.zheng
 */
public class ListReadWrite
{

	public static final int N = 50000;
	
	/*
	 * add(T t) 方法，ArrayList较快
	 * 
	 * add(int index, T t) LinkedList较快
	 * 遍历ArrayList较快
	 * 而且，N越大，两者的差距更加大
	 * 
	 * 因此，ArrayList适合随机访问，LinkedList适合增删数据.
	 * 
	 *  8G 8核机器上 5万条记录: 
		ArrayList添加 50000 条记录 耗时: 5
		LinkedList添加 50000 条记录 耗时: 3
		ArrayList添加 50000 条到头部记录 耗时: 150
		LinkedList添加 50000 条到头部记录 耗时: 3
		ArrayList遍历 50000 条记录 耗时: 3
		LinkedList遍历 50000 条记录 耗时: 855
	 */
	
	/**
	 * 
	 * @description 添加耗时
	 * @param list
	 * @return
	 * @author qianye.zheng
	 */
	public static final long timeOfAdd(final List<Object> list)
	{
		final Instant instant1 = Instant.now();
		for (int i =0; i < N; i++)
		{
			// 添加元素
			list.add(new Object());
			// 添加元素到头部
			//list.add(0, new Object());
		}
		final Instant instant2 = Instant.now();
		
		return Duration.between(instant1, instant2).toMillis();
	}
	
	/**
	 * 
	 * @description 添加元素到列表头耗时
	 * @param list
	 * @return
	 * @author qianye.zheng
	 */
	public static final long timeOfAddToHead(final List<Object> list)
	{
		final Instant instant1 = Instant.now();
		for (int i =0; i < N; i++)
		{
			// 添加元素
			//list.add(new Object());
			// 添加元素到头部
			list.add(0, new Object());
		}
		final Instant instant2 = Instant.now();
		
		return Duration.between(instant1, instant2).toMillis();
	}
	
	/**
	 * 
	 * @description 添加耗时
	 * @param list
	 * @return
	 * @author qianye.zheng
	 */
	public static final List<Object> add(final List<Object> list)
	{
		for (int i =0; i < N; i++)
		{
			// 添加元素
			list.add(new Object());
			// 添加元素到头部
			//list.add(0, new Object());
		}
		
		return list;
	}
	
	/**
	 * 
	 * @description 遍历耗时
	 * @param list
	 * @return
	 * @author qianye.zheng
	 */
	public static final long timeOfTraverse(final List<Object> list)
	{
		final Instant instant1 = Instant.now();
		for(int i = 0; i < list.size(); i++)
		{
			// 根据索引去访问
			 list.get(i);
			//Object obj = list.get(i);
			//System.out.println(e.toString());
		}
		final Instant instant2 = Instant.now();
		
		return Duration.between(instant1, instant2).toMillis();
	}
	
}
