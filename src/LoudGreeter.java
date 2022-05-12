
public class LoudGreeter extends Greeter {
	private String extra = "!";
	
	public LoudGreeter(String greeter) {
		super(greeter);
	}

	public void addVolume() {
		extra += "!";
	}
	
	@Override
	public String greet(String name) {
		
		return super.greet(name)+extra;
	}
}
