package in.yash.alienapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.yash.alienapi.domain.Alien;
@Repository
public interface AlienRepository extends JpaRepository<Alien, Integer>{

}
