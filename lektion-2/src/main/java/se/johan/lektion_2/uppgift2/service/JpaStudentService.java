package se.johan.lektion_2.uppgift2.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("prod")
@Service
public class JpaStudentService implements StudentService{

    @Override
    public String getStudentInfo(Long id) {
        return "Hello from JPA (id = " + id + ")";
    }
}
