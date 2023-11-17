import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { FormsModule } from '@angular/forms';
import { TeamLeaderHomeComponent } from './team-leader/team-leader-home/team-leader-home.component';
import { TeamLeaderHeaderComponent } from './team-leader/team-leader-header/team-leader-header.component';
import { TeamLeaderFooterComponent } from './team-leader/team-leader-footer/team-leader-footer.component';
import { HrHomeComponent } from './hr/hr-home/hr-home.component';
import { HrHeaderComponent } from './hr/hr-header/hr-header.component';
import { HrFooterComponent } from './hr/hr-footer/hr-footer.component';
import { NewJobComponent } from './hr/new-job/new-job.component';
import { HrProfileComponent } from './hr/hr-profile/hr-profile.component';
import { TeamLeaderProfileComponent } from './team-leader/team-leader-profile/team-leader-profile.component';
import { JobRequestComponent } from './team-leader/job-request/job-request.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    TeamLeaderHomeComponent,
    TeamLeaderHeaderComponent,
    TeamLeaderFooterComponent,
    HrHomeComponent,
    HrHeaderComponent,
    HrFooterComponent,
    NewJobComponent,
    HrProfileComponent,
    TeamLeaderProfileComponent,
    JobRequestComponent
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
