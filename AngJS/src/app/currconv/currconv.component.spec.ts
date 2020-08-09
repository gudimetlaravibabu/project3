import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CurrconvComponent } from './currconv.component';

describe('CurrconvComponent', () => {
  let component: CurrconvComponent;
  let fixture: ComponentFixture<CurrconvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CurrconvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CurrconvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
