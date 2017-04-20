package edu.iis.powp.events.predefine.figureslisteners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.PlotterCommand;

public class SelectTestFigureOptionCommandListener implements ActionListener
{

	private PlotterCommand command;
	
	
    public SelectTestFigureOptionCommandListener(PlotterCommand command) {
		super();
		this.command = command;
	}


	@Override
    public void actionPerformed(ActionEvent e)
    {
		command.setDriver(Application.getComponent(DriverManager.class).getCurrentPlotter());
       command.execute();
        
    }
}
