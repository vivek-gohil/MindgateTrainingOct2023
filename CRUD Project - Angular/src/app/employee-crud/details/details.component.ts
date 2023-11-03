import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { EmployeeCrudService } from '../employee-crud.service';
import { Employee } from '../employee';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {
  employeeId: number = 0;
  employee: Employee = new Employee();

  constructor(private activatedRoute: ActivatedRoute, 
                              private employeeCrudService: EmployeeCrudService) {
  }

  ngOnInit(): void {
    this.employeeId = this.activatedRoute.snapshot.params['employeeId'];
    this.employeeCrudService.getEmployeeByEmployeeId(this.employeeId).subscribe(
      data=> {
        this.employee = data;
        console.log(this.employee);
      }
    );
  }

  gotoHome(){
    
  }
}
