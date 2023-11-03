import { Component } from '@angular/core';
import { Employee } from '../employee';
import { AllEmployeeComponent } from '../all-employee/all-employee.component';
import { EmployeeCrudService } from '../employee-crud.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-new-employee',
  templateUrl: './add-new-employee.component.html',
  styleUrls: ['./add-new-employee.component.css']
})
export class AddNewEmployeeComponent {
  result : boolean = false;
  employee: Employee = new Employee();

  constructor(private employeeCrudService : EmployeeCrudService ,
     private router : Router){

  }

  saveEmployee(){
    console.log(this.employee);
    this.employeeCrudService.addNewEmployee(this.employee).subscribe(
      data=>{
        console.log(data);
        this.result = data;
      }
    );    
  }

  gotoHome(){
    this.router.navigate(['allemployees']);
  }
}
