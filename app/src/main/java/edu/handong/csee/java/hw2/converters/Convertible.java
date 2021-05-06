package edu.handong.csee.java.hw2.converters;

/**
 * set interface
 */
public interface Convertible {

    /**
     * get original value
     * @param fromValue original value
     */
    public void setFromValue(double fromValue);

    /**
     * return converted value
     * @return converted value
     */
    public double getConvertedValue();

    /**
     * convert KM to M
     */
    public void convert();
}