package design.pattern.FactoryMethod;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class FactoryMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryMethodApplication.class, args);
		System.out.println("Please Enter Your Type:(laptop/pc/monitor:)");
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		String type = "";
		try {
			type = dataIn.readLine();
		} catch (IOException e) {
			System.out.println("Error!");
		}
		Computer computer = ComputerFactory.getComputer(ComputerType.valueOf(type));
		System.out.println(computer.specification()+"/ "+computer.setname());
	}

}
