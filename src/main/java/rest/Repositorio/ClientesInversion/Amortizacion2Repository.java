package rest.Repositorio.ClientesInversion;

import org.springframework.data.repository.CrudRepository;
import rest.Modelo.ClientesInversion.Amortizacion2;

import java.util.List;

public interface Amortizacion2Repository extends CrudRepository<Amortizacion2, Integer> {
    List<Amortizacion2> findAll();
}