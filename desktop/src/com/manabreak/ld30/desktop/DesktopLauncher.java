package com.manabreak.ld30.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings;
import com.manabreak.ld30.LD30;

public class DesktopLauncher
{
	public static void main (String[] arg)
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1280;
		config.height = 720;
		
		Settings s = new Settings();
		s.filterMag = TextureFilter.Nearest;
		s.filterMin = TextureFilter.Nearest;
		s.maxWidth = 2048;
		s.maxHeight = 2048;
		s.paddingX = 3;
		s.paddingY = 3;
		s.edgePadding = true;
		s.alias = true;
		s.useIndexes = false;
		
		TexturePacker.process(s, "../images", "../android/assets/graphics", "game");
		
		new LwjglApplication(new LD30(), config);
	}
}
