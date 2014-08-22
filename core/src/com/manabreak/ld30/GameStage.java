package com.manabreak.ld30;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class GameStage extends Stage
{
	private GameScreen gameScreen;

	public GameStage(GameScreen gameScreen)
	{
		this.gameScreen = gameScreen;
		
	}
	
	public GameScreen getGameScreen()
	{
		return this.gameScreen;
	}
}
