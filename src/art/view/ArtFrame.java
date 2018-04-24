package art.view;

import javax.swing.JFrame;
import art.controller.ArtController;
import art.view.ArtPanel;
import art.view.ShapeCanvas;

public class ArtFrame extends JFrame
{
	private ArtController app;
	private ArtPanel appPanel;
	
	public ArtFrame(ArtController app)
	{
		super();
		appPanel = new ArtPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1200, 700);
		this.setContentPane(appPanel);
		this.setTitle("Creating modern art in java");
		this.setVisible(true);
	}
	
	public ArtPanel getFrame()
	{
		return appPanel;
	}
}
