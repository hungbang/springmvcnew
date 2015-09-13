/**
 * 
 */
package com.mrv.cps.daoImpl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * @author hungbang
 *
 */
public class BaseDAO {
	
	protected static JdbcTemplate jdbcTemplate;
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		BaseDAO.jdbcTemplate = jdbcTemplate;
	}
	
	protected static DataSourceTransactionManager transactionManager;
	/**
	 * @param transactionManager the transactionManager to set
	 */
	public void setTransactionManager(
			DataSourceTransactionManager transactionManager) {
		BaseDAO.transactionManager = transactionManager;
	}
}
