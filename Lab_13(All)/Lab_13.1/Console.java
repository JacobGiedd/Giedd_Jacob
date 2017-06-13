import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Console extends GameSystems
{
	public abstract String getController();
	
	public Console()
	{
		super();
	}
	
	public Console(String p)
	{
		super(p);
	}

	public String toString()
	{
		return "Platform: " + super.getPlatform() +
		       "\nSerial #: " + super.getSerialNo() +
			   "\nController: " + getController();
	}
}