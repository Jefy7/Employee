package com.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.employee.dao.Empdao;
import com.employeebackend.model.AddEmployeeModel;



@Controller
public class AddEmployee {
	
	@Autowired
	Empdao empdao;
	
	@RequestMapping("/Addemp")
	public String addEmp(){
		System.out.println("hi");
		return"Addemp";
	}
	@RequestMapping("/addemp")
	public String showMeUserRegister(@ModelAttribute("empmodelattribute") AddEmployeeModel addemployeemodel){
		if(empdao.insertEmployee(addemployeemodel))
		{
			return "redirect:/Addemp";
		}
		else
		{
		return "redirect:/Addemp";
		}
	}
	
	@RequestMapping("/deleteemployee")
	public String removeProduct(@RequestParam("empid") int employeeId) throws Exception
	{
		empdao.deleteEmployee(employeeId);
		
			return "redirect:/listemployee";
		
	}


	@RequestMapping("/editemployee")
	public ModelAndView displayProductEdit(@RequestParam("empid") int productId) throws Exception{
		
		ModelAndView modelandview= new ModelAndView("listemployee","employeemodelattributeedit",empdao.displayEmployeeEdit(productId));
		modelandview.addObject("check",false);
		return modelandview;
	}



	@RequestMapping("listemployee")
	public ModelAndView showMeAddProduct(){
		ModelAndView modelandview= new ModelAndView("listemployee","employeemodelattribute",new AddEmployeeModel());
		modelandview.addObject( "employeelistmodelattribute",empdao.allEmployee());
		modelandview.addObject("check",true);
		return modelandview;
	}
}
