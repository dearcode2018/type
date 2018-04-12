/**
 * AnnotationServiceImpl.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.service.impl;

import com.hua.service.AnnotationService;

/**
 * AnnotationServiceImpl
 * 描述: 
 * @author  qye.zheng
 */
public final class AnnotationServiceImpl extends CoreServiceImpl implements
		AnnotationService
{

	/**
	 
	 可以编译成字节码文件；可以被JVM识;
	相当于程序_一部分.
	 
	 
	 限定程序_行为/特征，可以通过反射方式探查出.
	 
	 标注一个类/属性/方法/局部变量；写给编译器看.
	 
	 注解分类
	1) 标记注解: 无需参数
	2) 单值注解: 需要一个参数，参数名- value
	3) 多值注解: 多个值，对应多个_参数名
	 
	 元注解(4个)
	1) 定义: 注解其他注解_注解
	2) Documented: 可以通过 javadoc 获取注解(生成html文档) \\ 标记注解
	3) Inherited: 描述_注解信息可继承 \\ 标记注解
	4) Retention: 描述信息在什么层次有效 \\ 单值注解
	层次: SOURCE(源文件)/CLASS(字节码)/RUNTIME
	5) Target: java.lang.annotation.ElementType中的值
	 
	 注解可以加在: 包、类(类/接口/枚举...)、字段(属性/枚举项)、方法、方法参数、局部变量。
	 
	 注解类定义: 权限符 @interface Xx {}
	 注解不能显式继承任何类型(包括注解类，已经隐含继承了java.lang.annotation.Annotation)，
	 也不能实现任何接口，单纯就是一个权限和名称声明而已.
	 
	@interface关键字隐含了: 继承 public class java.lang.annotation.Annotation 类。
	
	public @interface 类名[ extends java.lang.annotation.Annotation ] {
	
	属性只允许: 基本类型(不包括其包装类)/String/Class/Annotation/
	Enum/以及由以上类型构成的一维数组
	
	fieldName() default val... ;
	例如: String value() default "hehe";
	
	int[] test() default {1, 2, 3};
	
	
	
	}
	 
	 注解_辅助类
	java.lang.annotation.Documented
	java.lang.annotation.Inherited
	java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.XX)
	java.lang.annotation.Target(value={java.lang.annotation.ElementType.XX, java.lang.annotation.ElementType.XX...})
	 
	 注解_枚举类型
	1) java.lang.annotation.ElementType
	A. 注解类型: ElementType.ANNOTATION_TYPE
	B. 构造方法: ElementType.CONSTRUCTOR
	C. 属性: ElementType.FIELD
	D. 方法: ElementType.METHOD
	
	2）java.lang.annotation.RetentionPolicy
	枚举值: SOURCE / CLASS / RUNTIME
	 
	 
	 */
	
	
	/**
	 
	 常用注解
	1) 包含: Override/Deprecated/SuppressWarnings
	2) java.lang.Override: 覆盖父类方法  \\ 标记注解
	3) java.lang.Deprecated: 某个属性/方法_过期,不推荐使用 \\ 标记注解
	4) java.lang.SuppressWarnings: 忽略某种类型警告信息 \\ 单值注解
	value值: all deprecation fallthrough finally path serial unused unchecked
	只有基本类型、String、枚举及其数组，才能使用SuppressWarnings

	 */
	
	/**
	
	构造注解类对象(使用注解类):
	@类名(属性1=值1, 属性2=值2,...)
	所有没有默认值的属性都要在构造的时候赋上值，如果所有的属性都有默认值，那么可以@类名()来构造类对象。
	没有属性的类可以: @类名直接构造类对象
	 
	 施加对象: 类型、属性、普通方法、构造方法、方法参数、局部变量
	 保留级别: 源码级别、类级别、运行时级别
	 
	 */
	
	
}
