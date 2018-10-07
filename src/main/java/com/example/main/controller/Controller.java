package com.example.main.controller;

import com.example.main.entity.FormEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class Controller {
	@Autowired
	private IMyBean myBean;
	private final static Logger LOGGER = LoggerFactory.getLogger(Controller.class);
	
	@GetMapping("home")
	public String getIndex(){
        LOGGER.info("Serving GET request for home page");
		return "index";
	}

	@GetMapping("first")
	public String getOne(){
	    LOGGER.info("Serving GET request for one page");
		return "one";
	}	
	
	@GetMapping("/forms")
	public ResponseEntity<FormEntity> getFormEntity(){
	    LOGGER.info("Serving GET request for all forms");
		myBean.display();
		FormEntity formEntity = new FormEntity();
		formEntity.setFormId(101);
		formEntity.setUserId(201);
		formEntity.setFormName("Demo");
		formEntity.setFormDesc("Demo Description");
		return new ResponseEntity<FormEntity>(formEntity,HttpStatus.OK);
	}
	
	@PostMapping("/forms")
	public ResponseEntity<String> postFormEntity(@RequestBody FormEntity formEntity){
		System.out.println(formEntity);
		return new ResponseEntity<String>("Works",HttpStatus.OK);
	}
	
	@PutMapping("/forms/{formId}")
	public ResponseEntity<String> putFormEntity(@PathVariable("formId") Integer formId, @RequestBody FormEntity formEntity){
		System.out.println(formId);
		System.out.println(formEntity);
		return new ResponseEntity<String>("Works",HttpStatus.OK);
	}
	
	@DeleteMapping("/forms/{formId}")
	public ResponseEntity<String> deleteFormEntity(@PathVariable("formId") Integer formId){
		System.out.println(formId);
		return new ResponseEntity<String>("Works",HttpStatus.OK);
	}
}
