package android;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;


class Gaming{
	public static void main(String args[]) {
		
//GUI
		
        String fn = JOptionPane.showInputDialog("Enter first number");
        String sn = JOptionPane.showInputDialog("Enter second number");
        
        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "The answer is " + sum, "the title", JOptionPane.PLAIN_MESSAGE);
		
//printing Hello world
		
		System.out.println("hello world!");
		
//variables
		
		   double tuna;
	        tuna = 5.28;
	        
	        System.out.print("I want ");
	        System.out.print(tuna);
	        System.out.println(" movies");
	        System.out.print("apples\n");
	        
 //Getting user input
	        
	        Scanner bucky = new Scanner(System.in);
	        System.out.println(bucky.nextLine());
	        
//Building a basic calculator	     
	        
	        double fnum, snum, answer;
	        System.out.println("Enter first num: ");
	        fnum = bucky.nextDouble();
	        System.out.println("Enter second num: ");
	        snum = bucky.nextDouble();
	        answer = fnum + snum;
	        System.out.println(answer);
	        
//Math operator
	        
	        int girls, boys, people;
	        girls = 6;
	        boys = 3;
	        people = girls + boys; /*-, /, *, % are possible */
	        System.out.println(people);
	        
//Increment operator
	        
	        int bacon = 5;
	        int bass = 18;
	        
	        System.out.println(bacon++);
	        System.out.println(bacon);   
	        System.out.println(bass);  
	        
//If else statement
	        
	        int test = 6;
	        
	        if (test == 9){    
	            System.out.println("Yes");
	        }else{
	            System.out.println("This is else");    
	        }

// Logical operators
	        
	        int boy, girl;
	        boy = 18;
	        girl = 68;
	        
	        if (boy > 10 && girl < 60){
	            System.out.println("You can enter");
	        }else{
	            System.out.println("You cannot enter");
	        }
	        
//switch statement
	        
	        int age;
	        age = 3;
	        
	        switch (age){
	        case 1:
	            System.out.println("You can crawl");
	            break;
	        case 2:
	            System.out.println("You can talk");
	            break;
	        case 3:
	            System.out.println("You can get in problem");
	            break;
	        default:
	            System.out.println("I don't know how old you are");
	            break;
	        }
	        
//While loop
	        
	        int counter = 0;
	        while (counter < 10){
	            System.out.println(counter);
	            counter++;
	        }
	        
	        
//Multiple Classes
	        
	       // Rama RamaObject = new Rama();
	       // RamaObject.simpleMessage();
	        
//Use method with parameter
	        
	        Scanner input = new Scanner(System.in);
	        Rama RamaObject = new Rama();
	        
	        System.out.println("Enter your name here: ");
	        String name = input.nextLine();
	        
	        RamaObject.simpleMessage(name);
	        
//Many methods and instances
	        
	       // Scanner input = new Scanner(System.in);
	       // Rama RamaObject = new Rama();
	        System.out.println("Enter name of first gf here: ");
	        String Rama = input.nextLine();
	        RamaObject.setName(Rama);
	        RamaObject.saying();
	        
//Constructor
	        Tuna TunaObject = new Tuna("Shreya");
	        Tuna TunaObject2 = new Tuna("Nibha");
	        TunaObject.saying();
	        TunaObject2.saying();
	        
//Nested if statement
	        
	        int Male_age = 60;

	        if (Male_age < 50){
	            System.out.println("You are young");
	        }else{
	            System.out.println("You are old");
	            if(Male_age > 75){
	                System.out.println("You are REALLY old!");
	            }else{
	                System.out.println("dont worry you arent really thta old");
	            }
	        }
	        
//else if statement
	        
	        int Female_age = 55;

	        if (Female_age >= 60)
	            System.out.println("You are a senior citizen");
	        else if (Female_age >= 50)
	            System.out.println("You are in your 50s");
	        else if (Female_age >= 40)
	            System.out.println("You are in your 40s");
	        else
	            System.out.println("You are a young buck");
	        
//Conditional operators
	        
	        int Your_age = 21;

	        System.out.println(Your_age > 50 ? "You are old" : "You are young");
	        
//Simple Average program
	        
	        Scanner inputs = new Scanner(System.in);
	        int total = 0;
	        int grade;
	        int average;
	        int counters = 0;

	        while (counters < 10){
	            grade = input.nextInt();
	            total = total + grade;
	            counters++;
	        }
	        average = total/10;
	        System.out.println("Your average is "+ average);
	    
	
//For loop
	
	  for(int counteres=6;counteres<=21;counteres+=3){
          System.out.println(counteres);
      }
	  
//Compount intrest program
	  
	    double amount;
        double principal = 10000;
        double rate = .01;

        for(int day=1;day<=20;day++){
            amount=principal*Math.pow(1 + rate, day);
            System.out.println(day + "   "+ amount);
        }
        
//do while loop
        
        int a = 0;

        do{
            System.out.println(a);
            a++;
        }while(a <=10);
        
//Math operator
        
       // System.out.println(Math.(abs, ceil, floor, max, min, pow, sqrt all can apply after dot seporator)(1));
	  
//Random no. generator
        
        Random dice = new Random();
        int number;

        for(int c=1; c<=10;c++){
        number = dice.nextInt(6);
        System.out.println(number + " ");
        }
        
// Introduction to array
        
     int suraj[] = {2,4,5,7,9};
        
        System.out.println(suraj[2]);
        
// Creating array table
        
        System.out.println("Index\tValue");
        int buck[]={32,12,18,54,2};
        int coner = 0;
		for(int b=0;coner<buck.length;b++){
            System.out.println( coner+ "\t" + buck[b]);
        }
        
//Adding element of array
        
        int nibha[]={21,16,86,21,3};
        int sum1=0;

        for(int counte=0;counte<nibha.length;counte++){
            sum1+=nibha[counte];
        }

        System.out.println("The sum of theze numbers is " +sum1);
        
 
	        
bucky.close();
input.close();
inputs.close();

	        
	        
	}
}