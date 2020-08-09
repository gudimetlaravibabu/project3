import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PvnpallComponent } from './pvnpall.component';

describe('PvnpallComponent', () => {
  let component: PvnpallComponent;
  let fixture: ComponentFixture<PvnpallComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PvnpallComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PvnpallComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
