package com.ada.web1.boasvindas;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@WebServlet(urlPatterns = "/boasVindas")
public class BoasVindas extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String cumprimento;

        LocalTime agora = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        if(agora.getHour() < 12) {
            cumprimento = String.format("Bom dia, %s.", nome);
        }

        if(agora.getHour() < 18) {
            cumprimento = String.format("Boa tarde, %s.", nome);
        }
        else {
            cumprimento = String.format("Boa noite, %s.", nome);
        }


        req.setAttribute("cumprimento", cumprimento);
        res.setHeader("cumprimento", cumprimento);
        req.getRequestDispatcher("/boasVindas.jsp").forward(req, res);
    }
}
