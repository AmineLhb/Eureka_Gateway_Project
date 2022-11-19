package spring.project.customer_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import spring.project.customer_service.Models.Customer;
import spring.project.customer_service.Repositories.CustomerRepository;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	/*@Bean
	CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration restConfiguration){
		return args -> {
			restConfiguration.exposeIdsFor(Customer.class);
			customerRepository.save(new Customer(null,"Amine","amine@gmail.com"));
			customerRepository.save(new Customer(null,"Lhb","lhb@gmail.com"));
			customerRepository.save(new Customer(null,"AmineLhb","aminelhb@gmail.com"));
			customerRepository.findAll().forEach(System.out::println);
		};
	}*/
}
