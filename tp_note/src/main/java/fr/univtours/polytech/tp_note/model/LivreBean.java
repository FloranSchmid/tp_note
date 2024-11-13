package fr.univtours.polytech.tp_note.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIVRE")
public class LivreBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer idLivre;

    private String titreLivre;
    private String auteurLivre;
    private boolean freeLivre;

    public Integer getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(Integer newId) {
        this.idLivre = newId;
    }

    public String getTitreLivre() {
        return titreLivre;
    }

    public void setTitreLivre(String newTitre) {
        this.titreLivre = newTitre;
    }

    public String getAuteurLivre() {
        return auteurLivre;
    }

    public void setAuteurLivre(String newAuteur) {
        this.auteurLivre = newAuteur;
    }

    public boolean getFreeLivre() {
        return freeLivre;
    }

    public void setFreeLivre(boolean newFreeLivre) {
        this.freeLivre = newFreeLivre;
    }

}
