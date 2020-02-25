package com.epam.SimpleInterestAndCompoundInterest;

import java.text.DecimalFormat;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculation {
    private static Logger LOGGER = LogManager.getLogger(Calculation.class);
    private double principalAmount;
    private double rateOfInterest;
    private double time;
    private double simpleInterest;
    private double compoundInterest;
    DecimalFormat decimalFormat = new DecimalFormat("0.00");
   public void inputValues(){
        Scanner input = new Scanner(System.in);
       LOGGER.info("Enter principal, Rate of interest and Time");
        principalAmount = input.nextDouble();
        rateOfInterest = input.nextDouble();
         time = input.nextDouble();
    }
    public void calculateSimpleInterest(){
        simpleInterest= (principalAmount*time*rateOfInterest)/100;
    }
    public void calculateCompoundInterest(){
        compoundInterest= principalAmount * Math.pow(1.0+rateOfInterest/100.0,time) - principalAmount;
    }

    @Override
    public String toString() {
        return "Simple Interest=" + decimalFormat.format(simpleInterest) +
                ", Compound Interest=" + decimalFormat.format(compoundInterest);
    }
}
