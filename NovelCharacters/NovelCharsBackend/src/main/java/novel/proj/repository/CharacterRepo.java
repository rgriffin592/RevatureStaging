package novel.proj.repository;

import java.util.List;
import novel.proj.models.Character;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CharacterRepo extends JpaRepository<Character, Integer>{
	
	@Query(nativeQuery = true, value = "SELECT * FROM FICTIONAL_CHARACTER")
	List<Character> findAllCharacters(); // findAllByOrderByCharacterName
	
	//@Query(nativeQuery = true, value = "SELECT * FROM FICTIONAL_CHARACTER WHERE novel_id=?1")
	//List<Character> findCharactersByNovelid(int novelid);
	
	/*
	 * standard CRUD repository don't technically have to be declared
	 * here to be used. It is only the custom methods which contain field names
	 * and predicates that you must declare here.
	 */
	
	<S extends Character> S save(Character character);
	void delete(Character character);
	//void update(Character character);
	Character findByCharid(int charid);
	
}
