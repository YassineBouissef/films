package dto;

import java.util.List;

public class CategoryDTO {

	private Integer id;
	private String name;
	private List<FilmDTO> filmsDTO;
	
	public CategoryDTO() {
		super();
	}
	
	public CategoryDTO(Integer id, String name, List<FilmDTO> filmsDTO) {
		super();
		this.id = id;
		this.name = name;
		this.filmsDTO = filmsDTO;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<FilmDTO> getFilmsDTO() {
		return filmsDTO;
	}
	public void setFilmsDTO(List<FilmDTO> filmsDTO) {
		this.filmsDTO = filmsDTO;
	}
	
	

}
