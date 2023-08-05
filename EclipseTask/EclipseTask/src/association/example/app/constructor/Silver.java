package association.example.app.constructor;

public class Silver extends Gold{
public Silver() {
	super("Ring",4000,24,"mineral");
}
public Silver(String goldItem,double cost,int pureGold,String extractFrom) {
	super(goldItem,cost,pureGold,extractFrom);
	
}
}
