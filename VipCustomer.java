package udemy01_OOP_Part1_class_const;

public class VipCustomer {

	private String name;
	private int creditlimit;
	private String email;
	
	public VipCustomer() {
		// TODO Auto-generated constructor stub
	this("Sasi",30000,"tst@tst.com");	
	}

	public VipCustomer(String string, int i, String string2) {
		this.name=string;
		this.creditlimit = i;
		this.email=string2;	
	}

	public VipCustomer(String name, String email) {
		this(name,40000,email);
	}
	
	//Getters 
	public String getName() {
		return name;
	}

	public int getCreditlimit() {
		return creditlimit;
	}

	public String getEmail() {
		return email;
	}
	
    public static void main(String[] args)   {
    	System.out.println("VipCustomer.java main method execution, nothing else will be used/executed");
    }

}
