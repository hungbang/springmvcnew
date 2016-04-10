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
public class RoleVO implements Serializable {
	private int roleId;
	private String roleName;
	private List<AccountVO> listAccountVO;
	/**
	 * @return the listAccountVO
	 */
	public List<AccountVO> getListAccountVO() {
		return listAccountVO;
	}
	/**
	 * @param listAccountVO the listAccountVO to set
	 */
	public void setListAccountVO(List<AccountVO> listAccountVO) {
		this.listAccountVO = listAccountVO;
	}
	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}
	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
