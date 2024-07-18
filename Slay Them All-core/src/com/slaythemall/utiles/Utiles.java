package com.slaythemall.utiles;

public class Utiles {

	public static void esperar(int milis) {
		try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
