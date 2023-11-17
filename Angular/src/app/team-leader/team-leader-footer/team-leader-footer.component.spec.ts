import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TeamLeaderFooterComponent } from './team-leader-footer.component';

describe('TeamLeaderFooterComponent', () => {
  let component: TeamLeaderFooterComponent;
  let fixture: ComponentFixture<TeamLeaderFooterComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TeamLeaderFooterComponent]
    });
    fixture = TestBed.createComponent(TeamLeaderFooterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
