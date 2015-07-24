package com.beingjavaguys.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.beingjavaguys.domain.Employee;
import com.beingjavaguys.domain.Cars;
import org.springframework.stereotype.Repository;

@Repository
public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public int insertRow(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(employee);
		tx.commit();
		Serializable id = session.getIdentifier(employee);
		session.close();
		return (Integer) id;
	}

	@Override
	public List<Employee> getList() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Employee> employeeList = session.createQuery("from Employee")
				.list();
		session.close();
		return employeeList;
	}

	@Override
	public Employee getRowById(int id) {
		Session session = sessionFactory.openSession();
		Employee employee = (Employee) session.load(Employee.class, id);
		return employee;
	}

	@Override
	public int updateRow(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(employee);
		tx.commit();
		Serializable id = session.getIdentifier(employee);
		session.close();
		return (Integer) id;
	}

	@Override
	public int deleteRow(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee employee = (Employee) session.load(Employee.class, id);
		session.delete(employee);
		tx.commit();
		Serializable ids = session.getIdentifier(employee);
		session.close();
		return (Integer) ids;
	}

	@Override
	@Transactional
	public int insertCarsRow(Cars cars) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(cars);
		tx.commit();
		Serializable id = session.getIdentifier(cars);
		session.close();
		return (Integer) id;
	}

	@Override
	public List<Cars> getCarsList() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Cars> carsList = session.createQuery("from Cars")
				.list();
		session.close();
		return carsList;
	}

	@Override
	public Cars getRowCarsById(int id) {
		Session session = sessionFactory.openSession();
		Cars cars = (Cars) session.load(Cars.class, id);
		return cars;
	}

	@Override
	public int updateCarsRow(Cars cars) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(cars);
		tx.commit();
		Serializable id = session.getIdentifier(cars);
		session.close();
		return (Integer) id;
	}

	@Override
	public int deleteCarsRow(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Cars cars = (Cars) session.load(Cars.class, id);
		session.delete(cars);
		tx.commit();
		Serializable ids = session.getIdentifier(cars);
		session.close();
		return (Integer) ids;
	}
}
