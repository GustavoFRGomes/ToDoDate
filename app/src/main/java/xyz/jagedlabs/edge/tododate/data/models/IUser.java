package xyz.jagedlabs.edge.tododate.data.models;

/**
 * Created by ggomes on 2/23/2018.
 */

public interface IUser {

    public long getUserId();
    public String getUserEmail();
    public long getEnrollementDate();
    public boolean isPremiumUser();
    public String getUsername();
    public long getUserDoB();

}
