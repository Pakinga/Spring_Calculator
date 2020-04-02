package com.calculator.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @RequestMapping(value="/skaiciuoti", method = RequestMethod.GET)
    public double  skaiciuoti(@RequestParam(value = "sk1") double sk1,
                           @RequestParam(value = "sk2") double sk2,
                           @RequestParam(value = "zenklas") String zenklas){
        double skaiciuoti=0;
        if (zenklas.equals("/")) {
            skaiciuoti = sk1 / sk2;
        } else if (zenklas.equals("*")) {
            skaiciuoti = sk1 * sk2;
        } else if (zenklas.equals("-")) {
            skaiciuoti = sk1 - sk2;
        } else if (zenklas.equals(" ")) { // URL " " nuskaito kaip +
            skaiciuoti = sk1 + sk2;
        }
        return skaiciuoti;
    }

}
