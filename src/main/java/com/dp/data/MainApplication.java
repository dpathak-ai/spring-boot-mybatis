package com.dp.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dp.data.dao.TUserMapper;
import com.dp.data.entity.TUser;

import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.dp.data.dao")
@SpringBootApplication
public class MainApplication  implements ApplicationRunner{
	
	@Autowired
    private TUserMapper usersmapper;

	
	public static void main(String[] args) {
		 SpringApplication.run(MainApplication.class, args);

	}

	public void run(ApplicationArguments args) throws Exception {
		List<TUser> users = usersmapper.selectAll();
		for(TUser user : users) {
			System.out.println(user.getName());
		}
		
	}

}
