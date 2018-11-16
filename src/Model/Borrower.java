package Model;

public class Borrower extends User {
	private int borrowerId;
	private int bookId;
	
	public Borrower(int id, String password, int contactId, String name, String email, String phone) {
		super(id, password, contactId, name, email, phone);
	}
	

	public int getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	

}
