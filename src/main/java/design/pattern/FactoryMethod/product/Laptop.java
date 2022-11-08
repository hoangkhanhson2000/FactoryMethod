package design.pattern.FactoryMethod.product;

import design.pattern.FactoryMethod.Computer;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {


	@Override
	public String setname() {
		return "Lenovo Legion Y540";
	}
	@Override
	public String specification() {
		return "This is Laptop";
	}

}
