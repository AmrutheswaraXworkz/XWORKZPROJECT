package association.example.app.getset;

public class PhonePe {
	private int size = 75;
	private String userName = "amruth";
	private String upi = "6360504953@ybl";
	private float tax = 20.8f;
	private boolean safe = true;
	private long txnId = 123546789;
	private String senderName = "amruth";
	private String receiverName = "gagan";
	private float time = 0.2f;
	private boolean fast = true;
	private boolean creditCard = true;
	private int amount = 450000;
	private String bank = "HDFC";
	private String location = "mandipete";

	public int getSize() {
		return size;
	}

	public String getUserName() {
		return userName;
	}

	public String getUpi() {
		return upi;
	}

	public float getTax() {
		return tax;
	}

	public boolean isSafe() {
		return safe;
	}

	public String getSenderName() {
		return senderName;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public long getTxnId() {
		return txnId;
	}

	public float getTime() {
		return time;
	}

	public boolean isFast() {
		return fast;
	}

	public boolean isCreditCard() {
		return creditCard;
	}

	public int getAmount() {
		return amount;
	}

	public String getBank() {
		return bank;
	}

	public String getLocation() {
		return location;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUpi(String upi) {
		this.upi = upi;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public void isSafe(boolean safe) {
		this.safe = safe;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public void setTxnId(long txnId) {
		this.txnId = txnId;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public void isFast(boolean fast) {
		this.fast = fast;
	}

	public void isCreditCard(boolean creditCard) {
		this.creditCard = creditCard;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
