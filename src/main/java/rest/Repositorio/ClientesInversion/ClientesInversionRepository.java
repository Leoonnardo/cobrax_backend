package rest.Repositorio.ClientesInversion;

import org.springframework.data.repository.CrudRepository;
import rest.Modelo.ClientesInversion.ClientesInversion;

import java.util.List;

public interface ClientesInversionRepository extends CrudRepository<ClientesInversion, Integer> {
    List<ClientesInversion> findAll();
}