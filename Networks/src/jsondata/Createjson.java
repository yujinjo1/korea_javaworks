package jsondata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class Createjson {

	public static void main(String[] args) {
		// json 객체 생성 -{"속성": 속성값}->map 자료구조와 유사 
		
		JSONObject root =new JSONObject();
		
		System.out.println(root);// 빈 json 생성
		
		//속성 추가 
		root.put("id", "sky123");
		root.put("name", "이하늘");
		root.put("age",28);
		root.put("student",true);
		
		//전화 번호(집,핸드폰) 속성 추가 
		JSONObject tel=new JSONObject();
		tel.put("home", "02-111-2222");
		tel.put("mobile", "010-3333-5555");
		root.put("tel",tel);
		
		//배열 속성 추가 
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("C");
		skill.put("C++");

		
		root.put("skill", skill);
		
		//json 데이터를 문자열로 생성 
		String json= root.toString();
		System.out.println(json);
		
		//json데이터를 파일로 저장 
		
		try 
			(Writer writer =new FileWriter("member.json",
					Charset.forName("utf-8"))){
				writer.write(json);
				writer.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}


