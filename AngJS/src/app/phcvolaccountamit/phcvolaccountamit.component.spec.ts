import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PhcvolaccountamitComponent } from './phcvolaccountamit.component';

describe('PhcvolaccountamitComponent', () => {
  let component: PhcvolaccountamitComponent;
  let fixture: ComponentFixture<PhcvolaccountamitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PhcvolaccountamitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PhcvolaccountamitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
