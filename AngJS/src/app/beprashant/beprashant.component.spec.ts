import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BeprashantComponent } from './beprashant.component';

describe('BeprashantComponent', () => {
  let component: BeprashantComponent;
  let fixture: ComponentFixture<BeprashantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BeprashantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BeprashantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
