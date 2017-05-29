
package se.kth.iv1350.inspectvehicle.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZeenatAli.
 */
public class ResultList {
    private List<Boolean> result = null;
    
    public ResultList(){
        result = new ArrayList<Boolean>();
    }
    
    public  List<Boolean> getResultListBoolean(){
        return result;
    }
    
    public void addResultList(Boolean res){
        this.result.add(res);
    }
}
