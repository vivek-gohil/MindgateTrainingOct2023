import { Component } from '@angular/core';
import { EmployeeDetails } from '../domain/employee-details';
import { LoginService } from '../service/login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  login: boolean = false;
  employeeDetails: EmployeeDetails = new EmployeeDetails();

  constructor(private loginService: LoginService, private router : Router) {

  }

  logincheck() {
    this.login = true;

  }

  userLogin() {
    this.loginService.login(this.employeeDetails).subscribe(data => {
      this.employeeDetails = data;
      sessionStorage.setItem('employee', JSON.stringify(this.employeeDetails));
      if(this.employeeDetails.designation == 'TeamLeader'){
        this.router.navigate(['teamleaderhome']);
      }
      if(this.employeeDetails.designation == 'ProjectManager') {
        this.router.navigate(['projectmanagerhome']);
      }
      if(this.employeeDetails.designation == 'Hr') {
        this.router.navigate(['hrhome']);
      }
      if(this.employeeDetails.designation == 'Interviewer') {
        this.router.navigate(['interviewerhome']);
      }
    });
  }

}
