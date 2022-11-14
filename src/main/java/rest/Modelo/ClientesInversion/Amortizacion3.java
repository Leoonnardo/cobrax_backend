package rest.Modelo.ClientesInversion;


import javax.persistence.*;

@Entity
@Table(name = "amortizacion3")
public class Amortizacion3 {

    public Amortizacion3(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAmortizacion;

    @Column(name = "mes")
    private int mes;

    @Column(name = "monto")
    private int monto;

    @Column(name = "pagoSinIva")
    private int pagoSinIva;

    @Column(name = "interes")
    private double interes;

    @Column(name = "capital")
    private int capital;

    @Column(name = "retencion")
    private int retencion;

    @Column(name = "iva")
    private double iva;

    @Column(name = "totalMensual")
    private double totalMensual;

    @Column(name = "balanceFinal")
    private int balanceFinal;

    @Column(name = "factura")
    private String factura;

    @Column(name = "periodo")
    private String periodo;

    @Column(name = "fechaPago")
    private String fechaPago;

    @Column(name = "referenciaPago")
    private String referenciaPago;

    public Amortizacion3(int idAmortizacion, int mes, int monto, int pagoSinIva, double interes, int capital, int retencion, double iva, double totalMensual, int balanceFinal, String factura, String periodo, String fechaPago, String referenciaPago) {
        this.idAmortizacion = idAmortizacion;
        this.mes = mes;
        this.monto = monto;
        this.pagoSinIva = pagoSinIva;
        this.interes = interes;
        this.capital = capital;
        this.retencion = retencion;
        this.iva = iva;
        this.totalMensual = totalMensual;
        this.balanceFinal = balanceFinal;
        this.factura = factura;
        this.periodo = periodo;
        this.fechaPago = fechaPago;
        this.referenciaPago = referenciaPago;
    }

    public int getIdAmortizacion() {
        return idAmortizacion;
    }

    public void setIdAmortizacion(int idAmortizacion) {
        this.idAmortizacion = idAmortizacion;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getPagoSinIva() {
        return pagoSinIva;
    }

    public void setPagoSinIva(int pagoSinIva) {
        this.pagoSinIva = pagoSinIva;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public int getRetencion() {
        return retencion;
    }

    public void setRetencion(int retencion) {
        this.retencion = retencion;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalMensual() {
        return totalMensual;
    }

    public void setTotalMensual(double totalMensual) {
        this.totalMensual = totalMensual;
    }

    public int getBalanceFinal() {
        return balanceFinal;
    }

    public void setBalanceFinal(int balanceFinal) {
        this.balanceFinal = balanceFinal;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getReferenciaPago() {
        return referenciaPago;
    }

    public void setReferenciaPago(String referenciaPago) {
        this.referenciaPago = referenciaPago;
    }
}
