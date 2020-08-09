import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PhcvolaccountharishComponent } from './phcvolaccountharish.component';

describe('PhcvolaccountharishComponent', () => {
  let component: PhcvolaccountharishComponent;
  let fixture: ComponentFixture<PhcvolaccountharishComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PhcvolaccountharishComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PhcvolaccountharishComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
