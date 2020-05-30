package br.cin.ufpe.hcs3;

import java.io.Serializable;
import java.util.*;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

import br.cin.ufpe.hcs3.models.Employee;

public class WelcomePage extends WebPage implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List<String> departaments;
	private Employee employee;

	public WelcomePage() {
		this.initializeDepartaments();
		this.initializeEmployee();
		this.initializeEmployeeForm();
	}

	public void initializeEmployeeForm() {
		Form<?> employeeForm = new Form("employeeForm");

		TextField<String> employeeName = new TextField<String>("employeeName",
				new PropertyModel<String>(this.employee, "name"));

		TextField<String> employeeDocument = new TextField<String>("employeeDocument",
				new PropertyModel<String>(this.employee, "document"));
		
		DropDownChoice<String> employeeDepartament = 
				new DropDownChoice<String>("employeeDepartament",
						new PropertyModel<String>(this.employee, "departament"), 
						departaments);
		
		Button employeeFormSubmit = new Button("employeeFormSubmit") {
			private static final long serialVersionUID = 1L;

			public void onSubmit() {
				super.onSubmit();
				System.out.println(employee);
			}
		};
		
		employeeForm.add(employeeName);
		employeeForm.add(employeeDocument);
		employeeForm.add(employeeDepartament);
		employeeForm.add(employeeFormSubmit);		
		add(employeeForm);
		
	}

	public void initializeDepartaments() {
		this.departaments = new ArrayList<String>();
		departaments.add("Tecnologia");
		departaments.add("Financeiro");
		departaments.add("Administrativo");
	}

	public void initializeEmployee() {
		this.employee = new Employee();
	}

}
