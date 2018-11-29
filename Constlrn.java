package udemy01_OOP_Part1_class_const;


public class Constlrn {
    
		
    public static void main(String[] args)   {
        
        	   	
    	
//Bank account example
    	
    	Bankacc acc1 = new Bankacc();
        //Bankacc acc1 = new Bankacc(123456,5000,"Sasidharan","sasi@abc.com",123456781);
              
        //acc1.setacc(123456,5000,"Sasidharan","sasi@abc.com",123456781);
        acc1.printacc();
        
        acc1.deposit(123456,923);
        //acc1.printacc();
             
        acc1.withdraw(123456,500);
        //acc1.printacc();
        
        acc1.withdraw(12345, 10);
        acc1.withdraw(123456, 10000);
        acc1.printacc();
        
//VIP bank acc with 3 constructors
        System.out.println("****Start of VIP****");
    	VipCustomer vip1 = new VipCustomer();
    	System.out.println(vip1.getName());
    	System.out.println(vip1.getCreditlimit());
    	System.out.println(vip1.getEmail());
    	
    	VipCustomer vip2 = new VipCustomer("test2",100,"tstabc@c.com");
    	System.out.println(vip2.getName());
    	System.out.println(vip2.getCreditlimit());
    	System.out.println(vip2.getEmail());
    }

    	
    
}
