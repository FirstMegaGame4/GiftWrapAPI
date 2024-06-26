package net.neoforged.neoforge.client.event;

import net.minecraft.client.gui.screen.Screen;
import net.neoforged.bus.api.Event;

public class ScreenEvent extends Event
{
	private final Screen screen;
	
	public ScreenEvent(Screen screen)
	{
		this.screen = screen;
	}
	
	public Screen getScreen()
	{
		return screen;
	}
	
	public static abstract class Init extends ScreenEvent
	{
		public Init(Screen screen)
		{
			super(screen);
		}
		
		public static class Post extends Init
		{
			public Post(Screen screen)
			{
				super(screen);
			}
		}
	}
}
