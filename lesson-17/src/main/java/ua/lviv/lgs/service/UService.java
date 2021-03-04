package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.University;

public interface UService {
	University save(University university);

	University findById(Integer id);

	University update(University university);

	void deleteById(Integer id);

	List<University> findAll();

	List<University> findByNameOfUniversity(String nameOfUniversity);

	List<University> findByLevelOfAccreditation(Integer levelOfAccreditation);
}
