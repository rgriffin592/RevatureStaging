package novel.proj.service;

import java.util.List;

import novel.proj.models.Novel;
import novel.proj.repository.CharacterRepo;
import novel.proj.repository.NovelRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("novelServiceImpl")
@Transactional
public class NovelServiceImpl implements NovelService{
	
	@Autowired
	private NovelRepo novelRepo;
	
	// Constructor injection
	@Autowired
	public NovelServiceImpl(NovelRepo novelRepo) {
		this.novelRepo = novelRepo;
	}
	
	// Setter injection
	@Autowired
	public void setNovelRepo(NovelRepo novelRepo) {
		this.novelRepo = novelRepo;
	}
	
	@Override
	public List<Novel> getAllNovels() {
		return novelRepo.findAllNovels();
	}
	
	@Override
	public List<Novel> getNovelByTitle(String title) {
		return novelRepo.findNovelByTitle(title);
	}
	
	@Override
	public List<Novel> getNovelByAuthor(String author) {
		return novelRepo.findNovelByAuthor(author);
	}
	
	@Override
	public List<Novel> getNovelByGenre(String genre) {
		return novelRepo.findNovelByGenre(genre);
	}
	
	
	public void save(Novel novel) {
		this.novelRepo.save(novel);
	}
	
	public void delete(Novel novel) {
		this.novelRepo.delete(novel);
	}
	
	public void update(Novel novel) {
		this.novelRepo.update(novel);
	}
	
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
