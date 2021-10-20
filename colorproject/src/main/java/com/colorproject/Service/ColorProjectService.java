package com.colorproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colorproject.model.Color;
import com.colorproject.model.User;
import com.colorproject.repository.ColorProjectRepo;
import com.colorproject.repository.ColorProjectUser_Rep;

@Service
public class ColorProjectService {

	@Autowired
	ColorProjectRepo colorProjectRepo;
	
	@Autowired
	ColorProjectUser_Rep colorProjectUser_Repo;
	
	public List<Color> getAllColor() {
		
		List<Color> findAll = colorProjectRepo.findAll();
		
		return findAll;
		
	}

	public User submitForm(User user) {
		
		User save = colorProjectUser_Repo.save(user);
		
		return save;
		
	}

	public List<User> getAllUser() {
		
		List<User> findAll = colorProjectUser_Repo.findAll();
		
		return findAll;
	}
	
	

}
