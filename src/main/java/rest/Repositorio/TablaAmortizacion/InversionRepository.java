package rest.Repositorio.TablaAmortizacion;

import org.springframework.data.repository.CrudRepository;
import rest.Modelo.TablaAmortizacion.Inversion;

import java.util.List;

public interface InversionRepository extends CrudRepository<Inversion, Integer> {
    List<Inversion> findAll();
}