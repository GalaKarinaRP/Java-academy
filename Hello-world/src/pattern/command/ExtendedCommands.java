package pattern.command;

import java.time.Duration;

public class ExtendedCommands extends Command {
	
	
	protected ExtendedCommands(Duration duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}	

	@Override
	public void run() {
		System.out.println("Hello from extended command");
	}	
	
	public final static void main(String[] args) {
		Command command = new ExtendedCommands(Duration.parse("pt1s"));	
		System.out.println(command.timeToRun());
		command.run();
	}
	

}
