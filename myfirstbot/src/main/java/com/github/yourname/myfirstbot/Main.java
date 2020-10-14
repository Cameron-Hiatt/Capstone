package com.github.yourname.myfirstbot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;


public class Main 
{
	public static void main(String[] args)
	{
		DiscordApi api = new DiscordApiBuilder().setToken("NzY1OTc1MTU3MzY5NDcxMDM2.X4cn9A.qGOgvKDENorXYRTW4CIaal9VkQk").login().join();
		
		//uncomment this if you need an invite link for the bot to join a server. 
		//System.out.println(api.createBotInvite());
		
		api.addMessageCreateListener(event -> {
		    if (event.getMessageContent().equalsIgnoreCase("!ping")) 
		    {
		        event.getChannel().sendMessage("Pong!");
		    }
		});
		
		
	}//end of main() method
	
}//end of class Main
