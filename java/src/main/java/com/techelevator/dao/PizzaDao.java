package com.techelevator.dao;

import com.techelevator.model.Pizza;

import java.util.List;

public interface PizzaDao {
    public Pizza createSpecialtyPizza(Pizza pizza);
    public List<Pizza> getAvailableSpecialtyPizzas();
    public Pizza getPizza(int id);
    public Pizza updatePizza(Pizza pizza);
    public List<Pizza> getAllSpecialtyPizzas();
    public Pizza getAvailablePizza(int id);
}
