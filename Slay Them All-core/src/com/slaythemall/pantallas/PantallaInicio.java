package com.slaythemall.pantallas;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.slaythemall.elementos.Imagen;
import com.slaythemall.utiles.Recursos;
import com.slaythemall.utiles.Render;

public class PantallaInicio implements Screen {

	Imagen imagen;
	SpriteBatch b;
	boolean fadeInTerminado = false, termina = false;
	float a = 0;
	float contTiempo = 0, tiempoEspera = 5;
	float contTiempoFinal = 0, tiempoEsperaFinal = 5;
	
	@Override
	public void show() {
		imagen = new Imagen(Recursos.PRUEBA_IMAGEN);
		b = Render.batch;
		imagen.setTransparencia(a);
	}

	@Override
	public void render(float delta) {
		Render.limpiarPantalla(0,0,0);
		b.begin();
		imagen.dibujar();
		b.end();
		
		procesarFade();
	}

	private void procesarFade() {
		if(!this.fadeInTerminado) {
			a+=0.01f;
			if(a>=1) {
				a=1;
				this.fadeInTerminado = true;
			}
			
		} else {
			contTiempo += 0.05f;
			
			if(contTiempo>tiempoEspera) {
				a-=0.02f;
				if(a<=0) {
					a = 0;
					this.termina = true;
				}				
			}
		}
		
		imagen.setTransparencia(a);

		if(this.termina) {
			contTiempoFinal+=0.1f;
			if(contTiempoFinal>tiempoEsperaFinal) {
				Render.app.setScreen(new PantallaMenu());
			}
		}
		
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
//		img.dispose();
	}

}
