import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NbrnpallComponent } from './nbrnpall.component';

describe('NbrnpallComponent', () => {
  let component: NbrnpallComponent;
  let fixture: ComponentFixture<NbrnpallComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NbrnpallComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NbrnpallComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
