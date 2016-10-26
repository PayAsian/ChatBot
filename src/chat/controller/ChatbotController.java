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
		
		String response = chatView.collectResponse("What do you want ot talk aobut today?????");
		
		while(stupidBot.lengthChecker(response))
		{
			response = chatView.collectResponse("Oh, you are interested in " + response);
			chatView.displayMessage(useChatbotCheckers(response));
		}
	
	if("".equals(""))
		{
		
		}
		
	}
	private String useChatbotCheckers(String input)
	{
		String answer = "";
		
		if(stupidBot.contentChecker(input))
		{
			answer += "\nYou know my special scret\n";
		}
		if(stupidBot.memeChecker(input))
		{
			answer += "\nI can has memes?\n";
		}
		if(answer.length() == 0)
		{
			answer += "sorry, i dont know about " + input;
		}
		return answer;
	}
}
