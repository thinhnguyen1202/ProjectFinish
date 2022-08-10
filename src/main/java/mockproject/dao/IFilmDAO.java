package mockproject.dao;

import java.util.List;

import mockproject.model.FilmModel;

public interface IFilmDAO extends GenericDAO<FilmModel> {
	List<FilmModel> listAllFilm();
	
	int saveFilm(FilmModel filmModel);
	
	void deleteFilm(int id);
	
	void deleteFilmOnCategoryFilmTable(int id);
	
	int getTheLastID();
	
	FilmModel getFilmById(int id);
	
	void updateImagePath(int id,String path);
	
	void updateFilm(FilmModel filmModel);
}
