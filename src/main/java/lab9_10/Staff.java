package lab9_10;//********************************************************************
//  Staff.java       Author: Lewis/Loftus
//
//  Represents the personnel staff of a particular business.
//********************************************************************

import coursesource.chap10.StaffMember;
import coursesource.chap10.Volunteer;

public class Staff
{
    StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff ()
    {
        staffList = new StaffMember[8];

        staffList[0] = new Executive ("Sam", "123 Main Line",
                "555-0469", "123-45-6789", 2423.07);

        staffList[1] = new Employee ("Carla", "456 Off Line",
                "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee ("Woody", "789 Off Rocker",
                "555-0000", "010-20-3040", 1169.23);

        staffList[3] = new Hourly ("Diane", "678 Fifth Ave.",
                "555-0690", "958-47-3625", 10.55);

        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.",
                "555-8374");
        staffList[5] = new Volunteer ("Cliff", "321 Duds Lane",
                "555-7282");

        staffList[6] = new Commission("Bob", "111 Main St.", "10000", "100", 6.25, 0.2);
        staffList[7] = new Commission("Sue", "222 Main St.", "20000", "200", 9.75, 0.15);


        ((Executive)staffList[0]).awardBonus (500.00);
        ((Hourly)staffList[3]).addHours (40);

        ((Hourly)staffList[6]).addHours (35);
        ((Hourly)staffList[7]).addHours (40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println (staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println ("Thanks!");
            else
                System.out.println ("Paid: " + amount);

            System.out.println ("-----------------------------------");
        }
    }
}