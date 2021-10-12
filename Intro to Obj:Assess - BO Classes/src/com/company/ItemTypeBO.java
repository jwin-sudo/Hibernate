package com.company;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ItemTypeBO {

    public ItemTypeBO(){

    }
    public Double calculateCost(Date start, Date end, ItemType typeIns){

        long diffInMillies = Math.abs(end.getTime() - start.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return diff*typeIns.costPerDay;
    }
}
