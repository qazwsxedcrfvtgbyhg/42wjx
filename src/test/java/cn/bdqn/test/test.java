package cn.bdqn.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.bdqn.main.bean.User;

public class test {

	@Test
	public void test() {
		
		User user=new User();
		user.setName("asd");
		System.out.println(user.getName());
	}

}
