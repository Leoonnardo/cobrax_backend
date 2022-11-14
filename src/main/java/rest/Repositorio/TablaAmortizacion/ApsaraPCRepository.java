package rest.Repositorio.TablaAmortizacion;

import org.springframework.data.repository.CrudRepository;
import rest.Modelo.TablaAmortizacion.ApsaraPC;

import java.util.List;

public interface ApsaraPCRepository extends CrudRepository<ApsaraPC, Integer> {
    List<ApsaraPC> findAll();
}