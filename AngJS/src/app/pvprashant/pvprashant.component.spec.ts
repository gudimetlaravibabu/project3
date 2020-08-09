import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PvprashantComponent } from './pvprashant.component';

describe('PvprashantComponent', () => {
  let component: PvprashantComponent;
  let fixture: ComponentFixture<PvprashantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PvprashantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PvprashantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
