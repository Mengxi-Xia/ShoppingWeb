package com.shopping_web;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * This class is the describtion of CPU
 */
public class CPU 
{
    
    private String model;
    private int coreClock; //In mhz
    private int performanceCoreNum;
    private int effiencyCoreNum;
    private int threadNum;
    private String brand;
    private double LOneCache;
    private double LTwoCache;
    private double LThreeCache;//All cache store in MB
    private ArrayList<CPUCore> coreGroup;
    /**
     * 
     * @param model
     * @param coreClock
     * @param performanceCoreNum
     * @param effiencyCoreNum
     * @param threadNum
     * @param brand
     * @param LOneCache
     * @param LTwoCache
     * @param LThreeCache
     * @param coreGroup A ArrayList contain CPU core, Type CPUCore
     */
    public CPU(String model,int coreClock,int performanceCoreNum,int effiencyCoreNum,int threadNum,String brand,double LOneCache,double LTwoCache,double LThreeCache,ArrayList<CPUCore> coreGroup)
    {
        this.model=model;
        this.coreClock=coreClock;
        this.performanceCoreNum=performanceCoreNum;
        this.effiencyCoreNum=effiencyCoreNum;
        this.threadNum=threadNum;
        this.brand=brand;
        this.LOneCache=LOneCache;
        this.LTwoCache=LTwoCache;
        this.LThreeCache=LThreeCache;
        /*
         * For the arraylist, copy all it's element
         */
        Iterator<CPUCore> arrIt=coreGroup.iterator();
        while(arrIt.hasNext())
        {
            this.coreGroup.add(arrIt.next());
        }
    }
    public String getModel()
    {
        return this.model;
    }
    public int getCoreClock()
    {
        return this.coreClock;
    }
    public int getPerformanceCoreNum()
    {
        return this.performanceCoreNum;
    }
    public int getEffiencyCoreNum()
    {
        return this.effiencyCoreNum;
    }
    public int getThreadNum()
    {
        return this.threadNum;
    }
    public String getBrand()
    {
        return this.brand;
    }
    /**
     * 
     * @param level Specify the level of caching
     * @return
     */
    public String getCacheInString(int level)
    {
        if(level==1)
        {
            return String.valueOf(this.LOneCache);
        }
        else if(level==2)
        {
            return String.valueOf(this.LTwoCache);
        }
        else
        {
            return String.valueOf(this.LThreeCache);
        }
    }
    /**
     * 
     * @param level Specify the level of caching
     * @param unit Specify the unit of return, in Kb, Mb
     * @return Double value of specify unit
     */
    public double getCacheInUnitDouble(int level,String unit) throws Exception
    {
        
        if(unit.equals("Kb"))
        {
            switch (level) 
            {
                case 1:
                    return this.LOneCache/1024;
                case 2:
                    return this.LTwoCache/1024;
                case 3:
                    return this.LThreeCache/1024;
            }
        }
        else
        {
            switch (level) 
            {
                case 1:
                    return this.LOneCache;
                case 2:
                    return this.LTwoCache;
                case 3:
                    return this.LThreeCache;
            }
        }
        return -1;
    }
    //TODO: Need to get set and ArrayList
}
