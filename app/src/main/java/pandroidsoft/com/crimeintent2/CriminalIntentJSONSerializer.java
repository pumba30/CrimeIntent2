package pandroidsoft.com.crimeintent2;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Created by pumba30 on 21.11.2014.
 */
public class CriminalIntentJSONSerializer {
    private Context mContext;
    private String mFileName;

    public CriminalIntentJSONSerializer(Context context, String fileName) {
        mContext = context;
        mFileName = fileName;
    }

    public void saveCrimes(ArrayList<Crime>crimes)
        throws JSONException, IOException{
        //построение массива в JSON
        JSONArray array = new JSONArray();
        for(Crime crime : crimes){
            array.put(crime.toJSON());
        }

        //запись файла на диск
        Writer writer = null;
        try{
            OutputStream out = mContext.openFileOutput(mFileName, Context.MODE_PRIVATE);
            writer = new OutputStreamWriter(out);
            writer.write(array.toString());
        }finally {
            if(writer != null){
                writer.close();
            }
        }
    }


}
