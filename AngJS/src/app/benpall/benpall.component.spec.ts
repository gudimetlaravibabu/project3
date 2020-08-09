import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BenpallComponent } from './benpall.component';

describe('BenpallComponent', () => {
  let component: BenpallComponent;
  let fixture: ComponentFixture<BenpallComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BenpallComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BenpallComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
