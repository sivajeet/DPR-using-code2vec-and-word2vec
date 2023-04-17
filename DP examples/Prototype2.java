package com.w3spoint;
 
import java.util.ArrayList;
import java.util.List;
 
public class Customers implements Cloneable{
private List<String> customerList;
 
	public Customers(){
		customerList = new ArrayList<String>();
	}
 
	public Customers(List<String> list){
		this.customerList=list;
	}
	public void loadDataFromDB(){
		//Read all customers from DB
		customerList.add("Bharat");
		customerList.add("Sahdev");
		customerList.add("Richi");
		customerList.add("Jai");
		customerList.add("Bharti");
		customerList.add("Saveta");
		customerList.add("Deepika");
	}
 
	public List<String> getCustomerList() {
		return customerList;
	}
 
	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String string : this.getCustomerList()){
				temp.add(string);
			}
			return new Customers(temp);
	}
}