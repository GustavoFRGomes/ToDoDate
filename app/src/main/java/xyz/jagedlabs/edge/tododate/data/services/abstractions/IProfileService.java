package xyz.jagedlabs.edge.tododate.data.services.abstractions;

import xyz.jagedlabs.edge.tododate.data.models.IUser;

/**
 * Created by ggomes on 2/23/2018.
 */

public interface IProfileService {
    public IUser getUserProfile();
    public long getUserId();
    public String getUserEmail();
}
