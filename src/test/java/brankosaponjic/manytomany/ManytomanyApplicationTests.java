package brankosaponjic.manytomany;

import brankosaponjic.manytomany.entity.Programmer;
import brankosaponjic.manytomany.entity.Project;
import brankosaponjic.manytomany.repository.ProgrammerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class ManytomanyApplicationTests {

    @Autowired
    ProgrammerRepository programmerRepository;

    @Test
    void testCreateProgrammer() {
        Programmer programmer = new Programmer();
        programmer.setName("Branko");
        programmer.setSalary(1200.00);

        HashSet<Project> projects = new HashSet<>();
        programmer.setProjects(projects);

        Project project = new Project();
        project.setName("Hibernate project");
        projects.add(project);

        programmerRepository.save(programmer);
    }

}