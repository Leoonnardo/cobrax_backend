package rest.Modelo.ClientesInversion;


import javax.persistence.*;

@Entity
@Table(name = "clientesinversion")
public class ClientesInversion {

    public ClientesInversion(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Column(name = "codigoCliente")
    private String codigoCliente;

    @Column(name = "cliente")
    private String cliente;

    @Column(name = "rfc")
    private String rfc;

    @Column(name = "curp")
    private String curp;

    @Column(name = "fechaInversion")
    private String fechaInversion;

    @Column(name = "tasaAnual")
    private Double tasaAnual;

    @Column(name = "tasaMensual")
    private Double tasaMensual;

    @Column(name = "plazo")
    private int plazo;

    @Column(name = "monto")
    private String monto;

    @Column(name = "retornoCapital")
    private String retornoCapital;

    @Column(name = "incrementoCapital")
    private String incrementoCapital;

    @Column(name = "saldo")
    private String saldo;

    @Column(name = "interesMensual")
    private int interesMensual;

    @Column(name = "fechaTermino")
    private String fechaTermino;

    @Column(name = "comisionPorciento")
    private String comisionPorciento;

    @Column(name = "comisionDinero")
    private String comisionDinero;

    @Column(name = "comisionista")
    private String comisionista;

    @Column(name = "fechaPagoComision")
    private String fechaPagoComision;

    @Column(name = "pagoRendimiento")
    private String pagoRendimiento;

    @Column(name = "doctoPago")
    private String doctoPago;

    @Column(name = "fechaUltimoPago")
    private String fechaUltimoPago;

    @Column(name = "fechaProxPago")
    private String fechaProxPago;

    @Column(name = "correoElectronico")
    private String correoElectronico;

    public ClientesInversion(int idCliente, String codigoCliente, String cliente, String rfc, String curp, String fechaInversion, Double tasaAnual, Double tasaMensual, int plazo, String monto, String retornoCapital, String incrementoCapital, String saldo, int interesMensual, String fechaTermino, String comisionPorciento, String comisionDinero, String comisionista, String fechaPagoComision, String pagoRendimiento, String doctoPago, String fechaUltimoPago, String fechaProxPago, String correoElectronico) {
        this.idCliente = idCliente;
        this.codigoCliente = codigoCliente;
        this.cliente = cliente;
        this.rfc = rfc;
        this.curp = curp;
        this.fechaInversion = fechaInversion;
        this.tasaAnual = tasaAnual;
        this.tasaMensual = tasaMensual;
        this.plazo = plazo;
        this.monto = monto;
        this.retornoCapital = retornoCapital;
        this.incrementoCapital = incrementoCapital;
        this.saldo = saldo;
        this.interesMensual = interesMensual;
        this.fechaTermino = fechaTermino;
        this.comisionPorciento = comisionPorciento;
        this.comisionDinero = comisionDinero;
        this.comisionista = comisionista;
        this.fechaPagoComision = fechaPagoComision;
        this.pagoRendimiento = pagoRendimiento;
        this.doctoPago = doctoPago;
        this.fechaUltimoPago = fechaUltimoPago;
        this.fechaProxPago = fechaProxPago;
        this.correoElectronico = correoElectronico;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getFechaInversion() {
        return fechaInversion;
    }

    public void setFechaInversion(String fechaInversion) {
        this.fechaInversion = fechaInversion;
    }

    public Double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(Double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public Double getTasaMensual() {
        return tasaMensual;
    }

    public void setTasaMensual(Double tasaMensual) {
        this.tasaMensual = tasaMensual;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getRetornoCapital() {
        return retornoCapital;
    }

    public void setRetornoCapital(String retornoCapital) {
        this.retornoCapital = retornoCapital;
    }

    public String getIncrementoCapital() {
        return incrementoCapital;
    }

    public void setIncrementoCapital(String incrementoCapital) {
        this.incrementoCapital = incrementoCapital;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public int getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(int interesMensual) {
        this.interesMensual = interesMensual;
    }

    public String getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(String fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getComisionPorciento() {
        return comisionPorciento;
    }

    public void setComisionPorciento(String comisionPorciento) {
        this.comisionPorciento = comisionPorciento;
    }

    public String getComisionDinero() {
        return comisionDinero;
    }

    public void setComisionDinero(String comisionDinero) {
        this.comisionDinero = comisionDinero;
    }

    public String getComisionista() {
        return comisionista;
    }

    public void setComisionista(String comisionista) {
        this.comisionista = comisionista;
    }

    public String getFechaPagoComision() {
        return fechaPagoComision;
    }

    public void setFechaPagoComision(String fechaPagoComision) {
        this.fechaPagoComision = fechaPagoComision;
    }

    public String getPagoRendimiento() {
        return pagoRendimiento;
    }

    public void setPagoRendimiento(String pagoRendimiento) {
        this.pagoRendimiento = pagoRendimiento;
    }

    public String getDoctoPago() {
        return doctoPago;
    }

    public void setDoctoPago(String doctoPago) {
        this.doctoPago = doctoPago;
    }

    public String getFechaUltimoPago() {
        return fechaUltimoPago;
    }

    public void setFechaUltimoPago(String fechaUltimoPago) {
        this.fechaUltimoPago = fechaUltimoPago;
    }

    public String getFechaProxPago() {
        return fechaProxPago;
    }

    public void setFechaProxPago(String fechaProxPago) {
        this.fechaProxPago = fechaProxPago;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
