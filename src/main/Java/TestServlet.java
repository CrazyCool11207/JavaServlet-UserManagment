import controller.UserManagment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import java.io.IOException;
import java.io.PrintWriter;



/**
 * Created by cdanial on 12.07.2016.
 */
@WebServlet("/nameServlet")
public class TestServlet extends HttpServlet {


    private UserManagment userManagment;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }



    private static final String KEY_FOR_PLAYER_NAME = "name";
    private static final String KEY_FOR_PLAYER_AGE = "alter";
    private final String htmlResponseStart = "<html>";
    private final  String htmlResponseEnd = "</html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        userManagment = new UserManagment();
        String response = "";
        PrintWriter pw = resp.getWriter();
        String name = req.getParameter(KEY_FOR_PLAYER_NAME);
        String alter = req.getParameter(KEY_FOR_PLAYER_AGE);
        int age = Integer.parseInt(alter);
        boolean isRegistered = userManagment.registerBoolean(name , alter);

        if(name != null){
            if(!name.equals("") && age >= 18){
                if (isRegistered == true) {
                    response += "<h2>You are succesfully registered with name: "+ name + "<br/>" + alter;
                }
                else{
                    response += "<h2>User is already registered! Choose another name <br/>";
                }
                    response += "<h2>Work in progress "+ name + "<br/>" + alter;
            }
        }else{
            response += "<h3>Hallo mein Junge bitte geb deinen Nicknamen ein und lade die Seite neu!</h3><br> <h1> -.- oder -.- </h1> <br>";
            response += "<h3>Ueberpruefe bitte ob du deinen Nicknamen eingegeben hast oder du ueber 18 Jahre alt bist , falls nicht lade bitte die Seite neu und versuche es erneut!</h3>";
        }
        pw.println(htmlResponseStart + response + htmlResponseEnd);

    }

}

