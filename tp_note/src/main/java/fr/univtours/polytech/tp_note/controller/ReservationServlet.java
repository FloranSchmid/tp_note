package fr.univtours.polytech.tp_note.controller;

import java.io.IOException;

import fr.univtours.polytech.tp_note.business.LivreBusiness;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "reservationServlet", urlPatterns = { "/reservation" })
public class ReservationServlet extends HttpServlet {
    @Inject
    private LivreBusiness business;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /*
         * Integer id = Integer.parseInt(request.getParameter("id"));
         * 
         * 
         * if (!business.getFreeLivre(id) && business.getNbLivreEmprunt() >= 3) {
         * 
         * } else {
         * business.reservation(id);
         * }
         */

        request.setAttribute("LISTE_LIVRES", business.getLivreList());

        request.getRequestDispatcher("listLivres.jsp").forward(request, response);
    }
}