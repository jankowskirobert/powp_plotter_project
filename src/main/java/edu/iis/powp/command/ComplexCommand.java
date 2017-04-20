package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

	private IPlotter plotterDriver;
	List<PlotterCommand> commands = new ArrayList<>();

	public ComplexCommand(IPlotter plotterDriver) {
		super();
		this.plotterDriver = plotterDriver;
	}

	public ComplexCommand() {
		super();
	}

	@Override
	public void execute() {
		for (PlotterCommand plotterCommand : commands) {
			plotterCommand.setDriver(plotterDriver);
			plotterCommand.execute();
		}
	}

	public void addCommand(PlotterCommand command) {
		commands.add(command);
	}

	public void removeCommand(PlotterCommand command) {
		commands.remove(command);
	}

	public PlotterCommand getCommand(int position) {
		return commands.get(position);
	}

	@Override
	public void setDriver(IPlotter plotter) {
		this.plotterDriver = plotter;
	}

}
