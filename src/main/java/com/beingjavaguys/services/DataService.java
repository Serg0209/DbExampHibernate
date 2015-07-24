package com.beingjavaguys.services;

import java.util.List;
import com.beingjavaguys.domain.Cars;
import com.beingjavaguys.domain.Employee;

public interface DataService {
	public int insertRow(Employee employee);

	public List<Employee> getList();

	public Employee getRowById(int id);

	public int updateRow(Employee employee);

	public int deleteRow(int id);

	public int insertCarsRow(Cars cars);

	public List<Cars> getCarsList();

	public Cars getRowCarsById(int id);

	public int updateCarsRow(Cars cars);

	public int deleteCarsRow(int id);

}
