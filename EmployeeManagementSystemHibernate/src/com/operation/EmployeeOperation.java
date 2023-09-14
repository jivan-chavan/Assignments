package com.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.connection.MyConnection;
import com.entity.Employee;

public class EmployeeOperation {
	private final SessionFactory sessionFactory = MyConnection.getMySessionFactory();

	public void insertEmployee(Employee employee) {
		try (Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(employee);
			transaction.commit();
			System.out.println("Employee saved successfully.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
	}
  
	public Employee getEmployeeById(int id) {
		try (Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();
			Employee employee = session.get(Employee.class, id);
			if(employee!=null) {
				transaction.commit();
				return employee;
			}else {
				System.out.println("Employee not found.");
	            transaction.rollback();
				return null;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
	        e.printStackTrace();
		}
		return null;
	}
	

    public List<Employee> getAllEmployees() {
        try (Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();
            Criteria criteria = session.createCriteria(Employee.class);

				List<Employee> employees =criteria.list();
		
            if(employees!=null) {
				transaction.commit();
				   return employees;
				   }else {
				System.out.println("Employee not found.");
	            transaction.rollback();
				return null;
			}

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void updateEmployee(Employee employee) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            Employee existingEmployee = session.get(Employee.class, employee.getEmployeeId());

            if (existingEmployee != null) {
                existingEmployee.setFirstName(employee.getFirstName());
                existingEmployee.setLastName(employee.getLastName());
                existingEmployee.setDateOfBirth(employee.getDateOfBirth());
                existingEmployee.setEmail(employee.getEmail());
                existingEmployee.setDepartment(employee.getDepartment());
                existingEmployee.setSalary(employee.getSalary());
                session.update(existingEmployee);
                transaction.commit();
            } else {  System.out.println("Employee not found.");
            transaction.rollback();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
    
    public void deleteEmployee(int employeeId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            Employee employeeToDelete = session.get(Employee.class, employeeId);

            if (employeeToDelete != null) {
                session.delete(employeeToDelete);
                transaction.commit();
            } else {
                System.out.println("Employee not found.");
                transaction.rollback();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getEmployeesWithSalaryGreaterThan(double salary) {
        try (Session session = sessionFactory.openSession()) {
        	Transaction transaction = session.beginTransaction();
        	Criteria criteria = session.createCriteria(Employee.class);
            criteria.add(Restrictions.gt("salary", salary));
            List<Employee> employees = criteria.list();
            
            if (!employees.isEmpty()) {
                transaction.commit();
                return employees;
            } else {
                System.out.println("Employee not found.");
                transaction.rollback();
                return null;
            }
           
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<Employee> getEmployeesInDepartments(List<String> departmentNames) {
        try (Session session = sessionFactory.openSession()) {
        	Transaction transaction = session.beginTransaction();
            Criteria criteria = session.createCriteria(Employee.class);
            criteria.add(Restrictions.in("department", departmentNames));
            List<Employee> employees = criteria.list();
            if (!employees.isEmpty()) {
                transaction.commit();
                return employees;
            } else {
                System.out.println("Employee not found.");
                transaction.rollback();
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<Employee> getEmployeesInDepartmentsOtherThan(String departmentName) {
        try (Session session = sessionFactory.openSession()) {
        	Transaction transaction = session.beginTransaction();
        	Criteria criteria = session.createCriteria(Employee.class);
            criteria.add(Restrictions.ne("department", departmentName));
            List<Employee> employees = criteria.list();
            if (!employees.isEmpty()) {
                transaction.commit();
                return employees;
            } else {
                System.out.println("Employee not found.");
                transaction.rollback();
                return null;
            }        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Employee> getEmployeesSortedBySalaryDescending() {
        try (Session session = sessionFactory.openSession()) {
        	Transaction transaction = session.beginTransaction();
            Criteria criteria = session.createCriteria(Employee.class);
            criteria.addOrder(Order.desc("salary"));
            List<Employee> employees = criteria.list();
            if (!employees.isEmpty()) {
                transaction.commit();
                return employees;
            } else {
                System.out.println("Employee not found.");
                transaction.rollback();
                return null;
            }         } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
