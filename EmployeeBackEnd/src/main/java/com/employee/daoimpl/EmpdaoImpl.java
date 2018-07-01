package com.employee.daoimpl;

import java.util.List;

import org.h2.engine.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.dao.Empdao;
import com.employeebackend.model.AddEmployeeModel;


@Repository
public class EmpdaoImpl implements Empdao {

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean insertEmployee(AddEmployeeModel addemployeemodel) {
	
		try{
		Session session =sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		session.save(addemployeemodel);
		transaction.commit();
		session.close();
		return true;
		}
		catch(Exception e){
		return false;
		}
	}

	public List<AddEmployeeModel> allEmployee() {
		try{
			Session session =sessionFactory.openSession();
			Transaction transaction =session.beginTransaction();
			List<AddEmployeeModel> allemployee=session.createQuery("FROM ProductModel").list();
			transaction.commit();
			session.close();
		return 	allemployee;
	}
		catch(Exception e){
			
			return null;
			}
	}

	public AddEmployeeModel displayEmployeeEdit(int employeeId) {
		try{
			Session session =sessionFactory.openSession();
			Transaction transaction =session.beginTransaction();
			AddEmployeeModel emp = session.get(AddEmployeeModel.class, employeeId);
			transaction.commit();
			session.close();
			return emp;
			}
			catch(Exception e){
			return null;

			}
	}

	public boolean deleteEmployee(int employeeId) {
		try{
			Session session =sessionFactory.openSession();
			Transaction transaction =session.beginTransaction();
			AddEmployeeModel emp=session.get(AddEmployeeModel.class, employeeId);
			session.delete(emp);
			transaction.commit();
			session.close();
			return true;
			}
			catch(Exception e){
			return false;
		}
	}

	public boolean updateEmployee(AddEmployeeModel addemployeemodel) {

		try{
			
			Session session =sessionFactory.openSession();
			Transaction transaction =session.beginTransaction();
			session.saveOrUpdate(addemployeemodel);
			transaction.commit();
			session.close();
			return true;
			}
			catch(Exception e){
			return false;
		}
	}

	
}