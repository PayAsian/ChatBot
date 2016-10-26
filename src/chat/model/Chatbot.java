package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided.
 * Students will complete methods as part 
 * * of the project. 
 * * @author Peyton Trevino 
 * * @version 1.0 10/14/16
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;

	/**
	 * * Creates an instance of the Chatbot with the supplied username. * @param
	 * userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		this.politicalTopicList = new ArrayList<String>();
		this.memesList = new ArrayList<String>();
		this.userName = new String(userName);
		this.content = new String("Snowboarding");
		this.buildMemesList();
		this.buildPoliticalTopicList();
	
	}

	private boolean buildMemesList()
	{
		
		boolean buildMemesList;
		
		boolean MemesList = false;
		
		return MemesList;
		
	}

	private boolean buildPoliticalTopicList()
	{
		boolean buildPoliticalTopicLists;
		
		boolean PoliticalTopicList = false;
		
		return PoliticalTopicList;
	}

	/**
	 * * Checks the length of the supplied string. Returns false if the supplied
	 * String is empty or null, otherwise returns true. * @param currentInput * @return
	 * A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if (currentInput !=null && currentInput.length() > 0)
		{
			hasLength = true;
		}
		return hasLength;
	}

	/**
	 * * Checks if the supplied String matches the content area for this Chatbot
	 * instance.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether it
	 *            matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false; 
		
		if(currentInput.contains(content))
		{
			hasContent = true;
		}
		
		return hasContent;
	}

	/**
	 * * Checks if supplied String matches ANY of the topics in the
	 * politicalTopicsList. Returns true if it does find a match and false if it
	 * does not match.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. *
	 *             @return Whether the
	 *            String is contained in the ArrayList.
	 */

	public boolean politicalTopicChecker(String currentInput)
	{
		boolean haspoliticalTopicChecker = false;
		
		if(haspoliticalTopicChecker.contains(PoliticalTopicList))
		{
			haspoliticalTopicChecker = true;
		}
		return haspoliticalTopicChecker;
	}

	/**
	 * * Checks to see that the supplied String value is in the current
	 * memesList variable.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether the
	 *            supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentString)
	{
		boolean hasmemeChecker = false;
		
		if(hasmemeChecker.contains(MemesList))
		{
			hasmemeChecker =  true;
		}
		
		return MemesList;
	}

	/**
	 * * Returns the username of this Chatbot instance. * @return The username
	 * of the Chatbot.
	 */
	public String getUserName()
	{
		return null;
	}

	/**
	 * * Returns the content area for this Chatbot instance. * @return The
	 * content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return null;
	}

	/**
	 * * Getter method for the memesList object. * @return The reference to the
	 * meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}

	/**
	 * * Getter method for the politicalTopicList object. 
	 * * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}

	/**
	 * * Updates the content area for this Chatbot instance. 
	 * * @param content
	 * The updated value for the content area.
	 */
	public void setContent(String content)
	{
	}

}