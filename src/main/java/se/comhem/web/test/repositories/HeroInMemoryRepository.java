package se.comhem.web.test.repositories;

import org.springframework.stereotype.Repository;
import se.comhem.web.test.domain.Gender;
import se.comhem.web.test.domain.Hero;
import se.comhem.web.test.domain.MarvelHero;

import java.util.HashMap;
import java.util.Map;

@Repository("inMemoryRepository")
public class HeroInMemoryRepository implements HeroRepository {

    private Map<Integer,Hero> repository = new HashMap<Integer,Hero>();

    public HeroInMemoryRepository() {

        save(new MarvelHero("SuperMan","Kryptonite",Gender.MAN));
        save(new MarvelHero("Wonder Woman","Having her hands tied by a man",Gender.WOMAN));
        save(new MarvelHero("Power Girl","Any raw, unprocessed natural material",Gender.WOMAN));
        save(new MarvelHero("Captain Marvel Jr.","Saying his own name",Gender.MAN));
        save(new MarvelHero("Thor","Letting go of his hammer for 60 seconds",Gender.MAN));
    }

    public Map<Integer, Hero> list() {
        return repository;
    }

    public Hero get(Integer id) {
        return repository.get(id);
    }

    public void save(Hero hero) {
        repository.put(repository.size(), hero);
    }

}
