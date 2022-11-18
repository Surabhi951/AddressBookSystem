package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);
    ArrayList<ContactPerson> addressBook1 = new ArrayList<>();

    public ContactPerson createContact() {
        ContactPerson person = new ContactPerson();
        System.out.print("Enter First Name: ");
        person.setFirstName(sc.next());
        System.out.print("Enter Last Name: ");
        person.setLastName(sc.next());
        System.out.print("Enter Address: ");
        person.setAddress(sc.next());
        System.out.print("Enter City: ");
        person.setCity(sc.next());
        System.out.print("Enter State: ");
        person.setState(sc.next());
        System.out.print("Enter email: ");
        person.setEmail(sc.next());
        System.out.print("Enter ZipCode: ");
        person.setZipCode(sc.nextInt());
        System.out.print("Enter Phone Number: ");
        person.setPhoneNumber(sc.nextLong());
        System.out.println("created new contact");
        return person;
    }

    public void addContact(){
        ContactPerson contactPerson = createContact();
        addressBook1.add(contactPerson);
        System.out.println(contactPerson);
        System.out.println("Contact added successfully");
    }

    public void editContact() {
        boolean isContactFound = false;
        System.out.println(addressBook1);
        System.out.println("Enter Name to edit Contact");
        String name = sc.next();
        for (ContactPerson contactPerson : addressBook1) {
            if (name.equalsIgnoreCase(contactPerson.getFirstName())) {
                isContactFound = true;
                System.out.print("Enter First Name :");
                contactPerson.setFirstName(sc.next());
                System.out.print("Enter Last Name :");
                contactPerson.setLastName(sc.next());
                System.out.print("Enter Address :");
                contactPerson.setAddress(sc.next());
                System.out.print("Enter City :");
                contactPerson.setCity(sc.next());
                System.out.print("Enter State :");
                contactPerson.setState(sc.next());
                System.out.print("Enter ZipCode :");
                contactPerson.setZipCode(sc.nextInt());
                System.out.print("Enter Phone Number :");
                contactPerson.setPhoneNumber(sc.nextLong());
                System.out.print("Enter email :");
                contactPerson.setEmail(sc.next());
                System.out.println(contactPerson);
                break;
            }
        }
        if (isContactFound) {
            System.out.println("Contact Updated Successfully..");
        } else {
            System.out.println("Oops...Contact not found");
        }
    }
}
