package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping
    public String calculator() {
        return "Добро пожаловать в калькулятор.";
    }

}
