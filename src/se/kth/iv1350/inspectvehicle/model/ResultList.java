
package se.kth.iv1350.inspectvehicle.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Contains the information of the inspection results
 */
public class ResultList {
    private List<Boolean> result = null;
    
    /**
     * Creates a new instance
     */
    public ResultList(){
        result = new ArrayList<Boolean>();
    }
    
    /**
     * Get the value of inspection result
     * @return  <code>false</code> if the result is fail
     *          <code>true</code>  if the result is pass
     */
    public  List<Boolean> getResultListBoolean(){
        return result;
    }
    
    /**
     * Add result to the resultList
     * @param res   <code>false</code> if the result is fail
     *              <code>true</code>  if the result is pass
     */
    public void addResultList(Boolean res){
        this.result.add(res);
    }
}