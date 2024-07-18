package com.slaythemall.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.slaythemall.pantallas.PantallaInicio;
import com.slaythemall.pantallas.PantallaMenu;
import com.slaythemall.utiles.Render;

public class SlayThemAll extends Game {
	
	
	@Override
	public void create () {
		Render.app = this;
		Render.batch = new SpriteBatch();
		this.setScreen(new PantallaInicio());
		//this.setScreen(new PantallaMenu());
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		Render.batch.dispose();
		
	}
}
