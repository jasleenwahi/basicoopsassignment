package com.knoldus.Question3;

class Degree
{
    public void getDegree()
    {
        System.out.println("I got a degree");
    }
}
class Undergreaduate extends Degree
{
    public void getDegree()
    {
        System.out.println("I am an undergraduate");
    }
}
class Postgraduate extends Degree
{
    public void getDegree()
    {
        System.out.println("I am an postgraduate");
    }
}

public class PrintDegree
{
    public static void main(String args[])
    {
        Undergreaduate undergreaduateStudent = new Undergreaduate();
        Postgraduate postgraduateStudent = new Postgraduate();
        undergreaduateStudent.getDegree();
        postgraduateStudent.getDegree();
    }
}