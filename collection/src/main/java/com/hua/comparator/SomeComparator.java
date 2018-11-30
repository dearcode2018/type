/**
  * @filename SomeComparator.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.comparator;

import java.util.Comparator;

import com.hua.bean.SortObject;

/**
 * @type SomeComparator
 * @description 
 * @author qianye.zheng
 */
public class SomeComparator implements Comparator<SortObject>
{

	/**
	 * @description 
	 * @param o1
	 * @param o2
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public int compare(SortObject o1, SortObject o2)
	{
		System.out.println("SomeComparator.compare()");
		if (SortObject.asc)
		{ // 升序
			if (o1.getSize() > o2.getSize())
			{
				return 1;
			} else if (o1.getSize()< o2.getSize())
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

}
