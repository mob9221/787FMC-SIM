package nav;

import java.util.*;

public class Sids{
 
  
  private final String sidName;
  private final String sidICAO;
  private final List<String> RUNWAYS;
  private final List<String> TRANSITIONS;
  
  
  
    public Sids(String sidName, String sidICAO, List<String> runways, List<String> Transitions){
    
   this.sidName=sidName;
   this.sidICAO=sidICAO;
   this.RUNWAYS=runways;
   this.TRANSITIONS=Transitions;
    
  }
  
    public String getSidIdent(){
      
     return sidName; 
      
    }
    
    public String getSidIcao(){
      
     return sidICAO; 
    }
  
    public List<String> getRunways(){
     return RUNWAYS; 
    }
  
    public List<String> getTransitions(){
      
     return TRANSITIONS; 
    }
  
  
  
  
}