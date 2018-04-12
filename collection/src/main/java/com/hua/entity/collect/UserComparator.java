/**
 * UserComparator.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.entity.collect;

import java.util.Comparator;

import com.hua.constant.Constant;
import com.hua.util.StringUtil;

/**
 * UserComparator
 * 描述: User 比较器
 * @author  qye.zheng
 */
public final class UserComparator implements Comparator<User>
{

	/**
	 * 描述: 比较 - (满足: 升序排列)
	 * @author  qye.zheng
	 * @param a
	 * @param b
	 * @return
	 */
	@Override
	public int compare(final User a, final User b)
	{
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
