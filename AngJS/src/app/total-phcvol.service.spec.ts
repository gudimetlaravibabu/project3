import { TestBed } from '@angular/core/testing';

import { TotalPHCVolService } from './total-phcvol.service';

describe('TotalPHCVolService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TotalPHCVolService = TestBed.get(TotalPHCVolService);
    expect(service).toBeTruthy();
  });
});
