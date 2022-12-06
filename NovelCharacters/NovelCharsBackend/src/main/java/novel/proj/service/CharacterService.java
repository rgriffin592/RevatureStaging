package novel.proj.service;

import java.util.List;
import novel.proj.models.Character;

public interface CharacterService {
	
	List<Character> getAllCharacters();
	
	List<Character> getCharacterByNovel(String title);
	
	void save(Character character);
	
	void delete(Character character);
	
	void update(Character character);
	
	Character findById(int charid);
	
	//boolean insertCharacter(String charName, String charAge, String charGender, String charAbility, String charDescription);
	
	//boolean deleteCharacterById(int charId);

}
