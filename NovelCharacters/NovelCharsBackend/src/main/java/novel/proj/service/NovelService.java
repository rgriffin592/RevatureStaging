package novel.proj.service;

import java.util.List;
import novel.proj.models.Novel;

public interface NovelService {
	
	List<Novel> getAllNovels();
	
	List<Novel> getNovelByTitle(String title);
	
	List<Novel> getNovelByAuthor(String author);
	
	List<Novel> getNovelByGenre(String genre);
	
	void save(Novel novel);
	
	void delete(Novel novel);
	
	void update(Novel novel);
	
	Novel findByNovelid(int novelid);
	
	//boolean insertNovel(String title, String author, String genre, String setting, String plot);
	
	//boolean deleteNovelById(int novelId);

}
