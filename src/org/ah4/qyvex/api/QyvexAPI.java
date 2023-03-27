package org.ah4.qyvex.api;

import java.util.TreeMap;

import org.ah4.qyvex.api.action.QyvexAction;

/**
 * Class to make links with other Qyvex plugins/library
 * @author AH4
 *
 */
public class QyvexAPI {
	
	private static TreeMap<String, QyvexAction> registeredActions = new TreeMap<String, QyvexAction>();
	
	/**
	 * Registers and loads a Qyvex plugin
	 * @param actions the plugin actions
	 */
	public static void registerActions(QyvexAction... actions) {
		for(QyvexAction action : actions) {
			if(action == null) continue;
			for(String actionSyntax : action.getSyntaxes()) {
				registeredActions.put(actionSyntax, action);
			}
		}
	}
	
}
