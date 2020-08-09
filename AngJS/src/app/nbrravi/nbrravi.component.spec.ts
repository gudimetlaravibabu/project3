import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NbrraviComponent } from './nbrravi.component';

describe('NbrraviComponent', () => {
  let component: NbrraviComponent;
  let fixture: ComponentFixture<NbrraviComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NbrraviComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NbrraviComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
