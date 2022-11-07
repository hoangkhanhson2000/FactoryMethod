package design.pattern.FactoryMethod;

import design.pattern.FactoryMethod.constants.ComputerTypeConstants;
import design.pattern.FactoryMethod.product.Laptop;
import design.pattern.FactoryMethod.product.Monitor;
import design.pattern.FactoryMethod.product.Pc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service

public class ComputerFactory {

    private final Monitor monitor;
    private final Pc pc;
    private final Laptop laptop;
    private static final Map<String, Computer> handler = new HashMap<>();
    private ComputerFactory(Monitor monitor, Pc pc, Laptop laptop) {


        this.pc = pc;
        this.laptop = laptop;
        this.monitor = monitor;
    }



    public static final Computer getComputer(ComputerType computerType) {
        switch (computerType) {

            case laptop:
                return new Laptop();

            case pc:
                return new Pc();
            case monitor:
                return new Monitor();

            default:
                throw new IllegalArgumentException("This computer type is unsupported");
        }
    }










    @PostConstruct
    private Map<String, Computer> getObject() {
        handler.put(ComputerTypeConstants.LAPTOP, laptop);
        handler.put(ComputerTypeConstants.PC, pc);
        handler.put(ComputerTypeConstants.MONITOR, monitor);

        return handler;
    }

    public static Computer createInstance(String computer) {
        return Optional.ofNullable(handler.get(computer)).orElseThrow(() -> new IllegalArgumentException("Invalid computer"));
    }




}
