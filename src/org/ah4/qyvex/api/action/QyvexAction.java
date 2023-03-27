package org.ah4.qyvex.api.action;

/**
 * Class representing an action
 * @author AH4
 *
 */
public abstract class QyvexAction {

	/**
	 * Returns Qyvex syntax (a regular expression). This will be called when a script is
	 * referencing to this regEx. <br />
	 * For example: 'print %object% [to console]'
	 * @return action syntax
	 */
	public abstract String[] getSyntaxes();
	
	/**
	 * This function is linked to Qyvex methods. You can see it as a static methods. Once the
	 * syntax is read, it'll call this function with all specified parameters.
	 * @param syntax the action syntax
	 * @param args the action arguments (as specified in syntax)
	 */
	public abstract void run(String syntax, Object[] args);
	
}
