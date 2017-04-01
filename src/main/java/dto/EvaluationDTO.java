package dto;

import java.io.Serializable;

import com.models.film.Film;
import com.models.user.User;

public class EvaluationDTO implements Serializable{
	private static final long serialVersionUID = 554332449155193577L;
	
	private Integer id;
	private Integer points;
	private User user;
	private Film film;
	
	
	public EvaluationDTO() {
		super();
	}
	
	
	public EvaluationDTO(Integer id, Integer points, User user, Film film) {
		super();
		this.id = id;
		this.points = points;
		this.user = user;
		this.film = film;
	}




	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Film getFilm() {
		return film;
	}


	public void setFilm(Film film) {
		this.film = film;
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


	@Override
	public String toString() {
		return "EvaluationDTO [id=" + id + ", points=" + points + ", user=" + user + ", film=" + film + "]";
	}
	


	
}
