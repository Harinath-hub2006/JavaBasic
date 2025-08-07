import java.util.*;
class ContactManagementSystem
{
public static void main(String[] args)
{
ArrayList <String> user = new ArrayList<>();
Scanner sc = new Scanner(System.in);
int choice;
do
{
System.out.println("********** Contact Management System **********");
System.out.println("\n1.Add");
System.out.println("2.View");
System.out.println("3.Update");
System.out.println("4.Delete");
System.out.println("5.Exit");
System.out.println("Enter your choice:");
choice = sc.nextInt();
sc.nextLine();
switch(choice)
{
case 1:
 System.out.println("***** Add New Contact *****");
 System.out.println("Enter contact name: ");
 String name = sc.nextLine();
 user.add(name);
 System.out.println("Enter contact number: ");
 String contact = sc.nextLine();
 user.add(contact);
 break;
case 2:
 System.out.println("***** View Contact List *****");
 for(int i = 0; i < user.size(); i += 2)
 {
 System.out.println("Name: "+user.get(i));
 System.out.println("Contact: "+user.get(i + 1));
 System.out.println("--------------------");
 }
 break;
case 3:
 System.out.println("***** Update contact *****");
 System.out.println("Enter name to update: ");
 String old_name = sc.nextLine();
 if (user.contains(old_name))
 {
 int index = user.indexOf(old_name);
 System.out.println("Enter new name: ");
 String new_name = sc.nextLine();
 user.set(index, new_name);
 System.out.println("Enter new contact: ");
 String new_contact = sc.nextLine();
 user.set(index+1, new_contact);
 System.out.println("Updated Successfully");
 }
 else
 {
 System.out.println("Contact not found");
 }
 break;
case 4:
 System.out.println("***** Delete Contact *****");
 System.out.println("Enter name to delete: ");
 String old_name1 = sc.nextLine();
 if (user.contains(old_name1))
 {
 int index = user.indexOf(old_name1);
 String removed_name = user.remove(index);
 String removed_contact = user.remove(index+1);
 System.out.println("Contact name: "+removed_name+ "removed successfully");
 System.out.println("Contact number: "+removed_contact+ "removed successfully");
 }
 else
 {
 System.out.println("Contact not found");
 }
 break;
case 5:
 System.out.println("Exiting System");
 break;
default:
 System.out.println("Invalid Input");
}
}while(choice != 5);
}
}

   
 	
	

