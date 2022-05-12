import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreeterAppTest {

	@Test
	void greeterTestName() {
		Greeter greeterTestGreet = new Greeter("Sup");
		String result1 = greeterTestGreet.greet("Thundercat");
		String result2 = greeterTestGreet.greet("Flying Lotus");
		
		
		assertEquals("Sup, Thundercat!" , result1);
		assertEquals("Sup, Flying Lotus!", result2);
	}

	@Test
	void greeterTestGreet() {
		Greeter greeterTestGreet1 = new Greeter("E kaaro");
		Greeter greeterTestGreet2 = new Greeter("E kaabo");
		String result1 = greeterTestGreet1.greet("Folake");
		String result2 = greeterTestGreet2.greet("Folake");
		
		assertEquals("E kaaro, Folake!", result1);
		assertEquals("E kaabo, Folake!", result2);
	}
	
	@Test
	void greeterSimon1() {
		SimonGreeter greeterTestSimon = new SimonGreeter("Hey");
		String result = greeterTestSimon.greet("Emanuelle");
		assertEquals("Simon Says, \"Hey, Emanuelle!\"" , result);
	}
	
	@Test
	void greeterSimon2() {
		SimonGreeter greeterTestSimon = new SimonGreeter("Hallo");
		String result = greeterTestSimon.greet("Gunter");
		assertEquals("Simon Says, \"Hallo, Gunter!\"" , result);
	}
	
	@Test
	void greeterLilLoud() {
		LoudGreeter greeterTestLoud = new LoudGreeter("Yo");
		String result = greeterTestLoud.greet("Bryson");
		assertEquals("Yo, Bryson!!" , result);
	}
	
	@Test
	void greeterExtraLoud() {
		LoudGreeter greeterTestLoud = new LoudGreeter("Yo");
		greeterTestLoud.addVolume();
		greeterTestLoud.addVolume();
		String result = greeterTestLoud.greet("Bryson");
		assertEquals("Yo, Bryson!!!!" , result);
	}
	
	@Test
	void greeterHmtlEmptyTag() {
		HtmlGreeter emptyTag = new HtmlGreeter("Konichiwa");
		String result = emptyTag.greet("Zeus");
		assertEquals("<h1>Konichiwa, Zeus!</h1>", result);
	}
	
	@Test
	void greeterHmtlAssignTag() {
		HtmlGreeter emptyTag = new HtmlGreeter("Konichiwa","b1");
		String result = emptyTag.greet("Zeus");
		assertEquals("<b1>Konichiwa, Zeus!</b1>", result);
	}
}
