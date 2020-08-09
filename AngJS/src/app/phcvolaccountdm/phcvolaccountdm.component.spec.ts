import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PhcvolaccountdmComponent } from './phcvolaccountdm.component';

describe('PhcvolaccountdmComponent', () => {
  let component: PhcvolaccountdmComponent;
  let fixture: ComponentFixture<PhcvolaccountdmComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PhcvolaccountdmComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PhcvolaccountdmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
