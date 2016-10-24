package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatViewer;

public class ChatbotController

{
	private Chatbot stupidBot;
	private ChatViewer chatView;
	
	public ChatbotController()
	{
		stupidBot = new Chatbot("SHOOT ME IN THE FACE!!! THE FACE!!");
		chatView = new ChatViewer();
	}
	
	
	
	
	public void start()
	{
		String response = "talking to you";
		
		while(stupidBot.lengthChecker(response))
		{
			response = chatView.collectResponse("Do you want to play a game?");
		}
	}
}
