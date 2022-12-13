package novel.proj.controller;

import java.util.List; 

import novel.proj.models.Character;
import novel.proj.service.CharacterServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/characters")
public class CharacterController {
	
	@Autowired
	private CharacterServiceImpl characterService;
	//@Autowired
	//private RestTemplate restTemplate;
	
	@GetMapping(path = "/all")
	public List<Character> getAllCharacters() {
		return characterService.getAllCharacters();
	}
	
	//@GetMapping(path = "/novelscharacters", produces = MediaType.APPLICATION_JSON_VALUE)
	//public List<Character> getCharactersByNovelid(@RequestParam int novelid) {
	//	return characterService.getCharactersByNovelid(novelid);
	//}
	
	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Character character) {
		this.characterService.save(character);
	}
	
	//@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	//public void update(@RequestBody Character character) {
	//}
	
	@DeleteMapping(path = "/delete")
	public void delete(@RequestBody Character character) {
		this.characterService.delete(character);
	}
	
	// Client enters params on frontend
	@GetMapping(path = "/id", produces = MediaType.APPLICATION_JSON_VALUE)
	public Character findByIdRequestParam(@RequestParam int charid) {
		return this.characterService.findByCharid(charid);
	}
	
	// Client enters params directly into endpoint
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Character> findByCharid(@PathVariable int charid) {
		return new ResponseEntity<Character>(this.characterService.findByCharid(charid), HttpStatus.OK);
	}

}
