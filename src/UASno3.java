import java.util.List;

public class UASno3 {
    private String userId;
    private String userName;
    private List Messages;
    public UASno3 (String userId, String userName, List<Messages> myMessages) {
        this.userId = userId;
        this.userName = userName;
        this.Messages = Messages;
    }
    public UASno3() {

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Messages> getMyMessages() {
        return Messages;
    }

    public void setMyMessages(List<Messages> myMessages) {
        this.Messages = myMessages;
    }
}

}


