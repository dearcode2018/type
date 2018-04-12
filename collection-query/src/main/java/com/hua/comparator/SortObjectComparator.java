/**
  * @filename SortObjectComparator.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.comparator;

import java.util.Comparator;

import com.hua.bean.SortObject;

 /**
 * @type SortObjectComparator
 * @description 比较器
 * @author qianye.zheng
 */
public class SortObjectComparator implements Comparator<SortObject>
{
	/* 升序: true，降序: false， 默认是升序 */
	private Boolean asc = true;

	/**
	 * @description 构造方法
	 * @author qianye.zheng
	 */
	public SortObjectComparator()
	{
		this(true);
	}
	
	/**
	 * 
	 * @description 构造方法
	 * @param asc
	 * @author qianye.zheng
	 */
	public SortObjectComparator(Boolean asc)
	{
		this.asc = asc;
	}
	
	/**
	 * @description 
	 * 升序: 0: 相等，-1: o1小于o2，1: o1大于o2
	 * 降序: 0: 相等，1: o1小于o2，-1: o1大于o2
	 * @param o1
	 * @param o2
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public int compare(SortObject o1, SortObject o2)
	{
		System.out.println("SortObjectComparator.compare()");
		if (asc)
		{ // 升序
			if (o1.getSize() > o2.getSize())
			{
				return 1;
			} else if (o1.getSize() < o2.getSize())
			{
				return -1;
			}
		} else
		{ // 降序
			if (o1.getSize() > o2.getSize())
			{
				return -1;
			} else if (o1.getSize() < o2.getSize())
			{
				return 1;
			}
		}
		
		return 0;
	}


	/**
	 * @return the asc
	 */
	public final Boolean getAsc()
	{
		return asc;
	}


	/**
	 * @param asc the asc to set
	 */
	public final void setAsc(Boolean asc)
	{
		this.asc = asc;
	}

}
