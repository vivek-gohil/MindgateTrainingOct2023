import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TeamLeaderHeaderComponent } from './team-leader-header.component';

describe('TeamLeaderHeaderComponent', () => {
  let component: TeamLeaderHeaderComponent;
  let fixture: ComponentFixture<TeamLeaderHeaderComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TeamLeaderHeaderComponent]
    });
    fixture = TestBed.createComponent(TeamLeaderHeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
