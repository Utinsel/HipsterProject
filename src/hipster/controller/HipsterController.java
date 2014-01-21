package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

/**
 * Controller for the Hipster project.
 * @author Berry Echols
 * @version 1.1 added constructor information.
 */
public class HipsterController
{
	private HipsterFrame appFrame;
	private Hipster selfHipster;
	private Hipster [] classHipsters;
	public Hipster[] getClassHipsters()
	{
		return classHipsters;
	}

	public void setClassHipsters(Hipster[] classHipsters)
	{
		this.classHipsters = classHipsters;
	}

	private int hipsterCount;
	
	public HipsterController()
	{
		selfHipster = new Hipster();
		classHipsters = new Hipster [5];
		hipsterCount = 0;
	}
	
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}
	
	/**
	 * Replacing the current Hipster.
	 * @param selfHipster The new Hipster to set
	 */
	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}
	
	/**
	 * Used to start the application GUI for the Hipster program.
	 */
	public void start()
	{
		appFrame = new HipsterFrame(this);
	}
	
	/**
	 * Retrieves the Hipster from the specified position in the array.
	 * @param position The location in the array. It must be between 0 and classHipsters.length.
	 * @return The Hipster at the position in the array.
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;
		
		if(position < classHipsters.length && position >= 0)
		{
			currentHipster = classHipsters[position];
		}
		
		return currentHipster;
	}
	
	/**
	 * Used to retrieve a random Hipster object from the array of class Hipsters.
	 * @return
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;
		
		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random * classHipsters.length);
		currentHipster = classHipsters[randomIndex];
		
		return currentHipster;
	}
	
	/**
	 * Creates and adds a Hipster to the array of class Hipsters from the specified values.
	 * @param books
	 * @param name
	 * @param type
	 * @param phrase
	 */
	public void addHipster(String [] books, String name, String type, String phrase)
	{
		if(hipsterCount < classHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			classHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "THe class is full, you are too mainstream to be added");
		}
	}
}
