package design.pattern.FactoryMethod.product;


import design.pattern.FactoryMethod.Computer;
import org.springframework.stereotype.Component;

@Component
public class Pc implements Computer {
	@Override
	public String getComputerName() {
		return "Personal Computer";
	}
	@Override
	public String setname() {
		return "Son's PC";
	}
	@Override
	public String specification() {
		return "This is Personal Computer";
	}
}
