/**
  * @filename MapKey.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.hash;

import java.util.regex.Pattern;

/**
 * @type MapKey
 * @description 
 * @author qianye.zheng
 */
public class MapKey
{
	
	private static final String REG = "[0-9]+";
	
	private String key;

	/**
	 * @description 构造方法
	 * @param key
	 * @author qianye.zheng
	 */
	public MapKey(String key)
	{
		super();
		this.key = key;
	}

	/**
	 * @description 
	 * @return
	 * @author qianye.zheng
	 */
	@Override
	public int hashCode()
	{
		//final int prime = 31;
		//int result = 1;
		//result = prime * result + ((key == null) ? 0 : key.hashCode());
		
		//return result;
		if (null == key)
		{
			return 0;
		}
		
		Pattern pattern = Pattern.compile(REG);
		if (pattern.matcher(key).matches())
		{// 数字字符串返回1，其他字符串返回2
			
			return 1;
		} else
		{
			return 2;
		}
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapKey other = (MapKey) obj;
		if (key == null)
		{
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
	
	
	
}
