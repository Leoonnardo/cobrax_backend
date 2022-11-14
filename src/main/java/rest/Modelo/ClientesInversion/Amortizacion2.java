package rest.Modelo.ClientesInversion;


import javax.persistence.*;

@Entity
@Table(name = "amortizacion2")
public class Amortizacion2 {

    public Amortizacion2(){}

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
    private double interes;

    @Column(name = "capital")
    private int capital;

    @Column(name = "iva")
    private int iva;

    @Column(name = "totalMensual")
    private double totalMensual;

    @Column(name = "balanceFinal")
    private int balanceFinal;

    @Column(name = "periodosFactura")
    private String periodosFactura;

    @Column(name = "factura")
    private String factura;

    @Column(name = "periodo")
    private String periodo;

    @Column(name = "fechaPago")
    private String fechaPago;

    @Column(name = "referenciaPago")
    private String referenciaPago;

    public Amortizacion2(int idAmortizacion, int mes, int monto, String pagoSinIva, double interes, int capital, int iva, double totalMensual, int balanceFinal, String periodosFactura, String factura, String periodo, String fechaPago, String referenciaPago) {
        this.idAmortizacion = idAmortizacion;
        this.mes = mes;
        this.monto = monto;
        this.pagoSinIva = pagoSinIva;
        this.interes = interes;
        this.capital = capital;
        this.iva = iva;
        this.totalMensual = totalMensual;
        this.balanceFinal = balanceFinal;
        this.periodosFactura = periodosFactura;
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

    public double getInteres() {
        return interes;
    }

    public void setInteres(double intereses) {
        this.interes = intereses;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
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

    public String getPeriodosFactura() {
        return periodosFactura;
    }

    public void setPeriodosFactura(String periodosFactura) {
        this.periodosFactura = periodosFactura;
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
