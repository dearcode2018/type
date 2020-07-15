/**
 * TypeServiceImpl.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.service.impl;

import com.hua.service.TypeService;

/**
 * TypeServiceImpl
 * 描述: 数据类型 - 服务
 * @author  qye.zheng
 */
public final class TypeServiceImpl extends CoreServiceImpl implements
		TypeService
{

	/**
	 * 
	 * @description 
	 * @param name
	 * @author qianye.zheng
	 */
	@Override
	public void info(final String name) {
		System.out.println("name = " + name);
		//System.out.println("change code do otherthing.");
	}
	
}
