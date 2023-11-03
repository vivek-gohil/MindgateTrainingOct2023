import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllEmployeeComponent } from './employee-crud/all-employee/all-employee.component';
import { AddNewEmployeeComponent } from './employee-crud/add-new-employee/add-new-employee.component';
import { DetailsComponent } from './employee-crud/details/details.component';
import { UpdateEmployeeComponent } from './employee-crud/update-employee/update-employee.component';

const routes: Routes = [
  { path: "allemployees", component: AllEmployeeComponent },
  { path: "newemployee", component: AddNewEmployeeComponent },
  { path: "details/:employeeId", component: DetailsComponent },
  { path: "updateemployee/:employeeId", component: UpdateEmployeeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
