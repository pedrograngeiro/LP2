public class TesteArray {
    public static void main(String args[]){
        //create array of employee object
        Employee[] obj = new Employee[2];

        //create & initialize actual employeee objects using constructor
        obj[0] = new Employee(100,"ABC");
        obj[1] = new Employee(200,"XYZ");

        //display the employee object data
        System.out.println("Employee Object 1: ");
        obj[0].showData();
        System.out.println("Employee Object 2: ");
        obj[1].showData();
    }
}

class Employee {
    int empId;
    String name;
    //Employee class constructor
    Employee(int eid, String n ){
        empId = eid;
        name = n;
    }

    public void showData(){
        System.out.println("EmpId = " + empId + "  " + " Employee Name = "+name);
        System.out.println();
    }
}

