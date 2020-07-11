/**
  * @filename StudentEntity.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.entity;

 /**
 * @type StudentEntity
 * @description 
 * @author qianye.zheng
 */
public class StudentEntity
{
	
	/*
	 * 
	 * 不规范的书写hashCode和equals方法
	 * 
	 * 哈希码一样，而equals方法却是false
	 * 
	 * 
	 * 测试HashSet是否允许此类元素添加进
	 * 
	 */
	
	
	/* 用户id */
	private Integer id;
	
	/*  姓名 */
	private String name;
	
	private String remark;

	/**
	* @return the id
	*/
	public final Integer getId()
	{
		return id;
	}

	/**
	* @param id the id to set
	*/
	public final void setId(Integer id)
	{
		this.id = id;
	}

	/**
	* @return the name
	*/
	public final String getName()
	{
		return name;
	}

	/**
	* @param name the name to set
	*/
	public final void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @description 
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((id == null) ? 0 : id.hashCode());
		// 只对name 计算 哈希码
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		
		return result;
	}

	/**
	 * @description 
	 * @param obj
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public boolean equals(Object obj)
	{
		StudentEntity entity = (StudentEntity) obj;
		if (this.id.equals(entity.getId()))
		{
			return true;
		}
		
		return false;
	}

	/**
	* @return the remark
	*/
	public final String getRemark()
	{
		return remark;
	}

	/**
	* @param remark the remark to set
	*/
	public final void setRemark(String remark)
	{
		this.remark = remark;
	}
	
}
