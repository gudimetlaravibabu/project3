import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NbrprashantComponent } from './nbrprashant.component';

describe('NbrprashantComponent', () => {
  let component: NbrprashantComponent;
  let fixture: ComponentFixture<NbrprashantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NbrprashantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NbrprashantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
