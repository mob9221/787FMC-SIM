/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;

/**
 *
 * @author omer
 */
public class FMCLogicTest {
  
  public static void main(String[]args){
    System.out.println("Working Directory = " +System.getProperty("user.dir"));
    FMCLogicTest obj1=new FMCLogicTest();
    obj1.setAirportDep("CYYZ");
    obj1.getSIDS(obj1.getAirportDep());
    
  }
  
   public String filepath=System.getProperty("user.dir") ;
        File fileScanner=new File(filepath+"/navdata/navdata/PROC");
        
        
         String airportChosenDep="";
String airportChosenArr="";
public void setAirportDep(String x){airportChosenDep=x;}
public String getAirportDep(){return airportChosenDep;}
public void setAirportArr(String x){airportChosenArr=x;}
public String getAirportArr(){return airportChosenArr;}


public String[] getAirports(){
 String [] airports = fileScanner.list();
 for(int i=0; i<airports.length;i++){
  airports[i]=airports[i].substring(0,4); 
 }
 
 
 
 for(int i=0; i<40;i++){
  System.out.println(airports[i]); 
   
 }
         return airports;
}

public boolean checkAirport(String x){
   String icao=x;
   String [] airportsDatabase=getAirports();
    
    boolean isAirportFound=false;
    
    for(int i=0;i<airportsDatabase.length; i++ ){
  if(icao.equals(airportsDatabase[i])){
       isAirportFound=true;
       }
}
   return isAirportFound;
}


public void getSIDS(String icao){
 String[] sids;
 String depSelected=System.getProperty("user.dir")+"/navdata/navdata/PROC/"+icao+".txt";
 
 

 
 try{

  BufferedReader buf = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(depSelected))));
List<Integer> listSidFound = new ArrayList<Integer>();
 int line=0;
 String buff;
 while((buff=buf.readLine()) != null){
     line++;
     if(buff.contains("SID,")){
      listSidFound.add(line);   
     }
 }

 System.out.println(listSidFound);
 int listSize=listSidFound.size();
 int line2=0;
 String ph="";
 String[] Sidident=new String[listSize];
 BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(depSelected))));
 int i=0;
 while((ph=br.readLine())!=null){
  line2++;
   
   if(ph.contains("SID,")){
    Sidident[i]=ph; 
     i++;
   }
   
 }
 
 for(int j=0;j<Sidident.length;j++){
  System.out.println(Sidident[j]); 
   
 }
 
 }catch(IOException ex){
  ex.printStackTrace();
 }
 
    
}
    
}  
        
    
    
    


