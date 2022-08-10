package mockproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mockproject.dao.IFilmDAO;
import mockproject.model.FilmModel;
import mockproject.service.IFilmService;

@Service
public class FilmService implements IFilmService {

	@Autowired
	IFilmDAO filmDao;
	@Override
	public List<FilmModel> listAllFilm() {
		return filmDao.listAllFilm();
		
	}
	@Override
	public Integer saveFilm(FilmModel filmModel) {
		return filmDao.saveFilm(filmModel);
	}
	@Override
	public void deleteFilm(int id) {
		filmDao.deleteFilm(id);
	}
	@Override
	public void deleteFilmOnCategoryFilmTable(int id) {
		filmDao.deleteFilmOnCategoryFilmTable(id);
	}
	
	public int getTheLastID() {
		return filmDao.getTheLastID();
	}
	@Override
	public FilmModel getFilmById(int id) {
		return filmDao.getFilmById(id);
	}
	@Override
	public void updateImagePath(int id, String path) {
		filmDao.updateImagePath(id, path);
	}
	@Override
	public void updateFilm(FilmModel filmModel) {
		filmDao.updateFilm(filmModel);
	}
	
	
	
	
	
	
	
	
	

}
