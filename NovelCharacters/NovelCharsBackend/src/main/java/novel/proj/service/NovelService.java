package novel.proj.service;

import java.util.List; 
import novel.proj.models.Novel;

public interface NovelService {
	
	List<Novel> getAllNovels();
	
	List<Novel> getByTitle(String title);
	
	List<Novel> getByAuthor(String author);
	
	List<Novel> getByGenre(String genre);
	
	void save(Novel novel);
	
	void delete(Novel novel);
	
	//void update(Novel novel);
	
	Novel findByNovelid(int novelid);

}
