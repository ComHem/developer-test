package se.comhem.web.test.repositories;

import org.springframework.stereotype.Repository;
import se.comhem.web.test.domain.Hero;

import java.util.Map;

@Repository("fileBasedRepository")
public class HeroFileBasedRepository implements HeroRepository {

    public Map<Integer, Hero> list() {
        // TODO: Implement
        return null;
    }

    public Hero get(Integer id) {
        // TODO: Implement
        return null;
    }

    public void save(Hero hero) {
        // TODO: Implement
    }
}
