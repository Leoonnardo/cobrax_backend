package rest.Modelo.ClientesInversion;


import javax.persistence.*;

@Entity
@Table(name = "vs")
public class Vs {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVs;

    @Column(name = "semanas")
    private int semanas;

    @Column(name = "ashir")
    private Double ashir;

    @Column(name = "apsara")
    private Double apsara;

    public Vs(){}

    public Vs(int idVs, int semanas, Double ashir, Double apsara) {
        this.idVs = idVs;
        this.semanas = semanas;
        this.ashir = ashir;
        this.apsara = apsara;
    }

    public int getIdVs() {
        return idVs;
    }

    public void setIdVs(int idVs) {
        this.idVs = idVs;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public Double getAshir() {
        return ashir;
    }

    public void setAshir(Double ashir) {
        this.ashir = ashir;
    }

    public Double getApsara() {
        return apsara;
    }

    public void setApsara(Double apsara) {
        this.apsara = apsara;
    }
}
