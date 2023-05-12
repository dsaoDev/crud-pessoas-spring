package com.dsaoDev.people.util;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dsaoDev.people.dto.PersonRequestDTO;
import com.dsaoDev.people.dto.PersonResponseDTO;
import com.dsaoDev.people.entity.Person;

@Component
public class PersonMapper {
	
	public Person toPerson (PersonRequestDTO personDTO) {
		return Person.builder()
				.name(personDTO.getName())
				.age(personDTO.getAge())
				.cpf(personDTO.getCpf())
				
				
				.build();
	}
	
	public PersonResponseDTO toPersonDTO(Person person) {
		return new PersonResponseDTO(person);
	}
	
	public List<PersonResponseDTO> listConverter(List<Person> peopleList){
		return peopleList.stream().map(x -> new PersonResponseDTO(x)).toList();
	}
	
	public void updatePersonData(Person person, PersonRequestDTO personDTO) {
		person.setName(personDTO.getName());
		person.setCpf(personDTO.getCpf());
		person.setAge(personDTO.getAge());
	}
}
