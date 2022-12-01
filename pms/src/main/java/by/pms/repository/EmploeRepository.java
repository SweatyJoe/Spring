package by.pms.repository;

import by.pms.entity.Employe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploeRepository extends CrudRepository<Employe, Integer> {
    Iterable<Employe> findAllById(Long id);

}
