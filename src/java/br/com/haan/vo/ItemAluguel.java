package br.com.haan.vo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemAluguel implements Serializable{

    @Id
    @GeneratedValue        
    private int id;
    @ManyToOne
    private Disco disco;
    @ManyToOne
    private Aluguel aluguel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.disco);
        hash = 59 * hash + Objects.hashCode(this.aluguel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemAluguel other = (ItemAluguel) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.disco, other.disco)) {
            return false;
        }
        if (!Objects.equals(this.aluguel, other.aluguel)) {
            return false;
        }
        return true;
    }
    public String toString (){
        return disco.toString()+ " - "+aluguel.toString();
    }
}
