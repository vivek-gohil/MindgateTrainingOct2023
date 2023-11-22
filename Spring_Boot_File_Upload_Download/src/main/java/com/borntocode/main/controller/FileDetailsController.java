package com.borntocode.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.borntocode.main.domain.FileDetails;
import com.borntocode.main.service.FileDetailsServiceInterface;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("filedetailsapi")
public class FileDetailsController {

	@Autowired
	private FileDetailsServiceInterface fileDetailsServiceInterface;

	@RequestMapping(value = "upload", method = RequestMethod.POST)
	public boolean uploadFile(@RequestParam("file") MultipartFile file) {
		FileDetails fileDetails = new FileDetails();
		fileDetails.setName(StringUtils.cleanPath(file.getOriginalFilename()));
		fileDetails.setType(file.getContentType());
		try {
			fileDetails.setData(file.getBytes());
		} catch (IOException e) {
			System.out.println("Exception while file upload");
		}
		return fileDetailsServiceInterface.addNewFile(fileDetails);
	}

	@RequestMapping(value = "/files/{id}")
	public ResponseEntity<byte[]> getFile(@PathVariable int id) {
		FileDetails fileDetails = fileDetailsServiceInterface.getFileByFileId(id);
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDetails.getName() + "\"")
				.body(fileDetails.getData());
	}
}
