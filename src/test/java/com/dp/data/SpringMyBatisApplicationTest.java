package com.dp.data;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.dp.data.dao.TUserMapper;
import com.dp.data.entity.TUser;

import tk.mybatis.mapper.entity.Example;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SpringMyBatisApplicationTest {
	
	@Autowired
    private TUserMapper usersmapper;
	
	
//	@Test
//	public void selectAll() {
//		List<TUser> users = usersmapper.selectAll();
//		for(TUser user : users) {
//			System.out.println(user.getName());
//		}
//	}
	
//	@Test
//	public void insertSelective() {
//		TUser user = new TUser();
//		user.setEmail("aaa@sss");
//		user.setName("dphhjhj");
//		user.setPassword("aaaa");
//		usersmapper.insertSelective(user);
//		
//	}
	
//	@Test
//	public void deleteAll() {
//		TUser usr = new TUser();
//		usersmapper.delete(usr);
//	}
	
//	@Test
//	public void deleteAll() {
//		TUser usr = new TUser();
//		usr.setUserId(10);
//		usersmapper.delete(usr);
//	}
	
	
	@Test
    public void selectByExample() {
        Example example = new Example(TUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("name", "%dp%");
        //criteria.andEqualTo("email", "aaa@sss");
        List<TUser> users = usersmapper.selectByExample(example);
        users.forEach(System.out :: println);
    }
	
}
