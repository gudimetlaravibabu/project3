import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { M2actualsComponent } from './m2actuals.component';

describe('M2actualsComponent', () => {
  let component: M2actualsComponent;
  let fixture: ComponentFixture<M2actualsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ M2actualsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(M2actualsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
