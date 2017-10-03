package list.controller;

import java.util.List;
import java.util.ArrayList;
import list.model.Kahoot;

public class ListController
{
	private List<Kahoot> myKahoots;
	
	public ListController()
	{
		myKahoots = new ArrayList<Kahoot>();
		
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
	}
	
	private void fillTheList()
	{
		Kahoot quiz = new Kahoot("Quizzy", 5);
		myKahoots.add(quiz);
		
	}
}
