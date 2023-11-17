import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HrProfileComponent } from './hr-profile.component';

describe('HrProfileComponent', () => {
  let component: HrProfileComponent;
  let fixture: ComponentFixture<HrProfileComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HrProfileComponent]
    });
    fixture = TestBed.createComponent(HrProfileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
