
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy01_OOP_Part1_class_const;

/**
 *
 * @author ea88c
 */
public class Bankacc {
    
	
	//constructor, any number of constructors can be created by varying the parameters
	//this() is used to initialize the object created for this class
	//constructor can be called inside of another constructor but should be the first line
	
	public Bankacc() {
		this(11111,100,"test name","test email ID",0000000000);
		System.out.println("void parameter constructor executed");
	}
	
    public Bankacc(int i, double j, String string, String string2, int phone) {
    	System.out.println("Multiple parameter constructor executed");
    	this.accno = i;
        this.balance = j;
        this.name = string;
        this.email = string2;
        this.phone = phone;
	}

	private int accno;
    private double balance;
	private String name;
    private String email;
    private int phone;
  

	public void setAccno(int accno) {
		this.accno = accno;
	}


    
    public void setacc(int accno, double balance, String name, String email, int phone){
        
        if (accno>0 && balance>0 && name != null && name.trim()!= " " && email != null && email.trim()!= null) {
            this.accno = accno;
            this.balance = balance;
            this.name = name;
            this.email = email;
            this.phone = phone;
            System.out.println("Account details added ! ");
        }else {
        System.out.println("Incorrect details entered ! ");
        }
    }
    
    public void printacc(){
            System.out.println("Account Details: ");
            System.out.println("Acc#:" +this.accno);
            System.out.println("Acc Balance#: " +this.balance);
            System.out.println("Acc Name: " +this.name);
            System.out.println("Email ID: " +this.email);
            System.out.println("Phone#: " +this.phone);
            
    }

    public void deposit(int accno, double amount){
        if (accno == this.accno && amount > 0){
            this.balance += amount;
            System.out.println("Deposited. The balance for " +this.accno +" is " +this.balance);
        }else{
        System.out.println("Acc# or amount is invalid");
        }
    }
    
    public void withdraw(int accno, double amount){
        if (accno==this.accno){
            if (this.balance >= amount){
                this.balance -= amount;
                System.out.println("Withdrawal success! The balance for " +this.accno +" is " +this.balance);
            }else{
            System.out.println("Insufficient Balance");
            }
        }else{
        System.out.println("Invalid acc#");
        }
    
    }
    
    //how to use getters
    public int getaccno(){
        return this.accno;
    }

    public String getname(){
        return this.name;
    }
        
    public double getbalance(){
        return this.balance;
    }

    public String getemail(){
        return this.email;
    }
    
    public int getphone(){
        return this.phone;
    }
}


