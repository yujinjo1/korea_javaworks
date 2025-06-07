package jdbc.users.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import jdbc.users.domain.Users;
import jdbc.users.domain.UsersDAO;

public class UsersTest {

	public static void main(String[] args) {
		Users user= new Users();//Users객체 생성
		UsersDAO dao = new UsersDAO(); //관리객체 생성
		
		//주석 풀어서 새로운 데이터 넣고 실행 후 다시 주석 해놔서 재실행시 중복문제 없게 하기 
		
		
//		user.setuserId("cloud");
//		user.setUserPassword("c1478!!");
//		user.setUserName("흰구름");
//		user.setUserAge(100);
//		dao.insertUser(user);
		
		//System.out.println(user.getUserId());
		
	List<Users> userList =dao.getUserList();
	for(int i=0; i< userList.size(); i++) {
		Users findUser =userList.get(i);
		System.out.println(findUser);
	}
		
	}
	


}
