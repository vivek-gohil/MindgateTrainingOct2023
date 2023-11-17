import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HrFooterComponent } from './hr-footer.component';

describe('HrFooterComponent', () => {
  let component: HrFooterComponent;
  let fixture: ComponentFixture<HrFooterComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HrFooterComponent]
    });
    fixture = TestBed.createComponent(HrFooterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
