 
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
 
public class MaximumUsingStreamMain {
	public static void main(String args[])
	{
		List<Employee> employeeList = createEmployeeList();
		List<String> employeeFilteredList = employeeList.stream()
		          .filter(e->e.getAge()>20)
		          .map(Employee::getName)
		          .collect(Collectors.toList());
		
		employeeFilteredList.forEach((name)-> System.out.println(name));
		
		
		
		List<Employee> employeeList3 = createEmployeeList();
		long count = employeeList3.stream()
		.filter(e->e.getAge()>25)
		.count();
		System.out.println("Number of employees with age 25 are : "+count);
		
		
		List<Employee> employeeList2 = createEmployeeList();
		Optional<Employee> e1 = employeeList2.stream()
		          .filter(e->e.getName().equalsIgnoreCase("Mary")).findAny();
		        
		if(e1.isPresent())
			System.out.println(e1.get());
		
		List<Employee> employeeList4 = createEmployeeList();
		OptionalInt max = employeeList4.stream().
				          mapToInt(Employee::getAge).max();
		        
		if(max.isPresent())
			System.out.println("Maximum age of Employee: "+max.getAsInt());
		
	}
	
	public static List<Employee> createEmployeeList()
	{
		List<Employee> employeeList=new ArrayList<>();
 
		Employee e1=new Employee("John",31);
		Employee e2=new Employee("Martin",19);
		Employee e4=new Employee("MarY",18);
		Employee e3=new Employee("Maryy",31);
		Employee e5=new Employee("Gary",26);
 
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e4);
		employeeList.add(e3);
		employeeList.add(e5);
 
		return employeeList;
	}
}