import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PvbinduComponent } from './pvbindu.component';

describe('PvbinduComponent', () => {
  let component: PvbinduComponent;
  let fixture: ComponentFixture<PvbinduComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PvbinduComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PvbinduComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
