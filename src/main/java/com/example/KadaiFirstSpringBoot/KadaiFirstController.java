package com.example.KadaiFirstSpringBoot;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {
    
    @GetMapping("dayofweek/{val}")
    public String dispDayOfWeek(@PathVariable String val) {
       
        String today = val;
        String year = today.substring(0, 4);
        String month = today.substring(4, 6);
        String day = today.substring(6, 8);
        
        int intYear = Integer.parseInt(year);
        int intMonth = Integer.parseInt(month);
        int intDay = Integer.parseInt(day);
       System.out.println(intYear + "/" + intMonth + "/" + intDay); 
    Calendar cal = Calendar.getInstance();
    cal.set(intYear, intMonth-1, intDay);
    
    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
    
    String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    return weekDays[dayOfWeek-1];
    
    }
    
    
    @GetMapping("plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int sum = 0;
        sum = val1 + val2;
        return sum;
        
    }
    
    @GetMapping("minus/{val3}/{val4}")
    public int calcMinus(@PathVariable int val3, @PathVariable int val4) {
        int difference = 0;
        difference = val3 - val4;
        return difference;
        
    }

    @GetMapping("times/{val5}/{val6}")
    public int calcTimes(@PathVariable int val5, @PathVariable int val6) {
        int product = 0;
        product = val5 * val6;
        return product;
    
    }
    
    @GetMapping("divide/{val7}/{val8}")
    public int calcDivide(@PathVariable int val7, @PathVariable int val8) {
        int quotient = 0;
        quotient = val7 / val8;
        return quotient;
        
    }
    
}

