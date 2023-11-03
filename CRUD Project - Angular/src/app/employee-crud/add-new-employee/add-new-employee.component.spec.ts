import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddNewEmployeeComponent } from './add-new-employee.component';

describe('AddNewEmployeeComponent', () => {
  let component: AddNewEmployeeComponent;
  let fixture: ComponentFixture<AddNewEmployeeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddNewEmployeeComponent]
    });
    fixture = TestBed.createComponent(AddNewEmployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
