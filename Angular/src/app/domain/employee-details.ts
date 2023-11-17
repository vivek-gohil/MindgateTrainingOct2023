import { ProjectDetails } from "./project-details";

export class EmployeeDetails{
    employeeId: string = "";
    name: string = "";
    mailId : string = "";
    password: string = "";
    designation: string = "";
    projectDetails : ProjectDetails = new ProjectDetails();
}