package in.bushansirgur.springjdbcdemo.dao;

import java.util.List;

import in.bushansirgur.springjdbcdemo.model.Employee;

public interface EmployeeDAO {
	
	int save(Employee employee);
	
	int update(Employee employee, int id);
	
	int delete(int id);
	
	List<Employee> getAll();
	
	Employee getById(int id);

}
