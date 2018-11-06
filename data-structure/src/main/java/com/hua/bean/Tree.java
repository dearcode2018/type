/**
  * @filename Tree.java
  * @description 
  * @version 1.0
  * @author qianye.zheng
 */
package com.hua.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * @type Tree
 * @description 
 * @author qianye.zheng
 */
public class Tree
{
	
	private Integer id;
	
	private String code;
	
	private String name;
	
	private boolean root;
	
	private List<Tree> subs = new ArrayList<>();

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
	* @return the code
	*/
	public final String getCode()
	{
		return code;
	}

	/**
	* @param code the code to set
	*/
	public final void setCode(String code)
	{
		this.code = code;
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
	* @return the root
	*/
	public final boolean isRoot()
	{
		return root;
	}

	/**
	* @param root the root to set
	*/
	public final void setRoot(boolean root)
	{
		this.root = root;
	}

	/**
	* @return the subs
	*/
	public final List<Tree> getSubs()
	{
		return subs;
	}

	/**
	* @param subs the subs to set
	*/
	public final void setSubs(List<Tree> subs)
	{
		this.subs = subs;
	}
	
}
