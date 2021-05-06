package edu.handong.csee.java.hw2.converters;

/**
 * make TON to G converter follow the interface
 */
public class TONToGConverter implements Convertible{
    private double Value;
    
    /**
     * get original value
     * @param fromValue original value 
     */    
    public void setFromValue(double fromValue){
        Value = fromValue;
    }

    /**
     * return converted value
     * @return converted value
     */    
    public double getConvertedValue(){
        return Value;
    }

    /**
     * convert TON to G
     */    
    public void convert(){
        Value = 1000000*Value;
    }
}
