package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterCommand {

	private IPlotter plotterDriver;
	private int toPositionX;
	private int toPositionY;
	
	public CommandSetPosition(int toPositionX, int toPositionY) {
		super();
		this.toPositionX = toPositionX;
		this.toPositionY = toPositionY;
	}

	@Override
	public void execute() {
		plotterDriver.setPosition(toPositionX, toPositionY);		
	}

	@Override
	public void setDriver(IPlotter plotter) {		
		this.plotterDriver = plotter;
	}

}
