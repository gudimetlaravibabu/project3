import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NbrsaradaComponent } from './nbrsarada.component';

describe('NbrsaradaComponent', () => {
  let component: NbrsaradaComponent;
  let fixture: ComponentFixture<NbrsaradaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NbrsaradaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NbrsaradaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
