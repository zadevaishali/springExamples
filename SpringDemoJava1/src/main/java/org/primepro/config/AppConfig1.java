package org.primepro.config;

import org.primepro.beans.Address;
import org.primepro.beans.Emp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
	
	  @Bean(name="address")
	  public Address address()
	{
	  Address address=new Address();
	  address.setDno(101);
	  address.setStreetName("JNTU");
	  address.setLoc("Hyderabad");
	  return address;
	}
	 

	  @Bean(name="emp")
	     public Emp employee()
	   {
	     Emp e=new Emp();
	     e.setEno(1);
	     e.setName("Vaishali");
	     e.setAddress(address()); 
	     //setAddress method injecting address object into employee
	    //address() is a factory method and returning address object.
	     return e;
	    }

}
