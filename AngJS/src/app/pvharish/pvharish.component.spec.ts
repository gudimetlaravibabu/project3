import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PvharishComponent } from './pvharish.component';

describe('PvharishComponent', () => {
  let component: PvharishComponent;
  let fixture: ComponentFixture<PvharishComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PvharishComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PvharishComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
