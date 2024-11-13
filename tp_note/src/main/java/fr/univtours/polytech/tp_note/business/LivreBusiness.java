package fr.univtours.polytech.tp_note.business;

import java.util.List;
import fr.univtours.polytech.tp_note.model.LivreBean;

public interface LivreBusiness {
    public List<LivreBean> getLivreList();

    public int getNbLivreEmprunt();

    public void reservation(Integer id);

    public boolean getFreeLivre(Integer id);

    public void insertLivre(LivreBean livre);

}
