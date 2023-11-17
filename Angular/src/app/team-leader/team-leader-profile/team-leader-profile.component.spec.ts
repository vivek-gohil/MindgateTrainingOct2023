import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TeamLeaderProfileComponent } from './team-leader-profile.component';

describe('TeamLeaderProfileComponent', () => {
  let component: TeamLeaderProfileComponent;
  let fixture: ComponentFixture<TeamLeaderProfileComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TeamLeaderProfileComponent]
    });
    fixture = TestBed.createComponent(TeamLeaderProfileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
