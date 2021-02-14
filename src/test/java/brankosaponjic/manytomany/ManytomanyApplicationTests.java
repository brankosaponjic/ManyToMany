package brankosaponjic.manytomany;

import brankosaponjic.manytomany.entity.Programmer;
import brankosaponjic.manytomany.repository.ProgrammerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class ManytomanyApplicationTests {

    @Autowired
    ProgrammerRepository programmerRepository;

    @Test
    void testFindProgrammer() {
        Optional<Programmer> programmer = programmerRepository.findById(1);
        if (programmer.isPresent()) {
            System.out.println(programmer);
        }
    }

}