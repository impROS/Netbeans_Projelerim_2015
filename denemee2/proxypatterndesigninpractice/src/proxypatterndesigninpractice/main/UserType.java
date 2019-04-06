package proxypatterndesigninpractice.main;

public enum UserType {

	SUPER_USER("SuperUser"),
	SYSTEM_USER("SystemUser"),
	EVERYBODY("Everybody");
	
	private String name;
	
	UserType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
