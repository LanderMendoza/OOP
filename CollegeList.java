import java.util.Scanner;
public class CollegeList {
    public static void main(String[] args) {
    	Scanner iskan = new Scanner(System.in);
    	Person p = new Person();
    	Student s = new Student();
    	Employee e = new Employee();
    	Faculty f = new Faculty();
    	
    	System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
    	String choice = iskan.next();
    	
    	
    	if(choice.equalsIgnoreCase("E")){
    		System.out.print("Type employee's name, contact number, salary, and department.");
    		System.out.println("Press Enter after every input.");
    		String empName = iskan.next();
    		e.setName(empName);
    		String conNum = iskan.next();
    		e.setContactNum(conNum);
    		double sal = iskan.nextDouble();
    		e.setSalary(sal);
    		String dep = iskan.next();
    		e.setDepartment(dep);
    		
    		System.out.println("---------------------------------");
    		System.out.println("Name: " + e.getName());
    		System.out.println("Contact Number: " + e.getContactNum());
    		System.out.println("Salary: " + e.getSalary());
    		System.out.println("Department: " + e.getDepartment());				   		
    	}
    	else if(choice.equalsIgnoreCase("S")){
    		System.out.print("Type student's name, contact number, program, and year level.");
    		System.out.println("Press Enter after every input.");
    		String studName = iskan.next();
    		s.setName(studName);
    		String conNum = iskan.next();
    		s.setContactNum(conNum);
    		String prog = iskan.next();
    		s.setProgram(prog);
    		int yl = iskan.nextInt();
    		s.setYearLevel(yl);	
    			
    		System.out.println("---------------------------------");
    		System.out.println("Name: " + s.getName());
    		System.out.println("Contact Number: " + s.getContactNum());
    		System.out.println("Program: " + s.getProgram());
    		System.out.println("Year Level: " + s.getYearLevel());			
    	}
    	else if (choice.equalsIgnoreCase("F")){
    		System.out.print("Press Y if you are a Regular and Press N if not: ");
    		String Stat = iskan.next();
    		
    		System.out.print("---------------------------------");
    		System.out.print("Name: " + f.getName());
    		System.out.print("Contact Number: " + f.getContactNum());
    		System.out.print("Contact Number: " + f.getSalary());
    		System.out.println("Department: " + f.getDepartment());
    		System.out.println("Status: " + display);
    		
 			
    		if(choice.equalsIgnoreCase("Y")){
    			f.isRegular(true);
    			String display = "Regular";
    				
    			System.out.print("---------------------------------");
    			System.out.print("Name: " + f.getName());
    			System.out.print("Contact Number: " + f.getContactNum());
    			System.out.print("Contact Number: " + f.getSalary());
    			System.out.println("Department: " + f.getDepartment());
    			System.out.println("Status: " + display);
    			
    				
    			
    		}
    		else if(choice.equalsIgnoreCase("N")){
    			f.isRegular (false);
    			String display = "Part Timer";
    			
    				
    			System.out.print("---------------------------------");
    			System.out.print("Name: " + f.getName());
    			System.out.print("Contact Number: " + f.getContactNum());
    			System.out.print("Contact Number: " + f.getSalary());
    			System.out.println("Department: " + f.getDepartment());
    			System.out.println("Status: " + display);
    			
    			
    		}
    		
    		
    			
    	}
    	else{
    		System.out.print("Invalid input.");
    		
    	}
 
    }
}
