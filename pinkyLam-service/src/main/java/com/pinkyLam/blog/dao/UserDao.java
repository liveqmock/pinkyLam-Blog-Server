package com.pinkylam.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pinkylam.blog.entity.User;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年7月10日 上午11:31:04
 */

@Repository
public interface UserDao extends JpaRepository<User, Long> {

	public User findUserByNameAndPsw(String name, String psw);

}
