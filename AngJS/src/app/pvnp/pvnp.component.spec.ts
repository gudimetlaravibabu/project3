import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PvnpComponent } from './pvnp.component';

describe('PvnpComponent', () => {
  let component: PvnpComponent;
  let fixture: ComponentFixture<PvnpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PvnpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PvnpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
