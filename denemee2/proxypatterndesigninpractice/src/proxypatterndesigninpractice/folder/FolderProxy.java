package proxypatterndesigninpractice.folder;

import java.util.ArrayList;
import java.util.List;

import proxypatterndesigninpractice.main.User;

public class FolderProxy implements IFolder {

	private List<Folder> folders;
	private User user;
	
	public FolderProxy() {
		this.setUser(null);
		this.setFolders(new ArrayList<Folder>());
	}
	
	public FolderProxy(User user, List<Folder> folders) {
		this();
		this.setFolders(folders);
		this.setUser(user);
	}
	
	@Override
	public void write() {
		
		for(Folder folder : this.getFolders()) {
			if(folder.getAllowedUserTypes().contains(this.getUser().getUserType()) && this.getUser().isHasWriteAccess()) {
				folder.write();
			}
			else {
				System.out.println("You dont have write access for this file >> " + folder.getPath());
			}
		}
	}

	@Override
	public String read() {
		
		StringBuffer stringBuffer = new StringBuffer();
		for(Folder folder : this.getFolders()) {
			if(folder.getAllowedUserTypes().contains(this.getUser().getUserType()) && this.getUser().isHasWriteAccess()) {
				stringBuffer.append(folder.read());
			}
			else {
				System.out.println("You dont have read access for this file >> " + folder.getPath());
			}
		}
		return stringBuffer.toString();
	}

	public List<Folder> getFolders() {
		return folders;
	}

	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
