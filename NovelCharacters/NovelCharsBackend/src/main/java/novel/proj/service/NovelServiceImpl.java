package novel.proj.service;

import java.util.List;

import novel.proj.models.Novel;
import novel.proj.repository.CharacterRepo;
import novel.proj.repository.NovelRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NovelServiceImpl implements NovelService{
	
	@Autowired
	private NovelRepo novelRepo;
	
	@Override
	public List<Novel> getAllNovels() {
		return novelRepo.findAllNovels();
	}
	
	@Override
	public List<Novel> getByTitle(String title) {
		return novelRepo.findByTitle(title);
	}
	
	@Override
	public List<Novel> getByAuthor(String author) {
		return novelRepo.findAllByAuthor(author);
	}
	
	@Override
	public List<Novel> getByGenre(String genre) {
		return novelRepo.findAllByGenre(genre);
	}
	
	
	public void save(Novel novel) {
		this.novelRepo.save(novel);
	}
	
	public void delete(Novel novel) {
		this.novelRepo.delete(novel);
	}
	
	//public void update(Novel novel) {
	//	this.novelRepo.update(novel);
	//}
	
	public Novel findByNovelid(int novelid) {
		return this.novelRepo.findByNovelid(novelid);
	}
	
	//public boolean insertNovel(String title, String author, String genre, String setting, String plot) {
	//	return novelRepo.insertNovel(title, author, genre, setting, plot);
	//}
	
	//public boolean deleteNovelById(int novelId) {
	//	return novelRepo.deleteNovelById(novelId);
	//}

}
