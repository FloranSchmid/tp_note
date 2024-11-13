package fr.univtours.polytech.tp_note.dao;

import java.util.List;

import fr.univtours.polytech.tp_note.model.LivreBean;

public interface LivreDAO {

    public List<LivreBean> getLivreList();

    public LivreBean getLivreById(Integer id);

    public Integer getNbLivreEmprunt();

    public void insertLivre(LivreBean livre);

}
