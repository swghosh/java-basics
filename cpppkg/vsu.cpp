#include<cstdlib>
using namespace std;
	void main()
    {
		printf("\t || UNDERSTANDING PHYSICS ISC (POINTS TO REMEMBER) ||");
        int ans=1;
        while(ans==1)
        {
            printf("\t || SYLLABUS ||");
            printf(" 1. Work, Power & Energy");
            printf(" 2. Friction");
            printf(" 3. Elasticity");
            printf(" 4. Surface Tension");
            printf(" 5. Kinetic Theory Of Gases");
            
            printf("\n || Enter your Choice : ");
            int *ch =0;
			scanf("%d",&ch);
            printf();
            printf();
            

            switch(ch)
            {
                case 1:
                {
                    printf("\t || WORK, POWER & ENERGY ||");
                    printf(" WORK :");
                    printf(" **Work is measured by the product of the force applied and the displacement of the body in the direction,");
                    printf("   of the forc applied. Therefore, Work = force * displacement.");
                    printf("   If the force F make an angle,O with the direction then, Work = FcosO * S.");
                    printf(" **NOTE : IF THE DISPLACEMENT IS PERPENDICULAR TO THE DIRECTION (O = 90) NO WORK IS DONE.");
                    printf("\t || NATURE OF WORK ||");
                    printf(" 1. Positive Work :");
                    printf(" * When a body falls freely under gravity, positive work is done.");
                    printf(" * When a lawn roller is pulled, by applying a force on its handle at an acute angle.");
                    printf(" 2. Negative Work :");
                    printf(" * When a body is thrown upwards it's motion opposes gravity. The angle is greater than 180.");
                    printf(" * When a body is made to roll over a horizontal surface, frictional force acts against it.");
                    printf("   Work done by frictional force is said to negative.");
                    printf();
                    printf(" | Press 1 to continue studying 0 to exit : ");
                    int *ch1 = 0;
					scanf("%d",&ch1);
                    if ( ch1==1)
                    {
                    
                    
                  
                    printf("\t || SPRING ||");
                    printf(" ** When a spring, whose one end is fixed is stretched by a through a small distance 'X' then ");
                    printf("    an elastic restoring force F is developed in the spring. By hooke's law, F = -K*X.");
                    printf("    where K is called the spring constant. The negative sign indicates that the force F works");
                    printf("    against displacement x. This force F increases with X, is known as Spring Constant.");
                    printf(" ** Therefor the work done = F*dX. Since, F=-K*X depends on the change in X, K is constant.");
                    printf();
                    printf("\t || CONSERVATIVE FORCES ||");
                    printf(" ** A force is said to be conservative in nature if the work done by it in moving a body depends only on ");
                    printf("   the initial and the final position of the body is independent of the path followed between the positions.");
                    printf("   The Work done by a conservative force = m*g*h. Also, the work done by a conservative force in moving a body");
                    printf("   through a complete round trip is always ZERO.");
                    printf("\t || NON-CONSERVATIVE FORCES ||");
                    printf(" ** A force is said to be non conservative, if the work done by the force, or against the force, in moving a body");
                    printf("    from one point to another depends on the path followed by the body between the points.");
                    printf();
                }
                else
                break;
                
                printf(" | Press 1 to continue studying 0 to exit : ");
                    int *ch2 = 0;
					scanf("%d",&ch2);
                    if ( ch2==1)
                    {
                
                printf("\t || POWER ||");
                    printf(" ** Power is rate of doing works of a machine or an agent. It is denoted by P = W/T.");
                    printf("    P=dW/dT, dW = F*dS, P= F*dS/dT, dS/dT=V, therefore. P=F*dV OR P=F*V.");
                    printf("    UNITS - Watt and HP. 1 Watt = 1 J/1Second, 1HP = 746 W.");
                    printf();
                    printf("\t || ENERGY ||");
                    printf(" ** Energy is the capacity of doing work. Energy has to forms K.E & P.E.");
                    printf(" 1. Kinetic Energy is the energy of a body by the virtue of it's constant motion.");
                    printf("    It is the product of half the mass and the square of the velocity of the body in motion.");
                    printf(" ** K.E = 1/2*M*V^2. dW=F*dS, F => m*a = m* dV/dT, dW => [m*(dV/dT)*dV] ");
                    printf("    => [m*(dV*dV)] = [m* (V^2/2)] = 1/2*M*V^2.");
                    printf(" 2. Potential Energy is the energy stored in a body by the virtue of it's position or state of strain.");
                    printf("    Therefore, suppose a body of mass m at height H. Under the gravity G, Work done will be ");
                    printf("    => m*g*h. Potential Energy for a spring will be => W = 1/2 K*X^2, where K is the spring constant");
                    printf("    & X is the displacement of the spring.");
                    printf();
                    printf("\t || COLLISIONS ||");
                    printf(" ** Collision between two bodies is said to occur if either they collide physically against each other or ");
                    printf("    if the path of the motion of one is influenced by the other.");
                    printf(" | There are two types - Elastic Collisions & Non Elastic Collisons. ");
                    printf(" 1. Elastic Collision : If the forces of the colliding bodies are conservative, the momentum as well  ");
                    printf("    the K.E reamins conserved in the collision and the collision is said to be elastic.");
                    printf(" 2. Non Elastic Collisions : When the colliding bodies, change their K.E the collision is said to be");
                    printf("    inelastic. Collisions between bodies is always gross, the bodies stick together and move with a new");
                    printf("    velocity");
                    printf();
                    printf(" || THANK YOU FOR GOING THROW, WE HAVE COVERED ALL IMPORTANT POINTS!! :)");
                }
                   else
                   break;
                


                }
                case 2 :
                {
                    printf("\t ||  FRICTION || ");
                    printf(" || LIMITING FRICTION ||");
                    printf(" ** The maximum value of the static fricitional force which comes into play when a body just begins to slide");
                    printf("    over the surface of another body is called Limiting Frictional Force.");
                    printf(" |  LAWS OF LIMITING FRICTION :");
                    printf(" * The magnitude of Limiting Static Frictional force depends upon the nature of the surface in contact and");
                    printf("   on their roughness, not on area or size.");
                    printf(" * The force of friction is tangential to the surface of the body, and its direction will be opposite to which");
                    printf("   the body would start moving.");
                    printf(" * For the given surfaces, the limiting frictional force 'Fs' is directly proportional to the normal reaction R :");
                    printf("   Fs = Us*R. Where, Us= mu or co-efficient of static or limiting frictional.");

                }
                case 3 :
            }
            printf();
            printf();
            printf(" || Do you wish to learn more (ans in 1 for yes and 0 for no.): ");
            ans=vg.nextInt();
            printf();
            printf();

        }
        if(ans==0)
        {
        printf(" || THANK YOU FOR USING VAASU TUTORIALS. NEW WAY OF LEARNING. :)");
        System.exit(0);
        }
     

    }
}