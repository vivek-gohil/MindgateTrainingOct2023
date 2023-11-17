import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewJobComponent } from './new-job.component';

describe('NewJobComponent', () => {
  let component: NewJobComponent;
  let fixture: ComponentFixture<NewJobComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NewJobComponent]
    });
    fixture = TestBed.createComponent(NewJobComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
