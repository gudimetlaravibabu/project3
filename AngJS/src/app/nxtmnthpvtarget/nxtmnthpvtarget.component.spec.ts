import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NxtmnthpvtargetComponent } from './nxtmnthpvtarget.component';

describe('NxtmnthpvtargetComponent', () => {
  let component: NxtmnthpvtargetComponent;
  let fixture: ComponentFixture<NxtmnthpvtargetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NxtmnthpvtargetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NxtmnthpvtargetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
