package se.comhem.web.test.repositories;

import se.comhem.web.test.domain.Hero;

import java.util.Map;

/**
 * Copyright (c) 2013 Com Hem AB, Stockholm. All rights reserved.
 *
 * @author Steve Carrigan
 */
public interface HeroRepository {

    Map<Integer, Hero> list();
    Hero get(Integer id);
    void save(Hero hero);

}
