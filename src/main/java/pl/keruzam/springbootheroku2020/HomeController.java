package pl.keruzam.springbootheroku2020;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/home")
	@ResponseBody
	public String hello() {
		return "SpringBoot works";
	}

}
