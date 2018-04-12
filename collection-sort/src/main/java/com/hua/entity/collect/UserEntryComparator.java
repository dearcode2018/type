/**
 * 描述: 
 * UserEntryComparator.java
 * @author	qye.zheng
 *  version 1.0
 */
package com.hua.entity.collect;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import com.hua.constant.Constant;
import com.hua.util.StringUtil;

/**
 * 描述: 
 * @author  qye.zheng
 * UserEntryComparator
 */
public class UserEntryComparator implements Comparator<Map.Entry<String, User>>
{

	 /**
	 * 描述: 
	 * @author qye.zheng
	 * @param o1
	 * @param o2
	 * @return
	 */
	@Override
	public int compare(Entry<String, User> o1, Entry<String, User> o2)
	{
		final User a = o1.getValue();
		final User b = o2.getValue();
		/*
		 以 username 作为参照字段，为null或空串为最大值
		 */
		if (StringUtil.isEmpty(a.getUsername()) && !StringUtil.isEmpty(b.getUsername()))
		{
			// A 为空, B不为空，返回1
			return Constant.ONE;
		} else if (StringUtil.isEmpty(a.getUsername()) && StringUtil.isEmpty(b.getUsername()))
		{
			// A / B 都为空，返回0
			return Constant.ZERO;
		} else if (!StringUtil.isEmpty(a.getUsername()) && StringUtil.isEmpty(b.getUsername()))
		{
			// A不 为空, B为空，返回-1
			return Constant.NEGATIVE_ONE;
		}
		
		// A / B 都不为空，则调用String的compareTo 方法进行比较
		return a.getUsername().compareTo(b.getUsername());
	}

}
