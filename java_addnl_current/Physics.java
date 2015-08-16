import java.util.*;
class Physics
{
    public static void main(String args[])
    {
        Scanner vg = new Scanner(System.in);
        System.out.println("\t || UNDERSTANDING PHYSICS ISC (POINTS TO REMEMBER) ||");
        int ans=1;
        while(ans==1)
        {
            System.out.println("\t || SYLLABUS ||");
            System.out.println(" 1. Work, Power & Energy");
            System.out.println(" 2. Friction");
            System.out.println(" 3. Elasticity");
            System.out.println(" 4. Surface Tension");
            System.out.println(" 5. Kinetic Theory Of Gases");

            System.out.print("\n || Enter your Choice : ");
            int ch = vg.nextInt();
            System.out.println();
            System.out.println();

            switch(ch)
            {
                case 1:
                System.out.println("\t || WORK, POWER & ENERGY ||");
                System.out.println(" WORK :");
                System.out.println(" **Work is measured by the product of the force applied and the displacement of the body in the direction,");
                System.out.println("   of the forc applied. Therefore, Work = force * displacement.");
                System.out.println("   If the force F make an angle,O with the direction then, Work = FcosO * S.");
                System.out.println(" **NOTE : IF THE DISPLACEMENT IS PERPENDICULAR TO THE DIRECTION (O = 90) NO WORK IS DONE.");
                System.out.println("\t || NATURE OF WORK ||");
                System.out.println(" 1. Positive Work :");
                System.out.println(" * When a body falls freely under gravity, positive work is done.");
                System.out.println(" * When a lawn roller is pulled, by applying a force on its handle at an acute angle.");
                System.out.println(" 2. Negative Work :");
                System.out.println(" * When a body is thrown upwards it's motion opposes gravity. The angle is greater than 180.");
                System.out.println(" * When a body is made to roll over a horizontal surface, frictional force acts against it.");
                System.out.println("   Work done by frictional force is said to negative.");
                System.out.println();
                System.out.print(" | Press 1 to continue studying 0 to exit : ");
                int ch1 = vg.nextInt();
                if ( ch1==1)
                {

                    System.out.println("\t || SPRING ||");
                    System.out.println(" ** When a spring, whose one end is fixed is stretched by a through a small distance 'X' then ");
                    System.out.println("    an elastic restoring force F is developed in the spring. By hooke's law, F = -K*X.");
                    System.out.println("    where K is called the spring constant. The negative sign indicates that the force F works");
                    System.out.println("    against displacement x. This force F increases with X, is known as Spring Constant.");
                    System.out.println(" ** Therefor the work done = F*dX. Since, F=-K*X depends on the change in X, K is constant.");
                    System.out.println();
                    System.out.println("\t || CONSERVATIVE FORCES ||");
                    System.out.println(" ** A force is said to be conservative in nature if the work done by it in moving a body depends only on ");
                    System.out.println("   the initial and the final position of the body is independent of the path followed between the positions.");
                    System.out.println("   The Work done by a conservative force = m*g*h. Also, the work done by a conservative force in moving a body");
                    System.out.println("   through a complete round trip is always ZERO.");
                    System.out.println("\t || NON-CONSERVATIVE FORCES ||");
                    System.out.println(" ** A force is said to be non conservative, if the work done by the force, or against the force, in moving a body");
                    System.out.println("    from one point to another depends on the path followed by the body between the points.");
                    System.out.println();
                }
                else
                    break;

                System.out.print(" | Press 1 to continue studying 0 to exit : ");
                int ch2 = vg.nextInt();
                if ( ch2==1)
                {

                    System.out.println("\t || POWER ||");
                    System.out.println(" ** Power is rate of doing works of a machine or an agent. It is denoted by P = W/T.");
                    System.out.println("    P=dW/dT, dW = F*dS, P= F*dS/dT, dS/dT=V, therefore. P=F*dV OR P=F*V.");
                    System.out.println("    UNITS - Watt and HP. 1 Watt = 1 J/1Second, 1HP = 746 W.");
                    System.out.println();
                    System.out.println("\t || ENERGY ||");
                    System.out.println(" ** Energy is the capacity of doing work. Energy has to forms K.E & P.E.");
                    System.out.println(" 1. Kinetic Energy is the energy of a body by the virtue of it's constant motion.");
                    System.out.println("    It is the product of half the mass and the square of the velocity of the body in motion.");
                    System.out.println(" ** K.E = 1/2*M*V^2. dW=F*dS, F => m*a = m* dV/dT, dW => [m*(dV/dT)*dV] ");
                    System.out.println("    => [m*(dV*dV)] = [m* (V^2/2)] = 1/2*M*V^2.");
                    System.out.println(" 2. Potential Energy is the energy stored in a body by the virtue of it's position or state of strain.");
                    System.out.println("    Therefore, suppose a body of mass m at height H. Under the gravity G, Work done will be ");
                    System.out.println("    => m*g*h. Potential Energy for a spring will be => W = 1/2 K*X^2, where K is the spring constant");
                    System.out.println("    & X is the displacement of the spring.");
                    System.out.println();
                    System.out.println("\t || COLLISIONS ||");
                    System.out.println(" ** Collision between two bodies is said to occur if either they collide physically against each other or ");
                    System.out.println("    if the path of the motion of one is influenced by the other.");
                    System.out.println(" | There are two types - Elastic Collisions & Non Elastic Collisons. ");
                    System.out.println(" 1. Elastic Collision : If the forces of the colliding bodies are conservative, the momentum as well  ");
                    System.out.println("    the K.E reamins conserved in the collision and the collision is said to be elastic.");
                    System.out.println(" 2. Non Elastic Collisions : When the colliding bodies, change their K.E the collision is said to be");
                    System.out.println("    inelastic. Collisions between bodies is always gross, the bodies stick together and move with a new");
                    System.out.println("    velocity");
                    System.out.println();
                    System.out.println(" || THANK YOU FOR GOING THROW, WE HAVE COVERED ALL IMPORTANT POINTS!! :)");
                }
                else
                    break;
                //end of case
                case 2 :
                System.out.println("\t ||  FRICTION || ");
                System.out.println(" || LIMITING FRICTION ||");
                System.out.println(" ** The maximum value of the static fricitional force which comes into play when a body just begins to slide");
                System.out.println("    over the surface of another body is called Limiting Frictional Force.");
                System.out.println(" |  LAWS OF LIMITING FRICTION :");
                System.out.println(" * The magnitude of Limiting Static Frictional force depends upon the nature of the surface in contact and");
                System.out.println("   on their roughness, not on area or size.");
                System.out.println(" * The force of friction is tangential to the surface of the body, and its direction will be opposite to which");
                System.out.println("   the body would start moving.");
                System.out.println(" * For the given surfaces, the limiting frictional force 'Fs' is directly proportional to the normal reaction R :");
                System.out.println("   Fs = Us*R. Where, Us= mu or co-efficient of static or limiting frictional.");
                break;
                //end of case
                default:
                System.out.println("Either, this chapter is not very important or you made an invalid entry!");
            }
            System.out.println();
            System.out.println();
            System.out.print(" || Do you wish to learn more (ans in 1 for yes and 0 for no.): ");
            ans=vg.nextInt();
            System.out.println();
            System.out.println();
            if(ans==0)
            {
                System.out.println(" || THANK YOU FOR USING VAASU TUTORIALS. NEW WAY OF LEARNING. :)");
            }

        }
    }
}