package com.slaythemall.pantallas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.slaythemall.elementos.Imagen;
import com.slaythemall.elementos.Texto;
import com.slaythemall.io.Entradas;
import com.slaythemall.utiles.Config;
import com.slaythemall.utiles.Recursos;
import com.slaythemall.utiles.Render;
import com.slaythemall.utiles.Utiles;

public class PantallaMenu implements Screen{
	
	Imagen fondo;
	SpriteBatch b;
	
	Texto textos[] = new Texto[4]; //Podriamos hacerlo dinámico
	//El avance también debería ser dinámico, tal vez una funcion en Texto
	Entradas entrada = new Entradas();
	private int opcElegido = 1;
	
	@Override
	public void show() {
		fondo = new Imagen(Recursos.FONDO_MENU);
		b = Render.batch;
		
		Gdx.input.setInputProcessor(entrada);
		
		textos[0] = new Texto(Recursos.FUENTE_MENU, 30, Color.WHITE, false);
		textos[0].setTexto("JUGAR");
		
		float posInY = (Config.ALTO/2)+(textos[0].getAlto()/2);
		float avance = textos[0].getAlto()+40;
		
		textos[0].setPosicion((Config.ANCHO/2)-(textos[0].getAncho()/2), posInY);
		
		textos[1] = new Texto(Recursos.FUENTE_MENU, 30, Color.WHITE, false);
		textos[1].setTexto("ONLINE");
		textos[1].setPosicion((Config.ANCHO/2)-(textos[1].getAncho()/2), posInY-(avance*1));
		
		textos[2] = new Texto(Recursos.FUENTE_MENU, 30, Color.WHITE, false);
		textos[2].setTexto("OPCIONES");
		textos[2].setPosicion((Config.ANCHO/2)-(textos[2].getAncho()/2), posInY-(avance*2));
		
		textos[3] = new Texto(Recursos.FUENTE_MENU, 30, Color.WHITE, false);
		textos[3].setTexto("SALIR");
		textos[3].setPosicion((Config.ANCHO/2)-(textos[3].getAncho()/2), posInY-(avance*3));
		
	}

	@Override
	public void render(float delta) {
		b.begin();
			fondo.dibujar();
			textos[0].dibujar();
			textos[1].dibujar();
			textos[2].dibujar();
			textos[3].dibujar();
		b.end();
		
		Utiles.esperar(100);
		
		if(entrada.isAbajo()) {
			if(opcElegido<textos.length-1) {
				textos[opcElegido].setColor(Color.WHITE);
				opcElegido++;
				textos[opcElegido].setColor(Color.YELLOW);				
			} else {
				textos[opcElegido].setColor(Color.WHITE);
				opcElegido = 0;
				textos[opcElegido].setColor(Color.YELLOW);
			}
		}
		
		if(entrada.isArriba()) {
			if(opcElegido>0) {
				textos[opcElegido].setColor(Color.WHITE);
				opcElegido--;
				textos[opcElegido].setColor(Color.YELLOW);				
			} else {
				textos[opcElegido].setColor(Color.WHITE);
				opcElegido = textos.length-1;
				textos[opcElegido].setColor(Color.YELLOW);
			}
		}
		
		
//		if(entrada.isArriba()) {
//			System.out.println("Hola");
//			textos[opcElegido].setColor(Color.WHITE);
//			System.out.println("Hola");
//			opcElegido++;
//			System.out.println("Hola");
//			textos[opcElegido].setColor(Color.YELLOW);
//			System.out.println("Hola");
//		}
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
