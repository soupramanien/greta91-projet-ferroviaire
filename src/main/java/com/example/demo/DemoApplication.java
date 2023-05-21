package com.example.demo;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
		
//		Email from = new Email("soupramanien@baobab-ingenierie.fr");
//	    String subject = "Sending with SendGrid is Fun";
//	    Email to = new Email("soupramani@hotmail.com");
//	    Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
//	    Mail mail = new Mail(from, subject, to, content);
//
////	    SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
//	    SendGrid sg = new SendGrid("jhjhjhj");
//	    Request request = new Request();
//	    try {
//	      request.setMethod(Method.POST);
//	      request.setEndpoint("mail/send");
//	      request.setBody(mail.build());
//	      Response response = sg.api(request);
//	      System.out.println(response.getStatusCode());
//	      System.out.println(response.getBody());
//	      System.out.println(response.getHeaders());
//	    } catch (IOException ex) {
//	      throw ex;
//	    }

//		URL url;
//		url = new URL("https://base-donnees-publique.medicaments.gouv.fr/telechargement.php?fichier=CIS_bdpm.txt");
//		System.out.println("Etablissement de la connexion à " + url.toString());
//		HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
//		// On obtient la taille du fichier à télécharger
//		httpConnection.setRequestMethod("HEAD");
//		long removeFileSize = httpConnection.getContentLengthLong();
//		System.out.println("Taille du fichier à récupérer : " + removeFileSize);
//		BufferedInputStream in = new BufferedInputStream(url.openStream());
//		FileOutputStream fileOutputStream = new FileOutputStream("specialites.txt");
//		int bufferSize = 1024;
//		byte dataBuffer[] = new byte[bufferSize];
//		int bytesRead;
//		while ((bytesRead = in.read(dataBuffer, 0, bufferSize)) != -1) {
//			// Tant que le fichier n'est pas télécharger, on écrit dans le fichier à la
//			// suite.
//			fileOutputStream.write(dataBuffer, 0, bytesRead);
//		}
	}

}
