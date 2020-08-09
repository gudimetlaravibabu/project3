import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PhcvolaccountnpComponent } from './phcvolaccountnp.component';

describe('PhcvolaccountnpComponent', () => {
  let component: PhcvolaccountnpComponent;
  let fixture: ComponentFixture<PhcvolaccountnpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PhcvolaccountnpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PhcvolaccountnpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
