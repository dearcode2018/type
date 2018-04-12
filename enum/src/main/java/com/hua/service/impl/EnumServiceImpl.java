/**
 * EnumServiceImpl.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.service.impl;

import com.hua.service.EnumService;

/**
 * EnumServiceImpl
 * 描述: 
 * @author  qye.zheng
 */
public final class EnumServiceImpl extends CoreServiceImpl implements
		EnumService
{

	/**
	 enum
	 public enum EnumName extends java.lang.Enum<EnumName>
	 枚举是一个特殊的类，有自身的一些默认规则.
	 可以有属性、普通方法(静态/动态)、抽象方法、私有构造方法(private) 均可多个
	 默认有一个私有无参构造方法
	 构造方法私有化：单例模式
	 
	枚举类默认继承public abstract class java.lang.Enum<NameXx>，
	但不能明确地声明某个类继承Enum；隐含声明就是定义一个枚举类，
	不能再声明extends其他类，但可以implements多个接口。

	 
	由于其属性的声明的前缀的都相同，因此用逗号隔开，相当于一次声明多个变量
	public static final NameXx 属性1 = new NameXx();
	public static final NameXx 属性2 = new NameXx();
	...
	public static final NameXx 属性n = new NameXx();
	合并成1句即可
	默认调用私有无参构造方法，因此调用私有无参构造方法方式可以省略括号.
	直接写属性名称即可.
	也可以调用有参构造方法.

	 
	 */
	
	/**
	 java.lang.Enum<T> 有一个属性
	 private final String name;
	 通过该属性和静态方法valueOf(String name)
	 即可获取该枚举实例
	 
	 因此，一般情况下，通过name来获取实例已经
	 能满足很多需求，一般不需要再设计getInstance(String value)
	 通过value来获取枚举实例了.
	 */
	
}
