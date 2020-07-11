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

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.bean.Tree;
import com.hua.test.BaseTest;
import com.hua.util.EmptyUtil;
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
	public void testPush() {
		try {
			int i = 1;
			Tree node = new Tree();
			node.setRoot(true);
			node.setId(i++);
			node.setCode("1");
			node.setName("MKKK结点");
			// 栈对象
			final Stack<Tree> stack = new Stack<Tree>();
			System.out.println(stack.size());
			Tree node2 = stack.push(node);
			
			System.out.println(node == node2);
			
			System.out.println(stack.size());
			
		} catch (Exception e) {
			log.error("testPush =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testPop() {
		try {
			int i = 1;
			Tree node = new Tree();
			node.setRoot(true);
			node.setId(i++);
			node.setCode("1");
			node.setName("MKKK结点");
			// 栈对象
			final Stack<Tree> stack = new Stack<Tree>();
			stack.push(node);
			System.out.println(stack.size());
			
			Tree node2 = stack.pop();
			System.out.println(node == node2);
			System.out.println(stack.size());
		} catch (Exception e) {
			log.error("testPop =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testEmpty() {
		try {
			int i = 1;
			Tree node = new Tree();
			node.setRoot(true);
			node.setId(i++);
			node.setCode("1");
			node.setName("MKKK结点");
			// 栈对象
			final Stack<Tree> stack = new Stack<Tree>();
			stack.push(node);
			System.out.println(stack.empty());
			
		} catch (Exception e) {
			log.error("testEmpty =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testPeek() {
		try {
			int i = 1;
			Tree node = new Tree();
			node.setRoot(true);
			node.setId(i++);
			node.setCode("1");
			node.setName("MKKK结点");
			// 栈对象
			final Stack<Tree> stack = new Stack<Tree>();
			stack.push(node);
			System.out.println(stack.size());
			
			Tree node2 = stack.peek();
			System.out.println(node == node2);
			System.out.println(stack.size());
			
		} catch (Exception e) {
			log.error("testPeek =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSearch() {
		try {
			// 栈对象
			final Stack<Tree> stack = new Stack<Tree>();
			int i = 1;

			Tree node = new Tree();
			node.setRoot(true);
			node.setId(i++);
			node.setCode("1");
			node.setName("MKKK结点");
			stack.push(node);

			Tree node2 = new Tree();
			node2.setRoot(true);
			node2.setId(i++);
			node2.setCode("1");
			node2.setName("KLOOOO结点");
			stack.push(node2);
			
			Tree node3 = new Tree();
			node3.setRoot(true);
			node3.setId(i++);
			node3.setCode("1");
			node3.setName("KWEII结点");
			stack.push(node3);
			
			/*
			 * 索引从1开始，栈顶的索引为1
			 */
			
			System.out.println(stack.search(node));
			System.out.println(stack.search(node2));
			System.out.println(stack.search(node3));
			//System.out.println(stack.size());
			
			
		} catch (Exception e) {
			log.error("testSearch =====> ", e);
		}
	}
	
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testClear() {
		try {
			// 栈对象
			final Stack<Tree> stack = new Stack<Tree>();
			int i = 1;
			
			Tree node = new Tree();
			node.setRoot(true);
			node.setId(i++);
			node.setCode("1");
			node.setName("MKKK结点");
			stack.push(node);

			Tree node2 = new Tree();
			node2.setRoot(true);
			node2.setId(i++);
			node2.setCode("1");
			node2.setName("KLOOOO结点");
			stack.push(node2);
			
			Tree node3 = new Tree();
			node3.setRoot(true);
			node3.setId(i++);
			node3.setCode("1");
			node3.setName("KWEII结点");
			stack.push(node3);
			
			System.out.println(stack.size());
			stack.clear();
			System.out.println(stack.size());
		} catch (Exception e) {
			log.error("testClear =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testFindTree() {
		try {
			int i = 1;
			Tree root = new Tree();
			root.setRoot(true);
			root.setId(i++);
			root.setCode("1");
			root.setName("根结点");
			root.setShow(true);
			Tree node = null;
			
			Tree sub1 = new Tree();
			sub1.setShow(true);
			sub1.setId(i++);
			sub1.setCode("11");
			sub1.setName("二级结点AD");
			root.getSubs().add(sub1);
			node = new Tree();
			node.setShow(true);
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
			node2.setShow(true);
			node2.setId(i++);
			node2.setCode("110201");
			node2.setName("四级结点AE");
			node.getSubs().add(node2);
			
			Tree sub2 = new Tree();
			sub2.setShow(true);
			sub2.setId(i++);
			sub1.setCode("12");
			sub2.setName("二级结点XCB");
			root.getSubs().add(sub2);
			node = new Tree();
			node.setShow(true);
			node.setId(i++);
			node.setCode("1201");
			node.setName("三级结点HD");
			sub2.getSubs().add(node);
			
			Tree sub3 = new Tree();
			sub3.setShow(true);
			sub3.setId(i++);
			sub3.setCode("13");
			sub3.setName("二级结点CE");
			root.getSubs().add(sub3);
			node = new Tree();
			node.setShow(true);
			node.setId(i++);
			node.setCode("1301");
			node.setName("三级结点KE");
			sub3.getSubs().add(node);
			
			System.out.println(JacksonUtil.writeAsString(root));
			// 根据id查找结点
			Tree result = find(4, root);
			System.out.println(JacksonUtil.writeAsString(result));
		} catch (Exception e) {
			log.error("testFindTree =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void removeTree() {
		try {
			/*
			 * 
			 * 构建一棵完整数
			 * 
			 * 
			 * 输入指定显示的结点id
			 * 1) 将该结点设置为可见
			 * 2) 将该结点的父结点设置为可见
			 * 3) 将该结点的后代结点设置为可见
			 * 
			 * 
			 * 
			 * 找出符合条件的结点，然后移除掉
			 * 不显示
			 */
			int i = 1;
			Tree root = new Tree();
			root.setRoot(true);
			root.setId(i++);
			root.setCode("1");
			root.setName("根结点");
			root.setShow(false);
			Tree node = null;
			
			Tree sub1 = new Tree();
			sub1.setShow(true);
			sub1.setId(i++);
			sub1.setCode("11");
			sub1.setName("二级结点AD");
			root.getSubs().add(sub1);
			node = new Tree();
			node.setShow(false);
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
			node2.setShow(false);
			node2.setId(i++);
			node2.setCode("110201");
			node2.setName("四级结点AE");
			node.getSubs().add(node2);
			
			Tree sub2 = new Tree();
			sub2.setShow(false);
			sub2.setId(i++);
			sub1.setCode("12");
			sub2.setName("二级结点XCB");
			root.getSubs().add(sub2);
			node = new Tree();
			node.setShow(true);
			node.setId(i++);
			node.setCode("1201");
			node.setName("三级结点HD");
			sub2.getSubs().add(node);
			
			Tree sub3 = new Tree();
			sub3.setShow(false);
			sub3.setId(i++);
			sub3.setCode("13");
			sub3.setName("二级结点CE");
			root.getSubs().add(sub3);
			node = new Tree();
			node.setShow(false);
			node.setId(i++);
			node.setCode("1301");
			node.setName("三级结点KE");
			sub3.getSubs().add(node);
			
			System.out.println(JacksonUtil.writeAsString(root));
			// 根据id查找结点
			Tree result = find(4, root);
			System.out.println(JacksonUtil.writeAsString(result));
		} catch (Exception e) {
			log.error("removeTree =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 构建权限树
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBuildPermissionTree() {
		try {
			/*
			 * 
			 * 构建一棵完整数，所有结点为不可见
			 * 
			 * 
			 * 输入指定显示的结点id
			 * 1) 将该结点设置为可见
			 * 2) 将该结点的父代结点设置为可见，直至根结点
			 * 3) 将该结点的后代结点设置为可见，直至叶子结点
			 * 
			 * 
			 * 
			 * 找出符合条件的结点，然后移除掉
			 * 不显示
			 */
			int i = 1;
			Tree root = new Tree();
			root.setRoot(true);
			root.setId(i++);
			root.setCode("1");
			root.setName("根结点");
			Tree node = null;
			
			Tree sub1 = new Tree();
			sub1.setId(i++);
			sub1.setCode("11");
			sub1.setName("二级结点AD");
			root.getSubs().add(sub1);
			sub1.setParentId(root.getId());
			node = new Tree();
			node.setId(i++);
			node.setCode("1101");
			node.setName("三级结点AEE");
			sub1.getSubs().add(node);
			node.setParentId(sub1.getId());
			node = new Tree();
			node.setId(i++);
			node.setCode("1102");
			node.setName("三级结点AB");
			sub1.getSubs().add(node);
			node.setParentId(sub1.getId());
			Tree node2 = new Tree();
			node2.setId(i++);
			node2.setCode("110201");
			node2.setName("四级结点AE");
			node.getSubs().add(node2);
			node2.setParentId(node.getId());
			
			Tree sub2 = new Tree();
			sub2.setId(i++);
			sub1.setCode("12");
			sub2.setName("二级结点XCB");
			root.getSubs().add(sub2);
			sub2.setParentId(root.getId());
			node = new Tree();
			node.setId(i++);
			node.setCode("1201");
			node.setName("三级结点HD");
			sub2.getSubs().add(node);
			node.setParentId(sub2.getId());
			
			Tree sub3 = new Tree();
			sub3.setId(i++);
			sub3.setCode("13");
			sub3.setName("二级结点CE");
			root.getSubs().add(sub3);
			sub3.setParentId(root.getId());
			node = new Tree();
			node.setId(i++);
			node.setCode("1301");
			node.setName("三级结点KE");
			sub3.getSubs().add(node);
			node.setParentId(sub3.getId());
			
			// 原始树
			System.out.println(JacksonUtil.writeAsString(root));
			List<Integer> permissionIds = new ArrayList<Integer>();	
			permissionIds.add(4);
			permissionIds.add(6);
			permissionIds.add(9);
			
			// 构建
			buildPermissionTree(root, permissionIds);
			// 构建后的树
			System.out.println(JacksonUtil.writeAsString(root));
			
		} catch (Exception e) {
			log.error("testBuildPermissionTree =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 构建权限树
	 * @author qye.zheng
	 * 
	 */
	public void buildPermissionTree(final Tree tree, final List<Integer> permissionIds) {
		/*
		 * 
		 * 传入一棵完整树，所有结点为不可见
		 * 
		 * 
		 * 输入指定显示的结点id
		 * 1) 将该结点设置为可见
		 * 2) 将该结点的父代结点设置为可见，直至根结点
		 * 3) 将该结点的后代结点设置为可见，直至叶子结点
		 * 4) 移除所有不可见节点
		 * 
		 * 1) 2)可以放在一个方法，3) 4) 分别一个方法
		 * 
		 * 找出符合条件的结点，然后移除掉
		 * 不显示
		 */
		Stack<Tree> stack = new Stack<Tree>();
		stack.push(tree);
		Tree element = null;
		while (!stack.empty())
		{
			// 出栈
			element = stack.pop();
			if (permissionIds.contains(element.getId()))
			{
				// 设置父代可见
				setParentShow(tree, element);
				// 设置后代可见
				setDescendantShow(element);
				
				// 结束当前循环，后代无需再压栈
				continue;
			}
			// 将当前结点的直接子结点压入栈中
			stack.addAll(element.getSubs());
		}
		
		// 移除所有不可见结点
		removeUnshow(tree);
	}
	
	/**
	 * 
	 * @description 设置当前结点及其父代结点为可见
	 * 直到根节点或者直到可见的父节点
	 * @param node 
	 * @author qianye.zheng
	 */
	private void setParentShow(final Tree fullTree, final Tree node)
	{
		if (node.isRoot() || node.isShow())
		{ // 根结点则结束递归
		} else
		{ // 查找父结点
			final Tree parentNode = find(node.getParentId(), fullTree);
			// 递归调用
			setParentShow(fullTree, parentNode);
		}
		// 设置为可见
		node.setShow(true);
	}
	
	/**
	 * 
	 * @description 设置当前结点及其后代结点为可见
	 * 直到叶子结点
	 * @param node 
	 * @author qianye.zheng
	 */
	private void setDescendantShow(final Tree node)
	{
		Stack<Tree> stack = new Stack<Tree>();
		stack.push(node);
		Tree element = null;
		while (!stack.empty())
		{
			// 出栈
			element = stack.pop();
			// 设置为可见
			element.setShow(true);
			// 将当前结点的直接子结点压入栈中
			stack.addAll(element.getSubs());
		}
	}
	
	/**
	 * 
	 * @description 移除不可见节点
	 * @param node
	 * @author qianye.zheng
	 */
	private void removeUnshow(final Tree node)
	{
		Stack<Tree> stack = new Stack<Tree>();
		stack.push(node);
		Tree element = null;
		while (!stack.empty())
		{
			// 出栈
			element = stack.pop();
			// 忽略根结点
			if (element.isRoot())
			{
				continue;
			}
			if (!element.isShow())
			{ // 不可见，查找出父节点，然后从其子结点集合中移除
				final Tree parentNode = find(element.getParentId(), node);
				parentNode.getSubs().remove(node);
				// 结速当前循环，无需当前结点的后代节点压栈
				continue;
			}
			// 将当前结点的直接子结点压入栈中
			stack.addAll(element.getSubs());
		}
	}
	
	/**
	 * 
	 * @description 
	 * @param id 结点id
	 * @param tree
	 * @return
	 * @author qianye.zheng
	 */
	private Tree find(final Integer id, final Tree tree)
	{
		Tree result = null;
		// 栈对象
		final Stack<Tree> stack = new Stack<Tree>();
		// 
		stack.push(tree);
		Tree element = null;
		while (!stack.isEmpty())
		{
			// 出栈
			element = stack.pop();
			if (null != element && id.equals(element.getId()))
			{
				result = element;
				
				break;
			}
			// 将当前结点的直接子结点压入栈中
			stack.addAll(element.getSubs());
			// 继续出栈 遍历各个元素
		}
		
		return result;
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
