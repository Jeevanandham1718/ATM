package ATM;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hc=0;
        double atm=0;
       
        
        HashMap<Integer,Create> hs=new HashMap<>();
         
        List<List<String>> rec=new ArrayList<>();
        int ad=12345;
        while(true){
        System.out.println("1.Admin\n2.User");
        int c1=sc.nextInt();
        if(c1==1){
            System.out.println("Enter your id");
            int nad=sc.nextInt();
            if(nad!=ad){
                System.out.println("Enter a valid admin id");
                nad=sc.nextInt();
            }else{
                System.out.println("1.To check balance in ATM\n2.To see transcation history");
                int hh=sc.nextInt();
                if(hh==1){
                    System.out.println(atm);
                }else{
                 
                
                     for(int i=0;i<rec.size();i++){
                         System.out.println(rec.get(i));
                     
                }}
            }
        }else{
         
        while(true){
            int cp=0;
         
        System.out.println("--------Welcome to XYZ ATM---------\n");
        System.out.println("Enter your pin number");
        int pin=sc.nextInt();
        if(String.valueOf(pin).length()<4){
            System.out.println("Enter valid pin");
            pin=sc.nextInt();

        }
        List<String> sb=new ArrayList<>();
        sb.add(String.valueOf(pin));
        Create u1=new Create();
        if(!hs.containsKey(pin) && cp==0){
            hs.put(pin, u1);
        }
        while(true){
            System.out.println("1.Deposit\n2.Withdrwa\n3.Balance\n4.Exit\5.pin change");
            int ch=sc.nextInt();
            Create h=hs.get(pin);
            switch (ch) {
                case 1:
                System.out.println("Enter the amount");
                int amount=sc.nextInt();
                 
                h.amount+=amount;
                atm+=amount;
                System.out.println("Amount Successfully deposited"+h.amount);
                sb.add("Amount deposited"+" "+amount);
                    
                    break;
                case 2:
                System.out.println("Enter the amount to be withdraw");
                int wd=sc.nextInt();
               
                if(h.amount<wd){
                    System.out.println("Insufficient balance");
                    break;
                }else{
                    h.amount-=wd;
                    atm-=wd;
                    System.out.println("Take Your amount");
                    sb.add("Amount Withdrawn"+" "+wd);
                     
                }
                
                break;
                case 3:
                 
                System.out.println(h.amount);
                System.out.println("Balance checked");
                break;
                
            

            case 5:
            System.out.println("Enter the old pin");
            int op=sc.nextInt();
            if(!hs.containsKey(op)){
                System.out.println("Pin not matches");
            }else{
             
            
                System.out.println("Enter new pin");
                int np=sc.nextInt();
                h.pin=np;
                hs.put(np, h);
                hs.remove(op);
                cp=1;
                System.out.println("Pin changed successfully");
                sb.add(op+"Pin changed to"+np);
            

            }
             
            
                 
            }
            if(ch==4){
                System.out.println("Thank You Have a nice day");
                System.out.println("Enter 1 to go to home page");
             hc=sc.nextInt();
             break;
             

                
            }     
             
                  
            
             
             
        }
        rec.add(sb);
        if(hc==1){
            break;
        }  
        
         
       
    }
    
       
    }
}
}   
        
    }

    

