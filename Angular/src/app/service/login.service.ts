import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { EmployeeDetails } from '../domain/employee-details';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private httpClient : HttpClient) { }

  login(employeeDetails : EmployeeDetails) : Observable<EmployeeDetails> {
    return this.httpClient.post<EmployeeDetails>("http://localhost:8081/employeeapi/employee/employeeDetails/validate",employeeDetails);
  }
}
