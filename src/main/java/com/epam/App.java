package com.epam;

import com.epam.HouseConstructionCost.ConstructionCost;
import com.epam.SimpleInterestAndCompoundInterest.Calculation;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
        /*SIMPLE INTEREST AND COMPOUND INTEREST PROGRAM EXECUTION*/
        Calculation calculation = new Calculation();
        calculation.inputValues();
        calculation.calculateSimpleInterest();
        calculation.calculateCompoundInterest();
        System.out.println(calculation);

        /*COST OF HOUSE CONSTRUCTION PROGRAM EXECUTION*/
        ConstructionCost constructionCost = new ConstructionCost();
        constructionCost.inputValues();
        constructionCost.costCalculation();
        System.out.println(constructionCost);

    }
}
