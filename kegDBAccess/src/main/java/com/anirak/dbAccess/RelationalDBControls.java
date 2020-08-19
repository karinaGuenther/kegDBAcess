/**
 * 
 */
package com.anirak.dbAccess;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @author Owner
 *
 *         This class is the abstract class for relational databases
 */
public abstract class RelationalDBControls
{

	/**
	 * Inner function to recursively collect all fields of a class and the inherited
	 * ones from super classes.<br>
	 * <br>
	 * Used by {@link #getAllFields()}
	 * 
	 * @param fields A List&ltField&gt object
	 * @param type
	 * 
	 * @author Georgios Tzourmpakis<br>
	 *         AM: 2007030034<br>
	 *         Date: Apr 24, 2014
	 */
	private static void getAllFieldsInner(ArrayList<Field> fields, Class<?> type)
	{
		for (Field field : type.getDeclaredFields())
		{
			fields.add(field);
		}

		if (!type.getSuperclass()
				.getName()
				.endsWith("DBModel"))
		{
			getAllFieldsInner(fields, type.getSuperclass());
		}
	}
}
