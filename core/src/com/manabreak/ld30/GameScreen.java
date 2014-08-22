package com.manabreak.ld30;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class GameScreen implements Screen
{
	private LD30 mainGame;
	
	// List of current stages. These are updated from 0 to size-1 and
	// drawn in the reverse order. Put your game stage(s) in the bottom
	// and GUI layers on the top.
	private ArrayList<Stage> currentStages = new ArrayList<Stage>();
	
	private GameStage gameStage;
	private InputMultiplexer gameIM;
	
	public GameScreen(LD30 mainGame)
	{
		this.mainGame = mainGame;
		
		gameStage = new GameStage(this);
		
		currentStages.add(gameStage);
		gameIM = new InputMultiplexer(gameStage);
		Gdx.input.setInputProcessor(gameIM);
	}
	
	public GameStage getGameStage()
	{
		return this.gameStage;
	}
	
	@Override
	public void render(float delta)
	{
		Gdx.gl.glClearColor(0f, 0f, 0f, 0f);
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);

		for(int i = 0; i < currentStages.size(); ++i)
		{
			currentStages.get(i).act(delta);
		}
		
		for(int i = currentStages.size() - 1; i >= 0; --i)
		{
			currentStages.get(i).draw();
		}
	}

	@Override
	public void resize(int width, int height)
	{
		
	}

	@Override
	public void show()
	{
		Gdx.input.setInputProcessor(gameIM);
	}

	@Override
	public void hide()
	{
		
	}

	@Override
	public void pause()
	{
		
	}

	@Override
	public void resume()
	{
		
	}

	@Override
	public void dispose()
	{
		
	}
	
}
