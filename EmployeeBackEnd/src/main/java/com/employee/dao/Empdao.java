package com.employee.dao;
import java.util.List;

import com.employeebackend.model.AddEmployeeModel;





public interface Empdao {
	public	boolean insertEmployee(AddEmployeeModel addemployeemodel);
	public List<AddEmployeeModel> allEmployee();
	public AddEmployeeModel displayEmployeeEdit(int employeeId);
	public boolean deleteEmployee(int employeeId);
	public boolean updateEmployee(AddEmployeeModel addemployeemodel);

}
