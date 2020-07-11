/**
 * 描述: 
 * HanoiTowerTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.recursive;

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

import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * HanoiTowerTest
 */
public final class HanoiTowerTest extends BaseTest {

	// 总次数
	private int count;
	
	/**
	 * 汉诺塔(Hanoi Tower)，又称河内塔，源于印度古老的传说.大梵天创造世界时做了
	3根柱子，一根柱子上从下往上按照大小顺序摞着64个圆盘.大梵天命令婆罗门把圆盘从 下面开始按照大小顺序重新摆放到另一根柱子上，
	并且规定，任何时候，小圆盘上都不能放大圆盘，并且每次只能移动一个圆盘.
	 */
	
	/*
	 * (塔座	A上从上到下编号为 1-n)
	 */
	
	/**
	 * 
	 * @description 将第n号盘 从 塔座A 搬到 塔座C
	 * @param diskNo 盘的编号
	 * @param towerA 塔座A
	 * @param towerC 塔座C
	 * @author qianye.zheng
	 */
	private void move(int diskNo, char towerA, char towerC)
	{
		System.out.printf("第 %d 步: 将 %d号 盘从 %c柱 移到 %c柱 \n", ++count, diskNo, towerA, towerC);
	}
	
	/**
	 * 
	 * @description 将编号为 1 到 maxDiskNo的盘从塔座A移动到塔座C
	 * @param maxDiskNo 编号最大的圆盘
	 * @param towerA 塔座A
	 * @param towerB 塔座B (作为辅助)
	 * @param towerC 塔座C
	 * @author qianye.zheng
	 */
	private void hanoi(int maxDiskNo, char towerA, char towerB, char towerC)
	{
		if (1 == maxDiskNo)
		{ // 只有一个盘
			// 直接将编号为1的盘从 塔座A 移动到塔座C
			move(1, towerA, towerC);
		} else
		{ // 超过一个盘，递归调用当前方法
			// 将 编号 从maxDiskNo-1 到 1 的盘子，从塔座A移动到塔座B，塔座C做辅助  --> 盘子在B塔
			hanoi(maxDiskNo - 1, towerA, towerC, towerB);
			
			// 将塔座A剩下的盘子，从塔座A移动到移动到塔座C
			move(maxDiskNo, towerA, towerC);
			
			// 将 编号 从maxDiskNo-1 到 1 的盘子，从塔座B移动到塔座C，塔座A做辅助
			hanoi(maxDiskNo - 1, towerB, towerA, towerC);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void startHanoi() {
		try {
			
			//hanoi(2, 'A', 'B', 'C');
			
			//hanoi(3, 'A', 'B', 'C');
			hanoi(64, 'A', 'B', 'C');
		} catch (Exception e) {
			log.error("startHanoi =====> ", e);
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
