package com.beingjavaguys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.beingjavaguys.domain.Cars;
import com.beingjavaguys.domain.Employee;
import com.beingjavaguys.services.DataService;

@Controller
public class DataController {
	
	@Autowired
	DataService dataService;

	@RequestMapping("form")
	public ModelAndView getForm(@ModelAttribute Employee employee) {
		return new ModelAndView("form");
	}
	
	@RequestMapping("register")
	public ModelAndView registerUser(@ModelAttribute Employee employee) {
		dataService.insertRow(employee);
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping("list")
	public ModelAndView getList() {
		List employeeList = dataService.getList();
		return new ModelAndView("list","employeeList",employeeList);
	}
	
	@RequestMapping("delete")
	public ModelAndView deleteUser(@RequestParam int id) {
		dataService.deleteRow(id);
		return new ModelAndView("redirect:list");
	}
	
	@RequestMapping("edit")
	public ModelAndView editUser(@RequestParam int id,@ModelAttribute Employee employee) {
		Employee employeeObject = dataService.getRowById(id);
		return new ModelAndView("edit","employeeObject",employeeObject);
	}
	
	@RequestMapping("update")
	public ModelAndView updateUser(@ModelAttribute Employee employee) {
		dataService.updateRow(employee);
		return new ModelAndView("redirect:list");
	}


	@RequestMapping("formCars")
	public ModelAndView getFormCars(@ModelAttribute Cars cars) {
		return new ModelAndView("formCars");
	}

	@RequestMapping("registerCars")
	public ModelAndView registerCars(@ModelAttribute Cars cars) {
		dataService.insertCarsRow(cars);
		return new ModelAndView("redirect:listCars");
	}

	@RequestMapping("listCars")
	public ModelAndView getCarsList() {
		List carsList = dataService.getCarsList();
		return new ModelAndView("listCars","carsList",carsList);
	}

	@RequestMapping("deleteCars")
	public ModelAndView deleteCars(@RequestParam int id) {
		dataService.deleteCarsRow(id);
		return new ModelAndView("redirect:listCars");
	}

	@RequestMapping("editCars")
	public ModelAndView editCars(@RequestParam int id,@ModelAttribute Cars cars) {
		Cars carsObject = dataService.getRowCarsById(id);
		return new ModelAndView("editCars","carsObject",carsObject);
	}

	@RequestMapping("updateCars")
	public ModelAndView updateCars(@ModelAttribute Cars cars) {
		dataService.updateCarsRow(cars);
		return new ModelAndView("redirect:listCars");
	}

}
