
package main;

import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 *
 * @author BIRAHEKA
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws InterruptedException Throws the exception if the main is interrupted
     */
    public static void main(final String[] args) throws InterruptedException {
    	
    	/*
    	 You can enter the name of the map you want to play as a parameter of the model.
    	 Maps available:
    	 "level1"
    	 "level2"
    	 "level3"
    	 "level4"
    	 "level5"
    	 */

		/**
		 * The model
		 */
		final Model model = new Model("level1");
		/**
		 * The view
		 */
        final View view = new View(model);
		/**
		 * The controller.
		 */
		final Controller controller = new Controller(view, model);
		/**
		 * Sets the controller
		 */
        view.setController(controller);

		/**
		 * Plays the game
		 */
        controller.play();
    }
}
