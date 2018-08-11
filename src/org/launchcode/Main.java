package org.launchcode;

import org.launchcode.comparators.AreaComparator;
import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        NameComparator comparator = new NameComparator();
        cities.sort(comparator);

        printCities(cities);

       /* ArrayList<City> states = CityData.loadData();
        states.sort(new StateComparator());
        printCities(states);

        ArrayList<City> population = CityData.loadData();
        population.sort(new PopulationComparator());
        printCities(population);

        ArrayList<City> areas = CityData.loadData();
        areas.sort(new AreaComparator());
        printCities(areas);*/
    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }

}
