package com.manabreak.ld30;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/**
 * Resource manager - keeps track of textures,
 * fonts and audio.
 * 
 * @author manabreak
 */
public class Res
{
	// Main texture atlas
	private static TextureAtlas atlas;
	
	// Sound files
	private static HashMap<String, Sound> sounds = new HashMap<String, Sound>();
	
	// Music tracks
	private static HashMap<String, Music> musics = new HashMap<String, Music>();
	
	// Bitmap fonts
	private static HashMap<String, BitmapFont> fonts = new HashMap<String, BitmapFont>();
	
	// Skins
	private static HashMap<String, Skin> skins = new HashMap<String, Skin>();
	
	/**
	 * Loads all the resources in the default folders. If you want to load something
	 * later on, don't put those resources in the default folders.
	 */
	public static void loadResources()
	{
		// Load atlas
		atlas = new TextureAtlas(Gdx.files.internal("graphics/game.atlas"));
		
		// Load sound files
		for(FileHandle fh : Gdx.files.internal("sounds").list())
		{
			if(fh.isDirectory()) continue;
			sounds.put(fh.nameWithoutExtension(), Gdx.audio.newSound(fh));
		}
		
		// Load music files
		for(FileHandle fh : Gdx.files.internal("music").list())
		{
			if(fh.isDirectory()) continue;
			musics.put(fh.nameWithoutExtension(), Gdx.audio.newMusic(fh));
		}
		
		// Load fonts
		for(FileHandle fh : Gdx.files.internal("fonts").list())
		{
			if(fh.isDirectory()) continue;
			fonts.put(fh.nameWithoutExtension(), new BitmapFont(fh));
		}
		
		// Load skins
		for(FileHandle fh : Gdx.files.internal("skins").list())
		{
			if(fh.isDirectory()) continue;
			skins.put(fh.nameWithoutExtension(), new Skin(fh));
		}
	}
	
	/**
	 * Releases all the resources. Call this when you exit your game.
	 */
	public static void releaseResources()
	{
		atlas.dispose();
		for(Sound s : sounds.values()) s.dispose();
		for(Music m : musics.values()) m.dispose();
		for(BitmapFont f : fonts.values()) f.dispose();
		for(Skin s : skins.values()) s.dispose();
		sounds.clear();
		musics.clear();
		fonts.clear();
		skins.clear();
	}
}
