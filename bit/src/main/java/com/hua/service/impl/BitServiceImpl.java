/**
 * BitServiceImpl.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.service.impl;

import com.hua.service.BitService;

/**
 * BitServiceImpl
 * 描述: 
 * @author  qye.zheng
 */
public final class BitServiceImpl extends TypeServiceImpl implements BitService
{

	/**
	 比特分析
	 
	 一) 基本分析
	 比特(bit): 二进制信息单位
	 比特值: 0/1 
	 高低位: 左边称为高位，右边称为低位.
	 101010101010101
	 
	 
	 
	 二) 移位运算
	 1) 左移位: 数值翻1倍，相当于乘以 2^1，左移n位，相当乘以2^n.
	 
	 2) 右移位: 数值减1半，相当于除以2^1，右移n位，相当除以2^n.
	 
	 3) 
	 
	 三) 
	 n位1的值: 2^n - 1，即最大值为模 - 1， 模为2^n.
	 第n位的值: 2^(n-1)
	 
	 */
	
	
	/**
	 
	码分析
	 在计算机内，定点数有3种表示法: 原码、反码、补码.
	 
	 一) 原码
	 1) 原码(true form)是一种计算机中对数字的二进制定点表示方法。
	 原码表示法在数值前面增加了一位符号位（即最高位为符号位）:
	 ( 符号: 0-正号，1-负号)
	 正数该位为0，负数该位为1（0有两种表示：+0和-0），其余位表示数值的大小。
	 
	 2) 原码优点: 简单直观；例如，我们用8位二进制表示一个数，+11的原码为00001011，-11的原码就是10001011
	 
	 3) 原码缺点: 
	 原码不能直接参加运算，可能会出错。例如数学上，1+(-1)=0，而在二进制中
	00000001+10000001=10000010，换算成十进制为-2。显然出错了。
	所以原码的符号位不能直接参与运算，必须和其他位分开，这就增加了硬件的开销和复杂性
	
	
	二)  反码
	 1) 反码(inverse code)表示法规定：正数的反码与其原码相同；负数的反码是对其原码逐位取反，但符号位除外。
	 
	 2) 反码是区分正数、负数的，正数的情况和原码一样，而负数的反码则是取反，负号位不参与其中.
	 因此，对一个原码获取其反码的时候，首先需要判断是正数还是负数或者0.
	 
	 三) 补码
	 1) 在计算机系统中，数值一律用补码(complement code)来 [表示] 和 [存储]. 原因在于，使用补码，可以将 [符号位] 和 [数值位]
	 统一处理，同时，加法/减法也可以统一处理；此外，补码和原码的转换，其运算过程是相同的，不需要额外
	 的硬件电路.
	 
	 2) 补码特性
	 	A. 一个原码 和补码相加，和为模
	 	B. 对一个原码的补码求补码，等于该原码本身
	 	C. 补码的+0 和 -0 表示方法相同
	 	
	 3) 模-概念
	 模指一个计量系统的计数范围，如时钟。计算机可以看成一个计量机器，它也有一个计量范围，即都存在一个模.
	 
	 时钟的计量范围是 0 - 11，模=12；表示n位的计算机计量范围是0 ~ 2^n-1，模=2^n.
	 
	 模实质上是计量器产生溢出的量，它的值在计量器上表示不出来，计量器上只能表示出模的余数.
	 任何有模的计量器，均可化减法为加法运算.
	 
	 例如：假设当前时针指向10点，而准确时间是6点，调整时间可有以下两种拨法：一种是倒拨4小时，
	 即：10-4=6；另一种是顺拨8小时：10+8=12+6=6
	在以12模的系统中，加8和减4效果是一样的，因此凡是减4运算，都可以用加8来代替。
	对“模”而言，8和4互为补数。实际上以12模的系统中，11和1，10和2，9和3，7和5，6和6都有这个特性。共同的特点是两者相加等于模。
	 
	 对于计算机，其概念和方法完全一样。n位计算机，设n=8， 所能表示的最大数是11111111，若再加1称为100000000(9位），
	 但因只有8位，最高位1自然丢失。又回了00000000，所以8位二进制系统的模为2^8。
	 在这样的系统中减法问题也可以化成加法问题，只需把减数用相应的补数表示就可以了。把补数用到计算机对数的处理上，就是补码。
	 
	 4) 求补码
	 	A. 正整数: 补码 == 原码
	 	B. 负整数: 补码 == 反码 + 1
	 	
	 	说明，以8位为例: 
	 	+9 补码: 0000 1001
	 	-9 补码: [1000 1001] + 1 --> 1000 1010 
	 	
	 	// 正负0 的补码相同
	 	+0 补码: 0000 0000
	 	 -0 补码: [1111 1111] + 1 --> 0000 0000
	 	 
	 	 计算演示(2个正整数 做减法运算):
	 	 十进制数:  8 - 5 == 3
	 	 二进制数: [0000 1000] - [0000 0101] =将右操作数转成负数= [0000 1000] + [1000 0101]
	 	 --> 进入计算机-补码技术 == [0000 1000] + [1000 0101的补码] 
	 	 --> [0000 1000] + [1111 1010 + 1] == [0000 1000] + [1111 1011] == [0000 0011] --> 3(十进制数)
	 	
	 	
	 	总结
	 	1) 正整数: 原码= 反码 = 补码
	 	2) 负整数: 原码，反码(原码取反)， 补码(反码 + 1) 
	 	3) 所谓反码/补码的概念都是给负整数用的，和正整数几乎没有关系
	 */
	
	/**
	 
	 二进制补码-最值问题
	 1) 不管多少比特，都遵循统一一个规律
	 正数最小值永远是0，负数最大值永远是-1.
	 
	 2) 正数
	 最小值: 0 == 0000...00 (全部0)
	 最大值: 0111..11
	 
	 3) 负数
	 最小值: 100...00
	 最大值: -1 == 111...11 (全部1)
	 
	 
	 
	 */
	
}
