package rest.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rest.Modelo.ClientesInversion.*;
import rest.Modelo.TablaAmortizacion.ApsaraPC;
import rest.Modelo.TablaAmortizacion.AshirPC;
import rest.Modelo.TablaAmortizacion.Inversion;
import rest.Repositorio.ClientesInversion.*;
import rest.Repositorio.TablaAmortizacion.ApsaraPCRepository;
import rest.Repositorio.TablaAmortizacion.AshirPCRepository;
import rest.Repositorio.TablaAmortizacion.InversionRepository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class InversionController {
    @Autowired
    InversionRepository inversionRepository;
    @Autowired
    ApsaraPCRepository apsaraPCRepository;

    @Autowired
    AshirPCRepository ashirPCRepository;

    @Autowired
    ClientesInversionRepository clientesInversionRepository;

    @Autowired
    VsRepository vsRepository;

    @Autowired
    Amortizacion1Repository amortizacion1Repository;

    @Autowired
    Amortizacion2Repository amortizacion2Repository;

    @Autowired
    Amortizacion3Repository amortizacion3Repository;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/tablaAmortizacion/inversion")
    public List<Inversion> getListaInversion(){
        return inversionRepository.findAll();
    }

    @GetMapping(value = "/tablaAmortizacion/apsaraPC")
    public List<ApsaraPC> getListaApsaraPC(){
        return apsaraPCRepository.findAll();
    }

    @GetMapping(value = "/tablaAmortizacion/ashirPC")
    public List<AshirPC> getListaAshirPC(){
        return ashirPCRepository.findAll();
    }

    @GetMapping(value = "/ClientesInversion/clientesInversion")
    public List<ClientesInversion> getListaClientesInversion(){
        return clientesInversionRepository.findAll();
    }

    @GetMapping(value = "/ClientesInversion/Vs")
    public List<Vs> getListaVs(){
        return vsRepository.findAll();
    }

    @GetMapping(value = "/ClientesInversion/Amortizacion1")
    public List<Amortizacion1> getListaAmortizacion1(){
        return amortizacion1Repository.findAll();
    }

    @GetMapping(value = "/ClientesInversion/Amortizacion2")
    public List<Amortizacion2> getListaAmortizacion2(){
        return amortizacion2Repository.findAll();
    }

    @GetMapping(value = "/ClientesInversion/Amortizacion3")
    public List<Amortizacion3> getListaAmortizacion3(){
        return amortizacion3Repository.findAll();
    }

}