public class earth {
	public static void main(String[] args){
		float rkm=6378;
		double rmiles= rkm*0.621371;
		double pi= Math.PI;
		double vkm=((4.0/3.0)*pi*rkm*rkm*rkm), vmiles=((4.0/3.0)*pi*rmiles*rmiles*rmiles);
		//System.out.printf("The volume of Earth in cubic kilometers is %,.2f km³\n", vkm);
        //System.out.printf("The volume of Earth in cubic miles is %,.2f mi³\n", vmiles);
        System.out.printf("The volume of Earth in cubic kilometers is %,.2f", vmiles);
        System.out.printf(" and cubic miles is %,.2f", vmiles);
		//System.out.println("The volume of earth in cubic kilometers is "+vkm+" and cubic miles is "+vmiles);
	}
}