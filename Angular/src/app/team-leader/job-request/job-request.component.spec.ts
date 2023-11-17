import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JobRequestComponent } from './job-request.component';

describe('JobRequestComponent', () => {
  let component: JobRequestComponent;
  let fixture: ComponentFixture<JobRequestComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [JobRequestComponent]
    });
    fixture = TestBed.createComponent(JobRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
