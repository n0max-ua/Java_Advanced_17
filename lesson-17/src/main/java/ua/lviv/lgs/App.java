package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.domain.University;
import ua.lviv.lgs.service.UService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
		UService service = context.getBean(UService.class);
		
		University university = new University();
		university.setNameOfUniversity("WWW");
		university.setLevelOfAccreditation(11);
		university.setNumberOfInstitutes(11);
		university.setNumberOfStudents(123123);
		university.setUniversityAddress("Shkaf");
		
		System.out.println(university);
		
		service.save(university);
		
		System.out.println(service.findAll());
		
		System.out.println(service.findByNameOfUniversity("NASA"));
		
		System.out.println(service.findByLevelOfAccreditation(11));
		
		University forUpdate = service.findById(4);
		forUpdate.setNameOfUniversity("WASD");
		forUpdate.setLevelOfAccreditation(15);
		forUpdate.setNumberOfInstitutes(8);
		forUpdate.setUniversityAddress("Hell");
		forUpdate.setNumberOfStudents(666);
		
		service.update(forUpdate);
		
		System.out.println(service.findAll());
		
		service.deleteById(4);
		
		System.out.println(service.findAll());

	}

}
