package novel.proj.service;

import java.util.List;

import novel.proj.models.Character;
import novel.proj.repository.CharacterRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("characterServiceImpl")
@Transactional
public class CharacterServiceImpl implements CharacterService{

	@Autowired
	private CharacterRepo characterRepo;
	
	// Constructor injection
	@Autowired
	public CharacterServiceImpl(CharacterRepo characterRepo) {
		this.characterRepo = characterRepo;
	}
	
	// Setter injection
	@Autowired
	public void setCharacterRepo(CharacterRepo characterRepo) {
		this.characterRepo = characterRepo;
	}
	
	// CRUD repo finds, JpaRepo gets
	
	@Override
	public List<Character> getAllCharacters() {
		return characterRepo.findAllCharacters();
	}
	
	@Override
	public List<Character> getCharactersByNovelid(int novelid) {
		return characterRepo.findCharactersByNovelid(novelid);
	}
	
	public void save(Character character) {
		this.characterRepo.save(character);
	}
	
	public void delete(Character character) {
		this.characterRepo.delete(character);
	}
	
	public void update(Character character) {
		this.characterRepo.update(character);
	}
	
	public Character findByCharid(int charid) {
		return this.characterRepo.findByCharid(charid);
	}
	
	//public boolean insertCharacter(String charName, String charAge, String charGender, String charAbility, String charDescription) {
	//	return characterRepo.insertCharacter(charName, charAge, charGender, 0, charDescription);
	//}
	
	//public boolean deleteCharacterById(int charId) {
	//	return characterRepo.deleteCharacterById(charId);
	//}
}
