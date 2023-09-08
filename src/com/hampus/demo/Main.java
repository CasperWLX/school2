package com.hampus.demo;

public class Main
{
    public static void main(String[] args)
    {
        ageControl();
        loop();
        nameSwitch();
    }

    public static void ageControl()
    {
        int age;

        //Slumpat nummer så att det inte blir "hårdkodat"
        age = (int) (Math.random() * 40 + 1);

        if(age < 18)
        {
            System.out.printf("Underage, you're only %d years old\n", age);
        }
        else
        {
            System.out.println("Adult");
        }
    }

    public static void loop()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
            if(i == 10)
            {
                System.out.println("Index is 10");
            }
            else
            {
                System.out.println("Index is not 10");
            }
        }
    }

    public static void nameSwitch()
    {
        String name = "Anton";

        switch(name)
        {
            case "Benny":
                System.out.println("The name is Benny");
                break;
            case "Anton":
                System.out.println("The name is Anton ");
                break;
            default:
                System.out.println("No correct name found");
                break;
        }
    }

}
