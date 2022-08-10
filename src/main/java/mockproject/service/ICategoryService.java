package mockproject.service;

import java.util.List;

import mockproject.model.CategoryModel;

public interface ICategoryService  {
	List<CategoryModel> listAllCategoryModels();
	List<CategoryModel> listAllCategoryByFilmid(int film_id);
	List<String> listALlCategoryName();
	int findCategoryIdByName(String name);
}
