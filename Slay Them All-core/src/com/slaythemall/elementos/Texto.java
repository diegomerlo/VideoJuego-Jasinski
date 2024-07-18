package com.slaythemall.elementos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.math.Vector2;
import com.slaythemall.utiles.Render;

public class Texto {
	
	BitmapFont fuente;
	GlyphLayout layout;
	private String texto="";
	private float x=0, y=0;
	
	public Texto(String fuenteElegida, int dimension, Color color, boolean sombra) {
		generarTexto(fuenteElegida, dimension, color, sombra);
	}

	private void generarTexto(String fuenteElegida, int dimension, Color color, boolean sombra) {
		FreeTypeFontGenerator generador = new FreeTypeFontGenerator(Gdx.files.internal(fuenteElegida));
		FreeTypeFontParameter parametros = new FreeTypeFontParameter();
		parametros.size = dimension;
		parametros.color = color;
		
		if (sombra) {
			parametros.shadowColor = Color.BLACK;
			parametros.shadowOffsetX = 5;
			parametros.shadowOffsetY = 5;
		}
		
		fuente = generador.generateFont(parametros);
		layout = new GlyphLayout();
	}

	public void dibujar() {
		fuente.draw(Render.batch, texto, x, y);
	}

	public void setPosicion(float  x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void setColor(Color color) {
		fuente.setColor(color);
	}
	
	public String getTexto() {
		return texto;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		this.layout.setText(fuente, texto);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public float getAncho() {
		return this.layout.width;
	}
	
	public float getAlto() {
		return this.layout.height;
	}
	
	public Vector2 getDimension() {//Tipo de atributo que almacena 2 atrbutos como array, se accede con el - . -
		return new Vector2(this.layout.width, this.layout.height);
	}
	
	public Vector2 getPosicion() {
		return new Vector2(this.x, this.y);
	}
	
}
