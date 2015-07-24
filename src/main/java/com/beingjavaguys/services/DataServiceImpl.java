package com.beingjavaguys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.beingjavaguys.dao.DataDao;
import com.beingjavaguys.domain.Employee;
import com.beingjavaguys.domain.Cars;

public class DataServiceImpl implements DataService {
	
	@Autowired
	DataDao dataDao;

	@Override
	public int insertRow(Employee employee) {
		return dataDao.insertRow(employee);
	}

	@Override
	public List<Employee> getList() {
		return dataDao.getList();
	}

	@Override
	public Employee getRowById(int id) {
		return dataDao.getRowById(id);
	}

	@Override
	public int updateRow(Employee employee) {
		return dataDao.updateRow(employee);
	}

	@Override
	public int deleteRow(int id) {
		return dataDao.deleteRow(id);
	}

	@Override
	public int insertCarsRow(Cars cars) {
		return dataDao.insertCarsRow(cars);
	}

	@Override
	public List<Cars> getCarsList() {
		return dataDao.getCarsList();
	}

	@Override
	public Cars getRowCarsById(int id) {
		return dataDao.getRowCarsById(id);
	}

	@Override
	public int updateCarsRow(Cars cars) {
		return dataDao.updateCarsRow(cars);
	}

	@Override
	public int deleteCarsRow(int id) {
		return dataDao.deleteCarsRow(id);
	}

}
