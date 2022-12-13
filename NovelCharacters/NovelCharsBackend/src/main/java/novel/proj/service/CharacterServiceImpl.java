package novel.proj.service;

import java.util.List;

import novel.proj.models.Character;
import novel.proj.repository.CharacterRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CharacterServiceImpl implements CharacterService{

	@Autowired
	private CharacterRepo characterRepo;
	
	@Override
	public List<Character> getAllCharacters() {
		return characterRepo.findAllCharacters();
	}
	
	//@Override
	//public List<Character> getCharactersByNovelid(int novelid) {
	//	return characterRepo.findCharactersByNovelid(novelid);
	//}
	
	public void save(Character character) {
		this.characterRepo.save(character);
	}
	
	public void delete(Character character) {
		this.characterRepo.delete(character);
	}
	
	//public void update(Character character) {
	//	this.characterRepo.update(character);
	//}
	
	public Character findByCharid(int charid) {
		return this.characterRepo.findByCharid(charid);
	}
	
}
