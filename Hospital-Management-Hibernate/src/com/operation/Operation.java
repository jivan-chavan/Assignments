package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.connection.MyConnection;
import com.entity.Hospital;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Operation {

    private final SessionFactory sessionFactory = MyConnection.getMySessionFactory();

    public void insertHospital(Hospital hospital) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(hospital);
            transaction.commit();
            System.out.println("Hospital details are saved successfully.");
        }catch (Exception e) {
			// TODO: handle exception
        	System.out.println("error");
        	e.printStackTrace();
		}
    }

    public Hospital getHospital(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Hospital.class, id);
        }catch (Exception e) {
			// TODO: handle exception
        	System.out.println("error");
        	e.printStackTrace();
		}
		return null;
    }

    public void updateHospital(Hospital updatedHospital) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Hospital hospitalToUpdate = session.get(Hospital.class, updatedHospital.getId());
            if (hospitalToUpdate != null) {
                hospitalToUpdate.setName(updatedHospital.getName());
                hospitalToUpdate.setAddress(updatedHospital.getAddress());
                hospitalToUpdate.setPhone(updatedHospital.getPhone());
                session.update(hospitalToUpdate);
                transaction.commit();
                System.out.println("Hospital updated successfully.");
            } else {
                System.out.println("Hospital not found.");
            }
        }catch (Exception e) {
			// TODO: handle exception
        	System.out.println("error");
        	e.printStackTrace();
		}
    }

    public void deleteHospital(int id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Hospital hospitalToDelete = session.get(Hospital.class, id);
            if (hospitalToDelete != null) {
                session.delete(hospitalToDelete);
                transaction.commit();
                System.out.println("Hospital deleted successfully.");
            } else {
                System.out.println("Hospital not found.");
            }
        }catch (Exception e) {
			// TODO: handle exception
        	System.out.println("error");
        	e.printStackTrace();
		}
    }

    public List<Hospital> getAllHospitals() {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Hospital> criteriaQuery = criteriaBuilder.createQuery(Hospital.class);
            Root<Hospital> root = criteriaQuery.from(Hospital.class);
            criteriaQuery.select(root);
            return session.createQuery(criteriaQuery).getResultList();
        }catch (Exception e) {
			// TODO: handle exception
        	System.out.println("error");
        	e.printStackTrace();
		}
		return null;
    }
}
