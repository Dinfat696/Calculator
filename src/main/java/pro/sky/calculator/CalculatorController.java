package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final  CalculatorService calculator;
    public CalculatorController(CalculatorService calculator){
        this.calculator=calculator;
    }
    @GetMapping(path = "/")
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String add(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if(num2==0){
            return "Делить на 0 нельзя";
        }
        return num1 + " / " + num2 + " = " + (num1 /(double)num2);
    }
}
