import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BeamitComponent } from './beamit.component';

describe('BeamitComponent', () => {
  let component: BeamitComponent;
  let fixture: ComponentFixture<BeamitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BeamitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BeamitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
