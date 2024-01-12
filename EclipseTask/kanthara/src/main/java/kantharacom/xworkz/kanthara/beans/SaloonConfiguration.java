package kantharacom.xworkz.kanthara.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.kanthara.configuration.Customer;
import com.xworkz.kanthara.configuration.Scissors;

@Configuration
public class SaloonConfiguration {
	
	public SaloonConfiguration() {
	System.out.println("created SaloonConfigiration..");
	}
	
	
	@Bean 
	public Customer cust()
	{
		return new Customer();
	}
	
	
	@Bean 
	public Customer customer1()
	{
		return new Customer();
	}
	
	
	@Bean 
	public Customer customer2()
	{
		return new Customer();
	}
	
	
	
	@Bean
	public String scissors()
	{
		return "Scissors";
	}
	@Bean
	public Scissors metal() {
		System.out.println("registering metal");
		return new Scissors();
	}
	@Bean
	public Scissors blade() {
		System.out.println("registering blade");
		return new Scissors();
	}


}
