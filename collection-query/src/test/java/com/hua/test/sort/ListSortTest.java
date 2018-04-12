/**
 * 描述: 
 * ListSortTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.sort;

// 静态导入
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.bean.SortObject;
import com.hua.comparator.SortObjectComparator;
import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * ListSortTest
 */
public final class ListSortTest extends BaseTest {

	/**
	 java.util.List 通过下标来建立元素存放位置
	 自然，可以直接通过下标来操作元素.
	 */
	

	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testListSort() {
		try {
			SortObject sortObject = null;
			List<SortObject> list = new ArrayList<SortObject>();
			int i = 0;
			
			i = 3;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			i = 1;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			i = 5;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			i = 9;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			i = 4;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			// 执行排序，使用Comparable接口方式
			Collections.sort(list);
			
			for (SortObject e : list)
			{
				System.out.println(e.toString());
			}
			
		} catch (Exception e) {
			log.error("testListSort =====> ", e);
		}
	}	
	
	/**
	 * 
	 * 描述: 实体类实现 可比较接口
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testListSortComparable() {
		try {
			SortObject sortObject = null;
			List<SortObject> list = new ArrayList<SortObject>();
			int i = 0;
			
			i = 3;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			i = 1;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			i = 5;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			i = 9;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			i = 4;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			// 执行排序，使用Comparable接口方式
			Collections.sort(list);
			
			for (SortObject e : list)
			{
				System.out.println(e.toString());
			}
			
		} catch (Exception e) {
			log.error("testListSortComparable =====> ", e);
		}
	}	
	
	/**
	 * 
	 * 描述: 创建比较器接口实现类
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testListSortComparator() {
		try {
			SortObject sortObject = null;
			List<SortObject> list = new ArrayList<SortObject>();
			int i = 0;
			
			i = 3;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			i = 1;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			i = 5;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			i = 9;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			i = 4;
			sortObject = new SortObject();
			sortObject.setId("2000-" + i);
			sortObject.setName("listName-" + i);
			sortObject.setSize(i);
			list.add(sortObject);
			
			// 执行排序，使用Comparator比较器接口方式
			Collections.sort(list, new SortObjectComparator());
			
			for (SortObject e : list)
			{
				System.out.println(e.toString());
			}
			
		} catch (Exception e) {
			log.error("testListSortComparator =====> ", e);
		}
	}	
	
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testAdd() {
		try {
			
			/*
			 在指定位置添加元素
			 指定的index必须满足 [0, size]，
			 否则将抛出数组下标越界异常
			 */
			index = 2;
			Integer e = new Integer(15);
			intList.add(1);
			intList.add(3);
			intList.add(5);
			log.info("testAdd =====> 添加之后 " + intList.get(index));
			// 这种添加方式是没有返回值的
			intList.add(index, e);
			log.info("testAdd =====> 添加之后 " + intList.get(index));
			
		} catch (Exception e) {
			log.error("testAdd =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testAddAll() {
		try {
			
			/**
			 在指定位置加入多个，如果新增的元素
			 大小大于0，则返回true，否则返回false
			 */
			
		} catch (Exception e) {
			log.error("testAddAll =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testGet() {
		try {
			/*
			 通过下标来获取元素，类似于
			 操作数组
			 */
			index = 1;
			intList.add(1);
			intList.add(3);
			intList.add(5);
			log.info("testGet =====> " + intList.get(index));
			
		} catch (Exception e) {
			log.error("testGet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSet() {
		try {
			/*
			 通过下标来获取元素，类似于
			 操作数组
			 */
			index = 1;
			intList.add(1);
			intList.add(3);
			intList.add(5);
			log.info("testSet =====> 设置之前 = " + intList.get(index));
			
			intList.set(index, 87);
			
			log.info("testSet =====> 设置之后 = " + intList.get(index));
		} catch (Exception e) {
			log.error("testSet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testIndexOf() {
		try {
			/*
			 从头开始查找元素
			 */
			intList.add(1);
			intList.add(3);
			intList.add(5);
			intList.add(3);
			
			index = intList.indexOf(3);
			log.info("testIndexOf =====> index = " + index);
			
		} catch (Exception e) {
			log.error("testIndexOf =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testLastIndexOf() {
		try {
			/*
			 从末尾开始查找元素
			 */
			intList.add(1);
			intList.add(3);
			intList.add(5);
			intList.add(48);
			intList.add(1);
			
			index = intList.lastIndexOf(1);
			log.info("testLastIndexOf =====> index = " + index);
			
		} catch (Exception e) {
			log.error("testLastIndexOf =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testListIteratorOne() {
		try {
			/*
			 ListIterator listIterator();
			 ListIterator listIterator(int startIndex);
			 第一个方法通过startIndex = 0 调用第二个方法
			 
			 ListIterator 比单纯的Iterator增加了许多功能，可以直接
			 在指定位置添加/修改元素、游标上移
			 */
			intList.add(1);
			intList.add(3);
			intList.add(5);
			intList.add(48);
			
			// 等效于 intList.listIterator(0);
			listIt = intList.listIterator();
			Integer temp = null;
			// 顺序取值
			while (listIt.hasNext())
			{
				temp = listIt.next();
				log.info("=====> previousIndex = " + listIt.previousIndex());
				log.info("=====> nextIndex = " + listIt.nextIndex());
				listIt.set(temp + 100);
			}
			System.out.println("=====================");
			// 逆转取值
			while (listIt.hasPrevious())
			{
				temp = listIt.previous();
				log.info("=====> previousIndex = " + listIt.previousIndex());
				log.info("=====> nextIndex = " + listIt.nextIndex());
				log.info("testListIteratorOne =====> value = " + temp);
			}
			
		} catch (Exception e) {
			log.error("testListIteratorOne =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testListIteratorTwo() {
		try {
			/*
			 ListIterator listIterator();
			 ListIterator listIterator(int startIndex);
			 第一个方法通过startIndex = 0 调用第二个方法
			 
			 ListIterator 比单纯的Iterator增加了许多功能，可以直接
			 在指定位置添加/修改元素、游标上移
			 */
			intList.add(1);
			intList.add(3);
			intList.add(5);
			intList.add(48);
			
			index = 1;
			listIt = intList.listIterator(index);
			Integer temp = null;
			// 顺序取值
			while (listIt.hasNext())
			{
				temp = listIt.next();
				log.info("=====> previousIndex = " + listIt.previousIndex());
				log.info("=====> nextIndex = " + listIt.nextIndex());
				listIt.set(temp + 100);
			}
			System.out.println("=====================");
			// 逆转取值
			while (listIt.hasPrevious())
			{
				temp = listIt.previous();
				log.info("=====> previousIndex = " + listIt.previousIndex());
				log.info("=====> nextIndex = " + listIt.nextIndex());
				log.info("testListIteratorTwo =====> value = " + temp);
			}
			
		} catch (Exception e) {
			log.error("testListIteratorTwo =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testRemove() {
		try {
			/*
			 返回被删除的元素
			 */
			intList.add(1);
			intList.add(3);
			intList.add(5);
			intList.add(48);
			
			index = 1;
			
			Integer deletedInt = intList.remove(index);
			log.info("testRemove =====> " + deletedInt);
		} catch (Exception e) {
			log.error("testRemove =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSubList() {
		try {
			/*
			 子集合
			 */
			intList.add(1);
			intList.add(3);
			intList.add(5);
			intList.add(48);
			
			int fromIndex = 1;
			// 不包含
			int toIndex = 2;
			List<Integer> subList = intList.subList(fromIndex, toIndex);
			log.info("testSubList =====> " + subList.size());
		} catch (Exception e) {
			log.error("testSubList =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void test() {
		try {
			
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTemp() {
		try {
			
			
		} catch (Exception e) {
			log.error("testTemp=====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCommon() {
		try {
			
			
		} catch (Exception e) {
			log.error("testCommon =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSimple() {
		try {
			final int max = 5;
			final List<String> ids  = new ArrayList<String>();
			ids.add("1");
			ids.add("2");
			ids.add("3");
			ids.add("4");
			ids.add("5");
			ids.add("6");
			ids.add("7");
			ids.add("8");
			ids.add("9");
			//ids.add("10");
			String[] arr = null;
			log.info("txOverdueUserHandle =====> size = " + ids.size());
			if (ids.size() < max)
			{
				arr = new String[ids.size()];
				arr = ids.toArray(arr);
				System.out.println(Arrays.toString(arr));
			} else
			{
				// 20 个 一次
				final Iterator<String> it = ids.iterator();
				while (it.hasNext())
				{
					if (ids.size() < max)
					{
						arr = new String[ids.size()];
					} else
					{
						arr = new String[max];
					}
					for (int i = 0; i < max; i++)
					{
						if (it.hasNext())
						{
							arr[i] = it.next();
							it.remove();
						}
					}
					System.out.println(Arrays.toString(arr));
				}
			}
			
		} catch (Exception e) {
			log.error("testSimple =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBase() {
		try {
			
			
		} catch (Exception e) {
			log.error("testBase =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 解决ide静态导入消除问题 
	 * @author qye.zheng
	 * 
	 */
	@Ignore("解决ide静态导入消除问题 ")
	private void noUse() {
		String expected = null;
		String actual = null;
		Object[] expecteds = null;
		Object[] actuals = null;
		String message = null;
		
		assertEquals(expected, actual);
		assertEquals(message, expected, actual);
		assertNotEquals(expected, actual);
		assertNotEquals(message, expected, actual);
		
		assertArrayEquals(expecteds, actuals);
		assertArrayEquals(message, expecteds, actuals);
		
		assertFalse(true);
		assertTrue(true);
		assertFalse(message, true);
		assertTrue(message, true);
		
		assertSame(expecteds, actuals);
		assertNotSame(expecteds, actuals);
		assertSame(message, expecteds, actuals);
		assertNotSame(message, expecteds, actuals);
		
		assertNull(actuals);
		assertNotNull(actuals);
		assertNull(message, actuals);
		assertNotNull(message, actuals);
		
		assertThat(null, null);
		assertThat(null, null, null);
		
		fail();
		fail("Not yet implemented");
		
	}

}
