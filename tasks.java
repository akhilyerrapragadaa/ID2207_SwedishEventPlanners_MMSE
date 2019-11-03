import java.util.*;
//import static com.package.OtherClass.main;

class Data{
 
String recordNumber; String clientName; String eventType; String fromDate; String toDate; String decorations; String FeedBack = ""; String PMFM ="";

Data(String recordNumber,String clientName,String eventType,String fromDate,String toDate,String decorations){
this.recordNumber = recordNumber;
this.clientName = clientName;
this.eventType = eventType;
this.fromDate = fromDate;
this.toDate = toDate;
this.decorations = decorations;
//this.FeedBack = FeedBack;
}


      
public void setPMFM(String PMFM){
    this.PMFM = PMFM;
}

public String getPMFM(){
    return PMFM;
}

public void setFeedBackValue(String FeedBack){
    this.FeedBack = FeedBack;
}

public String getFeedBackValue(){
    return FeedBack;
}

public String getRecordNumber() {
    return recordNumber;
}



public void setRecordNumber(String recordNumber) {
    this.recordNumber = recordNumber;
}



public String getClientName() {
    return clientName;
}



public void setClientName(String clientName) {
    this.clientName = clientName;
}



public String getEventType() {
    return eventType;
}



public void setEventType(String eventType) {
    this.eventType = eventType;
}



public String getFromDate() {
    return fromDate;
}



public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
}



public String getToDate() {
    return toDate;
}
public void setToDate(String toDate) {
    this.toDate = toDate;
}



public String getDecorations() {
    return decorations;
}



public void setDecorations(String decorations) {
    this.decorations = decorations;
}

 public String toString(){
    return "1. Record Number = "+ recordNumber +""+"  2. Client Name = "+ clientName +""+"  3. Event Type = " + eventType+ "" +"  4. From date = "+fromDate+""+"  5. To Date ="+toDate+""+"  6. Decorations ="+decorations+""+"7. FeedBack ="+FeedBack+""+"8. PM or FM ="+PMFM;
 
 }
}

class tasks{
    String extra = "";
    String extraData = "";
    int count = 0;
    String number = null;
    String choice = null;
    String FMdatain = null;
    String ADMdatain = null;
    String PMdatain = null;
    logindisplay myThread = new logindisplay();
    HashMap<String,Data> mapData = new HashMap<String,Data>();
    HashMap<String,Data> mapData1 = new HashMap<String,Data>();

public Data getTask(String x, String y,HashMap<String,Data> mapData){
    //Data =null;
    //if(!y.equals("")) {     
      Data cycle = mapData.get(x);
        return cycle;
       // return mapData1.get(x);       
        //  }        
}
public HashMap<String,Data> getTasks(String role,HashMap<String,Data> mapData){
       // switch (role) {
           // case "CS":
           // for (Map.Entry<String,Data> entry : mapData.entrySet())  
            // return entry.getValue();
           // Data ob=null ;
           //mapData1 = mapData;
           return mapData;
           //System.out.println(mapData);
            //Iterator<String> keySetIterator = mapData.keySet().iterator();
           // while(keySetIterator.hasNext()) {
            //    String key = keySetIterator.next();
                //return mapData.get(key);
           //  ob = mapData.get(key);
           //  return ob.toString(); 
           // }   
    }      
           // case "SCS":
            //for (Map.Entry<String,Data> entry : mapData1.entrySet()) 
            //return entry.getValue();
          //  Iterator<String> keySetIteratorSCS = mapData1.keySet().iterator();
           // System.out.println(mapData1.size());
           // while(keySetIteratorSCS.hasNext()) {
             //   String keySCS = keySetIteratorSCS.next();
                //return mapData.get(key);
             // Data obSCS = mapData1.get(keySCS);
             // return obSCS.toString();
            //}   


          //  default:
          //  return null;
           
           // }
            

public void forward(String e,String d,String c, Data a, String b){
   // switch (b) {
      //  case "CS":
      if(b.equals("ADM")){
      Data li;
      li = a;
      li.setPMFM(e);
      mapData1.put(c, li);
   }
      else if(b.equals("FM")){
      Data listed;
      listed = a;
      listed.setFeedBackValue(d);
      mapData1.put(c,listed);
      }  
      else 
      mapData1.put(c,a);        
        //System.out.println(mapData1);    
        //break;
    
    //  default:
    //        break;
    //}
    
}

public HashMap<String,Data> displayOptions(String role,HashMap<String,Data> mapData){
    if(role == "CS"){
             System.out.println("Please choose a type of service");
             System.out.println("1. Create customer service request");
             System.out.println("2. Send request to senior");
             System.out.println("3. Logout");
             Scanner obj = new Scanner(System.in);
             number = obj.nextLine();
             System.out.println("numm.............."+number);
                 if(number.equals("1")){
                        System.out.println("1. Record Number");
                        String recordNumber = obj.nextLine();
                        System.out.println("2. Client Name");
                        String clientName = obj.nextLine();
                        System.out.println("3. Event type");
                        String eventType = obj.nextLine();
                        System.out.println("4. From");
                        String fromDate = obj.nextLine();
                        System.out.println("5. To");
                        String toDate = obj.nextLine();
                        System.out.println("6.Decorations(Y/N)");
                        String decorations = obj.nextLine();
                        mapData.put(recordNumber,new Data(recordNumber,clientName,eventType,fromDate,toDate,decorations));
                        System.out.println(mapData.get(recordNumber));
                        System.out.println("You have succesfully entered details");
                   
                    }
             
                 else if(number.equals("2")){

                        if(mapData.isEmpty()){
                        System.out.println("Please create a request before choosing to submit it");
                        } 
                        else{
                        System.out.println("Please choose from the requests from which you want to send");
                        //requestData = new Data();
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        System.out.println(this.getTasks(role,mapData));
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        try{
                        String chosenRequest = obj.nextLine();
                        this.forward(extraData,extra,chosenRequest, this.getTask(chosenRequest, role,mapData), role);
                        mapData.remove(chosenRequest);
                        }
                        catch(Exception e){
                        System.out.println("Invalid Entry");    
                        } 
                        }
                       
                    //return mapData1;
                    }

                else if(number.equals("3") && mapData1.size()!=0){
                    System.out.println("You are succesfully logged out");
                   // myThread.startThread(); 
                }
                 else
                   System.out.println("Thanks for your time");
                
                // System.out.println(number);
                 //System.out.println("I'm In");
                 if(!number.equals("3"))
                 this.displayOptions(role,mapData); 
                 //else{
                   // try{
                        // myThread.stopRunning();
                        
                     //   myThread.m.interrupt();
                     
                       // }
                       // catch(Exception e){
                        //    e.printStackTrace();
                       // }
                        
                 //}
                 //logindisplay relogin = new logindisplay();
                 //logindisplay reinit = new logindisplay();
                 //reinit.reInitialization();
                // return mapData1; 
          }
    
         else if(role =="SCS"){
                System.out.println("Please choose a type of service");
                System.out.println("1. View current requests");
                System.out.println("2. Send approval/rejection and forward the request");
                System.out.println("3. Logout");
                Scanner obj1 = new Scanner(System.in);
                 choice = obj1.nextLine();
                if(choice.equals("1")) {
                        System.out.println("Below are the requests received");
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        System.out.println(this.getTasks(role,mapData));
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        
                }
                else if(choice.equals("2")){
                    
                    if(mapData.isEmpty()){
                        System.out.println("Please create a request before choosing to submit it");
                        } 
                        else{
                        System.out.println("Enter the record number of which you want to send");
                        //requestData = new Data();
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        System.out.println(this.getTasks(role,mapData));
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        try{
                        String chosenRequestSCS = obj1.nextLine();
                        this.forward(extraData, extra,chosenRequestSCS, this.getTask(chosenRequestSCS, role,mapData), role);
                        mapData.remove(chosenRequestSCS);
                        }
                        catch(Exception e){
                        System.out.println("Invalid Entry");    
                        } 
                        }   

                        }
                else if(choice.equals("3")&& mapData1.size()!=0){
                    System.out.println("You are succesfully logged out");
                   // myThread.startThread(); 
                        }
                else
                System.out.println("Thanks for your time");
                        
                if(!choice.equals("3"))
                this.displayOptions(role,mapData);
     
            }
            else if (role =="FM"){
                System.out.println("1.Please choose a type of request you want to view");
                System.out.println("2.Send request to AM");
                System.out.println("3.Logout");
                Scanner obj2 = new Scanner(System.in);
                FMdatain = obj2.nextLine();
                if(FMdatain.equals("1")) {
                    System.out.println("Below are the requests received");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    System.out.println(this.getTasks(role,mapData));
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
                else if(FMdatain.equals("2")){
                    if(mapData.isEmpty()){
                        System.out.println("Please create a request before choosing to submit it");
                        } 
                        else{
                        System.out.println("Enter the record number of which you want to send");
                        //requestData = new Data();
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        System.out.println(this.getTasks(role,mapData));
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        try{
                        String chosenRequestFM = obj2.nextLine();
                        System.out.println("Please enter your feedback for this request");
                        extra = obj2.nextLine();
                        System.out.println("Thanks for your feedback");
                        this.forward(extraData,extra,chosenRequestFM, this.getTask(chosenRequestFM, role,mapData), role);
                        mapData.remove(chosenRequestFM);
                        }
                        catch(Exception e){
                        System.out.println("Invalid Entry");    
                        } 
                        }   
                }
                else if(FMdatain.equals("3")&& mapData1.size()!=0){
                    System.out.println("You are succesfully logged out");
                }
                else
                System.out.println("Thanks for your time");

                if(!FMdatain.equals("3"))
                this.displayOptions(role,mapData);
            }
            else if(role == "ADM"){
                System.out.println("1.View current requests");
                System.out.println("2.Send request to PM/SM");
                System.out.println("3.Logout");
                Scanner obj3 = new Scanner(System.in);
                ADMdatain = obj3.nextLine();
                if(ADMdatain.equals("1")){
                    System.out.println("Below are the requests received");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    System.out.println(this.getTasks(role,mapData));
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                }
                else if(ADMdatain.equals("2")){
                    System.out.println("Enter the record number of which you want to send");
                        //requestData = new Data();
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        System.out.println(this.getTasks(role,mapData));
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        try{
                            String chosenRequestADM = obj3.nextLine();
                            System.out.println("Whom do you want to sedn this to? PM/SM");
                            extraData = obj3.nextLine();

                            System.out.println("You have forwarded the request to corresponding dept");
                            this.forward(extraData,extra,chosenRequestADM, this.getTask(chosenRequestADM, role,mapData), role);
                            mapData.remove(chosenRequestADM);
                            }
                            catch(Exception e){
                            System.out.println("Invalid Entry");    
                            } 
                }
                else if(ADMdatain.equals("3")&& mapData1.size()!=0){
                    System.out.println("You are succesfully logged out");
                }
                else
                System.out.println("Thanks for your time");
            
                if(!ADMdatain.equals("3"))
                this.displayOptions(role,mapData);
            }  
            
            else if(role.equals("PM")||role.equals("SM")){
                System.out.println("1.View current requests");
                System.out.println("2.Logout");
                Scanner obj4 = new Scanner(System.in);
                PMdatain = obj4.nextLine();
                if(PMdatain.equals("1")){
                    if(mapData.isEmpty()){
                        System.out.println("You dont have any requests");
                        } 
                    else{
                    System.out.println("Below are the requests received");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    System.out.println(this.getTasks(role,mapData));
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                }
            }

                else if(PMdatain.equals("2")){
                System.out.println("You are succesfully logged out");
                }

                else
                System.out.println("Invalid Entry");
            
                if(!PMdatain.equals("2"))
                this.displayOptions(role,mapData);
            }
      
        

            //System.out.println("mapData1......................."+mapData1.size());
            if(role.equals("CS") && ((number.equals("2")&&(mapData1.size() != 0))||number.equals("3"))){
              //  System.out.println("1 am in else ............"+mapData1.size());
                return mapData1;
            }
            else if(role.equals("SCS") && ((choice.equals("2")&&(mapData1.size() != 0))||choice.equals("3"))){
                //System.out.println("2 am in else ............"+mapData1.size());
                return mapData1;
            }
            else if(role.equals("FM") && ((FMdatain.equals("2")&&(mapData1.size() != 0))||FMdatain.equals("3"))){
                //System.out.println("3 am in else ............"+mapData1.size());
                return mapData1;
            }
            else if(role.equals("ADM") && ((ADMdatain.equals("2")&&(mapData1.size() != 0))||ADMdatain.equals("3"))){
                //System.out.println("4 am in else ............"+mapData1.size());
                return mapData1;
            }
            else if((role.equals("PM")||(role.equals("SM")) && ((PMdatain.equals("2")&&(mapData1.size() != 0))||PMdatain.equals("3")))){
                //System.out.println("5 am in else ............"+mapData.size());
                return mapData;
            }
            else
            return mapData;
            
        
            //}

            //else if(role.equals("SCS")){ 
           // if(role.equals("SCS")&& ((choice.equals("2")&&(mapData1.size() != 0))||choice.equals("3"))){
            //    return mapData1;
            //}
            //else
             //   return mapData;
            //}
    }
}
   
  