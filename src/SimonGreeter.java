
public class SimonGreeter extends Greeter{
	public SimonGreeter(String greeter) {
		super(greeter);
	}
	
	@Override
	public String greet(String name) {
		return "Simon Says, " + "\"" + super.greet(name)+"\"";
}


}
