package view.menuElement;

import contract.MenuActions;

/**
 * The QuitGame class
 * 
 * @author BIRAHEKA
 *
 */
public class QuitGame extends MenuElement {

	/**
	 * Initiates a new QuitGame
	 * @param content
	 * @param size
	 * @param alpha
	 */
	public QuitGame(String content, int size, int alpha) {
		super(content, size, alpha);
	}
	
	@Override
	public MenuActions MenuRequest() {
		if(this.isSelected()) {
			return MenuActions.Quitgame;
		}
		return MenuActions.Nop;
	}

}
