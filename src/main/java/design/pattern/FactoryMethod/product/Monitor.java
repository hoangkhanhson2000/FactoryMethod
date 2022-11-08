package design.pattern.FactoryMethod.product;


import design.pattern.FactoryMethod.Computer;
import org.springframework.stereotype.Component;

@Component
public class Monitor implements Computer {


	@Override
	public String setname() {
		return "Monitor A";
	}
	@Override
	public String specification() {
		return "This is Monitor";
	}

}
