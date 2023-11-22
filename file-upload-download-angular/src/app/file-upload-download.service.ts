import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FileUploadDownloadService {

  constructor(private httpClient: HttpClient) { }

  upload(file: any) : Observable<boolean>{

    console.log(file);
    
    // Create form data 
    const formData = new FormData();  
        
    // Store form name as "file" with file data 
    formData.append("file", file, file.name); 

    console.log(formData);
    
    return this.httpClient.post<boolean>("http://localhost:8080/filedetailsapi/upload",formData);
  }

}
