package Model;

public class Owner extends User {
	
	private int ownerId;
	private int bookId;
	
	public Owner(int id, String password, int contactId, String name, String email, String phone) {
		super(id, password, contactId, name, email, phone);
	}
	
	
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

}
