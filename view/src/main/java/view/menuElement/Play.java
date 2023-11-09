package view.menuElement;

import contract.MenuActions;

/**
 * The Play class
 * 
 * @author BIRAHEKA
 *
 */
public class Play extends MenuElement {
	
	/**
	 * Initiates a new Play object
	 * @param content
	 * @param size
	 * @param alpha
	 */
	public Play(String content, int size, int alpha) {
		super(content, size, alpha);
	}
	
	@Override
	public MenuActions MenuRequest() {
		if(this.isSelected()) {
			return MenuActions.Play;
		}
		return MenuActions.Nop;
	}
}
