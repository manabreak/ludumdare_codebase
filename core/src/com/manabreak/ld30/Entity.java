package com.manabreak.ld30;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Entity extends Actor
{
	protected GameStage stage;
	protected Sprite sprite;
	
	public Entity(GameStage stage, Sprite sprite)
	{
		this.stage = stage;
		this.sprite = sprite;
		setSize(sprite.getWidth(), sprite.getHeight());
		setBounds(0f, 0f, sprite.getWidth(), sprite.getHeight());
		super.setColor(new Color(1f, 1f, 1f, 1f));
		sprite.setColor(getColor());
	}
	
	@Override
	public void act(float delta)
	{
		super.act(delta);
		/*
		this.sprite.setX(getX());
		this.sprite.setY(getY());
		this.sprite.setScale(getScaleX(), getScaleY());
		this.sprite.setOrigin(getOriginX(), getOriginY());
		this.sprite.setRotation(getRotation());
		this.sprite.setColor(getColor());
		*/
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha)
	{
		if (this.sprite != null)
		{
			this.sprite.draw(batch, parentAlpha);
		}
	}
	
	public float getAlpha()
	{
		return getColor().a;
	}
	
	@Override
	public Color getColor()
	{
		return super.getColor();
	}
	
	public void setAlpha(float a)
	{
		super.setColor(getColor().r, getColor().g, getColor().b, a);
		this.sprite.setAlpha(a);
	}
	
	@Override
	public void setColor(Color color)
	{
		super.setColor(color);
		this.sprite.setColor(color);
	}
	
	@Override
	public void setColor(float r, float g, float b, float a)
	{
		super.setColor(r, g, b, a);
		this.sprite.setColor(r, g, b, a);
	}
	
	public void setFlip(boolean flipX, boolean flipY)
	{
		this.sprite.setFlip(flipX, flipY);
	}
	
	@Override
	public void setHeight(float height)
	{
		super.setHeight(height);
		this.sprite.setSize(getWidth(), height);
	}
	
	public void setOriginCenter()
	{
		this.sprite.setOriginCenter();
		setOrigin(this.sprite.getOriginX(), this.sprite.getOriginY());
	}
	
	@Override
	public void setPosition(float x, float y)
	{
		super.setPosition(x, y);
		this.sprite.setPosition(x, y);
	}
	
	public void setRegion(TextureRegion tr)
	{
		this.sprite.setRegion(tr);
	}
	
	@Override
	public void setRotation(float degrees)
	{
		super.setRotation(degrees);
		this.sprite.setRotation(degrees);
	}
	
	@Override
	public void setScale(float scaleXY)
	{
		super.setScale(scaleXY);
		this.sprite.setScale(scaleXY);
	}
	
	@Override
	public void setScale(float scaleX, float scaleY)
	{
		super.setScale(scaleX, scaleY);
		this.sprite.setScale(scaleX, scaleY);
	}
	
	@Override
	public void setScaleX(float scaleX)
	{
		super.setScaleX(scaleX);
		this.sprite.setScale(scaleX, getScaleY());
	}
	
	@Override
	public void setScaleY(float scaleY)
	{
		super.setScaleY(scaleY);
		this.sprite.setScale(getScaleX(), this.sprite.getScaleY());
	}
	
	@Override
	public void setSize(float width, float height)
	{
		super.setSize(width, height);
		this.sprite.setSize(width, height);
		setBounds(0f, 0f, width, height);
	}
	
	@Override
	public void setWidth(float width)
	{
		super.setWidth(width);
		this.sprite.setSize(width, getHeight());
	}
	
	@Override
	public void setX(float x)
	{
		this.sprite.setX(x);
		super.setX(x);
	}
	
	@Override
	public void setY(float y)
	{
		this.sprite.setY(y);
		super.setY(y);
	}
}
