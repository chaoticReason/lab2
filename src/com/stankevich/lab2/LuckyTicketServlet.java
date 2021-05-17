package com.stankevich.lab2;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getLuckyTicket")
public class LuckyTicketServlet extends HttpServlet {

    @EJB
    TicketsServiceEjb ejb=  new TicketsServiceEjb();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            int number = Integer.parseInt(req.getParameter("number"));
            boolean isLucky = ejb.isLucky(number);
            if (isLucky)
                req.setAttribute("number", "У тебя счастливый билет!!!!! " + ejb.getTicket(number).getNum());
            else
                req.setAttribute("number", "Билет несчастливый " + ejb.getTicket(number).getNum());

            RequestDispatcher dispatcher = req.getRequestDispatcher("lucky.jsp");
            dispatcher.forward(req, resp);
        }
        catch(NumberFormatException | TicketNotFoundException e){
            resp.getWriter().write("Such ticket not found!");
        }
        catch (ServletException e) {
            e.printStackTrace();
        }
    }

}
