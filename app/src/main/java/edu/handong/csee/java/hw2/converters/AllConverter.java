package edu.handong.csee.java.hw2.converters;

/**
 * convert KM to M, MILE. convert TON to KG, G. convert MILE to KM.
 */
public class AllConverter {
    private double originValue;
    private String OM;

/**
 * get original value
 * @param fromValue original value.
 * @return chaning method.
 */
    public AllConverter setFromValue(double fromValue){
        this.originValue = fromValue;
        return this;
    }

/**
 * get original measure
 * @param originMeasure original measure
 * @return chaning method
 */
    public AllConverter setOriginalMeasure(String originMeasure){
        this.OM = originMeasure;
        return this;
    }

/**
 * convert values and print them.
 * @return chaning method
 */
    public AllConverter convertAndPrintOut(){
        if(OM.equals("KM")){
            System.out.println(originValue + " " + OM + " to " + originValue*1000 + " M");
            System.out.println(originValue + " " + OM + " to " + originValue/1.6 + " MILE");
        }else if(OM.equals("TON")){
            System.out.println(originValue + " " + OM + " to " + originValue*1000 + " KG");
            System.out.println(originValue + " " + OM + " to " + originValue*1000000 + " G");
        }
        else if(OM.equals("MILE")){
            System.out.println(originValue + " " + OM + " to " + originValue*1.6 + " KM");
        }else{
            System.out.println("AllConverter cannot support the measure!");
        }
        return this;
    }
}
