import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BeraviComponent } from './beravi.component';

describe('BeraviComponent', () => {
  let component: BeraviComponent;
  let fixture: ComponentFixture<BeraviComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BeraviComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BeraviComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
