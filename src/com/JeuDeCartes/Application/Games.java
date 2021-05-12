package com.JeuDeCartes.Application;

import com.JeuDeCartes.controller.GameController;
import com.JeuDeCartes.model.Deck;
import com.JeuDeCartes.view.View;

public class Games
{

	public static void main(String args[])
	{
		GameController gc = new GameController(new Deck(), new View());
		gc.run();
	}
}
