import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TimeServlet extends HttpServlet
{
    private String id;;
    public void init()
    {
        id=String.toString((int)(Math.random()*5000));
    }
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    {
        PrintWriter out=response.getWriter();
        String header="<!doctype html>\n<html>\n\t<head>\n\t\t<title>"+id+"</title>\n\t</head>\n\t<body>";
        response.setIntInterval("Refresh",3);
        out.print(header);
        Calendar cd=new GregorianCalendar();
        int hh=cd.get(cd.HOUR);
        int mm=cd.get(cd.HOUR);
        int ss=cd.get(cd.HOUR);
        out.println(hh+":"+mm+":"+ss);
        String footer="\n\t</body></html>";
        out.print(footer);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
    {
        doGet(request,response);
    }
}