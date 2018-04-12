/**
 * 描述: 
 * User.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.entity.collect;

import java.sql.Timestamp;
import java.util.List;

import com.hua.constant.Constant;
import com.hua.entity.BaseEntity;
import com.hua.util.StringUtil;

/**
 * 描述: 
 * 
 * @author qye.zheng
 * User
 */
public final class User implements Comparable<User> {

	/**
	 比较: 覆盖equals 和 hashCode 方法，以 username 作为参照字段
	 
	 排序: 实现Comparable<T> 接口，以 username 作为参照字段
	 */
	
	 /* long */
	private static final long serialVersionUID = 1L;
	
	/* 登录-用户名 (唯一) */
	private String username;
	
	/* 昵称 (用于显示) */
	private String nickname;
	
	/* 登录-密码 */
	private String password;
	
	/* 用户状态 - 是否有效 默认 : 有效 */
	private boolean isValid = true;
	
	/* 上一次登录-时间 */
	private Timestamp lastLoginTime;
	
	/* 上一次登录-IP地址 */
	private String lastLoginIp;
	
	/** 无参构造方法 */
	public User() {}

	/**
	 * 
	 * 构造方法
	 * 描述: 
	 * @author qye.zheng
	 * @param username
	 * @param nickname
	 */
	public User(String username, String nickname)
	{
		super();
		this.username = username;
		this.nickname = nickname;
	}



	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the lastLoginTime
	 */
	public Timestamp getLastLoginTime()
	{
		return lastLoginTime;
	}

	/**
	 * @param lastLoginTime the lastLoginTime to set
	 */
	public void setLastLoginTime(Timestamp lastLoginTime)
	{
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * @return the lastLoginIp
	 */
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	/**
	 * @param lastLoginIp the lastLoginIp to set
	 */
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname()
	{
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	/**
	 * @return the isValid
	 */
	public boolean isValid()
	{
		return isValid;
	}

	/**
	 * @param isValid the isValid to set
	 */
	public void setValid(boolean isValid)
	{
		this.isValid = isValid;
	}

	 /**
	 * 描述: 
	 * @author qye.zheng
	 * @return
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nickname == null) ? 0 : nickname.hashCode());
		return result;
	}

	 /**
	 * 描述: 
	 * @author qye.zheng
	 * @param obj
	 * @return
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
		User other = (User) obj;
		if (nickname == null)
		{
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		return true;
	}

	/**
	 * 描述: java.lang.Comparable<T> 接口方法
	 * @author  qye.zheng
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(final User o)
	{
		/*
		 以 username 作为参照字段，为null或空串为最大值
		 */
		if (StringUtil.isEmpty(username) && !StringUtil.isEmpty(o.getUsername()))
		{
			// A 为空, B不为空，返回1
			return Constant.ONE;
		} else if (StringUtil.isEmpty(username) && StringUtil.isEmpty(o.getUsername()))
		{
			// A / B 都为空，返回0
			return Constant.ZERO;
		} else if (!StringUtil.isEmpty(username) && StringUtil.isEmpty(o.getUsername()))
		{
			// A不 为空, B为空，返回-1
			return Constant.NEGATIVE_ONE;
		}
		
		// A / B 都不为空，则调用String的compareTo 方法进行比较
		int result = username.compareTo(o.getUsername());
		//System.out.println("result = " + result);
		
		return result;
	}
	
	/**
	 * 
	 * 描述: 输出集合
	 * @author  qye.zheng
	 * @param users
	 */
	public static void printList(final List<User> users)
	{
		System.out.print("[");
		User user = null;
		for (int i = 0; i < users.size(); i++)
		{
			user = users.get(i);
			if (0 == i)
			{
				System.out.print(user.getUsername());
			} else 
			{
				System.out.print(", " + user.getUsername());
			}
			
		}
		System.out.print("]");
		System.out.println();
	}
	
	 /**
	 * 描述: 
	 * @author qye.zheng
	 * @return
	 */
	@Override
	public String toString()
	{
		String result = "<" + username + ": " + nickname + ">";
		
		return result;
	}
	
}
