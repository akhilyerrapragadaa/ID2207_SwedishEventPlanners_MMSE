import java.util.*;

class logindisplay implements Runnable{
   // private volatile boolean flag = true;
    Thread m = null;
    private  static HashMap<String,Data> mapData = new HashMap<String,Data>();
    private static HashMap<String,Data> mapDataSCS = new HashMap<String,Data>();
    private static HashMap<String,Data> mapDataFM = new HashMap<String,Data>();
    private static HashMap<String,Data> mapDataADM = new HashMap<String,Data>();
    private static HashMap<String,Data> mapDataSM = new HashMap<String,Data>();
    private static HashMap<String,Data> mapDataPM = new HashMap<String,Data>();
    private static String FeedBack = null;
    // private Thread m;
    
    private int count = 0;
    public String checkAttempts(){
        System.out.println("Enter your password");
        Scanner myObj1 = new Scanner(System.in);
        String givenpass = myObj1.nextLine();        

              if(count ==3)
            System.out.println("Exceeded atempts. Wait for 5 mins");
            count++;
           // System.out.println(count);
       return givenpass;
    }
   
    public void validatePassword(String pass){
      // try{
        int num = 0;   
        String val = "";    
    for(int i=3;i>count;){
        if(pass.equals(this.checkAttempts())){
            //System.out.println("Equal"+count);    
            System.out.println("Welcome!");
         num++;
        }
        else {
        //System.out.println("Unequal"+count);
            System.out.println("Password Incorrect! Please enter valid password");
       // val = this.checkAttempts();
    }
    if(num==1)
    break;
    }
  
//}
//catch(Exception e){
  //  e.printStackTrace();
//}
   }

   @Override   
   public void run(){
    //while (!Thread.currentThread().isInterrupted()) {
    //  System.out.println("I am running....");
          String role = "";
          boolean asp = false;
          try{
            System.out.println("Enter your Name");
            Scanner myObj = new Scanner(System.in);
            String userName = myObj.nextLine();
          // MyThread th = new MyThread(myObj);
            database validUser = new database(); 
            User upd =  validUser.checkUser(userName);
            String pass = upd.getPassword();
            logindisplay attempts = new logindisplay();    
            attempts.validatePassword(pass);
            role = upd.getRole();
            //System.out.println(role); 
            tasks input = new tasks();
            //System.out.println(role); 
            if(role.equals("CS")){
              mapData = input.displayOptions(role,mapData);
              mapDataSCS = mapData;
              //System.out.println(mapDataSCS);  
              m.interrupt();
              //asp = true;
             //while(Thread.currentThread().isInterrupted()== true) {
              
             //}
             //m.sleep(4000);
             // System.out.println("loop");
             
              
          }
            else if(role.equals("SCS")){
              //System.out.println("Janat................."+mapDataSCS);
              //System.out.println(mapDataSCS);
              mapData = input.displayOptions(role,mapDataSCS);
              //System.out.println("Please add feedback for this request");
             // FeedBack = myObj.nextLine();
             //System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!");
             //System.out.println(mapData);
             mapDataFM = mapData;
              
              m.interrupt();
            //System.out.println(role);  
          }

           else if(role.equals("FM")){
            //System.out.println(mapDataFM);
            //System.out.println(FeedBack);
            mapData = input.displayOptions(role,mapDataFM);
            mapDataADM = mapData;
            m.interrupt();
          }
          else if(role.equals("ADM")){
            System.out.println(mapDataADM);
            mapData = input.displayOptions(role,mapDataADM);
            //System.out.println(mapData);
            for(Map.Entry<String,Data> entry : mapData.entrySet()) {
            //Data ob = mapData;
            String key = entry.getKey();
            Data ob = entry.getValue();
            String PMSM = ob.getPMFM();
           // System.out.println(PMSM);
            if(PMSM.equals("PM"))
            mapDataPM.put(key,ob);
            else
            mapDataSM.put(key,ob);
            }

            m.interrupt();
        }
          else if(role.equals("PM")){
            mapData = input.displayOptions(role,mapDataPM);
           // m.interrupt();
          }
          else if(role.equals("SM")){
            mapData = input.displayOptions(role,mapDataSM);
          //  m.interrupt();
          }
        }  
        catch(Exception e){
            //System.out.println(e);
            //System.out.println("I'm in!");
            this.startThread();
           // e.printStackTrace();
          }
         // System.out.println(role);
         //   System.out.println(mapData.size());
    }
    //System.out.println("Stopped Running....");
   //} 

   public void startThread(){
    // if(flag == true){
     //  if( m !=null)
      //   this.stopRunning();
     m = new Thread(new logindisplay());
      m.start(); 
     //}
  }

   //public void stopRunning(){ 
    //  m.interrupt();
    //}

   public static void main(String[] args) { 
    logindisplay myThread = new logindisplay();
    myThread.startThread();
   }
    //User upd =  validUser.checkUser(userName);
   // String role = upd.getRole();  
    
    //System.out.println("Roleeeeeeeeeeeeeeeeeee"+role);
    //input.displayOptions(role); 
}
  




   


    