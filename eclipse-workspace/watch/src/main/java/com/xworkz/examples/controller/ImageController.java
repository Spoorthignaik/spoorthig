package com.xworkz.examples.controller;


import java.io.BufferedInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.examples.service.WatchServiceImpl;

import org.apache.log4j.Logger;


@Controller
@RequestMapping("/")
public class ImageController {
	
	
	 private static final Logger LOGGER = Logger.getLogger(ImageController.class);
	 
	public ImageController() {
		LOGGER.info("ImageController");
	}
	
	
	@PostMapping("/upload")
	public String onUpload(@RequestParam("photo")MultipartFile multipartFile) throws IOException{
		System.out.println("multipartFile"+multipartFile);
		System.out.println(multipartFile.getOriginalFilename());
		System.out.println(multipartFile.getContentType());
		System.out.println(multipartFile.getSize());
		System.out.println(multipartFile.getBytes());
		log.info("multipartFile");
		
		
		byte[] bytes=multipartFile.getBytes();
		Path path=Paths.get("D:\\watch-files\\"+multipartFile.getOriginalFilename());
		Files.write(path, bytes);
		return "ImageUpload";
	}
	
	
	@GetMapping("/download")
	public void onDownload(HttpServletResponse response,@RequestParam String fileName) throws IOException{
		response.setContentType("image/jpeg");
		File file=new File("D:\\watch-files\\"+fileName);
		InputStream in=new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out=response.getOutputStream();
		IOUtils.copy(in, out);
		response.flushBuffer();
	}

}
