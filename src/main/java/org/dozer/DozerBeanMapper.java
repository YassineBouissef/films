package org.dozer;

import org.springframework.context.annotation.Bean;

import com.models.evaluation.Evaluation;
import com.models.user.User;

import dto.EvaluationDTO;
import dto.UserDTO;

public class DozerBeanMapper {

	public UserDTO map(User user, Class<UserDTO> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Evaluation map(EvaluationDTO evaluationDTO, Class<Evaluation> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public EvaluationDTO map(Evaluation evaluation, Class<Evaluation> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public User map(UserDTO userDTO, Class<User> class1) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Bean
	public DozerBeanMapper dozer() {
		return new DozerBeanMapper();
	}


}
