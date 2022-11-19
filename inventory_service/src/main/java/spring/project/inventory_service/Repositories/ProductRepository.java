package spring.project.inventory_service.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import spring.project.inventory_service.Models.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {

}
