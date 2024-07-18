package com.slaythemall.io;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.slaythemall.utiles.Utiles;

public class Entradas implements InputProcessor{

	private boolean abajo = false, arriba = false;
	
	@Override
	public boolean keyDown(int keycode) { //CUANDO PRESIONA UNA TECLA
		
		if(keycode == Keys.W) {
			arriba = true;
		}
		
		if(keycode == Keys.S) {
			abajo = true;
		}
		
		return false;
	}

	@Override
	public boolean keyUp(int keycode) { //CUANDO DEJA DE PRESIONAR LA TECLA
		
		if(keycode == Keys.W) {
			arriba = false;
		}
		
		if(keycode == Keys.S) {
			abajo = false;
		}
		
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		return false;
	}

	public boolean isAbajo() {
		return abajo;
	}

	public boolean isArriba() {
		return arriba;
	}

	
}
