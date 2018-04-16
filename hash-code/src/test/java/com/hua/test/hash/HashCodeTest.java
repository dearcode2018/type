/**
 * 描述: 
 * HashCodeTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.hash;

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

import java.util.HashSet;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.entity.StudentEntity;
import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * HashCodeTest
 */
public final class HashCodeTest extends BaseTest {

	/**
	 * 哈希码 (hashCode)
	 * 1) hashCode()方法 返回该对象的哈希码值，支持该方法是为哈希表提供一些优点，例如 java.util.Hashtable提供的
	 * 哈希表。
	 * 
	 * 2) hashCode常规机制
	 * 在Java应用程序执行期间，在同一对象上多次调用hashCode()方法时，必须一致地返回相同的整数，前提是对象上
	 * equals比较中所用的信息没有被修改。从某一应用程序的一次执行同一应用程序的另一次执行，该整数无需保持一致。
	 * 
	 *  3) 约定: 如果根据equals()方法，两个对象是相等，那么在 每个对象上调用hashCode()方法必须生成相同的
	 *  整数，反之则不一定。为不相等的对象生成不同整数结果可以提高哈希表的性能。
	 *  当equals()方法被重写时，通常要重写hashCode()方法，以维护hashCode()方法的常规协定，该协定声明相等对象必须
	 *  具有相等的哈希码.
	 *  
	 *  4) Object类定义的hashCode()方法确实会针对不同的对象返回不同的整数，一般是通过将该对象的内部地址转换
	 *  成一个整数来实现。
	 *  
	 *  5) 哈希码存在的优势
	 *  有利于快速查找Hashtable/HashMap，哈希码是用来在散列存储结构中确定对象的存储地址；
	 *  
	 * 6) 两个对象的哈希码相同，并不表示2个对象就相同，只能够说明这2个对象在散列存储结构中，如Hashtable，它们存放
	 * 在同一个篮子中。
	 * 
	 * 
	 * 
	 */
	
	/**
	 * 
	 * 描述: 哈希码相同，equals是true，则直接忽略不替换
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testHashSet1() {
		try {
			Set<StudentEntity> set = new HashSet<StudentEntity>();
			StudentEntity entity = null;
			
			entity = new StudentEntity();
			entity.setId(201);
			entity.setName("张三");
			entity.setRemark("备注1");
			set.add(entity);
			
			entity = new StudentEntity();
			entity.setId(201);
			entity.setName("张三");
			entity.setRemark("备注2");
			set.add(entity);
			
			for (StudentEntity e : set)
			{
				System.out.println(e.getName());
				System.out.println(e.getRemark());
			}
			
		} catch (Exception e) {
			log.error("testHashSet1 =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 哈希码相同，equals是false
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testHashSet2() {
		try {
			Set<StudentEntity> set = new HashSet<StudentEntity>();
			StudentEntity entity = null;
			
			entity = new StudentEntity();
			entity.setId(201);
			entity.setName("张三");
			entity.setRemark("备注1");
			set.add(entity);
			
			entity = new StudentEntity();
			entity.setId(202);
			entity.setName("张三");
			entity.setRemark("备注2");
			set.add(entity);
			
			for (StudentEntity e : set)
			{
				System.out.println(e.getName());
				System.out.println(e.getRemark());
			}
			
		} catch (Exception e) {
			log.error("testHashSet2 =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 哈希码不同，equals是true，也是可以添加到集合的
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testHashSet3() {
		try {
			Set<StudentEntity> set = new HashSet<StudentEntity>();
			StudentEntity entity = null;
			
			entity = new StudentEntity();
			entity.setId(201);
			entity.setName("张三");
			entity.setRemark("备注1");
			set.add(entity);
			
			entity = new StudentEntity();
			entity.setId(201);
			entity.setName("张三2");
			entity.setRemark("备注2");
			set.add(entity);
			
			for (StudentEntity e : set)
			{
				System.out.println(e.getName());
				System.out.println(e.getRemark());
			}
			
		} catch (Exception e) {
			log.error("testHashSet3 =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 哈希码不同，equals是false，也是可以添加到集合的
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testHashSet4() {
		try {
			Set<StudentEntity> set = new HashSet<StudentEntity>();
			StudentEntity entity = null;
			
			entity = new StudentEntity();
			entity.setId(201);
			entity.setName("张三");
			entity.setRemark("备注1");
			set.add(entity);
			
			entity = new StudentEntity();
			entity.setId(202);
			entity.setName("张三");
			entity.setRemark("备注2");
			set.add(entity);
			
			for (StudentEntity e : set)
			{
				System.out.println(e.getName());
				System.out.println(e.getRemark());
			}
			
		} catch (Exception e) {
			log.error("testHashSet4 =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testHashSet5() {
		try {
			Set<StudentEntity> set = new HashSet<StudentEntity>();
			StudentEntity entity = null;
			
			entity = new StudentEntity();
			entity.setId(201);
			entity.setName("张三");
			entity.setRemark("备注1");
			set.add(entity);
			
			entity = new StudentEntity();
			entity.setId(201);
			entity.setName("张三");
			entity.setRemark("备注2");
			set.add(entity);
			
			for (StudentEntity e : set)
			{
				System.out.println(e.getName());
				System.out.println(e.getRemark());
			}
			
		} catch (Exception e) {
			log.error("testHashSet5 =====> ", e);
		}
	}
	
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testHashMap() {
		try {
			
			
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
