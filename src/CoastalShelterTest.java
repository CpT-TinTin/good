import org.junit.Test;

import java.util.ArrayList;

public class CoastalShelterTest{


   /*@Test
    void getLandsurface() {
    }*/

    @Test
    public void getWatertype() {
        CoastalShelter d=new CoastalShelter("A.1",30,true,42);
        System.out.println(d.getWaterType());
        ArrayList<shelter> d1=new ArrayList<shelter>();
        d1.add(d);
        TundraShelter tunda=new TundraShelter("B.2",30,false);
        System.out.println(tunda.getClimate());
        ReefShelter reef=new ReefShelter("B.3",30,true,4);
        System.out.println(reef.getCoraltypes());
        d1.add(reef);
        System.out.println(d1.get(1).getCoraltypes());

    }

    /*@Test
    void getClimate() {
    }*/
}