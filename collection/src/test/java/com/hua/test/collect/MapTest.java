/**
 * 描述: 
 * MapTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.collect;

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

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.bean.SortObject;
import com.hua.comparator.SomeComparator;
import com.hua.hash.MapKey;
import com.hua.test.BaseTest;
import com.hua.util.RandomUtil;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * MapTest
 */
public final class MapTest extends BaseTest {

	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testHashMap() {
		try {
			
			Map<String, Object> map = new HashMap<String, Object>();
			List<String> list = new LinkedList<>();
			list.add("a");
			list.add("b");
			list.add("c");
			map.put("linkedList", list);
			Map<String, String> map2 = new HashMap<String, String>();
			map2.put("string", "milk");
			map2.put("linkedList", "2222");
			
			map.put("map2", map2);
			map.put("string", "milk");
			
			System.out.println(map.size());
			
		} catch (Exception e) {
			log.error("testHashMap =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testHashMapBucket() {
		try {
			
			Map<MapKey, Object> map = new HashMap<>();
			// @1号桶装了3个对象，此时HashMap大小为3，桶的大小
			map.put(new MapKey("1"), "1111");
			map.put(new MapKey("2"), "2222");
			map.put(new MapKey("3"), "3333");
			
			System.out.println(map.size());
			
		} catch (Exception e) {
			log.error("testHashMapBucket =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testHashMapStructure() {
		try {
			/*
			 * 4种场景，前3个场景保留一个即可，注释掉其他的，最后一个场景是证明，桶的独立性
			 * 一个桶存储的bin被树化的时候，其他桶不会受到影响.
			 * 
			 * 前3个场景，单独放开注释，debug看HashMap对对象的结构，可以看到采用的是单向链表结构
			 */
			Map<MapKey, Object> map = new HashMap<>();
			
			/*
			 * 场景1: 单个桶中bin的数量小于 TREEIFY_THRESHOLD(8)，链表结构存储
			 */
/*			for (int i = 1; i <= 6; i++)
			{
				map.put(new MapKey(String.valueOf(i)), "A");
			}*/
			
			/*
			 * 场景2: 单个桶中bin的数量大于 TREEIFY_THRESHOLD(8)，capacity小于
			 * MIN_TREEIFY_CAPACITY，继续 链表结构存储
			 * 超过8个，到第9个元素时，触发扩容为32.
			 * 达到10个时，扩容为64.
			 * 任意一个桶的KV数量超过8个，到第9个元素时，触发扩容为32.
			 * 任意一个桶的KV数量超过9个，到第10个元素时，触发扩容为64.
			 * 
			 * capacity = threshold / loadFactor
			 * 
			 */
/*			for (int i = 1; i <= 10; i++)
			{
				map.put(new MapKey(String.valueOf(i)), "A");
			}*/

			/*
			 * 场景3: 单个桶中bin的数量大于 TREEIFY_THRESHOLD(8)，
			 * 达到10个时，扩容为64
			 * 接着在增加到第49时引发再次库容到128，此时capacity 大于 MIN_TREEIFY_THRESHOLD
			 * 存储结构会树化 TreeNode
			 */
			for (int i = 1; i <= 50; i++)
			{
				map.put(new MapKey(String.valueOf(i)), "A");
			}

			/*
			 * 场景4: 验证桶的独立性， 一个桶存储的bin被树化的时候，其他桶不会受到影响.
			 */
			map.put(new MapKey("X1"), "XB");
			map.put(new MapKey("Y2"), "YB");
			map.put(new MapKey("Z3"), "ZB");
			map.put(new MapKey("X4"), "XB");
			map.put(new MapKey("Y5"), "YB");
			map.put(new MapKey("Z6"), "ZB");
			map.put(new MapKey("X7"), "XB");
			map.put(new MapKey("Y8"), "YB");
			/*
			 * 这个桶加入的第九个元素(大于TREEIFY_THRESHOLD) 会触发树化，
			 * 外部条件MIN_TREEIFY_CAPACITY已满足
			 */
			map.put(new MapKey("Z9"), "ZB");
			
			/* 结论 */
			
			/*
			 * 扩容条件
			 * 1) 单个桶的元素大于TREEIFY_THRESHOLD(8)，放置第九个元素是触发
			 * 2) 数组总KV即size值大于threshold时，触发扩容
			 * 3) 
			 */
			
			/*
			 * 树化条件 (树化一个桶)
			 * 1) 只树化符合条件的桶，不符合的继续用链表存储，链表和树结构在数组中并存
			 * 2) 单个桶中元素的个数大于 TREEIFY_THRESHOLD(8)，且数组的总KV
			 *  即size超过MIN_TREEIFY_CAPACITY(64)，TREEIFY_THRESHOLD是内部条件，取决某个桶
			 *  的元素个数，MIN_TREEIFY_CAPACITY是外部条件，取决于数组总KV数.
			 *  3) 
			 */
			
			
			
			System.out.println(map.size());
			
		} catch (Exception e) {
			log.error("testHashMapStructure =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testHashMapStructure2() {
		try {
			/*
			 * 4种场景，前3个场景保留一个即可，注释掉其他的，最后一个场景是证明，桶的独立性
			 * 一个桶存储的bin被树化的时候，其他桶不会受到影响.
			 * 
			 * 前3个场景，单独放开注释，debug看HashMap对对象的结构，可以看到采用的是单向链表结构
			 */
			Map<MapKey, Object> map = new HashMap<>();
			
			/*
			 * 场景1: 单个桶中bin的数量小于 TREEIFY_THRESHOLD(8)，链表结构存储
			 */
/*			for (int i = 1; i <= 6; i++)
			{
				map.put(new MapKey(String.valueOf(i)), "A");
			}*/
			
			/*
			 * 场景2: 单个桶中bin的数量大于 TREEIFY_THRESHOLD(8)，capacity小于
			 * MIN_TREEIFY_CAPACITY，继续 链表结构存储
			 * 超过8个，到第9个元素时，触发扩容为32.
			 * 达到10个时，扩容为64（原因暂且未明）
			 * 
			 * capacity = threshold / loadFactor
			 * 
			 */
			for (int i = 1; i <= 8; i++)
			{
				map.put(new MapKey(String.valueOf(i)), "A");
			}

			/*
			 * 场景3: 单个桶中bin的数量大于 TREEIFY_THRESHOLD(8)，
			 * 达到10个时，扩容为64（原因暂且未明）
			 * 在增加到第13个时超过threshold 会引发扩容到 64 (分析和实验观察有差距)
			 * 接着在增加到第49时引发再次库容到128，此时capacity 大于 MIN_TREEIFY_THRESHOLD
			 * 存储结构会树化 TreeNode
			 */
/*			for (int i = 1; i <= 50; i++)
			{
				map.put(new MapKey(String.valueOf(i)), "A");
			}*/

			/*
			 * 场景4: 验证桶的独立性， 一个桶存储的bin被树化的时候，其他桶不会受到影响.
			 */
			map.put(new MapKey("X"), "XB");
			map.put(new MapKey("Y"), "YB");
			map.put(new MapKey("Z"), "ZB");
			for (int i = 1; i <= 8; i++)
			{
				map.put(new MapKey(RandomUtil.randomAlphabetic(10)), "RANDOM");
			}
			
			System.out.println(map.size());
			
		} catch (Exception e) {
			log.error("testHashMapStructure2 =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testMap() {
		try {
			Map<String, String> map = new HashMap<String, String>();
			log.info("testMap =====> " + map.isEmpty());
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			log.info("testMap =====> size = " + map.size());
			

			
			
		} catch (Exception e) {
			log.error("testMap =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testContainsKey() {
		try {
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			map.put(null, "nullkey");
			map.put("6-nullvalue", null);
			
			log.info("testContainsKey =====> " + map.containsKey("1"));
			log.info("testContainsKey =====> " + map.containsKey(null));
			log.info("testContainsKey =====> " + map.containsKey("d"));
		} catch (Exception e) {
			log.error("testContainsKey =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testContainsValue() {
		try {
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			map.put(null, "nullkey");
			map.put("6-nullvalue", null);
			
			log.info("testContainsValue =====> " + map.containsValue(null));
			log.info("testContainsValue =====> " + map.containsValue("shenzhen"));
			log.info("testContainsValue =====> " + map.containsValue("guangdong"));
			
		} catch (Exception e) {
			log.error("testContainsValue =====> ", e);
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
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			map.put(null, "nullkey");
			map.put("6-nullvalue", null);
			
			String temp = map.get(null);
			log.info("testGet =====> temp = " + temp);
			
			temp = map.get("shen");
			log.info("testGet =====> temp = " + temp);
			
			temp = map.get("1");
			log.info("testGet =====> temp = " + temp);
			
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
	public void testKeySet() {
		try {
			Map<String, String> map = new HashMap<String, String>();
			/*
			 获取可以构成的set对对象
			 */
			map.put("1", "beijing1");
			map.put("2", "shanghai2");
			map.put("3", "beijing3");
			map.put("4", "shenzhen4");
			map.put(null, "nullkey1");
			map.put("6-nullvalue", null);
			// 覆盖前者的值
			map.put(null, "nullkey2");
			strSet = map.keySet();
			log.info("testKeySet =====> " + strSet.size());
			Set<String> keySet = map.keySet();
			for (String key : keySet)
			{
				System.out.println(map.get(key));
			}
			
		} catch (Exception e) {
			log.error("testKeySet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testMapSort() {
		try {
			/*
			 * Map的排序是对键的排序，其实就是Set的排序
			 * TreeMap构造方法参数中提供Comparator<? super K>
			 */
			SortedMap<SortObject, String> map = 
					new TreeMap<SortObject, String>(new SomeComparator());
			SortObject.asc = true;
			SortObject e = null;
			e = new SortObject();
			e.setId("20182012");
			e.setName("zhangsan");
			e.setSize(10);
			map.put(e, e.getSize().toString());
			
			e = new SortObject();
			e.setId("201820144");
			e.setName("lisi");
			e.setSize(5);
			map.put(e, e.getSize().toString());
			
			e = new SortObject();
			e.setId("20182099");
			e.setName("wangwu");
			e.setSize(8);
			map.put(e, e.getSize().toString());
			Set<SortObject> keySet = map.keySet();
			/*
			 * 调用get方法的时候，根据key值去KeySet中搜索，会调用Comparator的方法
			 * 来快速寻找
			 */
/*			for (SortObject key : keySet)
			{
				System.out.println(map.get(key));
			}
			*/
			
			/*
			 * map.entrySet()得到排序好的项，根据这个来输出，遍历Set即可，不需要去寻找Key，
			 * 所以无需调用Comparator的方法.
			 * 
			 * 因此输出的时候应该选择map.entrySet()得到Set<Map.Entry<K,V>>来遍历，
			 * 而不是通过map.keySet()得到键的Set来遍历，
			 * 因为根据key去调用get的时候，会去调用Comparator来寻找key的位置.
			 * 
			 */
			Set<Map.Entry<SortObject, String>> entries = map.entrySet();
			for (Map.Entry<SortObject, String> entry : entries)
			{
				System.out.println(entry.getValue());
			}
			
		} catch (Exception e) {
			log.error("testMapSort =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testValues() {
		try {
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			map.put(null, "nullkey");
			map.put("6-nullvalue", null);
			
			Collection<String> values = map.values();
			log.info("testValues =====> " + values.size());
			
		} catch (Exception e) {
			log.error("testValues =====> ", e);
		}
	}
	
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testEntrySet() {
		try {
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");
			map.put("5", "shenzhen");
			map.put(null, "nullkey");
			map.put("6-nullvalue", null);
			
			entrySet = map.entrySet();
					
			for (Map.Entry<String, String> mapEntry: entrySet)
			{
				log.info("=====> " + mapEntry.getKey() + ": " + mapEntry.getValue());
			}
			
		} catch (Exception e) {
			log.error("testEntrySet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testPut() {
		try {
			/*
			 put方法将返回一个Value值，
			 若key已经存在，则返回旧value，否则返回null
			 返回的oldValue表示该值将被新的替换
			 可以根据此返回值是否为空来判断放值是否成功
			 */
			String oldValue = null;
			oldValue = map.put("1", "beijing");
			log.info("testPut =====> oldValue = " + oldValue);
			
			oldValue =map.put("2", "shanghai");
			log.info("testPut =====> oldValue = " + oldValue);
			
			oldValue =map.put("1", "guangzhou");
			log.info("testPut =====> oldValue = " + oldValue);
		} catch (Exception e) {
			log.error("testPut =====> ", e);
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
			 返回被移除的值，如果key存在，
			 否则返回null，可以根据返回值是否为空来判断
			 移除动作是否成功
			 */
			String removedValue = null;
			map.put("1", "beijing");
			map.put("2", "shanghai");
			map.put("3", "beijing");
			map.put("1", "guangzhou");

			removedValue = map.remove("1");
			log.info("testRemove =====> removedValue = " + removedValue);
			
			removedValue = map.remove("dd");
			log.info("testRemove =====> removedValue = " + removedValue);
			
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
	public void testNumber() {
		try {
			
			System.out.println(1 << 30);
			System.out.println(3 << 1);
			System.out.println(3 << 2);
			System.out.println(3 << 3);
			System.out.println(Integer.MAX_VALUE);
			
		} catch (Exception e) {
			log.error("testNumber =====> ", e);
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
