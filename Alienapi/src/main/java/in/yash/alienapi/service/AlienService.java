package in.yash.alienapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import in.yash.alienapi.domain.Alien;
import in.yash.alienapi.repository.AlienRepository;

@Service
public class AlienService {
	@Autowired
	private AlienRepository alienRepository;

	public Alien addAlien(Alien alien) {
		return alienRepository.save(alien);
	}

	public Optional<Alien> findAlienById(Integer id) {
		return alienRepository.findById(id);
	}

	public List<Alien> findAllAlien() {
		return alienRepository.findAll();
	}

	public String deleteAlien(Integer id) {
			try {
				alienRepository.deleteById(id);				
			}catch(EmptyResultDataAccessException e) {
				return ("No data found with id "+id);
			}
			return "successfully deleted";
	}

}
