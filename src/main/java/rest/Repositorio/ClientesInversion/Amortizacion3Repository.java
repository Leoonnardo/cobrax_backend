package rest.Repositorio.ClientesInversion;

import org.springframework.data.repository.CrudRepository;
import rest.Modelo.ClientesInversion.Amortizacion3;

import java.util.List;

public interface Amortizacion3Repository extends CrudRepository<Amortizacion3, Integer> {
    List<Amortizacion3> findAll();
}