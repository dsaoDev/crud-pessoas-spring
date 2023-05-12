package com.dsaoDev.people.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.dsaoDev.people.dto.PersonRequestDTO;
import com.dsaoDev.people.dto.PersonResponseDTO;
import com.dsaoDev.people.service.PersonService;

@RestController
@RequestMapping(value = "/people")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PersonResponseDTO> findById(@PathVariable(name = "id") Long id) {
		return ResponseEntity.ok().body(personService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<PersonResponseDTO>> findAll(){
		return ResponseEntity.ok().body(personService.findAll());
	}
	
	@PostMapping
	public ResponseEntity<PersonResponseDTO> save(@RequestBody PersonRequestDTO personRequestDTO, UriComponentsBuilder uriBuilder){
		PersonResponseDTO personResponseDTO = personService.save(personRequestDTO);
		URI uri  = uriBuilder.path("/people/{id}").buildAndExpand(personResponseDTO.getId()).toUri();
		return ResponseEntity.created(uri).body(personResponseDTO);
		
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<PersonResponseDTO> update (@RequestBody PersonRequestDTO personRequestDTO, @PathVariable(name = "id") Long id){
		return ResponseEntity.ok().body(personService.update(personRequestDTO, id));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<String> delete (@PathVariable(name =  "id") Long id){
		return ResponseEntity.ok().body(personService.delete(id));
	}
	

}
