package novel.proj.controller;

import java.util.List;

import novel.proj.models.Novel;
import novel.proj.service.NovelServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

@RestController("novelController")
@RequestMapping(path = "/novels")
public class NovelController {
	
	@Autowired
	private NovelServiceImpl novelService;
	
	@GetMapping(path = "/all")
	public List<Novel> getAllNovels() {
		return novelService.getAllNovels();
	}
	

}
