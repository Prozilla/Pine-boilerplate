package dev.prozilla;

import dev.prozilla.pine.core.ApplicationBuilder;

public class Main {
	
	/**
	 * Runs an application titled "Pine boilerplate" in a 800x600 window with the icon set to "pine.png".
	 */
	public static void main(String[] args) {
		ApplicationBuilder applicationBuilder = new ApplicationBuilder();
		
		applicationBuilder.setTitle("Pine boilerplate");
		applicationBuilder.setIcons("pine.png");
		applicationBuilder.setWindowSize(800, 600);
		
		applicationBuilder.buildAndRun();
	}
	
}