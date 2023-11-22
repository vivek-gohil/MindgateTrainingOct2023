import { TestBed } from '@angular/core/testing';

import { FileUploadDownloadService } from './file-upload-download.service';

describe('FileUploadDownloadService', () => {
  let service: FileUploadDownloadService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FileUploadDownloadService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
