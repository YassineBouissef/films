package dto;

import java.io.Serializable;

import com.models.film.Film;
import com.models.user.User;

public class EvaluationDTO implements Serializable{
	private static final long serialVersionUID = 554332449155193577L;
	
	private Integer id;
	private Integer points;
	private UserDTO userDTO;
	private FilmDTO filmDTO;
	
	public EvaluationDTO() {
		super();
	}

	public EvaluationDTO(Integer id, Integer points, UserDTO userDTO, FilmDTO filmDTO) {
		super();
		this.id = id;
		this.points = points;
		this.userDTO = userDTO;
		this.filmDTO = filmDTO;
	}

	public EvaluationDTO(Integer id2, Integer points2, User user, Film film) {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public FilmDTO getFilmDTO() {
		return filmDTO;
	}

	public void setFilmDTO(FilmDTO filmDTO) {
		this.filmDTO = filmDTO;
	}


}
