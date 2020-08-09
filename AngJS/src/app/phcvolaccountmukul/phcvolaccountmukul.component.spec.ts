import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PhcvolaccountmukulComponent } from './phcvolaccountmukul.component';

describe('PhcvolaccountmukulComponent', () => {
  let component: PhcvolaccountmukulComponent;
  let fixture: ComponentFixture<PhcvolaccountmukulComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PhcvolaccountmukulComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PhcvolaccountmukulComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
