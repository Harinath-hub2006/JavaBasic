import java.util.*;
public class SimplePayroll {
    static String[] names = new String[100];
    static double[] salaries = new double[100];
    static int count = 0;
    static int[] undoIndex = new int[100];
    static int undoCount = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        while(true){
            System.out.println("****** Employee Payroll System ******");
            System.out.println("\n1.Add Employee \n2.Show Payroll \n3.Undo Last \n4.Exit");
            System.out.println("Choice: ");
            int ch = Integer.parseInt(sc.nextLine());
            try{
                if (ch == 1) addEmployee();
                else if (ch == 2) showPayroll();
                else if (ch == 3) undoLast();
                else if (ch == 4) break;
                else System.out.println("Invalid choice.");
            }
            catch(Exception e){
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
    static void addEmployee() throws Exception{
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter salary: ");
        double salary = Double.parseDouble(sc.nextLine());
        if (name.isEmpty() || salary < 0) new Exception("Invalid name on Salary!");
        names[count] = name;
        salaries[count] = salary;
        undoIndex[undoCount++] = count;
        count++;
        System.out.println("Employee added!");
    }
    static void showPayroll() throws Exception{
        if (count == 0) throw new Exception("No employees to display!");
        for (int i = 0; i < count; i++){
            if (names[i] != null){
                System.out.println(names[i]+ " -Salary: "+salaries[i]);
            }
        }
    }
    static void undoLast() throws Exception{
        if (undoCount == 0) throw new Exception("Nothing to undo!");
        int idx = undoIndex[--undoCount];
        System.out.println("Removed last added Employee: "+names[idx]);
        names[idx] = null;
        salaries[idx] = 0;
    }
}

