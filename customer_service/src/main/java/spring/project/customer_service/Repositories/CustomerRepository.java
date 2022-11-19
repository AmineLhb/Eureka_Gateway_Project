package spring.project.customer_service.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import spring.project.customer_service.Models.Customer;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
