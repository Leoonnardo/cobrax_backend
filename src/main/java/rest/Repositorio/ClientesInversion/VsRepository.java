package rest.Repositorio.ClientesInversion;

import org.springframework.data.repository.CrudRepository;
import rest.Modelo.ClientesInversion.Vs;

import java.util.List;

public interface VsRepository extends CrudRepository<Vs, Integer> {
    List<Vs> findAll();
}