package proxypatterndesigninpractice.main;

import java.util.ArrayList;
import java.util.List;

import proxypatterndesigninpractice.folder.Folder;
import proxypatterndesigninpractice.folder.FolderProxy;

public class Main {

	public static void main(String[] args) {
		
		User user = new User.UserBuilder("Batuhan", "Düzgün", UserType.EVERYBODY)
							.setHasReadAccess(true)
							.setHasWriteAccess(true)
							.build();
		
		
		UserType systemUserType = UserType.SYSTEM_USER;
		UserType superUserType = UserType.SUPER_USER;
		UserType everybodyUserType = UserType.EVERYBODY;
		
		Folder folder1 = new Folder("/home/batuhan/Documents/dosya1.txt","SAMPIYON FENERBAHCE",true);
		folder1.getAllowedUserTypes().add(superUserType);
		
		Folder folder2 = new Folder("/home/batuhan/Documents/dosya2.txt","SAMPIYON FENERBAHCE",true);
		folder2.getAllowedUserTypes().add(superUserType);
		folder2.getAllowedUserTypes().add(everybodyUserType);
		
		Folder folder3 = new Folder("/home/batuhan/Documents/dosya3.txt","SAMPIYON FENERBAHCE",true);
		folder3.getAllowedUserTypes().add(superUserType);
		folder3.getAllowedUserTypes().add(everybodyUserType);
		folder3.getAllowedUserTypes().add(systemUserType);
		
		Folder folder4 = new Folder("/home/batuhan/Documents/dosya4.txt","SAMPIYON FENERBAHCE",true);
		folder4.getAllowedUserTypes().add(superUserType);
		folder4.getAllowedUserTypes().add(systemUserType);
		
		Folder folder5 = new Folder("/home/batuhan/Documents/dosya5.txt","SAMPIYON FENERBAHCE",true);
		folder5.getAllowedUserTypes().add(systemUserType);
		
		List<Folder> folders = new ArrayList<Folder>();
		folders.add(folder1);
		folders.add(folder2);
		folders.add(folder3);
		folders.add(folder4);
		folders.add(folder5);
		
		FolderProxy folderProxy = new FolderProxy(user, folders);
		folderProxy.write();
		folderProxy.read();
	}

}
