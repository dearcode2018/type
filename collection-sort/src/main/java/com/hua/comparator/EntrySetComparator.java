/**
  * @filename EntrySetComparator.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import com.hua.bean.SortObject;

 /**
 * @type EntrySetComparator
 * @description 
 * @author qianye.zheng
 */
public class EntrySetComparator implements Comparator<Map.Entry<String, SortObject>>
{

	/**
	 * @description 对Map中的EntrySet进行自定义排序
	 * 升序: 0: 相等，-1: o1小于o2，1: o1大于o2
	 * 降序: 0: 相等，1: o1小于o2，-1: o1大于o2
	 * @param o1
	 * @param o2
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public int compare(Entry<String, SortObject> o1,
			Entry<String, SortObject> o2)
	{
		System.out.println("EntrySetComparator.compare()");
		// 自定义规则来进行排序
		if (o1.getValue().getSize() > o2.getValue().getSize())
		{
			return 1;
		} else if (o1.getValue().getSize() < o2.getValue().getSize())
		{
			return -1;
		}
		
		return 0;
	}

}
