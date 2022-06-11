package com.boot.cardatabase.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path="arabalar")
public interface CarRepository extends CrudRepository<Car, Long> , PagingAndSortingRepository<Car, Long> {

    List<Car> findByBrand(@Param("marka") String brand);
    List<Car> findByColor(@Param("renk") String color);
    //List<Car> findByYear(int year);
    //List<Car> findByBrandAndModel(String brand, String model);
    //List<Car> findByBrandAndColor(String brand, String color);
    //List<Car> findByBrandOrderByYearAsc(String brand);

    //@Query("select c from Car c where c.brand = ?1")
    //List<Car> findByBrand(String brand);
    //List<Car> findByBrandEndsWith(String brand);
}
