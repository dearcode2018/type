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
	
	/* 结点id */
	private Integer id;
	
	/* 父结点id */
	private Integer parentId;
	
	/* 结点编码 */
	private String code;
	
	/* 结点名称 */
	private String name;
	
	/* 是否为根节点 */
	private boolean root;
	
	/* 是否显示 */
	private boolean show;
	
	/* 后代节点 */
	private List<Tree> subs = new ArrayList<>();

	/**
	* @return the show
	*/
	public final boolean isShow()
	{
		return show;
	}

	/**
	* @return the parentId
	*/
	public final Integer getParentId()
	{
		return parentId;
	}

	/**
	* @param parentId the parentId to set
	*/
	public final void setParentId(Integer parentId)
	{
		this.parentId = parentId;
	}

	/**
	* @param show the show to set
	*/
	public final void setShow(boolean show)
	{
		this.show = show;
	}

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
