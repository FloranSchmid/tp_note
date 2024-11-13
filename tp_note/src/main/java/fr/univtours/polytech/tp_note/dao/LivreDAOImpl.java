package fr.univtours.polytech.tp_note.dao;

import java.util.List;

import fr.univtours.polytech.tp_note.model.LivreBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class LivreDAOImpl implements LivreDAO {

    @PersistenceContext(unitName = "TpNote1")
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Override
    public List<LivreBean> getLivreList() {
        Query requete = em.createNativeQuery("select * from livre", LivreBean.class);
        return requete.getResultList();
    }

    @Override
    public LivreBean getLivreById(Integer id) {
        return em.find(LivreBean.class, id);
    }

    @Override
    public Integer getNbLivreEmprunt() {
        Query requete = em.createNativeQuery("Select count(*) from livre where freeLivre LIKE 'TRUE'", LivreBean.class);
        return requete.getFirstResult();
    }

    @Override
    public void insertLivre(LivreBean livre) {
        em.persist(livre);
    }

}