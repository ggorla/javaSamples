package ArrayListChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("123213123");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        PringActions();
        while(!quit){
            System.out.println("\n Enter action:(6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    PringActions();
                    break;

            }

        }
    }

    private  static void addNewContact(){
        System.out.println("Enter new COntact name:");
        String name = scanner.nextLine();
        System.out.println("Enter Phone number:");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("new Contact added: name="+name+"phone= "+phone);
        }else{
            System.out.println("cannot add"+name+"already on file");
        }
    }
    private static void updateContact(){
        System.out.println("Enter existing contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.QueryCOntact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not Found.");
            return;
        }
        System.out.print("Enternew Contact name:");
        String newName = scanner.nextLine();
        System.out.print("enter new contact phone numer:");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Sucessfully updated record");
        }
        else{
            System.out.println("error updating record.");
        }

    }
    private static void  removeContact(){
        System.out.println("Enter ezisting contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.QueryCOntact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not Found");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Contact has been removed");
            return;
        }
        else{
            System.out.println("problem in deleting record");
            return;
        }
    }
    private static void  queryContact(){
        System.out.println("Enter ezisting contact name:");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.QueryCOntact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not Found");
            return;
        }

        System.out.println("contact found"+existingContactRecord.getName()+" phone number"+ existingContactRecord.getPhoneNumber());
    }
    private static void startPhone(){
        System.out.println("Start phone");
    }

    private static void PringActions(){
        System.out.println("\nAvailable Actions:\npress");
        System.out.println("0 - to shutdon\n"+
                            "1 - to print contacts\n"+
                            "2  - to add a new contact\n"+
                            "3  - to update existing an exiting contact\n"+
                            "4  - to remove an existing contact\n"+
                            "5  - Query if an existing contact\n "+
                            "6  - to print a list of available actions.");
        System.out.println("Choose your action:");
    }
}
