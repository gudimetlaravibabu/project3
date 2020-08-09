import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NbrTileComponent } from './nbr-tile.component';

describe('NbrTileComponent', () => {
  let component: NbrTileComponent;
  let fixture: ComponentFixture<NbrTileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NbrTileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NbrTileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
