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
	List<Novel> findByTitle(String title);
	
	@Query(nativeQuery = true, value = "SELECT * FROM NOVEL WHERE author=?1")
	List<Novel> findAllByAuthor(String author);
	
	@Query(nativeQuery = true, value = "SELECT * FROM NOVEL WHERE genre=?1")
	List<Novel> findAllByGenre(String genre);
	
	<S extends Novel> S save(Novel novel);
	void delete(Novel novel);
	//void update(Novel novel);
	Novel findByNovelid(int novelid);
	
}
