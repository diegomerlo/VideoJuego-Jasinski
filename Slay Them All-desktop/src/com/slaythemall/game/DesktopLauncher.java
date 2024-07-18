package com.slaythemall.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.slaythemall.game.SlayThemAll;
import com.slaythemall.utiles.Config;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setResizable(false);
		config.setTitle("Slay Them All");
		config.setWindowedMode(Config.ANCHO, Config.ALTO);
		new Lwjgl3Application(new SlayThemAll(), config);
	}
}
