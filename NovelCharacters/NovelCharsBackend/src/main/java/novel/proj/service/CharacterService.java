package novel.proj.service;

import java.util.List;
import novel.proj.models.Character;

public interface CharacterService {
	
	List<Character> getAllCharacters();
	
	List<Character> getCharactersByNovelid(int novelid);
	
	void save(Character character);
	
	void delete(Character character);
	
	void update(Character character);
	
	Character findByCharid(int charid);
	
}
