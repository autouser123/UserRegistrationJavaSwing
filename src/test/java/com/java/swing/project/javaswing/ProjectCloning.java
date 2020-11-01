package com.java.swing.project.javaswing;

import java.nio.file.Paths;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

public class ProjectCloning {

	public static void main(String[] args) {
		String repoUrl = "https://cmra.wkglobal.com:8088/FS-RC/HMDAWiz-Agile/_git/WizNG.QA.UIAutomation?path=%2Fquickstart&version=GBDev";
		String cloneDirectoryPath = "C:\\Git project demo\\"; // Ex.in windows c:\\gitProjects\SpringBootMongoDbCRUD\
		try {
		    System.out.println("Cloning "+repoUrl+" into "+repoUrl);
		    Git.cloneRepository()
		        .setURI(repoUrl)
		        .setDirectory(Paths.get(cloneDirectoryPath).toFile())
		        .call();
		    System.out.println("Completed Cloning");
		} catch (GitAPIException e) {
		    System.out.println("Exception occurred while cloning repo");
		    e.printStackTrace();
		}
	}

}
