import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PvamitComponent } from './pvamit.component';

describe('PvamitComponent', () => {
  let component: PvamitComponent;
  let fixture: ComponentFixture<PvamitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PvamitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PvamitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
