package art.controller;

import art.view.ArtFrame;
import art.view.ArtPanel;
import art.view.ShapeCanvas;

import javax.swing.JOptionPane;

public class ArtController
{
	
	private ArtFrame appFrame;
	
	public ArtController()
	{
		super();
		this.appFrame = appFrame;
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Welcome to art!");
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	
	public ArtFrame getFrame()
	{
		return appFrame;
	}
}
