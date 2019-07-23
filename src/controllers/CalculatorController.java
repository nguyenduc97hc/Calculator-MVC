package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String greeting(){
        return "index";
    }
    @GetMapping("/calculating")
    public  String calculating(@RequestParam double firstOperand ,@RequestParam double secondOperand , @RequestParam String operator , Model model){
        double result = 0;
        switch (operator){
            case "+":
                result = firstOperand +secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand/secondOperand;
                break;
        }
        model.addAttribute("firstOperand",firstOperand);
        model.addAttribute("secondOperand" , secondOperand);
        model.addAttribute("operator",operator);
        model.addAttribute("result",result);
        return "calculator";
    }
}
