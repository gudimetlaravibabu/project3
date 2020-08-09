import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PhcvolaccountbinduComponent } from './phcvolaccountbindu.component';

describe('PhcvolaccountbinduComponent', () => {
  let component: PhcvolaccountbinduComponent;
  let fixture: ComponentFixture<PhcvolaccountbinduComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PhcvolaccountbinduComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PhcvolaccountbinduComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
