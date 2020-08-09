import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BebinduComponent } from './bebindu.component';

describe('BebinduComponent', () => {
  let component: BebinduComponent;
  let fixture: ComponentFixture<BebinduComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BebinduComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BebinduComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
