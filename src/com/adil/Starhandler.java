package com.adil;

public class Starhandler {
    public void Add(int a) {
        if (a == 3) {

            for (int i = 1; i <= 3; i++)
            {
                for (int j = 4; j >= i; j--)
                {

                    System.out.print("");
                }


                for (int k = 1; k <= (2 * i - 1); k++)
                {
                    System.out.print("*");

                }

                System.out.println("");

            }


        }
        else if (a==5)
        {
            for (int i = 1; i <=5; i++)
            {
                for (int j = 4; j >= i; j--)
                {
                    System.out.print("");
                }
                for (int k = 1; k <= (2 * i - 1); k++)
                {
                    System.out.print("*");


                }
                System.out.println("");

            }

        }
        }
    }
