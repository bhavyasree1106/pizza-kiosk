package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

   //Behaviour..
    enum size { MEDIUM, SMALL, LARGE};
    ArrayList<Crust.cr> crust_type = new ArrayList<Crust.cr>();
    ArrayList<Toppings.topp> toppings =new ArrayList<Toppings.topp>();

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello");

        //create an object to class..
        Main m =new Main();

        size s =size.MEDIUM;
        System.out.println(s);
        Crust.cr c = Crust.cr.thick;

        m.crust_type.add(c);

        for(Crust.cr cc : m.crust_type) {
            System.out.println(cc);
        }

        Toppings.topp t1 = Toppings.topp.NONVEG;

        m.toppings.add(t1);

        for(Toppings.topp tt : m.toppings) {
            System.out.println(tt);
        }

        m.eatable();

    }

    public void eatable(){
        System.out.print("Now you are ready to eatt!!");
    }
}

class Crust{

    //"thin", s2 ="thick", s3="stufffed";
    public enum cr { thick, stufffed,thin};

}

class Toppings{

   public enum topp { VEG, NONVEG};

}
