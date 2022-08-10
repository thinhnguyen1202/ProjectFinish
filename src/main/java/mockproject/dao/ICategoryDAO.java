package mockproject.dao;

import java.util.List;

import mockproject.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel> {
	
	List<CategoryModel> listAllCategoryModels();
	
	List<CategoryModel> listAllCategoryByFilmid(int film_id);
	
	List<String> listALlCategoryName();
	
	int findCategoryIdByName(String name);
}
