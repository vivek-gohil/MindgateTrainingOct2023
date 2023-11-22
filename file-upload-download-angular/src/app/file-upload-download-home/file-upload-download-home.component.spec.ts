import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FileUploadDownloadHomeComponent } from './file-upload-download-home.component';

describe('FileUploadDownloadHomeComponent', () => {
  let component: FileUploadDownloadHomeComponent;
  let fixture: ComponentFixture<FileUploadDownloadHomeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FileUploadDownloadHomeComponent]
    });
    fixture = TestBed.createComponent(FileUploadDownloadHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
