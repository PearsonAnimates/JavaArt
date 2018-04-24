package art.controller;

import art.view.ArtFrame;
import art.view.ArtPanel;

import javax.swing.JOptionPane;

public class ArtController
{
	
	private ArtFrame appFrame;
	
	public ArtController()
	{
		super();
	}
	
	public void start()
	{
		appFrame = new ArtFrame(this);
		JOptionPane.showMessageDialog(appFrame, "Welcome to art!");
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
}
