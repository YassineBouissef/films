package dto;

import java.util.List;

public class FilmDTO {

	private Integer id;
	private String title;
	private Integer year;
	private CategoryDTO categoryDTO;
	private List<EvaluationDTO> evaluationsDTO;
	
	public FilmDTO() {
		super();
	}
	public FilmDTO(Integer id, String title, Integer year, CategoryDTO categoryDTO,
			List<EvaluationDTO> evaluationsDTO) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.categoryDTO = categoryDTO;
		this.evaluationsDTO = evaluationsDTO;
	}

	
	public FilmDTO(String title, Integer year) {
		super();
		this.title = title;
		this.year = year;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public CategoryDTO getCategoryDTO() {
		return categoryDTO;
	}
	public void setCategoryDTO(CategoryDTO categoryDTO) {
		this.categoryDTO = categoryDTO;
	}
	public List<EvaluationDTO> getEvaluationsDTO() {
		return evaluationsDTO;
	}
	public void setEvaluationsDTO(List<EvaluationDTO> evaluationsDTO) {
		this.evaluationsDTO = evaluationsDTO;
	}

}
