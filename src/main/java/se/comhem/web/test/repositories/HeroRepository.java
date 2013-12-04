package se.comhem.web.test.repositories;

import se.comhem.web.test.domain.Hero;

import java.util.Map;

public interface HeroRepository {

    Map<Integer, Hero> list();
    Hero get(Integer id);
    void save(Hero hero);

}
