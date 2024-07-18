package com.slaythemall.elementos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.slaythemall.utiles.Render;

public class Imagen {
	
	private Texture t;
	private Sprite s;
	
	public Imagen(String ruta) {
		t = new Texture(ruta);
		s = new Sprite(t);
		s.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		s.setPosition(0, 0);
	}

	public void dibujar() {
		s.draw(Render.batch);
	}
	
	public void setTransparencia(float a) {
		s.setAlpha(a);
	}
	
}
