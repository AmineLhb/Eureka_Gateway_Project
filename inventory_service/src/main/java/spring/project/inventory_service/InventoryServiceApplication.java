package spring.project.inventory_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import spring.project.inventory_service.Models.Product;
import spring.project.inventory_service.Repositories.ProductRepository;

@SpringBootApplication
@EnableEurekaClient
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);

    }
   /* @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null, "Pr1",8000));
            productRepository.save(new Product(null, "Pr2",10000));
            productRepository.save(new Product(null, "Pr3",12000));
            productRepository.findAll().forEach(System.out::println);

        };
    }*/

}
