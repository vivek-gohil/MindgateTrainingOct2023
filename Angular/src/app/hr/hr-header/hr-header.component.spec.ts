import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HrHeaderComponent } from './hr-header.component';

describe('HrHeaderComponent', () => {
  let component: HrHeaderComponent;
  let fixture: ComponentFixture<HrHeaderComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HrHeaderComponent]
    });
    fixture = TestBed.createComponent(HrHeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
