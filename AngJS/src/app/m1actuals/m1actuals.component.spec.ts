import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { M1actualsComponent } from './m1actuals.component';

describe('M1actualsComponent', () => {
  let component: M1actualsComponent;
  let fixture: ComponentFixture<M1actualsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ M1actualsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(M1actualsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
