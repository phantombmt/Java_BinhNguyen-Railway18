package com.vti.backend.datalayer;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Role;
import com.vti.entity.User;

public class UserRepository {
	
	public List<User> getListUsersRepository(){
		return initListUsers();
	}
	
	private List<User> initListUsers(){
		
		List<User> listUsers = new ArrayList<>();
		
		User user1 = new User(1,"Nguyen Van A","anguyen@gmail.com","abc1",Role.ADMIN);
		User user2 = new User(2,"Nguyen Van B","bnguyen@gmail.com","abc2",Role.USER);
		User user3 = new User(3,"Nguyen Van C","cnguyen@gmail.com","abc3",Role.ADMIN);
		User user4 = new User(4,"Nguyen Van D","dnguyen@gmail.com","abc4",Role.SECURITY);
		listUsers.add(user1);
		listUsers.add(user2);
		listUsers.add(user3);
		listUsers.add(user4);
		
		return listUsers;
	}

}
