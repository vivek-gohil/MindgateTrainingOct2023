import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeCrudService {

  constructor(private httpClient: HttpClient) { }

  getEmployeeByEmployeeId(employeeId: number) : Observable<Employee> {
    return this.httpClient.get<Employee>('http://localhost:8080/employeeapi/employees/'+employeeId);
  }

  updateEmployee(employee: Employee) : Observable<Employee> {
    return this.httpClient.put<Employee>('http://localhost:8080/employeeapi/employees/employee',employee);
  }
  
  addNewEmployee(employee: Employee) : Observable<boolean> {
    return this.httpClient.post<boolean>('http://localhost:8080/employeeapi/employees/employee',employee);
  }

  getAllEmployees(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>('http://localhost:8080/employeeapi/employees');
  }

  deleteEmployee(employeeId: number) : Observable<boolean> {
    return this.httpClient.delete<boolean>('http://localhost:8080/employeeapi/employees/'+employeeId);
  }


}
