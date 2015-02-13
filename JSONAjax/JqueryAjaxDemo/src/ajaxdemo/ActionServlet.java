package ajaxdemo;

import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;

/**
 * Servlet implementation class ActionServlet
 */

public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ActionServlet() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String country=request.getParameter("countryname");
		Map<String, String> ind = new LinkedHashMap<String, String>();
	    ind.put("1", "New delhi");
	    ind.put("2", "Tamil Nadu");
	    ind.put("3", "Kerala");
	    ind.put("4", "Andhra Pradesh");
	    
	    Map<String, String> us = new LinkedHashMap<String, String>();
	    us.put("1", "Washington");
	    us.put("2", "California");
	    us.put("3", "Florida");
	    us.put("4", "New York");
	    
	    Map<String, String> reset = new LinkedHashMap<String, String>();
	    reset.put("1", "Select State");
	    
	    String json = null ;
	    if(country.equals("India")){
	    	json= new Gson().toJson(ind);   
	    }
	    else if(country.equals("US")){
	    	json=new Gson().toJson(us);  
	    }
	    else if(country.equals("Select Country"))
	    {
	    	json=new Gson().toJson(reset);
	    }
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
		    
		    
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
