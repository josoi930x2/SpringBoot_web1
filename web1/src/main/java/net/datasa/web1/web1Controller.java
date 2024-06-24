package net.datasa.web1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 외부로부터 들어오는 요청을 받아서 메서드와 연결시켜줌
@Controller
public class web1Controller {
	
	// http://localhost:8888/ 경로로 요청이 들어왔을 때 실행될 메소드
	@GetMapping({"","/"})
	public String Home() {
		
		// templates 경로의 mainHome.html
		return "mainHome";
		
	}


}
