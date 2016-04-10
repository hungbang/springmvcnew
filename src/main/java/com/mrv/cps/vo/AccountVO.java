/**
 * 
 */
package com.mrv.cps.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author PC
 *
 */
public class AccountVO implements Serializable{
	private int accountId;
	private String username;
	private String password;
	private RoleVO roleVO = new RoleVO();
	private List<TeacherVO> listTeacherVO;
	private List<StudentVO> listStudentVO;
	public List<TeacherVO> getListTeacherVO() {
		return listTeacherVO;
	}
	public void setListTeacherVO(List<TeacherVO> listTeacherVO) {
		this.listTeacherVO = listTeacherVO;
	}
	public List<StudentVO> getListStudentVO() {
		return listStudentVO;
	}
	public void setListStudentVO(List<StudentVO> listStudentVO) {
		this.listStudentVO = listStudentVO;
	}
	/**
	 * @return the roleVO
	 */
	public RoleVO getRoleVO() {
		return roleVO;
	}
	/**
	 * @param roleVO the roleVO to set
	 */
	public void setRoleVO(RoleVO roleVO) {
		this.roleVO = roleVO;
	}
	/**
	 * @return the account
	 */
	public int getAccountId() {
		return accountId;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccountId(int accountId) {
		this.accountId = accountId;
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
	 * @return the roleId
	 */
	
}
