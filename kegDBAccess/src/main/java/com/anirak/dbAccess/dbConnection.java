/**
 * 
 */
package com.anirak.dbAccess;

/**
 * @author Owner
 *
 */
public class dbConnection
{

	/**
	 * 114
	 * 
	 * 
	 * 66 I want to manipulate a Microsoft Access database (.accdb or .mdb file)
	 * from my Java project. I don't want to use the JDBC-ODBC Bridge and the Access
	 * ODBC driver from Microsoft because:
	 * 
	 * the JDBC-ODBC Bridge has been removed from Java SE 8 and is not supported
	 * (ref: here), the JDBC-ODBC Bridge does not work properly with the Access ODBC
	 * driver when text includes Unicode characters with code points above U+00FF
	 * (ref: here), so such a setup would not be able to handle characters such as
	 * Greek, Russian, Chinese, Arabic, etc., the Access ODBC driver from Microsoft
	 * only works in Windows, and there are separate 32-bit and 64-bit versions of
	 * the Access Database Engine (and ODBC driver) which can be a nuisance for
	 * deployment. I have seen other answers mentioning a JDBC driver for Access
	 * databases named UCanAccess. How can I set up my Java project to use this
	 * approach?
	 * 
	 * (Answers suggesting better ways of working with Access databases from Java
	 * would also be most welcome.)
	 */

	// https://stackoverflow.com/questions/45300178/how-to-connect-java-to-ms-access-database
	// https://www.benchresources.net/jdbc-msaccess-database-connection-steps-in-java-8/
	// need canaccess.jdbc.UcanaccessDriver
	// http://ucanaccess.sourceforge.net/site.html

}
