package com.dsaoDev.people.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsaoDev.people.dto.PersonRequestDTO;
import com.dsaoDev.people.dto.PersonResponseDTO;
import com.dsaoDev.people.entity.Person;
import com.dsaoDev.people.repository.PersonRepository;
import com.dsaoDev.people.util.PersonMapper;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private PersonMapper personMapper;

	@Override
	public PersonResponseDTO findById(Long id) {
		
		return personMapper.toPersonDTO(returnPerson(id));
	}

	@Override
	public List<PersonResponseDTO> findAll() {
		return personMapper.listConverter(personRepository.findAll());
	}

	@Override
	public PersonResponseDTO save(PersonRequestDTO personDTO) {
		
		Person person = personMapper.toPerson(personDTO);
		return personMapper.toPersonDTO(personRepository.save(person));
	}

	@Override
	public PersonResponseDTO update(PersonRequestDTO personDTO, Long id) {
		Person person = returnPerson(id);
		personMapper.updatePersonData(person, personDTO);
		return personMapper.toPersonDTO(personRepository.save(person));
	
	}

	@Override
	public String delete(Long id) {
	personRepository.deleteById(id);
		return "Person id: "+ id + "deleted";
	}
	
	private Person returnPerson(Long id) {
		return personRepository.findById(id).orElseThrow();
	
	}
	
	

}
