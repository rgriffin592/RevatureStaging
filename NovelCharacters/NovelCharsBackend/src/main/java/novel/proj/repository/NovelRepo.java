package novel.proj.repository;

import java.util.List;
import novel.proj.models.Novel;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface NovelRepo extends JpaRepository<Novel, Integer>{
	@Query(nativeQuery = true, value = "SELECT * FROM NOVEL")
	List<Novel> findAllNovels();
	
	@Query(nativeQuery = true, value = "SELECT * FROM NOVEL WHERE title=?1")
	List<Novel> findNovelByTitle(String title);
	
	@Query(nativeQuery = true, value = "SELECT * FROM NOVEL WHERE author=?1")
	List<Novel> findNovelByAuthor(String author);
	
	@Query(nativeQuery = true, value = "SELECT * FROM NOVEL WHERE genre=?1")
	List<Novel> findNovelByGenre(String genre);
	
	<S extends Novel> S save(Novel novel);
	void delete(Novel novel);
	void update(Novel novel);
	Novel findByNovelid(int novelid);
	
	
	//@Query(nativeQuery = true, value = "INSERT INTO NOVEL (title, author, genre, setting, plot) VALUES (?1, ?2, ?3, ?4, 5?)")
	//boolean insertNovel(String title, String author, String genre, String setting, String plot);
	
	//@Query(nativeQuery = true, value = "DELETE FROM NOVEL WHERE novel_id=?1")
	//boolean deleteNovelById(int novelId);
}
