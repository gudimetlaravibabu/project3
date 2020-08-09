import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BemukulComponent } from './bemukul.component';

describe('BemukulComponent', () => {
  let component: BemukulComponent;
  let fixture: ComponentFixture<BemukulComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BemukulComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BemukulComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
