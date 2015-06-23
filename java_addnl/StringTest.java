import java.util.*;
public class StringTest
{
	public static void main(String[] args)
	{
		String str="Kilo Joule per Second Joule Square Inverse";
		str.replaceAll("J","x");
		System.out.print(str);
	}
}