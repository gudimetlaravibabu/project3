import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NbrnpComponent } from './nbrnp.component';

describe('NbrnpComponent', () => {
  let component: NbrnpComponent;
  let fixture: ComponentFixture<NbrnpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NbrnpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NbrnpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
