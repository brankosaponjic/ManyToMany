package brankosaponjic.manytomany.repository;

import brankosaponjic.manytomany.entity.Programmer;
import org.springframework.data.repository.CrudRepository;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {
}
