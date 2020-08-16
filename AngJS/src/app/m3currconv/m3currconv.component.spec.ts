import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { M3currconvComponent } from './m3currconv.component';

describe('M3currconvComponent', () => {
  let component: M3currconvComponent;
  let fixture: ComponentFixture<M3currconvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ M3currconvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(M3currconvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
