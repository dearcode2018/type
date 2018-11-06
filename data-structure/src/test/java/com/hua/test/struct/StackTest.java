/**
 * 描述: 
 * StackTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.struct;

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

import org.junit.Ignore;
import org.junit.Test;

import com.hua.bean.Tree;
import com.hua.test.BaseTest;
import com.hua.util.JacksonUtil;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * StackTest
 */
public final class StackTest extends BaseTest {


	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTree() {
		try {
			int i = 1;
			Tree root = new Tree();
			root.setRoot(true);
			root.setId(i++);
			root.setCode("1");
			root.setName("根结点");
			Tree node = null;
			
			Tree sub1 = new Tree();
			sub1.setRoot(true);
			sub1.setId(i++);
			sub1.setCode("11");
			sub1.setName("二级结点AD");
			root.getSubs().add(sub1);
			node = new Tree();
			node.setId(i++);
			node.setCode("1101");
			node.setName("三级结点AEE");
			sub1.getSubs().add(node);
			node = new Tree();
			node.setId(i++);
			node.setCode("1102");
			node.setName("三级结点AB");
			sub1.getSubs().add(node);
			Tree node2 = new Tree();
			node2.setId(i++);
			node2.setCode("110201");
			node2.setName("四级结点AE");
			node.getSubs().add(node2);
			
			Tree sub2 = new Tree();
			sub2.setRoot(true);
			sub2.setId(i++);
			sub1.setCode("12");
			sub2.setName("二级结点XCB");
			root.getSubs().add(sub2);
			node = new Tree();
			node.setId(i++);
			node.setCode("1201");
			node.setName("三级结点HD");
			sub2.getSubs().add(node);
			
			Tree sub3 = new Tree();
			sub3.setRoot(true);
			sub3.setId(i++);
			sub3.setCode("13");
			sub3.setName("二级结点CE");
			root.getSubs().add(sub3);
			node = new Tree();
			node.setId(i++);
			node.setCode("1301");
			node.setName("三级结点KE");
			sub3.getSubs().add(node);
			
			System.out.println(JacksonUtil.writeAsString(root));
			
		} catch (Exception e) {
			log.error("testTree =====> ", e);
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
