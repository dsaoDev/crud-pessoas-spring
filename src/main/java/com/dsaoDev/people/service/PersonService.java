package com.dsaoDev.people.service;

import java.util.List;

import com.dsaoDev.people.dto.PersonRequestDTO;
import com.dsaoDev.people.dto.PersonResponseDTO;

public interface PersonService {
	
	PersonResponseDTO findById(Long id);
	
	List<PersonResponseDTO> findAll();
	
	PersonResponseDTO save(PersonRequestDTO personDTO);
	
	PersonResponseDTO update(PersonRequestDTO personDTO, Long id);
	
	String delete (Long id);

}
