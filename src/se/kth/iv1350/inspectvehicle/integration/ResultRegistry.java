
package se.kth.iv1350.inspectvehicle.integration;

import  se.kth.iv1350.inspectvehicle.model.ResultList;
import  se.kth.iv1350.inspectvehicle.model.ListOfInspection;

/**
 *
 * @author ZeenatAli.
 */
public class ResultRegistry {
    private ListOfInspection listOfInspection = null;
    private ResultList resultList = null;
    
    ResultRegistry(){
        this.listOfInspection = new ListOfInspection();
        this.resultList = new ResultList();
    }
    
    public void storeResult(String inspection, Boolean result){
        this.listOfInspection.addInspectionList(inspection);
        this.resultList.addResultList(result);
    }
    
    public ListOfInspection getInspectionList(){
        return listOfInspection;
    }
    
    public ResultList getResultList(){
        return resultList;
    }
    
}

