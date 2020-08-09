import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BenpComponent } from './benp.component';

describe('BenpComponent', () => {
  let component: BenpComponent;
  let fixture: ComponentFixture<BenpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BenpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BenpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
