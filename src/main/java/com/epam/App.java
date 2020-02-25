package com.epam;

import com.epam.HouseConstructionCost.ConstructionCost;
import com.epam.SimpleInterestAndCompoundInterest.Calculation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;

public class App 
{
    private static Logger LOGGER = LogManager.getLogger(App.class);

    public static void main( String[] args )throws IOException
    {
        /*SIMPLE INTEREST AND COMPOUND INTEREST PROGRAM EXECUTION*/
        Calculation calculation = new Calculation();
        calculation.inputValues();
        calculation.calculateSimpleInterest();
        calculation.calculateCompoundInterest();
        LOGGER.info(calculation);

        /*COST OF HOUSE CONSTRUCTION PROGRAM EXECUTION*/
        ConstructionCost constructionCost = new ConstructionCost();
        constructionCost.inputValues();
        constructionCost.costCalculation();
        LOGGER.info(constructionCost);

    }
}
