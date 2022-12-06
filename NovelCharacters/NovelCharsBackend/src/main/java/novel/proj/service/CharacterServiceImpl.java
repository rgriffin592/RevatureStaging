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
	
	public CharacterServiceImpl() {
		
	}
	
	// CRUD repo finds, JpaRepo gets
	
	@Override
	public List<Character> getAllCharacters() {
		return characterRepo.findAllCharacters();
	}
	
	@Override
	public List<Character> getCharacterByNovel(String title) {
		return characterRepo.findCharactersByNovel(title);
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
	
	public Character findById(int charid) {
		return this.characterRepo.findById(charid);
	}
	
	//public boolean insertCharacter(String charName, String charAge, String charGender, String charAbility, String charDescription) {
	//	return characterRepo.insertCharacter(charName, charAge, charGender, 0, charDescription);
	//}
	
	//public boolean deleteCharacterById(int charId) {
	//	return characterRepo.deleteCharacterById(charId);
	//}
}
