package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandLineToPosition implements PlotterCommand {

	private IPlotter plotterDriver;
	private int toPositionX;
	private int toPositionY;
	private int fromPositionX;
	private int fromPositionY;

	public CommandLineToPosition(int toPositionX, int toPositionY, int fromPositionX, int fromPositionY) {
		super();
		this.toPositionX = toPositionX;
		this.toPositionY = toPositionY;
		this.fromPositionX = fromPositionX;
		this.fromPositionY = fromPositionY;
	}

	@Override
	public void execute() {
		plotterDriver.setPosition(fromPositionX, fromPositionY);
		plotterDriver.drawTo(toPositionX, toPositionY);
	}

	@Override
	public void setDriver(IPlotter plotter) {
		this.plotterDriver = plotter;
	}

}
