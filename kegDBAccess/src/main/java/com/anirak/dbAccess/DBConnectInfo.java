/**
 * 
 */
package com.anirak.dbAccess;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Owner
 *
 */

public class DBConnectInfo
{
	@Getter
	@Setter
	private String dbName;

	@Getter
	@Setter
	private int dbPort;
	@Getter
	@Setter
	private String userName;
	@Getter
	@Setter
	private String password;

}
