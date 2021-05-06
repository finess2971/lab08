package edu.handong.csee.java.hw2.converters;

/**
 * make MILE to KM converter follow the interface
 */
public class MILEToKMConverter implements Convertible{
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
     * convert MILE to KM
     */
    public void convert(){
        Value = 1.6*Value;
    }
}
