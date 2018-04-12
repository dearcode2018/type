/**
 * 描述: 
 * ArrayServiceImpl.java
 * @author	qye.zheng
 *  version 1.0
 */
package com.hua.service.impl;

import com.hua.service.ArrayService;

/**
 * 描述: 
 * @author  qye.zheng
 * ArrayServiceImpl
 */
public final class ArrayServiceImpl extends CoreServiceImpl implements
		ArrayService
{

	/**
	 
	 数组: 存放基本类型、引用类型; 一个数组对象只能存储
	 
	 存储基本类型的值、存储引用类型的引用地址
	 
	 常用数组: 一维、二维数组
	 
	 数组名：数组_数据_起始地址/首元素地址
	 数组名_作_参数: 引用传递
	 
	 Java中，数组也是一个对象，
	 有一个常用的属性length,数组对象可以通过下标读写指定位置的元素；
	 可以通过循环遍历数组中的所有元素。
	 
	 数组元素_默认值: 没有填充值的，基本类型是其默认值，引用类型为null
	 
	 */
	
	/**
	 
	length与null
	1) 数组对象.length == 0;
	2) 数组对象 == null;
	分析：两个是不等价的，数组长度为0，但是数组不为空；
	如果是一个null数组对象，则不能调用数组对象的任何成员；如果数组长度为0，则不能访问数组的元素。
	
	 
	 
	 */
	
	/**
	 
	 构建数组对象
	 type[] array = new type[size];
	 Type[] t = new Type[]{t1, t2, ...};
	 
	 构建一个空的数组对象: type[] array = new type[]{};
	 
	 
	 // 批量赋值
	 java.util.Arrays
	 
	 
	 
	 */
	
	/*
	 一维、二维数组比较常用，
	 
	 二维数组: 一维元素存储的是二级数组的首地址
	 
	 type[][] array = new type[size][];
	 // 一级数组
	 type[] array[index];
	 
	 // 二级元素
	 type array[x][y] 
	 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
