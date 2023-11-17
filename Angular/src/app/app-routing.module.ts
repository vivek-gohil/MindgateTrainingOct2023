import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { TeamLeaderHomeComponent } from './team-leader/team-leader-home/team-leader-home.component';
import { HrHomeComponent } from './hr/hr-home/hr-home.component';
import { TeamLeaderProfileComponent } from './team-leader/team-leader-profile/team-leader-profile.component';
import { JobRequestComponent } from './team-leader/job-request/job-request.component';
import { HrProfileComponent } from './hr/hr-profile/hr-profile.component';
import { NewJobComponent } from './hr/new-job/new-job.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },

  { path: 'teamleaderhome', component: TeamLeaderHomeComponent },
  { path: 'teamleaderprofile', component: TeamLeaderProfileComponent },
  { path: 'jobrequest', component: JobRequestComponent },

  { path: 'hrhome', component: HrHomeComponent },
  { path: 'hrprofile', component: HrProfileComponent },
  { path: 'newjob', component: NewJobComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
