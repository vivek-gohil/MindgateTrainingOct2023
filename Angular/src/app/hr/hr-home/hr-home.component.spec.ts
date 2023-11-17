import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HrHomeComponent } from './hr-home.component';

describe('HrHomeComponent', () => {
  let component: HrHomeComponent;
  let fixture: ComponentFixture<HrHomeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HrHomeComponent]
    });
    fixture = TestBed.createComponent(HrHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
