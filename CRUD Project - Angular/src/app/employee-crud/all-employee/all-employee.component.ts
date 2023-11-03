import { Component } from '@angular/core';
import { EmployeeCrudService } from '../employee-crud.service';
import { OnInit } from '@angular/core';
import { Employee } from '../employee';
import { Router } from '@angular/router';

@Component({
  selector: 'app-all-employee',
  templateUrl: './all-employee.component.html',
  styleUrls: ['./all-employee.component.css']
})
export class AllEmployeeComponent implements OnInit {

  employees: Employee[] = [];

  constructor(private employeeCrudService: EmployeeCrudService, private router: Router) {

  }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.employeeCrudService.getAllEmployees().subscribe(
      data => {
        this.employees = data;
        console.log(this.employees);
      }
    );
  }

  deleteEmployee(employeeId: number) {
    this.employeeCrudService.deleteEmployee(employeeId).subscribe(
      data => {
        console.log(data);
        this.reloadData();
      }
    );
  }

  details(employeeId: number) {
    this.router.navigate(['details', employeeId]);
  }

  updateEmployee(employeeId: number) {
    this.router.navigate(['updateemployee', employeeId]);
  }
}
