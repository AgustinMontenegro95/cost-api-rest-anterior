package ar.com.dinamicaonline.cost.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ar.com.dinamicaonline.cost.models.Parameter;


@Repository
public interface ParameterRepository extends JpaRepository<Parameter, Integer> {

    @Query(value = "SELECT * FROM api_Parameters WHERE id BETWEEN 42 and 51", nativeQuery = true)
    public List<Parameter> findTransferMoney();
    
}
