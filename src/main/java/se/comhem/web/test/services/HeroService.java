package se.comhem.web.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.comhem.web.test.domain.Hero;
import se.comhem.web.test.repositories.HeroRepository;

import java.util.Map;

@Service
public class HeroService {

    @Autowired
    HeroRepository inMemoryRepository;

    public Map<Integer, Hero> list() {
        return inMemoryRepository.list();
    }

    public Hero get(Integer id) {
        return inMemoryRepository.get(id);
    }

}
