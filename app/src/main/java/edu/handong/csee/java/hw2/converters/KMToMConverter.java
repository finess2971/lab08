package edu.handong.csee.java.hw2.converters;

/**
 * make KM to M converter follow the interface
 */
public class KMToMConverter implements Convertible{
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
     * convert KM to M
     */
    public void convert(){
        Value = 1000*Value;
    }
}
