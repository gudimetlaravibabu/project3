import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { M2currconvComponent } from './m2currconv.component';

describe('M2currconvComponent', () => {
  let component: M2currconvComponent;
  let fixture: ComponentFixture<M2currconvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ M2currconvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(M2currconvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
