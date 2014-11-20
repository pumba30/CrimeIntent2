package pandroidsoft.com.crimeintent2;

import java.util.UUID;

/**
 * Created by pumba30 on 20.11.2014.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();


    }





    public UUID getId() {
        return mId;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
