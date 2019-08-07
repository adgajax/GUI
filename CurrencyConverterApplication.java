/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverterapplication;

/**
 *
 * @author Ajax
 */
public class CurrencyConverterApplication {
private static final double USARate = 69.01;
    private static final double CanadaRate = 52.74;
    private static final double UKRate = 77.42;
    private static final double KuwaitRate = 226.72;
    
    public static final int IndiaCode = 0;
    public static final int USACode = 1;
    public static final int CanadaCode = 2;
    public static final int UKCode = 3;
    public static final int KuwaitCode = 4;
    /**
     * @param args the command line arguments
     */
    public double convert (int countryCode, double amount) {
        double result = 0.0;
        switch (countryCode) {
            case 1 : // USA
                result = amount * USARate;
                break;
            case 2 : // Canada
                result = amount * CanadaRate;
                break;                
            case 3 : // UK
                result = amount * UKRate;
                break;                
            case 4 : // Kuwait
                result = amount * KuwaitRate;
                break;                
            default: // do nothing; simply return 0.0
        }
        return adjust (result);
    }

/**
 * This method converts the given amount in a currency of the country
 * indicated as 'From' parameter into currency of the country indicated
 * in the 'To' parameter. It first converts the currency into Indian rupees
 * and then converts back into the other country.
 * @param fromCountryCode the integer representing the 'from' country code.
 * @param toCountryCode the integer representing the 'to' country code.
 * @param amount the amount to be converted.
 * @return the converted amount in the currency of 'to' country code.
 */
    public double convertFromTo (int fromCountryCode, 
                                 int toCountryCode,
                                 double amount) {
        double result = 0.0;
        switch (fromCountryCode) {
            case 1 : // USA
                result = amount * USARate;
                break;
            case 2 : // Canada
                result = amount * CanadaRate;
                break;                
            case 3 : // UK
                result = amount * UKRate;
                break;                
            case 4 : // Kuwait
                result = amount * KuwaitRate;
                break;                
            default: result = 0.0; // invalid country code
        }
        
        switch (toCountryCode) {
            case 1 : // USA
                result = result / USARate;
                break;
            case 2 : // Canada
                result = result / CanadaRate;
                break;                
            case 3 : // UK
                result = result / UKRate;
                break;                
            case 4 : // Kuwait
                result = result / KuwaitRate;
                break;                
            default: result = 0.0; // invalid country code
        }        
        return adjust (result);
    }

/**
 * This method converts the given double value into two decimal digits.
 * @param inputValue the amount to be adjusted.
 * @return the adjusted value in two decimal digits.
 */
    
    public double adjust (double inputValue) {
        return ((int)(inputValue * 100.00)) / 100.0;
    }
}
