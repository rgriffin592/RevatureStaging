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
	
	@Query(nativeQuery = true, value = "SELECT * FROM FICTIONAL_CHARACTER WHERE title=?1")
	List<Character> findCharactersByNovel(String title); // should be findByNovelId
	
	/*
	 * standard CRUD repository don't technically have to be declared
	 * here to be used. It is only the custom methods which contain field names
	 * and predicates that you must declare here.
	 */
	
	<S extends Character> S save(Character character);
	void delete(Character character);
	void update(Character character);
	Character findById(int charid);
	
	//@Query(nativeQuery = true, value = "INSERT INTO FICTIONAL_CHARACTER (char_name, char_age, char_gender, char_ability, char_description) VALUES (?1, ?2, ?3, ?4, ?5)")
	//boolean insertCharacter(String charname, String charage, String chargender, int charability, String chardescription);
	
	//@Query(nativeQuery = true, value = "DELETE FROM FICTIONAL_CHARACTER WHERE char_id=?1")
	//boolean deleteCharacterById(int charid);

}