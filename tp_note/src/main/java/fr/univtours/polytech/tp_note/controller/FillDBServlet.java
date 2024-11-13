package fr.univtours.polytech.tp_note.controller;

import java.io.IOException;

import fr.univtours.polytech.tp_note.business.LivreBusiness;
import fr.univtours.polytech.tp_note.model.LivreBean;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "fillDBServlet", urlPatterns = { "/fillDB" })
public class FillDBServlet extends HttpServlet {

    @Inject
    private LivreBusiness livreBusiness;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Ajout de livres.
        LivreBean seigneur_anneaux = new LivreBean();
        seigneur_anneaux.setAuteurLivre("Tolkien");
        seigneur_anneaux.setTitreLivre("Le Seigneur des Anneaux");
        seigneur_anneaux.setFreeLivre(true);

        LivreBean silmarillion = new LivreBean();
        silmarillion.setAuteurLivre("Tolkien");
        silmarillion.setTitreLivre("Le Silmarillion");
        silmarillion.setFreeLivre(true);

        LivreBean livre3 = new LivreBean();
        livre3.setAuteurLivre("Auteur3");
        livre3.setTitreLivre("Livre3");
        livre3.setFreeLivre(true);

        LivreBean livre4 = new LivreBean();
        livre4.setAuteurLivre("Auteur4");
        livre4.setTitreLivre("Livre4");
        livre4.setFreeLivre(true);

        livreBusiness.insertLivre(seigneur_anneaux);
        livreBusiness.insertLivre(silmarillion);
        livreBusiness.insertLivre(livre3);
        livreBusiness.insertLivre(livre4);
    }
}