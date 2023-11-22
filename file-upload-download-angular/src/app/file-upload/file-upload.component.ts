import { Component } from '@angular/core';
import { FileUploadDownloadService } from '../file-upload-download.service';

@Component({
  selector: 'app-file-upload',
  templateUrl: './file-upload.component.html',
  styleUrls: ['./file-upload.component.css']
})
export class FileUploadComponent {
  
  
  loading: boolean = false; // Flag variable
  file?: File; // Variable to store file to Upload

  // Inject service
  constructor(private fileUploadDownloadService: FileUploadDownloadService) {}

  // On file Select
  onChange(event : any) {
    this.file = event.target.files[0];
  }

  // OnClick of button Upload
  onUpload() {
    if (this.file) {
      console.log(this.file);
      this.fileUploadDownloadService.upload(this.file).subscribe(
        data => {
          console.log(data);
        }
      );
    }
  }
}
