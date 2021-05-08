package main;

import abstracts.CostumerManagerBase;
import adapter.CheckMernisService;
import concretes.NeroCostumerManger;
import concretes.StarbucksCostumerManager;
import entities.*;

public class Main {

    public static void main(String[] args) {
        CostumerManagerBase costumerManagerBase = new StarbucksCostumerManager(new CheckMernisService());
        Costumer costumer = new Costumer("Mahammad", "Abdullayev", "31.07.2001", "&KA1CYR");

        costumerManagerBase.save(costumer);
    }
}
