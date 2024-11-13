package fr.univtours.polytech.tp_note.business;

import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import fr.univtours.polytech.tp_note.dao.LivreDAO;
import fr.univtours.polytech.tp_note.model.LivreBean;

@Stateless
public class LivreBusinessImpl implements LivreBusiness {
    @Inject
    private LivreDAO livreDAO;

    @Override
    public List<LivreBean> getLivreList() {
        return livreDAO.getLivreList();
    }

    @Override
    public void reservation(Integer id) {
        LivreBean livreBean = livreDAO.getLivreById(id);
        livreBean.setFreeLivre(!livreBean.getFreeLivre());
    }

    @Override
    public boolean getFreeLivre(Integer id) {
        return livreDAO.getLivreById(id).getFreeLivre();
    }

    @Override
    public int getNbLivreEmprunt() {
        return livreDAO.getNbLivreEmprunt();
    }

    @Override
    public void insertLivre(LivreBean livre) {
        this.livreDAO.insertLivre(livre);
    }

}
