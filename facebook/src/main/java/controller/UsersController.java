package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelException;
import model.User;
import model.dao.DAOFactory;
import model.dao.UserDAO;

@WebServlet(urlPatterns = {""})
public class UsersController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException , IOException {
		String action = req.getRequestURI();
		
	switch (action) {
	case "/facebook/": {
		//Carregar a lista de usuarios
		UserDAO dao = DAOFactory.createDAO(UserDAO.class);
		
		try {
			List<User> users = dao.listAll();
			
			//Colocar ela na requisição
			req.setAttribute("usuarios", users);
			
			// Redirecionar para a index.jsp
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
			
		}catch (ModelException e) {
			e.printStackTrace();
		}
		
		
		// Redirecionar para a index.jsp
		
		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + action);
	}
		
		
		
//		RequestDispatcher rd = req.getRequestDispatcher("index.html");
//		rd.forward(req, resp);
	}

}
