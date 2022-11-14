package rest.Modelo.ClientesInversion;


import javax.persistence.*;

@Entity
@Table(name = "amortizacion1")
public class Amortizacion1 {

    public Amortizacion1(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAmortizacion;

    @Column(name = "mes")
    private int mes;

    @Column(name = "monto")
    private int monto;

    @Column(name = "pagoSinIva")
    private String pagoSinIva;

    @Column(name = "interes")
    private int interes;

    @Column(name = "capital")
    private int capital;

    @Column(name = "retencionIsr")
    private int retencionIsr;

    @Column(name = "totalMensual")
    private int totalMensual;

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

    public Amortizacion1(int idAmortizacion, int mes, int monto, String pagoSinIva, int interes, int capital, int retencionIsr, int totalMensual, int balanceFinal, String factura, String periodo, String fechaPago, String referenciaPago) {
        this.idAmortizacion = idAmortizacion;
        this.mes = mes;
        this.monto = monto;
        this.pagoSinIva = pagoSinIva;
        this.interes = interes;
        this.capital = capital;
        this.retencionIsr = retencionIsr;
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

    public String getPagoSinIva() {
        return pagoSinIva;
    }

    public void setPagoSinIva(String pagoSinIva) {
        this.pagoSinIva = pagoSinIva;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int intereses) {
        this.interes = intereses;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public int getRetencionIsr() {
        return retencionIsr;
    }

    public void setRetencionIsr(int retencionIsr) {
        this.retencionIsr = retencionIsr;
    }

    public int getTotalMensual() {
        return totalMensual;
    }

    public void setTotalMensual(int totalMensual) {
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
