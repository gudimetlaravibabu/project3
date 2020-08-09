import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PvmukulComponent } from './pvmukul.component';

describe('PvmukulComponent', () => {
  let component: PvmukulComponent;
  let fixture: ComponentFixture<PvmukulComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PvmukulComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PvmukulComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
