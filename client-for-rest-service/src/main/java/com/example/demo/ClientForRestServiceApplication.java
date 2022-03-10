package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;

@SpringBootApplication
public class ClientForRestServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(ClientForRestServiceApplication.class, args);
		
		RestTemplate template = ctx.getBean(RestTemplate.class);
		
		HttpEntity<HttpHeaders> entity = ctx.getBean(HttpEntity.class);
		
		
		//String response= template.getForObject("http://localhost:1078/api/v1/students", String.class);
		
		String response = template.exchange("http://localhost:1055/api/v1/students",
					HttpMethod.GET, entity, String.class).getBody();
					
		System.out.println("Response from REST APi:="+response);
		
		String body ="{'rollNumber':89,'studentName':'kumar','markScored':78}";
		
		
//		Student ram=new Student(967,"rahu",78);
//		
//		HttpEntity<Student> data = new HttpEntity <Student>(ram);
//		
//		ResponseEntity<Student> response = template.postForEntity("http://localhost:1078/api/v1/students", data, Student.class);
//		
//		System.out.println(response.getBody());
//		System.out.println("Status Code:="+response.getStatusCodeValue());
//		System.out.println("Location:="+ response.getHeaders().get("location"));
		
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//
//		Map<String, Object> map = new HashMap<>();
//		map.put("rollNumber", 696);
//		map.put("studentName", "ari");
//		map.put("markScored",99);

		//HttpEntity<Map<String,Object>> entity = new HttpEntity<>(map,headers);

		//ResponseEntity<String> response = template.postForEntity("http://localhost:1078/api/v1/students",entity, String.class);
		
		//ResponseEntity<Object> response = template.exchange("http://localhost:1078/api/v1/students", HttpMethod.PATCH,entity,Object.class);

//		System.out.println(response.getBody());
//		System.out.println("Status Code:="+response.getStatusCodeValue());
//		System.out.println("Location:="+ response.getHeaders().get("location"));
	}
	
	@Bean
	public HttpHeaders header() {
		
		HttpHeaders header = new HttpHeaders();
		
		header.setContentType(MediaType.APPLICATION_JSON);
		
		return header;
	}
	
	@Bean
	public HttpEntity<HttpHeaders> entity(HttpHeaders header){
		
		HttpEntity<HttpHeaders> entity = new HttpEntity<HttpHeaders>(header);
		
		return entity;
	}
	
	
	@Bean
	public RestTemplate template(BasicAuthenticationInterceptor interceptor) {
		
		RestTemplate template =  new RestTemplate();
		
		template.getInterceptors().add(interceptor);
		
		return template;
	}
	
	@Bean
	public BasicAuthenticationInterceptor interceptor() {
		
		return new BasicAuthenticationInterceptor("srilanka", "srilanka");
	}
}
