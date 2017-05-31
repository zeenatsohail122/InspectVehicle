
package se.kth.iv1350.inspectvehicle.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *  Represents list of specified inspections
 */
public class ListOfInspection {
    private List<String> listOfInspection = null;
    
    /**
     *  Creates new instance
     */
    public ListOfInspection(){
        this.listOfInspection = new ArrayList<>();
    }
    
    /**
     * Get value the of ListOfInscpections
     * @return  the value of ListOfInscpections
     */
    public List<String> getInspectionListString(){
        return listOfInspection;
    }
    
    /**
     * Add new Inspection
     * @param string An inspection item
     */
    public void addInspectionList(String string){
        this.listOfInspection.add(string);
    }
    
}

