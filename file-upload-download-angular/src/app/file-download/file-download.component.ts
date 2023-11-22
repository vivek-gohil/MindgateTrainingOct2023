import { Component } from '@angular/core';
import { FileUploadDownloadService } from '../file-upload-download.service';

@Component({
  selector: 'app-file-download',
  templateUrl: './file-download.component.html',
  styleUrls: ['./file-download.component.css']
})
export class FileDownloadComponent {
  fileId: number = 0;

  
}
