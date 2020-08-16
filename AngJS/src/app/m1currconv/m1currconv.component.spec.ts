import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { M1currconvComponent } from './m1currconv.component';

describe('M1currconvComponent', () => {
  let component: M1currconvComponent;
  let fixture: ComponentFixture<M1currconvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ M1currconvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(M1currconvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
