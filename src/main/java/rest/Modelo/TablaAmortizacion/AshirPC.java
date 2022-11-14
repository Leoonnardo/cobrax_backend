package rest.Modelo.TablaAmortizacion;


import javax.persistence.*;

@Entity
@Table(name = "ashirprestamocapital")
public class AshirPC {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrestamo;

    @Column(name = "numeroPago")
    private int numeroPago;

    @Column(name = "abonoCapital")
    private Double abonoCapital;

    @Column(name = "abonoInteres")
    private Double abonoInteres;

    @Column(name = "pago")
    private Double pago;

    @Column(name = "saldo")
    private Double saldo;

    @Column(name = "fechaPago")
    private String fechaPago;

    public AshirPC(){}

    public AshirPC(int idPrestamo, int numeroPago, Double abonoCapital, Double abonoInteres, Double pago, Double saldo, String fechaPago) {
        this.idPrestamo = idPrestamo;
        this.numeroPago = numeroPago;
        this.abonoCapital = abonoCapital;
        this.abonoInteres = abonoInteres;
        this.pago = pago;
        this.saldo = saldo;
        this.fechaPago = fechaPago;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    public Double getAbonoCapital() {
        return abonoCapital;
    }

    public void setAbonoCapital(Double abonoCapital) {
        this.abonoCapital = abonoCapital;
    }

    public Double getAbonoInteres() {
        return abonoInteres;
    }

    public void setAbonoInteres(Double abonoInteres) {
        this.abonoInteres = abonoInteres;
    }

    public Double getPago() {
        return pago;
    }

    public void setPago(Double pago) {
        this.pago = pago;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

}
