package com.shopping_web;
/**
 * The class decrible CPU core
 * This class do not offer method of editing core info
 * Must initilize them in constructor
 */
public class CPUCore 
{
    private boolean supportHyperThread;
    private int baseClock;
    private int overClock;
    /**
     * 
     * @param supportHyperThread
     * @param baseClock in Mhz
     * @param overClock int Mhz
     * 
     */
    public CPUCore(boolean supportHyperThread,int baseClock,int overClock)
    {
        this.supportHyperThread=supportHyperThread;
        this.baseClock=baseClock;
        this.overClock=overClock;
    }
    public boolean getIfSupportHyperThread()
    {
        return this.supportHyperThread;
    }
    public int getBaseClock()
    {
        return this.baseClock;
    }
    public int getOverClock()
    {
        return this.overClock;
    }

}
