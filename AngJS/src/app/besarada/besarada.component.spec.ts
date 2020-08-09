import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BesaradaComponent } from './besarada.component';

describe('BesaradaComponent', () => {
  let component: BesaradaComponent;
  let fixture: ComponentFixture<BesaradaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BesaradaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BesaradaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
