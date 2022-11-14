package rest.Repositorio.ClientesInversion;

import org.springframework.data.repository.CrudRepository;
import rest.Modelo.ClientesInversion.Amortizacion1;

import java.util.List;

public interface Amortizacion1Repository extends CrudRepository<Amortizacion1, Integer> {
    List<Amortizacion1> findAll();
}