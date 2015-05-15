package demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import demo.Models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long>{

}
