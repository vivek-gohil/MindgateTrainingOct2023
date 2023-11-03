import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeCrudService } from '../employee-crud.service';
import { Employee } from '../employee';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {
  employeeId: number = 0;
  employee: Employee = new Employee();
  result: boolean = false;

  constructor(private activatedRoute: ActivatedRoute,
    private employeeCrudService: EmployeeCrudService, private router: Router) {
  }
  ngOnInit(): void {
    this.employeeId = this.activatedRoute.snapshot.params['employeeId'];
    this.employeeCrudService.getEmployeeByEmployeeId(this.employeeId).subscribe(
      data => {
        this.employee = data;
        console.log(this.employee);
      }
    );
  }
  updateEmployee() {
    console.log(this.employee);
    this.employeeCrudService.updateEmployee(this.employee).subscribe(
      data => {
        console.log(data);
        this.result = true;
      }
    );
  }

  gotoHome() {
    this.router.navigate(['allemployees']);
  }

}
