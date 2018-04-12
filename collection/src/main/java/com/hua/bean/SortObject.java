/**
  * @filename SortObject.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.bean;

 /**
 * @type SortObject
 * @description 排序对象
 * @author qianye.zheng
 */
public class SortObject implements Comparable<SortObject>
{
	private String id;
	
	private String name;
	
	private Integer size;
	
	/* 升序: true，降序: false， 默认是升序 */
	private Boolean asc = true;

	/**
	 * @return the id
	 */
	public final String getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(String id)
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
	 * @return the size
	 */
	public final Integer getSize()
	{
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public final void setSize(Integer size)
	{
		this.size = size;
	}

	/**
	 * @description 哈希码，为Set集合对象准备
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public int hashCode()
	{
		System.out.println("SortObject.hashCode() id: " + id);
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		System.out.println("SortObject.equals() id: " + id);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SortObject other = (SortObject) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size == null)
		{
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		
		return true;
	}
	
	/**
	 * @description 
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public String toString()
	{
		String result = "[id = " + id + ", name = " + name + ", size = " + size + "]";
		
		return result;
	}

	/**
	 * @description 实现 [可比较] 接口
	 * 升序: 0: 相等，-1: this小于other，1: this大于other
	 * 降序: 0: 相等，1: this小于other，-1: this大于other
	 * @param o
	 * @return 0: 相等，-1: this小于other，1: this大于other
	 * @author qianye.zheng
	 */
	@Override
	public int compareTo(SortObject o)
	{
		System.out.println("SortObject.compareTo()");
		if (asc)
		{ // 升序
			if (size > o.getSize())
			{
				return 1;
			} else if (size < o.getSize())
			{
				return -1;
			}
		} else
		{ // 降序
			if (size > o.getSize())
			{
				return -1;
			} else if (size < o.getSize())
			{
				return 1;
			}
		}
		
		return 0;
	}

	/**
	 * @return the asc
	 */
	public final Boolean getAsc()
	{
		return asc;
	}

	/**
	 * @param asc the asc to set
	 */
	public final void setAsc(Boolean asc)
	{
		this.asc = asc;
	}
	
}
