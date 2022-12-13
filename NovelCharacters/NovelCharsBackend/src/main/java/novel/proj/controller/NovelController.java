package novel.proj.controller;

import java.util.List;

import novel.proj.models.Novel;
import novel.proj.service.NovelServiceImpl;

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
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.client.RestTemplate;

@RestController("novelController")
@RequestMapping(path = "/novels")
public class NovelController {
	
	@Autowired
	private NovelServiceImpl novelService;
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(path = "/all")
	public List<Novel> getAllNovels() {
		return novelService.getAllNovels();
	}
	
	@GetMapping(path = "/title", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Novel> getNovelByTitle(@RequestParam String title) {
		return this.novelService.getNovelByTitle(title);
	}
	
	@GetMapping(path = "/author", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Novel> getNovelByAuthor(@RequestParam String author) {
		return this.novelService.getNovelByAuthor(author);
	}
	
	@GetMapping(path = "/genre", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Novel> getNovelByGenre(@RequestParam String genre) {
		return this.novelService.getNovelByGenre(genre);
	}
	
	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Novel novel) {
		this.novelService.save(novel);
	}
	
	@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody Novel novel) {
		this.novelService.update(novel);
	}
	
	@DeleteMapping(path = "/delete")
	public void delete(@RequestBody Novel novel) {
		this.novelService.delete(novel);
	}
	
	// Client enters params on frontend
	@GetMapping(path = "/id", produces = MediaType.APPLICATION_JSON_VALUE)
	public Novel findByIdRequestParam(@RequestParam int novelid) {
		return this.novelService.findByNovelid(novelid);
	}
	
	// Client enters params directly into endpoint
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Novel> findByNovelid(@PathVariable int novelid) {
		return new ResponseEntity<Novel>(this.novelService.findByNovelid(novelid), HttpStatus.OK);
	}

}
