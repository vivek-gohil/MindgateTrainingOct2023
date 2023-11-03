import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllEmployeeComponent } from './all-employee.component';

describe('AllEmployeeComponent', () => {
  let component: AllEmployeeComponent;
  let fixture: ComponentFixture<AllEmployeeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AllEmployeeComponent]
    });
    fixture = TestBed.createComponent(AllEmployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
