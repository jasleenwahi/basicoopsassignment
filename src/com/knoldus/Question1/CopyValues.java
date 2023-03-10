package com.knoldus.Question1;
public class CopyValues
{
    String name;
    CopyValues(String name)
    {
        this.name=name;
    }

    CopyValues(CopyValues object)
    {
        this.name=object.name;
    }

    public static void main(String args[])
    {
        CopyValues copy1 = new CopyValues("Jasleen");
        System.out.println("Name of object 1: "+copy1.name);

        CopyValues copy2 = new CopyValues(copy1);
        System.out.println("Name of object 2: "+copy2.name);
    }
}
