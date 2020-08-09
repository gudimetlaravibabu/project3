import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PvraviComponent } from './pvravi.component';

describe('PvraviComponent', () => {
  let component: PvraviComponent;
  let fixture: ComponentFixture<PvraviComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PvraviComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PvraviComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
