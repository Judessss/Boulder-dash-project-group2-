package view.menuElement;

import contract.MenuActions;

/**
 * The Resume class
 * @author BIRAHEKA
 *
 */
public class Resume extends MenuElement {

	/**
	 * Initiates the new object
	 * @param content
	 * @param size
	 * @param alpha
	 */
	public Resume(String content, int size, int alpha) {
		super(content, size, alpha);
	}
	
	@Override
	public MenuActions MenuRequest() {
		if(this.isSelected()) {
			return MenuActions.Resume;
		}
		return MenuActions.Nop;
	}

}
