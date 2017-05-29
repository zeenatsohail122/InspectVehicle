
package se.kth.iv1350.inspectvehicle.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ZeenatAli.
 */

public class ListOfInspection {
    private List<String> listOfInspection = null;
    
    /**
     * 
     */
    public ListOfInspection(){
        this.listOfInspection = new ArrayList<>();
    }
    
    /**
     * 
     * @return 
     */
    public List<String> getInspectionListString(){
        return listOfInspection;
    }
    
    /**
     * 
     * @param string 
     */
    public void addInspectionList(String string){
        this.listOfInspection.add(string);
    }
    
}
