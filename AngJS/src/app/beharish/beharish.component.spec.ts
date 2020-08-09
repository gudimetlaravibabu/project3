import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BeharishComponent } from './beharish.component';

describe('BeharishComponent', () => {
  let component: BeharishComponent;
  let fixture: ComponentFixture<BeharishComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BeharishComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BeharishComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
