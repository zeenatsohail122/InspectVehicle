
package se.kth.iv1350.inspectvehicle.integration;

import  se.kth.iv1350.inspectvehicle.integration.ResultList;
import  se.kth.iv1350.inspectvehicle.integration.ListOfInspection;

/**
 * Responsible for all the calls to the result database, including getting results from 
 * and storing results in database
 */
public class ResultRegistry {
    private ListOfInspection listOfInspection = null;
    private ResultList resultList = null;
    
    /**
     * Creates new instance
     */
    ResultRegistry(){
        this.listOfInspection = new ListOfInspection();
        this.resultList = new ResultList();
    }
    
    /**
     * Store result to the database
     * @param inspection    One specified inspection
     * @param result        Result for one specified inspection
     */
    public void storeResult(String inspection, Boolean result){
        this.listOfInspection.addInspectionList(inspection);
        this.resultList.addResultList(result);
    }
    
    /**
     * Get list of inspection from the database
     * @return      listOfInspection
     */
    public ListOfInspection getInspectionList(){
        return listOfInspection;
    }
    
    /**
     * Get result list from the database
     * @return  resultList
     */
    public ResultList getResultList(){
        return resultList;
    }
    
}

