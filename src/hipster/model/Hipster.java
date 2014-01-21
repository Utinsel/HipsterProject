package hipster.model;
/**
 * Creates the Hipster object.
 * @author Berry Echols
 * @version 1.3 11/20/13 Added getter/setters, overloaded constructor for additional hipsters, documentation comments.
 */

public class Hipster
{
	/**
	 * The name of the Hipster
	 */
	private String name;
	/**
	 * The type of the Hipster.
	 */
	private String hipsterType;
	/**
	 * The Hipster's catch-phrase.
	 */
	private String hipsterPhrase;
	/**
	 * The collection of the Hipster's books.
	 */
	private String [] hipsterBooks;
	
	/**
	 * Creates a default Hipster object with values based on me.
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Berry";
		hipsterType = "Student Hipster";
		hipsterPhrase = "Radical";
		
		fillTheBooks();
	}
	
	/**
	 * Creates a Hipster object with the specified parameters to fill in the component data members.
	 * @param name The name of the created Hipster.
	 * @param hipsterType The type of the created Hipster.
	 * @param hipsterPhrase The catch-phrase of this created Hipster.
	 * @param hipsterBooks An array of books for the Hipster
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase, String [] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}
	
	/**
	 * Getter method to get the name.
	 * @return The name of the Hipster.
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Getter method for the type of Hipster.
	 * @return The Hipster type.
	 */
	public String getHipsterType()
	{
		return hipsterType;
	}
	/**
	 * Getter method for the Hipster phrase.
	 * @return The catch-Phrase for the Hipster.
	 */
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}
	/**
	 * Getter method for the array of Hipster books.
	 * @return The array of Hipster books.
	 */
	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}
	/**
	 * Setter method to change the name of the Hipster.
	 * @param name The new name value for the Hipster.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * Setter method to change the type of the Hipster.
	 * @param hipsterType The new type of Hipster.
	 */
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}
	/**
	 * Setter method to change the phrase of the Hipster.
	 * @param hipsterPhrase The new phrase for the Hipster.
	 */
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}
	/**
	 * Setter method for the array of books for the Hipster.
	 * @param hipsterBooks The new array of books for the Hipster
	 */
	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
	/**
	 * Helper method to fill the book array for the Hipster.
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Oxford Dictionary";
		hipsterBooks[1] = "The Hipster Handbook";
		hipsterBooks[2] = "On the Road";
		hipsterBooks[3] = "The Catcher in the Rye";
		hipsterBooks[4] = "The Perks of Being a Wallflower";
	}
}
