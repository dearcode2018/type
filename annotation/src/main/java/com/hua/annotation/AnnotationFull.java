/**
 * AnnotationFull.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.hua.constant.ext.Season;

/**
 * AnnotationFull
 * 描述: 注解完整 - 范例
 * @author  qye.zheng
 */

/*
 	注解定义
    注解类定义: 权限符 @interface Xx {}
	注解不能显式继承任何类型(包括注解类，已经隐含继承了java.lang.annotation.Annotation)，
	也不能实现任何接口，单纯就是一个权限和名称声明而已.
	[ extends java.lang.annotation.Annotation ]
 */
// 可以通过 javadoc 获取注解
@Documented

// 在施加对象中是否可继承
@Inherited

/*
 施加对象(多个) TYPE, FIELD, METHOD, PARAMETER, 
 CONSTRUCTOR, LOCAL_VARIABLE,ANNOTATION_TYPE,PACKAGE
 */
@Target({ANNOTATION_TYPE,TYPE, FIELD, METHOD, PARAMETER, 
	PACKAGE, CONSTRUCTOR, LOCAL_VARIABLE})

/*
 从 SOURCE --> RUNTIME 级别上升
 @Retention(RetentionPolicy.SOURCE | 
 RetentionPolicy.CLASS | RetentionPolicy.RUNTIME)
 
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationFull
{

	/**
	 属性只允许: 基本类型(不包括其包装类)/String/Class/Annotation/
	 Enum/以及由以上类型构成的一维数组
	 共13种数据类型
	 */

	/**
	 * 
	 * 描述: 注解属性的声明类似于一个方法
	 * @author qye.zheng
	 * @return
	 */
	String name() default "";
	
	boolean bl() default false;
	
	byte bt() default 0;
	
	short sh() default 0;
	
	char ch() default '\u0000';
	
	int index() default 0;
	
	float fl() default 0.0F;
	
	long lon() default 0L;
	
	double db() default 0.0;
	
	// 枚举类型
	Season season() default Season.AUTUMN;
	
	// Class 类型
	Class<?> clazz() default Object.class;
	
	// 注解类型
	SuppressWarnings anno();
	
	// 数组 - 以 int 为例
	int[] array() default {};
	
}
