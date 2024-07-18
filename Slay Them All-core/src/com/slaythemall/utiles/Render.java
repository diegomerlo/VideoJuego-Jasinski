package com.slaythemall.utiles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.slaythemall.game.SlayThemAll;

public class Render {

	public static SpriteBatch batch;
	public static SlayThemAll app;
	
	public static void limpiarPantalla(float r, float g, float b) {
		
		Gdx.gl.glClearColor(r,g,b, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
	}
	
}
