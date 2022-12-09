package com.revature.service;


import com.revature.dao.SuperHeroDao;
import com.revature.dao.SuperHeroDaoImpl;
import com.revature.model.Superhero;
import com.revature.util.DaoFactory;

public class SuperheroService {
    private SuperHeroDao superheroDao;

    // pass in a particular implementation of the super hero dao:
    public SuperheroService(SuperHeroDao superHeroDao) {
        // do the creation of the dao:
        this.superheroDao = superHeroDao;
    }

    public Superhero save(Superhero superhero) {
        // invoking the methods from the DAO:
        // we need an instance of the DAO implementation class:
        this.superheroDao.save(superhero);
        return superhero;
    }


}