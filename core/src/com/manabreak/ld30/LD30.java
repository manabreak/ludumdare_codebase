package com.manabreak.ld30;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class LD30 extends Game
{
	private GameScreen gameScreen;
	
	@Override
	public void create ()
	{
		Res.loadResources();
		gameScreen = new GameScreen(this);
		setScreen(gameScreen);
	}
	
	@Override
	public void dispose()
	{
		Res.releaseResources();
		super.dispose();
	}
	
	public GameScreen getGameScreen()
	{
		return this.gameScreen;
	}
}
