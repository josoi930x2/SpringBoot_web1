package net.datasa.web1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticTestController {
	
	// localhost:8888/image
	@GetMapping("image")
	public String imageTest() {
		return "imageView";
	}
	
	// localhost:8888/sub/image2로 접속했을 때
	@GetMapping("sub/image2")
	public String imageTest2() {
		return "imageView2";
	}
	
	// localhost:8888/css
	@GetMapping("css")
	public String cssTest() {
		return "cssView";
	}
	
	// localhost:8888/js
	@GetMapping("js")
	public String jsTest() {
		return "jsView";
	}

}
