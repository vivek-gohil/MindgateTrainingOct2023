import { TestBed } from '@angular/core/testing';

import { EmployeeCrudService } from './employee-crud.service';

describe('EmployeeCrudService', () => {
  let service: EmployeeCrudService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmployeeCrudService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
