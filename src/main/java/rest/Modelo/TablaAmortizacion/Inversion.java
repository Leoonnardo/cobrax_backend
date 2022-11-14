package rest.Modelo.TablaAmortizacion;


import javax.persistence.*;

@Entity
@Table(name = "inversion")
public class Inversion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInversion;

    @Column(name = "numeroPago")
    private int numeroPago;

    @Column(name = "fechaPago")
    private String fechaPago;

    @Column(name = "saldo")
    private int saldo;

    @Column(name = "interes")
    private int interes;

    @Column(name = "capital")
    private int capital;

    @Column(name = "interesAcomulado")
    private int interesAcomulado;

    public Inversion(){}

    public Inversion(int id, int numeroPago, String fechaPago, int saldo, int interes, int capital, int interesAcomulado) {
        this.idInversion = id;
        this.numeroPago = numeroPago;
        this.fechaPago = fechaPago;
        this.saldo = saldo;
        this.interes = interes;
        this.capital = capital;
        this.interesAcomulado = interesAcomulado;
    }

    public int getIdInversion() {
        return idInversion;
    }

    public void setIdInversion(int idInversion) {
        this.idInversion = idInversion;
    }

    public int getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public int getInteresAcomulado() {
        return interesAcomulado;
    }

    public void setInteresAcomulado(int interesAcomulado) {
        this.interesAcomulado = interesAcomulado;
    }



}
