package design.pattern.FactoryMethod.FactoryController;

import design.pattern.FactoryMethod.Computer;
import design.pattern.FactoryMethod.ComputerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactoryController {

	@GetMapping("/computer/{computer-type}")
	public String getComputerTypeInfo(@PathVariable("computer-type") String computer) throws Exception {

		Computer computerFactory = ComputerFactory.createInstance(computer);
		return computerFactory.specification()+" .Name:"+computerFactory.setname();
	}

}
