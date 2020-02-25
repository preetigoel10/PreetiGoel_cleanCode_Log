package com.epam.HouseConstructionCost;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost {
    private static Logger LOGGER = LogManager.getLogger(ConstructionCost.class);
    private String materialChoice;
    private double totalAreaOfHouse;
    private boolean fullyAutomatedHome = false;
    private double costOfConstruction;

    public void inputValues(){
        Scanner input = new Scanner(System.in);
        LOGGER.info("Enter area:");
        totalAreaOfHouse = input.nextDouble();

        LOGGER.info("Type 'standard' to use STANDARD materials\nType 'above' to use ABOVE standard materials\nType 'high' to use HIGH standard material");
        materialChoice= input.next().toLowerCase();

        if(materialChoice.contains("high")) {
            LOGGER.info("Do you want a fully automated house? (True/False)");
            fullyAutomatedHome = input.nextBoolean();
        }
    }

    public void costCalculation(){
        if(materialChoice.contains("standard")) {
            StandardMaterial standardMaterial= new StandardMaterial();
            costOfConstruction = standardMaterial.getPriceOfMaterial()*totalAreaOfHouse;
        }
        else if(materialChoice.contains("above")){
            AboveStandardMaterial aboveStandardMaterial = new AboveStandardMaterial();
            costOfConstruction = aboveStandardMaterial.getPriceOfMaterial()*totalAreaOfHouse;
        }
        else if(materialChoice.contains("high"))
        {
            if(!fullyAutomatedHome) {
                HighStandardMaterial highStandardMaterial = new HighStandardMaterial();
                costOfConstruction = highStandardMaterial.getPriceOfMaterial() * totalAreaOfHouse;
            }
            else{
                HighStandardMaterialAndFullyAutomated highStandardMaterialAndFullyAutomated = new HighStandardMaterialAndFullyAutomated();
                costOfConstruction = highStandardMaterialAndFullyAutomated.getPriceOfMaterial()*totalAreaOfHouse;
            }
        }
    }

    @Override
    public String toString() {
        return "Choice of Material='" + materialChoice + '\'' +
                ", Total Area Of House=" + totalAreaOfHouse +
                ", Fully Automated Home=" + fullyAutomatedHome +
                ", \nCost Of Construction=" + costOfConstruction ;
    }
}
