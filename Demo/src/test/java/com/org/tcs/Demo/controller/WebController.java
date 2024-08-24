package com.org.tcs.Demo.controller;

import java.lang.reflect.Method;

import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.tcs.Demo.model.PostResponse;
import com.org.tcs.Demo.model.SampleResponse;

@RestController
@RequestMapping("/hello")
public class WebController {
	
	
	@GetMapping("/abc")
	public SampleResponse Sample(@RequestParam(value="Name",defaultValue = "Nikhil")String name) {
			SampleResponse res = new SampleResponse();
			res.setId(1);
			res.setMessage("Nikhil");
			return res;		
	}
	
	
	@PostMapping
	public PostResponse  Test(@RequestBody PostRquest inputPayload) {
		PostResponse response= new PostResponse();
		
	}
}
