package ru.inie.storages;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.inie.storages.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
