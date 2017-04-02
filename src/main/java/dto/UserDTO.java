package dto;


import java.io.Serializable;

public class UserDTO  implements Serializable {

	private static final long serialVersionUID = -6608062330490381145L;

	private Integer id;

	public UserDTO() {
		super();
	}

	public UserDTO(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + "]";
	}
}