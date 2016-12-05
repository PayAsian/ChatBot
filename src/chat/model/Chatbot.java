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
	private String buildMemeslist;
	private String buildPoliticalTopicList;
	private String memeChecker;
	private String politicalTopicChecker; 

	

	/**
	 * * Creates an instance of the Chatbot with the supplied username. 
	 * * @param
	 * userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		this.politicalTopicList = new ArrayList<String>();
		this.memesList = new ArrayList<String>();
		this.userName = new String(userName);
		this.content = new String("Snowboarding");
		this.buildMemeslist = new String();
		this.buildPoliticalTopicList = new String();
		this.politicalTopicChecker = new String();
		this.memeChecker = new String();
		
	
	}

	private boolean buildMemeslist(boolean memeslist)
	{
		boolean MemesList = false;
		if(buildMemeslist !=null && memesList.size() > 0 )
		{
			memeslist = true; 
		}
		return memeslist;
		
	}

	private boolean buildPoliticalTopicList(String politicaltopiclist)
	{
		boolean PoliticalTopicList = false;
		if(politicaltopiclist !=null && politicaltopiclist.length() > 0)
		{
			PoliticalTopicList = true; 
		}
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

	public boolean politicalTopicChecker(String politicalTopicChecker)
	{
		boolean haspoliticalTopicChecker = false;
		
		if(politicalTopicChecker.equals(politicalTopicList))
		{
			haspoliticalTopicChecker = true;
		}
		
		return haspoliticalTopicChecker;
	}

	/**
	 * * Checks to see that the supplied String value is in the current
	 * memesList variable.
	 * @param currentInput
	 * The supplied String to be checked. 
	 * * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String memesChecker)
	{
		boolean hasmemeChecker = false;
		
		if(memeChecker.contains((CharSequence) memesList))
		{
			hasmemeChecker = true;
		}
		
		return hasmemeChecker;
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
		return content;
	}

	/**
	 * * Getter method for the memesList object. 
	 * * @return The reference to the meme list.
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