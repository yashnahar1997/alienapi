package in.yash.alienapi.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.yash.alienapi.domain.Alien;
import in.yash.alienapi.service.AlienService;

//@Controller
@RestController
public class AlienController {
	@Autowired
	private AlienService alienService;

//	@RequestMapping("/")
//	public String home() {
//		return "home.jsp";
//	}
//	@RequestMapping("/add")
	
	@PostMapping(path = "/add",consumes = {"application/json"})
	public Alien addAlien(@RequestBody Alien alien) {
		return alienService.addAlien(alien);
		//return "home.jsp";
	}
	@GetMapping(path="/get/{id}")
	public Optional<Alien> getAlien(@PathVariable("id") Integer id) {
		System.out.println(id);
		return alienService.findAlienById(id);
	}
	@GetMapping(path="get/aliens")
	public List<Alien> getAliens(){
		return alienService.findAllAlien();
	}
	@DeleteMapping(path="delete/{id}")
	public String deleteAlien(@PathVariable("id") Integer id) {
		return alienService.deleteAlien(id);
	}
}
