package com.company;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util. *;
public class Electronic{
    private String name;
    private Double cost;


    Electronic() { }
    Electronic(String name, Double cost){
        this.name = name;
        this.cost = cost;
    }

    String getName(){
        return this.name;
    }

    Double getCost(){
        return this.cost;
    }

    public List<Electronic> getAllElectronics(){
        List<Electronic> electronicList = new ArrayList<Electronic>();
        electronicList.add(new Electronic("Onida Fire TV",21990.0));
        electronicList.add(new Electronic("IPhone 11",55999.0));
        electronicList.add(new Electronic("HP Pavilion",63990.0));
        electronicList.add(new Electronic("Canon EOS 1500D",24990.0));
        electronicList.add(new Electronic("Mi Smart Band",2498.0));
        electronicList.add(new Electronic("Lenovo ThinkPad",58990.0));
        electronicList.add(new Electronic("OnePlus Nord 5G",27999.0));
        electronicList.add(new Electronic("Tp-Link Smart Cam",2099.0));
        electronicList.add(new Electronic("Boat Wireless Headphone",2499.0));
        electronicList.add(new Electronic("Samsung Galaxy Tab A7",16999.0));
        electronicList.add(new Electronic("JBL Cinema SB261",12999.0));
        electronicList.add(new Electronic("Asus VA24EHE",11998.0));
        electronicList.add(new Electronic("Acer Nitro 5",53990.0));
        return electronicList;
    }

    public List<Electronic> filterProducts(Double price){
        return getAllElectronics().stream().filter(p->p.getCost() <= price).collect(Collectors.toList());
    }

}
