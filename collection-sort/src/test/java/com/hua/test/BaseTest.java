/**
 * 描述: 
 * BaseTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test;

// 静态导入
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.hua.entity.collect.User;
import com.hua.log.BaseLog;

/**
 * 描述: 测试基类
 * 包含多个测试示例
 * 
 * @author qye.zheng
 * BaseTest
 */
//@RunWith()
public class BaseTest extends BaseLog {
	
	public Collection<String> strCollect = new ArrayList<String>();
	
	public Collection<Integer> numCollect = new LinkedList<Integer>();
	
	public Collection<User> userCollect = new HashSet<User>();
	
	// 子集
	public Collection<String> subCollect = new ArrayList<String>();
	
	public Iterator<String> strIt;
	
	public List<Integer> intList = new ArrayList<Integer>();
	
	public ListIterator<Integer> listIt;
	
	public Set<String> strSet = new HashSet<String>();
	
	public Map<String, String> map = new HashMap<String, String>();
	
	// 由 key 和 value 对，构成的 Entry的 Set集合
	public Set<Map.Entry<String, String>> entrySet;
	
	// 单个 Entry
	public Map.Entry<String, String> mapEntry;
	
	public boolean flag;
	
	public int index;
	
	public int size;
	
	public boolean result;
	
	/**
	 * 
	 * 描述: [所有测试]开始之前运行
	 * @author qye.zheng
	 * 
	 */
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
	}
	
	/**
	 * 
	 * 描述: [所有测试]结束之后运行
	 * @author qye.zheng
	 * 
	 */
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}

}
