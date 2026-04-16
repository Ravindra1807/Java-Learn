// 🔹 Day 6
// Package & Access Modifiers 
// ⏰ 2 घंटे (Session-1)
// Package concept
// Built-in packages
// User-defined package
// Creating package using package keyword

import java.util.*; // In - Bild defined

import Package.day_5_5;

public class day_6_1  {
    public static void main(String[] args) 
    {
        Scanner ss = new Scanner(System.in);
        day_5_5 d = new day_5_5();
        d.name = ss.nextLine();
         d.Fname = ss.nextLine();
        d.Mname = ss.nextLine();
        d.Marks = ss.nextInt();
        
        d.R();


    }
     
    
}
