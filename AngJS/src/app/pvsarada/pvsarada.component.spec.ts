import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PvsaradaComponent } from './pvsarada.component';

describe('PvsaradaComponent', () => {
  let component: PvsaradaComponent;
  let fixture: ComponentFixture<PvsaradaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PvsaradaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PvsaradaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
