package com.ExceptionHandling;

import java.util.Scanner;

public class ChcekedException {
    int x,y;
    public void accept() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values");
        x = sc.nextInt();
        y = sc.nextInt();
    }
    public void display()
    {
        int result = x+y;
        System.out.println("Addition  = "+result);
    }
    public static void main(String ar[])
    {
        ChcekedException ce = new ChcekedException();
        try
        {
            ce.accept();
        }
        catch(IOException ie)
        {
            System.out.println(ie);
        }
        ce.display();
    }
}