package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        boolean flag1 = true;
        while (flag1) {
            System.out.println("*************\n"+addressBook.addressBookList.keySet());
            System.out.println("current AddressBook Name: "+addressBook.currentAddressBookName);
            System.out.println("Select Option :\n1.Add Contact\n2.Edit Contact\n3.Delete Contact\n4.Display\n5.Add Multiple Contacts\n6.Add New Address Book\n7.Select Address Book\n8.Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    addressBook.displayContact(addressBook.currentAddressBook);
                    break;
                case 5:
                    addressBook.addMultipleContacts();
                    break;
                case 6:
                    addressBook.addNewAddressBook();
                    break;
                case 7:
                    addressBook.selectAddressBook();
                    break;
                case 8:
                    flag1 = false;
                    break;
                default:
                    System.out.println(option + " is not valid option");
                    break;
            }
        }
    }
}

