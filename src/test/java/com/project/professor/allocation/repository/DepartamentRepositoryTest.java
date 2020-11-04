package com.project.professor.allocation.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.project.professor.allocation.model.Departament;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class DepartamentRepositoryTest {
	
	@Autowired
	private DepartamentRepository departamentRepository;

	@Test
	public void save_create() {
		// Arrange
		Departament departament = new Departament();
		departament.setId(null);
		departament.setName("Departament 1");

		// Act
		departament = departamentRepository.save(departament);

		// Print
		System.out.println(departament);
	}
}
