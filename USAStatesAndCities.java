
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usastatesandcities;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Ajax
 */
public class USAStatesAndCities {
 private ArrayList<String> states;
    private HashMap<String,ArrayList<String>> cities;
    
    public USAStatesAndCities () {
        states = new ArrayList<String>();
        cities = new HashMap<String, ArrayList<String>>();
        
        states.add ("California");
        states.add ("Florida");
        states.add ("New York");
        states.add ("Texas");
        states.add ("Washington");
        states.add ("Wisconsin");

        cities.put ("California", new ArrayList<String>(){
            {  add("Los Angeles");
               add("Sacramento");
               add("San Diego");
               add("San Jose");
               add("San Fransisco");
            }
        });
        cities.put ("Florida", new ArrayList<String>(){
            {  add("Jaconsonville");
               add("Miami");
               add("Orlando");
               add("Tallahassee");
               add("Tampa");
            }
        });
        cities.put ("New York", new ArrayList<String>(){
            {  add("Baffalo");
               add("Brooklyn");
               add("Manhatten");
               add("New York");
               add("Queens");
               add("The Bronx");
            }
        });
        cities.put ("Texas", new ArrayList<String>(){
            {  add("Austin");
               add("Dallas");
               add("El Paso");
               add("Fort Worth");
               add("Houston");
               add("San Antonio");
            }
        });
        cities.put ("Washington", new ArrayList<String>(){
            {  add("Richland");
               add("Seattle");
               add("Spokane");
               add("Tacoma");
            }
        });
        cities.put ("Wisconsin", new ArrayList<String>(){
            {  add("La Crosse");
               add("Green Bay");
               add("Madison");
               add("Milwaukee");
               add("Tomah");
            }
        });
    } 
    
    /**
     * These are the get methods for the states and the corresponding
     * cities. They both return arrays, converted from ArrayList so that
     * they can be loaded directly into combo box and list box.
     */
    
    public String[] getStates() {
        String[] result = new String[states.size()];
        for (int i = 0; i < result.length; i++)
           result[i] = states.get(i);
        return result;
    }
    
    public String[] getCities(String state) {
        String[] result = new String[cities.get(state).size()];
        for (int i = 0; i < result.length; i++) 
            result[i] = cities.get(state).get(i);
        return result;
    }    
}
