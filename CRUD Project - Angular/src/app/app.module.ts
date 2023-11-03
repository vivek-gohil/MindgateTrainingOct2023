import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { AllEmployeeComponent } from './employee-crud/all-employee/all-employee.component';
import { AddNewEmployeeComponent } from './employee-crud/add-new-employee/add-new-employee.component';
import { DetailsComponent } from './employee-crud/details/details.component';
import { UpdateEmployeeComponent } from './employee-crud/update-employee/update-employee.component';

@NgModule({
  declarations: [
    AppComponent,
    AllEmployeeComponent,
    AddNewEmployeeComponent,
    DetailsComponent,
    UpdateEmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
