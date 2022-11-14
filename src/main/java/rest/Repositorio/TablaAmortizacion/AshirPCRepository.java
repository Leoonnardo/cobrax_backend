package rest.Repositorio.TablaAmortizacion;

import org.springframework.data.repository.CrudRepository;
import rest.Modelo.TablaAmortizacion.AshirPC;

import java.util.List;

public interface AshirPCRepository extends CrudRepository<AshirPC, Integer> {
    List<AshirPC> findAll();
}