package dev.prozilla;

import dev.prozilla.pine.common.math.vector.GridAlignment;
import dev.prozilla.pine.common.system.resource.Color;
import dev.prozilla.pine.core.entity.Entity;
import dev.prozilla.pine.core.entity.prefab.canvas.CanvasPrefab;
import dev.prozilla.pine.core.entity.prefab.canvas.TextPrefab;

public class Scene extends dev.prozilla.pine.core.Scene {
	
	public Scene() {
		super("HelloWorld");
	}
	
	@Override
	protected void load() {
		super.load();
		
		Entity canvas = world.addEntity(new CanvasPrefab());
		
		TextPrefab textPrefab = new TextPrefab("Hello world!");
		textPrefab.setColor(Color.white());
		textPrefab.setAnchor(GridAlignment.CENTER);
		canvas.addChild(textPrefab);
	}
}
