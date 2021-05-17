package com.stankevich.lab2;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/getIsSumHigher")
public class TicketsWinServlet extends HttpServlet {

    @EJB
    TicketsServiceEjb ejb = new TicketsServiceEjb();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int value = Integer.parseInt(req.getParameter("sum"));
        ArrayList<Ticket> tickets = ejb.getTicketsWithBiggerWin(value);

        req.setAttribute("ticketsList", tickets);
            RequestDispatcher dispatcher = req.getRequestDispatcher("isSumHigher.jsp");
            try {
                dispatcher.forward(req, resp);
            } catch (ServletException e) {
                e.printStackTrace();
            }
    }
}
