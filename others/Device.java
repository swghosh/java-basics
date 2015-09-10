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
        String header="<!DOCTYPE html>\n<html>\n  <head>\n    <meta charset='utf-8'>\n    <meta name=\"viewport\" content=\"width=device-width, user-scalable=yes\">\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/styledev.css\" media=\"all\">\n    <title>Device | cdn.swghosh.tk | &copy;SwG Ghosh</title>\n  </head>\n<body>";
        out.println(header);
        String uagent=request.getHeader("user-agent");
        String log=request.getRemoteAddr()+" "+uagent+" "+request.getRequestURI();
        System.out.println(hitctr+" "+log);
        String api[]=message(uagent);
        out.println(""+api[0]+"<br/>"+"You are currently using "+api[1]+".\n\n<br/><code>&copy;<a href=\"http://twitter.com/SwG_Ghosh\">SwG Ghosh</a></code></body>\n</html>");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
        doGet(request,response);
    }
    public static String[] message(String uagent)
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
		String[] api=new String[2];
		if(uagent.contains("Windows NT"))
		{
			api[0]=windows;api[1]="Windows";
		}
		else if(uagent.contains("Windows Phone"))
		{
			api[0]=microsoft;api[1]="Windows Phone";
		}
		else  if(uagent.contains("Linux; U;") && uagent.contains("Android"))
		{
			api[0]=samsung;api[1]="Android";
		}
		else if(uagent.contains("iPad") || uagent.contains("iPhone"))
		{
			api[0]=apple;api[1]="iOS";
		}
		else if(uagent.contains("BB10"))
		{
			api[0]=blackberry;api[1]="Blackberry 10 OS";
		}
		else if(uagent.contains("Nexus") || uagent.contains("Moto"))
		{
			api[0]=motorola;api[1]="Android";
		}
		else if(uagent.contains("Micromax"))
		{
			api[0]=micromax;api[1]="Android";
		}
		else if(uagent.contains("Mac OS"))
		{
			api[0]=osx;api[1]="Mac OSX";
		}
		else if(uagent.contains("Android") && uagent.contains("Build/"))
		{
			api[0]=sony;api[1]="Android";
		}
		else if(uagent.contains("Linux"))
		{
			api[0]=linux;api[1]="some Linux distro";
		}
		else
		{
			api[0]=unknown;api[1]="an Unknown System";
		}
		return api;
    }
}
