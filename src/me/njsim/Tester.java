package me.njsim;



public class Tester {

	
    public static void main(String[] args) {
        Customer customers[] = new Customer[5];
        //customers[0] = new Customer("Fred", "Smith");
        customers[0] = new Customer("John", "Doe", "1st Street", "Red Deer", "AB", "403-555-5555");
        customers[1] = new Customer("John", "Doe", "1st Street", "Red Deer", "AB", "403-555-5555");
        
        Agent agent[] = new Agent[5];
        agent[0] = new Agent("Nick", "Sim", "403-123-4567", 0.10);
        agent[1] = new Agent("Hayden", "Belanger", "403-126-4567", 0.10);

        //customers[0].setFirstName("Sam");
        System.out.println(customers[0].getFirstName());
        System.out.println(customers[0].makePhonebookName(customers[0].getFirstName(), customers[0].getLastName()));
        System.out.println(customers[1].getFirstName());
        System.out.println(customers[1].makePhonebookName(customers[1].getFirstName(), customers[1].getLastName()));
        //customers[0] = customers[1];
        System.out.println(customers[0]);
        System.out.println(customers[1]);
        customers[0].setFirstName("Sam");
        System.out.println(customers[0]);
        System.out.println(customers[1]);
        
        
        System.out.println("=== AGENT INFO === ");
        System.out.println(agent[0].getFirstName());
        System.out.println(agent[1].getFirstName());
        System.out.println(agent[0]);
        System.out.println(agent[1]);

 


    }
}
