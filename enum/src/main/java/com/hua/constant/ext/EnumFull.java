/**
 * 描述: 
 * EnumFull.java
 * @author	qye.zheng
 *  version 1.0
 */
package com.hua.constant.ext;

import java.util.Comparator;

import com.hua.face.ISomeInterface;

/**
 * 描述: 完整枚举 - 范例
 * @author  qye.zheng
 * EnumFull
 */
public enum EnumFull implements ISomeInterface, Comparator<EnumFull>
{
	/*
	 完整枚举-范例，
	 */
	
	/*
	 枚举类型声明实现的接口，可以在枚举内部整体实现，
	 也可以让每个枚举实例来实现；
	 而枚举内部声明的抽象方法，必须由每个枚举实例来
	 实现.
	 枚举自身声明要实现的接口，可以内部整体实现，也可以
	 让每个枚举实例单独实现，后者覆盖前者.
	 
	 */
	
	/**
	 设计提示: 
	 若每个实例都需要有一个同名但不同实现的方法，
	 可以在枚举内部写抽象方法，然后让各个实例单独去实现
	 或者实现接口的某个方法过程中，出现这种需求，则可以
	 让各个实例单独去实现.
	 
	 */
	
	// 无论是否有属性，都必须写一个分号
	FIELD_A("FIELD_A+", "A") {
		
		/**
		 * 
		 * 描述:实现枚举内部的抽象方法 
		 * @author qye.zheng
		 */
		@Override
		public void some()
		{
			
		}

		/**
		 * 
		 * 描述: 实现枚举本身声明
		 * 要实现的接口
		 * @author qye.zheng
		 */
		@Override
		public void other()
		{
		}
	},
	FIELD_B("FIELD_B+", "B") {
		 /**
		 * 描述: 实现枚举内部的抽象方法
		 * @author qye.zheng
		 */
		@Override
		public void some()
		{
		}
		
		/**
		 * 
		 * 描述: 实现枚举本身声明
		 * 要实现的接口
		 * @author qye.zheng
		 */
		@Override
		public void other()
		{
		}
		
		 /**
		 * 描述: 可以单独实现枚举自身声明的接口
		 * @author qye.zheng
		 * @param o1
		 * @param o2
		 * @return
		 */
		@Override
		public int compare(EnumFull o1, EnumFull o2)
		{
			return super.compare(o1, o2);
		}
	},
	/*
	 调用默认私有构造方法实例化
	 规范起见，建议保留括号
	 */
	FIELD_C() {
		 /**
		 * 描述: 
		 * @author qye.zheng
		 */
		@Override
		public void some()
		{
		}
		
		/**
		 * 
		 * 描述: 实现枚举本身声明
		 * 要实现的接口
		 * @author qye.zheng
		 */
		@Override
		public void other()
		{
		}
	}
	;
	// 理论上如此，但这种写法不正确
	//public static final EnumFull FIELD_A = new EnumFull();

	// 理论上如此，但这种写法不正确
	//public static final EnumFull FIELD_B = new EnumFull();
	
	/*
	 属性必须写在枚举常量后面
	 属性一般通过构造方法来赋值
	 */
	
	/*
	 父类Enum也有一个name属性，
	 父类name的值存储的是每个枚举
	 实例的字面值
	 */
	// 枚举实例的名称
	private String name;
	
	// 值，code
	private String value;
	
	// 描述信息
	private String description;
	
	// 索引，即用 0,1,2...来表示枚举实例的值
	private int index;
	//private int index = this.ordinal();
	
	// 私有无参构造方法 (默认)
	private EnumFull()
	{
		//super("d", 1);
	}
	
	// 私有构造方法
	private EnumFull(String name, String value)
	{
		this.name = name;
		this.value = value;
	}
	
	/**
	 * 
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 * @param name
	 * @param value
	 * @param description
	 * @param index
	 */
	private EnumFull(String name, String value, String description, int index)
	{
		// 错误写法
		//super(name, index);
		this.value = value;
		this.description = description;
	}

	/**
	 枚举类型实现接口，其作用只在于拥有
	 一些方法而已
	 有些接口方法已经被抽象类java.lang.Enum<T> 实现了
	 因此在子枚举类中不再实现
	 */
	
	// 实现接口的方法
	 /**
	 * 描述: 
	 * @author qye.zheng
	 */
	@Override
	public void common()
	{
		System.out.println("EnumFull.common()");
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	 /**
	 * 描述: 实现枚举声明的接口
	 * @author qye.zheng
	 * @param o1
	 * @param o2
	 * @return
	 */
	@Override
	public int compare(EnumFull o1, EnumFull o2)
	{
		return 0;
	}
	
	/**
	 * 
	 * 描述: 枚举自身_抽象方法
	 * 需要每个枚举实例去单独实现
	 * 需求点: 要求枚举实例 有 同名单不同实现的方法
	 * @author qye.zheng
	 */
	public abstract void some();

	/**
	 * @return the value
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * @return the index
	 */
	public int getIndex()
	{
		return index;
	}
	
	/**
	 * 
	 * 描述: 根据value值获取枚举实例
	 * @author qye.zheng
	 * @param value
	 * @return
	 */
	public static EnumFull getInstance(final String value)
	{
		EnumFull instance = null;
		final EnumFull[] array = EnumFull.values();
		for (int i = 0; i < array.length; i++)
		{
			if (array[i].getValue().equals(value))
			{
				instance = array[i];
				
				return instance;
			}
		}
		
		return instance ;
	}
	
	/**
	 * 
	 * 描述: 静态方法
	 * @author qye.zheng
	 * @return
	 */
	public static String t()
	{
		
		return null;
	}
	
}
