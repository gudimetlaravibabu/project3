import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { M3actualsComponent } from './m3actuals.component';

describe('M3actualsComponent', () => {
  let component: M3actualsComponent;
  let fixture: ComponentFixture<M3actualsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ M3actualsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(M3actualsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
