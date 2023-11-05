package com.project.smms;

import java.io.Serializable;

	import org.springframework.data.jpa.repository.JpaRepository;
	
	import com.project.smms.User;
	
	import org.springframework.stereotype.Repository;
	@Repository

	public interface UserRepository extends JpaRepository<User, Serializable> {

		//User findByNameAndPassword(String name, String password);
	    // can define custom query methods here if needed.
	}


