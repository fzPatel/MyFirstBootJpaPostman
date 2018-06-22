package com.example.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Data;
import com.example.service.DataService;
import com.example.service.WelcomeService;

@Controller 
public class WelcomeController {

@Autowired
private WelcomeService service;
@Autowired
private DataService dataservice;

@RequestMapping(value="/",method = RequestMethod.GET)
public String first() 
{
	return "welcome to First Spring Boot App";
}	

@RequestMapping(value="/welcome",method = RequestMethod.GET)
@ResponseBody
	public String welcome() 
	{
		return service.retrieveWelcomeMessage();
	}

//------------------------------Services----------------------------------//

@GetMapping("/data")
@ResponseBody
	public List<Data> getdata() {
		return dataservice.getAlldata();
	}
	
@GetMapping("/data/{name}")
public Optional<Data> getdataById(@PathVariable String name) 
{	
	return dataservice.getAlldataById(name);
}

@RequestMapping(method=RequestMethod.POST,value="/data")
public void addData(@RequestBody Data data) 
{
dataservice.addData(data);
	
}
@RequestMapping(method=RequestMethod.PUT,value="/data/{name}")
public void updateData(@RequestBody Data data,@PathVariable String name) 
{
	dataservice.updateData(name,data);	
}

@RequestMapping(method=RequestMethod.DELETE,value="/data/{name}")
public void deleteData(@PathVariable String name) 
{
	dataservice.deleteData(name);	
}

//------------------------------Services----------------------------------


@RequestMapping(value = "/login", method = RequestMethod.GET)
public String login(Model model) 
{
	return "index";
}

/*
@RequestMapping("/")
public String home(Map<String, Object> model) {
	model.put("message", "HowToDoInJava Reader !!");
	return "index";
}

*/
}