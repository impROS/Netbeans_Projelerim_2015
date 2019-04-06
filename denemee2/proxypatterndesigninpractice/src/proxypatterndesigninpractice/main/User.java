package proxypatterndesigninpractice.main;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 378255018946260847L;
	protected String name = null;
	protected String surname = null;
	protected boolean hasWriteAccess = false;
	protected boolean hasReadAccess = false;
	protected UserType userType = UserType.EVERYBODY;
	
	private User() {}
	private User(UserBuilder builder) {
		this.name = builder.name;
		this.surname = builder.surname;
		this.userType = builder.userType;
		this.hasWriteAccess = builder.hasWriteAccess;
		this.hasReadAccess = builder.hasReadAccess;
	}

	public static class UserBuilder extends User {
		
		private static final long serialVersionUID = 1090780112333497031L;

		public UserBuilder(String name, String surname, UserType userType) {
			super.name = name;
			super.surname = surname;
			super.userType = userType;
		}
		
		public UserBuilder setHasWriteAccess(boolean hasWriteAccess) {
			super.hasWriteAccess = hasWriteAccess;
			return this;
		}
		
		public UserBuilder setHasReadAccess(boolean hasReadAccess) {
			super.hasReadAccess = hasReadAccess;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public boolean isHasWriteAccess() {
		return hasWriteAccess;
	}

	public boolean isHasReadAccess() {
		return hasReadAccess;
	}

	public UserType getUserType() {
		return userType;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (hasReadAccess ? 1231 : 1237);
		result = prime * result + (hasWriteAccess ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result
				+ ((userType == null) ? 0 : userType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (hasReadAccess != other.hasReadAccess)
			return false;
		if (hasWriteAccess != other.hasWriteAccess)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (userType != other.userType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname
				+ ", hasWriteAccess=" + hasWriteAccess + ", hasReadAccess="
				+ hasReadAccess + ", userType=" + userType + "]";
	}
	
}
