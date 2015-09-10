<%@ page contentType="text/html; charset=utf-8" language="java" import="java.util.*" errorPage="" %>
<%!
	static String[] message(String uagent)
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
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
		<title>cdn.SwGhosh.tk</title>
		<meta name="viewport" content="width=device-width,user-scalable=yes">
		<link href='https://fonts.googleapis.com/css?family=Architects+Daughter' rel='stylesheet' type='text/css'>
        <link href="spinner.css" rel='stylesheet' type="text/css"
    	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=yes">
  	</head>
  	<body>
    	<p class="txt" align="center">
			<svg class="spinner-container" width="65px" height="65px" viewBox="0 0 52 52">
      			<circle class="path" cx="26px" cy="26px" r="20px" fill="none" stroke-width="4px"></circle>
    		</svg>
			<br/>
		</p>
		<span class="imported">
			<% String uagent=request.getHeader("user-agent");
			String api[]=message(uagent);
			out.println(api[0]);
			%>
        	<br/>
			You are currently using <%=api[1]%>.
		</span>
		<footer class="imported">
			&copy;SwG Ghosh<br/>
        	<a href="https://twitter.com/SwG_Ghosh" class="twitter-follow-button" data-show-count="false" data-size="large">Follow @SwG_Ghosh</a>
			<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>
        </footer>
    	<p class="logo" align="center"><a href="https://www.openshift.com/"></a></p>
	</body>
</html>