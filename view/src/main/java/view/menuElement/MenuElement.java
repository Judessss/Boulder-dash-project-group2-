package view.menuElement;


import contract.MenuActions;

/**
 * The MenuElement class
 * 
 * @author BIRAHEKA
 *
 */
public class MenuElement {
	private String content;
	private int size;
	private int alpha;
	private boolean selected;
	
	/**
	 * 
	 * @param content
	 *            The content of the window
	 * @param size
	 *            The size of the window menu
	 * @param alpha
	 */
	public MenuElement(String content, int size, int alpha) {
		this.setContent(content);
		this.setSize(size);
		this.setAlpha(alpha);
	}
	
	/**
	 * Gets the content
	 * 
	 * @return the content
	 */
	public String getContent() {
		return this.content;
	}
	/**
	 * Sets the content
	 * 
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * Gets the size
	 * @return the size
	 */
	public int getSize() {
		return this.size;
	}
	/**
	 * Sets the size
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * Gets the Alpha
	 * @return alpha
	 */
	public int getAlpha() {
		return this.alpha;
	}
	/**
	 * Sets the Alpha
	 * 
	 * @param alpha
	 */
	public void setAlpha(int alpha) {
		this.alpha = alpha;
	}

	/**
	 * @return the boolean selected
	 */
	public boolean isSelected() {
		return this.selected;
	}

	/**
	 * The setter of selected
	 * @param selected
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	/**
	 * 
	 * @return the menu action Nop
	 */
	public MenuActions MenuRequest() {
		return MenuActions.Nop;
	}
}
