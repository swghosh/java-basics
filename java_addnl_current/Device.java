import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Device extends HttpServlet
{
    int hitctr=0;
    public void init() throws ServletException
    {
        hitctr=0;
    }
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
        hitctr++;
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String header="<!DOCTYPE html>\n<html>\n  <head>\n    <meta charset='utf-8'>\n    <meta name=\"viewport\" content=\"width=device-width, user-scalable=yes\">\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/styledev.css\" media=\"all\">\n    <title>Device</title>\n  </head>\n<body>";
        out.println(header);
        String uagent=request.getHeader("user-agent");
        String log=request.getRemoteAddr()+" "+uagent+" "+request.getRequestURI();
        System.out.println(hitctr+" "+log);
        String api=message(uagent);
        out.println(""+api+"<br/>"+"You are currently using "+uagent+"\n</body>\n</html>");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
        doGet(request,response);
    }
    public static String message(String uagent)
    {
        String samsung="Maybe you are the most popular brand, but you need not always be a stereotype.<br/>#samsung";
        String apple="You are already using the best brand, the market ever witnessed.<br/>#apple";
        String sony="Maybe you have the most attractive user interface, but when it comes to performance, you are nowhere.<br/>#sony";
        String micromax="You might look into upgrading your phone&#39;s hardware. There are better options available in the market.<br/>#micromax";
        String microsoft="Maybe that most people hate you but Microsoft does not sell beer.<br/>#microsoft";
        String blackberry="Should be that you belong to a business family. You&#39;re hands are on a premium device.<br/>#blackberry";
        String motorola="You are a newcomer to the market, but never mind you belong to the Google line of products.<br/>#motorola";
        String windows="I have nothing to say. You are too stereo type.<br/>#windows";
        String osx="You are the boss. You own a Mac.<br/>#osx";
        String linux="You swagger too much and you love opensource.<br/>#linux";
        String unknown="Sorry to say, but people do not care about you. You may undergo an upgrade.<br/>#unknown";
        //message generator
		String api="";
		if(uagent.contains("Windows NT"))
			api=windows;
		else if(uagent.contains("Windows Phone"))
			api=microsoft;
		else  if(uagent.contains("Linux; U;"))
			api=samsung;
		else if(uagent.contains("iPad") || uagent.contains("iPhone"))
			api=apple;
		else if(uagent.contains("BB10"))
			api=blackberry;
		else if(uagent.contains("Nexus") || uagent.contains("Moto"))
			api=motorola;
		else if(uagent.contains("Mac OS"))
			api=osx;
		//else if(uagent.contains("Android") || uagent.contains("10") ||  uagent.contains("Build"))
		//	api=sony;
		else if(uagent.contains("Linux"))
			api=linux;
		else
			api=unknown;
		return api;
    }
}
