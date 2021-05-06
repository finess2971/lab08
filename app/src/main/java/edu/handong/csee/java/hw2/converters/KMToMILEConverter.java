package edu.handong.csee.java.hw2.converters;

/**
 * make KM to MILE converter follow the interface
 */
public class KMToMILEConverter implements Convertible{
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
     * convert KM to MILE
     */
    public void convert(){
        Value = Value/1.6;
    }
}
