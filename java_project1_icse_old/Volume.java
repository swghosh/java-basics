import java.util.*;
public class Volume
{
    public void main()
    {
        Scanner x=new Scanner(System.in);
        System.out.print("CALCULATOR FOR VOLUME OF 3D SOLIDS\n1- Volume of Cube\n2- Volume of Sphere\n3- Volume of Cuboid\n\nEnter your choice : ");
        int ch=x.nextInt();double vol=0;
        switch(ch)
        {
            case 1:
            System.out.print("\nEnter side length of cube : ");int s=x.nextInt();vol=Math.pow(s,3);System.out.println("Volume of Cube = "+vol);break;
            case 2:
            System.out.print("\nEnter radius of sphere : ");int r=x.nextInt();vol=1.33*3.14*Math.pow(r,2);System.out.println("Volume of Sphere = "+vol);break;
            case 3:
            System.out.print("\nEnter length of cuboid : ");int l=x.nextInt();System.out.print("\nEnter breadth of cuboid : ");int b=x.nextInt();System.out.print("\nEnter height of cuboid : ");int h=x.nextInt();vol=l*b*h;System.out.println("Volume of Cuboid = "+vol);break;
            default:
            System.out.print("\nInvalid Choice.. Please Retry\n\n\n");main();
        }
    }
}
