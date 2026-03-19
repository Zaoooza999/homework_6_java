package guru.qa.homeworkwithallcollectionscycles;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UserRegistry {
    private Set<String> logins = new HashSet<>();

    public void register(String login){
        logins.add(login);
    }

    public boolean hasUser(String login){
        Iterator<String> it = logins.iterator();
        while (it.hasNext()){
            String user = it.next();
            if (user.equals(login)){
            return true;
            }
        }
        return false;
    }

    public void deleteUser(String login){
        logins.remove(login);
    }

    @Override
    public String toString() {
        return "UserRegistry{" +
                "logins=" + logins +
                '}';
    }
}
